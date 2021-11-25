package s.h.e.l.l;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class N {
    static boolean la = true;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e A:{SYNTHETIC, Splitter:B:35:0x006e} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A:{Catch:{ Throwable -> 0x0094, Throwable -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056 A:{SYNTHETIC, Splitter:B:20:0x0056} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b A:{SYNTHETIC, Splitter:B:23:0x005b} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A:{Catch:{ Throwable -> 0x0094, Throwable -> 0x0083 }} */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e A:{SYNTHETIC, Splitter:B:35:0x006e} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A:{SYNTHETIC, Splitter:B:29:0x0065} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006a A:{SYNTHETIC, Splitter:B:32:0x006a} */
    static {
        /*
        r1 = 0;
        r0 = 1;
        la = r0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0052, all -> 0x0061 }
        r0.<init>();	 Catch:{ Exception -> 0x0052, all -> 0x0061 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x00b5, all -> 0x00b0 }
        r2.<init>();	 Catch:{ Exception -> 0x00b5, all -> 0x00b0 }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0.hashCode();	 Catch:{ Exception -> 0x00aa }
    L_0x0014:
        if (r2 == 0) goto L_0x0019;
    L_0x0016:
        r2.hashCode();	 Catch:{ Exception -> 0x00ad }
    L_0x0019:
        r0 = la;	 Catch:{ Throwable -> 0x0083 }
        if (r0 == 0) goto L_0x006e;
    L_0x001d:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0083 }
        r1 = s.h.e.l.l.S.p;	 Catch:{ Throwable -> 0x0083 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0083 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0083 }
        r1 = "/libexec.so";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0083 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0083 }
        java.lang.System.load(r0);	 Catch:{ Throwable -> 0x0083 }
        r0 = s.h.e.l.l.S.m;	 Catch:{ Throwable -> 0x0083 }
        if (r0 == 0) goto L_0x0051;
    L_0x0039:
        r0 = new java.lang.StringBuilder;	 Catch:{ Throwable -> 0x0083 }
        r1 = s.h.e.l.l.S.p;	 Catch:{ Throwable -> 0x0083 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ Throwable -> 0x0083 }
        r0.<init>(r1);	 Catch:{ Throwable -> 0x0083 }
        r1 = "/libexecmain.so";
        r0 = r0.append(r1);	 Catch:{ Throwable -> 0x0083 }
        r0 = r0.toString();	 Catch:{ Throwable -> 0x0083 }
        java.lang.System.load(r0);	 Catch:{ Throwable -> 0x0083 }
    L_0x0051:
        return;
    L_0x0052:
        r0 = move-exception;
        r0 = r1;
    L_0x0054:
        if (r0 == 0) goto L_0x0059;
    L_0x0056:
        r0.hashCode();	 Catch:{ Exception -> 0x00a4 }
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
        r2.hashCode();	 Catch:{ Exception -> 0x00a6 }
    L_0x0068:
        if (r1 == 0) goto L_0x006d;
    L_0x006a:
        r3.hashCode();	 Catch:{ Exception -> 0x00a8 }
    L_0x006d:
        throw r0;
    L_0x006e:
        r0 = x();	 Catch:{ Throwable -> 0x0083 }
        if (r0 != 0) goto L_0x0085;
    L_0x0074:
        r0 = "exec";
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0083 }
        r0 = s.h.e.l.l.S.m;	 Catch:{ Throwable -> 0x0083 }
        if (r0 == 0) goto L_0x0051;
    L_0x007d:
        r0 = "execmain";
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0083 }
        goto L_0x0051;
    L_0x0083:
        r0 = move-exception;
        goto L_0x0051;
    L_0x0085:
        r0 = "exec_x86";
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0094 }
        r0 = s.h.e.l.l.S.m;	 Catch:{ Throwable -> 0x0094 }
        if (r0 == 0) goto L_0x0051;
    L_0x008e:
        r0 = "execmain_x86";
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0094 }
        goto L_0x0051;
    L_0x0094:
        r0 = move-exception;
        r0 = "exec";
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0083 }
        r0 = s.h.e.l.l.S.m;	 Catch:{ Throwable -> 0x0083 }
        if (r0 == 0) goto L_0x0051;
    L_0x009e:
        r0 = "execmain";
        java.lang.System.loadLibrary(r0);	 Catch:{ Throwable -> 0x0083 }
        goto L_0x0051;
    L_0x00a4:
        r0 = move-exception;
        goto L_0x0059;
    L_0x00a6:
        r2 = move-exception;
        goto L_0x0068;
    L_0x00a8:
        r1 = move-exception;
        goto L_0x006d;
    L_0x00aa:
        r0 = move-exception;
        goto L_0x0014;
    L_0x00ad:
        r0 = move-exception;
        goto L_0x0019;
    L_0x00b0:
        r2 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0063;
    L_0x00b5:
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

    public static boolean x() {
        try {
            String readLine = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("getprop ro.product.cpu.abi").getInputStream())).readLine();
            if (readLine != null && readLine.contains("x86")) {
                return true;
            }
        } catch (Exception e) {
        }
        return false;
    }
}
