package s.h.e.l.l;

import android.app.Application;
import android.content.pm.ApplicationInfo;

public final class N {
    static boolean la = true;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056 A:{SYNTHETIC, Splitter:B:19:0x0056} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005b A:{SYNTHETIC, Splitter:B:22:0x005b} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0065 A:{SYNTHETIC, Splitter:B:28:0x0065} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a A:{SYNTHETIC, Splitter:B:31:0x006a} */
    static {
        /*
        r1 = 0;
        r0 = 1;
        la = r0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0052, all -> 0x0061 }
        r0.<init>();	 Catch:{ Exception -> 0x0052, all -> 0x0061 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x008c, all -> 0x0087 }
        r2.<init>();	 Catch:{ Exception -> 0x008c, all -> 0x0087 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0.hashCode();	 Catch:{ Exception -> 0x0083 }
    L_0x0014:
        if (r2 == 0) goto L_0x0019;
    L_0x0016:
        r2.hashCode();	 Catch:{ Exception -> 0x0085 }
    L_0x0019:
        r0 = la;
        if (r0 == 0) goto L_0x006e;
    L_0x001d:
        r0 = new java.lang.StringBuilder;
        r1 = s.h.e.l.l.S.p;
        r1 = java.lang.String.valueOf(r1);
        r0.<init>(r1);
        r1 = "/libexec.so";
        r0 = r0.append(r1);
        r0 = r0.toString();
        java.lang.System.load(r0);
        r0 = s.h.e.l.l.S.m;
        if (r0 == 0) goto L_0x0051;
    L_0x0039:
        r0 = new java.lang.StringBuilder;
        r1 = s.h.e.l.l.S.p;
        r1 = java.lang.String.valueOf(r1);
        r0.<init>(r1);
        r1 = "/libexecmain.so";
        r0 = r0.append(r1);
        r0 = r0.toString();
        java.lang.System.load(r0);
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        r0 = r1;
    L_0x0054:
        if (r0 == 0) goto L_0x0059;
    L_0x0056:
        r0.hashCode();	 Catch:{ Exception -> 0x007d }
    L_0x0059:
        if (r1 == 0) goto L_0x0019;
    L_0x005b:
        r3.hashCode();	 Catch:{ Exception -> 0x005f }
        goto L_0x0019;
    L_0x005f:
        r0 = move-exception;
        goto L_0x0019;
    L_0x0061:
        r0 = move-exception;
        r2 = r1;
    L_0x0063:
        if (r2 == 0) goto L_0x0068;
    L_0x0065:
        r2.hashCode();	 Catch:{ Exception -> 0x007f }
    L_0x0068:
        if (r1 == 0) goto L_0x006d;
    L_0x006a:
        r3.hashCode();	 Catch:{ Exception -> 0x0081 }
    L_0x006d:
        throw r0;
    L_0x006e:
        r0 = "exec";
        java.lang.System.loadLibrary(r0);
        r0 = s.h.e.l.l.S.m;
        if (r0 == 0) goto L_0x0051;
    L_0x0077:
        r0 = "execmain";
        java.lang.System.loadLibrary(r0);
        goto L_0x0051;
    L_0x007d:
        r0 = move-exception;
        goto L_0x0059;
    L_0x007f:
        r2 = move-exception;
        goto L_0x0068;
    L_0x0081:
        r1 = move-exception;
        goto L_0x006d;
    L_0x0083:
        r0 = move-exception;
        goto L_0x0014;
    L_0x0085:
        r0 = move-exception;
        goto L_0x0019;
    L_0x0087:
        r2 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0063;
    L_0x008c:
        r2 = move-exception;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.N.<clinit>():void");
    }

    public static native ClassLoader al(ClassLoader classLoader, ApplicationInfo applicationInfo, String str, String str2);

    public static native byte[] b2b(byte[] bArr, int i);

    public static native boolean l(Application application, String str);

    public static native void m(String str, int i);

    public static native boolean r(Application application, String str);

    public static native boolean ra(Application application, String str);

    public static native void sa(String str, String str2);
}
