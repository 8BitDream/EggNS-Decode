.class public final Ls/h/e/l/l/A;
.super Landroid/app/AppComponentFactory;


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x1c
.end annotation


# instance fields
.field private acf:Landroid/app/AppComponentFactory;

.field private orignACF:Landroid/app/AppComponentFactory;

.field private orignAppName:Ljava/lang/String;

.field private orignName:Ljava/lang/String;

.field private packageName:Ljava/lang/String;

.field private supportInstantiateClassLoader:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Landroid/app/AppComponentFactory;-><init>()V

    const-string v0, "com.xiaoji.gamesirnsemulator"

    iput-object v0, p0, Ls/h/e/l/l/A;->packageName:Ljava/lang/String;

    const-string v0, "io.switchdroid.NSApplication"

    iput-object v0, p0, Ls/h/e/l/l/A;->orignAppName:Ljava/lang/String;

    const-string v0, "androidx.core.app.CoreComponentFactory"

    iput-object v0, p0, Ls/h/e/l/l/A;->orignName:Ljava/lang/String;

    iput-object v1, p0, Ls/h/e/l/l/A;->orignACF:Landroid/app/AppComponentFactory;

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls/h/e/l/l/A;->supportInstantiateClassLoader:Z

    iput-object v1, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    return-void
.end method

.method public static native al(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;
.end method


# virtual methods
.method public declared-synchronized getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-nez v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->orignName:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->orignName:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-nez v0, :cond_0

    :try_start_1
    iget-object v0, p0, Ls/h/e/l/l/A;->orignName:Ljava/lang/String;

    invoke-virtual {p1, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AppComponentFactory;

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    :goto_0
    :try_start_2
    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;
        }
    .end annotation

    sget-boolean v0, Ls/h/e/l/l/S;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ls/h/e/l/l/A;->getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateActivity(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Activity;

    move-result-object v0

    goto :goto_0
.end method

.method public instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;
        }
    .end annotation

    iget-boolean v0, p0, Ls/h/e/l/l/A;->supportInstantiateClassLoader:Z

    if-eqz v0, :cond_1

    const-string v0, "s.h.e.l.l.S"

    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p2, p0, Ls/h/e/l/l/A;->orignAppName:Ljava/lang/String;

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_1
    sget-boolean v0, Ls/h/e/l/l/S;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ls/h/e/l/l/A;->getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    invoke-virtual {v0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateApplication(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/app/Application;

    move-result-object v0

    goto :goto_0
.end method

.method public instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x1d
    .end annotation

    iget-boolean v0, p0, Ls/h/e/l/l/A;->supportInstantiateClassLoader:Z

    if-nez v0, :cond_1

    iget-object v0, p2, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    new-instance v1, Ljava/io/File;

    const-string v2, "files"

    invoke-direct {v1, v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    :cond_0
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls/h/e/l/l/S;->p:Ljava/lang/String;

    iget-object v0, p2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    sput-object v0, Ls/h/e/l/l/S;->f:Ljava/lang/String;

    const/4 v0, 0x0

    invoke-static {v0}, Ls/h/e/l/l/S;->l(Landroid/content/Context;)V

    iget-object v0, p0, Ls/h/e/l/l/A;->packageName:Ljava/lang/String;

    iget-object v1, p0, Ls/h/e/l/l/A;->orignAppName:Ljava/lang/String;

    invoke-static {p1, p2, v0, v1}, Ls/h/e/l/l/N;->al(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/ClassLoader;

    move-result-object p1

    iget-object v0, p0, Ls/h/e/l/l/A;->orignAppName:Ljava/lang/String;

    iput-object v0, p2, Landroid/content/pm/ApplicationInfo;->className:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls/h/e/l/l/A;->supportInstantiateClassLoader:Z

    :cond_1
    sget-boolean v0, Ls/h/e/l/l/S;->l:Z

    if-eqz v0, :cond_2

    invoke-virtual {p0, p1}, Ls/h/e/l/l/A;->getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    invoke-virtual {v0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_2
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateClassLoader(Ljava/lang/ClassLoader;Landroid/content/pm/ApplicationInfo;)Ljava/lang/ClassLoader;

    move-result-object v0

    goto :goto_0
.end method

.method public instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;
        }
    .end annotation

    sget-boolean v0, Ls/h/e/l/l/S;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ls/h/e/l/l/A;->getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    invoke-virtual {v0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/app/AppComponentFactory;->instantiateProvider(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroid/content/ContentProvider;

    move-result-object v0

    goto :goto_0
.end method

.method public instantiateReceiver(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/BroadcastReceiver;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;
        }
    .end annotation

    sget-boolean v0, Ls/h/e/l/l/S;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ls/h/e/l/l/A;->getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateReceiver(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/BroadcastReceiver;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateReceiver(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/content/BroadcastReceiver;

    move-result-object v0

    goto :goto_0
.end method

.method public instantiateService(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Service;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/ClassNotFoundException;,
            Ljava/lang/IllegalAccessException;,
            Ljava/lang/InstantiationException;
        }
    .end annotation

    sget-boolean v0, Ls/h/e/l/l/S;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Ls/h/e/l/l/A;->getACF(Ljava/lang/ClassLoader;)Landroid/app/AppComponentFactory;

    move-result-object v0

    iput-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    if-eqz v0, :cond_0

    iget-object v0, p0, Ls/h/e/l/l/A;->acf:Landroid/app/AppComponentFactory;

    invoke-virtual {v0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateService(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Service;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/app/AppComponentFactory;->instantiateService(Ljava/lang/ClassLoader;Ljava/lang/String;Landroid/content/Intent;)Landroid/app/Service;

    move-result-object v0

    goto :goto_0
.end method
