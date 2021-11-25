package s.h.e.l.l;

import android.app.Application;

public final class S extends Application {
    public static String f = null;
    public static boolean l = false;
    public static boolean m = true;
    public static Application n = null;
    public static String p = null;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0027 A:{SYNTHETIC, Splitter:B:14:0x0027} */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002c A:{SYNTHETIC, Splitter:B:17:0x002c} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0036 A:{SYNTHETIC, Splitter:B:23:0x0036} */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A:{SYNTHETIC, Splitter:B:26:0x003b} */
    static {
        /*
        r0 = 0;
        r1 = 0;
        p = r1;
        n = r1;
        r5 = 1;
        m = r5;
        f = r1;
        l = r0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0023, all -> 0x0032 }
        r0.<init>();	 Catch:{ Exception -> 0x0023, all -> 0x0032 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x004e, all -> 0x0049 }
        r2.<init>();	 Catch:{ Exception -> 0x004e, all -> 0x0049 }
        if (r0 == 0) goto L_0x001d;
    L_0x001a:
        r0.hashCode();	 Catch:{ Exception -> 0x0045 }
    L_0x001d:
        if (r2 == 0) goto L_0x0022;
    L_0x001f:
        r2.hashCode();	 Catch:{ Exception -> 0x0047 }
    L_0x0022:
        return;
    L_0x0023:
        r0 = move-exception;
        r0 = r1;
    L_0x0025:
        if (r0 == 0) goto L_0x002a;
    L_0x0027:
        r0.hashCode();	 Catch:{ Exception -> 0x003f }
    L_0x002a:
        if (r1 == 0) goto L_0x0022;
    L_0x002c:
        r3.hashCode();	 Catch:{ Exception -> 0x0030 }
        goto L_0x0022;
    L_0x0030:
        r0 = move-exception;
        goto L_0x0022;
    L_0x0032:
        r0 = move-exception;
        r2 = r1;
    L_0x0034:
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2.hashCode();	 Catch:{ Exception -> 0x0041 }
    L_0x0039:
        if (r1 == 0) goto L_0x003e;
    L_0x003b:
        r3.hashCode();	 Catch:{ Exception -> 0x0043 }
    L_0x003e:
        throw r0;
    L_0x003f:
        r0 = move-exception;
        goto L_0x002a;
    L_0x0041:
        r2 = move-exception;
        goto L_0x0039;
    L_0x0043:
        r1 = move-exception;
        goto L_0x003e;
    L_0x0045:
        r0 = move-exception;
        goto L_0x001d;
    L_0x0047:
        r0 = move-exception;
        goto L_0x0022;
    L_0x0049:
        r2 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0034;
    L_0x004e:
        r2 = move-exception;
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.<clinit>():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b A:{SYNTHETIC, Splitter:B:28:0x007b} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0080 A:{SYNTHETIC, Splitter:B:31:0x0080} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008c A:{SYNTHETIC, Splitter:B:37:0x008c} */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0091 A:{SYNTHETIC, Splitter:B:40:0x0091} */
    public static void c(java.lang.String r11) throws java.io.IOException {
        /*
        r1 = 0;
        r5 = 1;
        r4 = 0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0077, all -> 0x0088 }
        r0.<init>();	 Catch:{ Exception -> 0x0077, all -> 0x0088 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x00a6, all -> 0x00a1 }
        r2.<init>();	 Catch:{ Exception -> 0x00a6, all -> 0x00a1 }
        if (r0 == 0) goto L_0x0013;
    L_0x0010:
        r0.hashCode();	 Catch:{ Exception -> 0x009b }
    L_0x0013:
        if (r2 == 0) goto L_0x0018;
    L_0x0015:
        r2.hashCode();	 Catch:{ Exception -> 0x009e }
    L_0x0018:
        r0 = "assets/ijm_lib/%s/libexec.so";
        r1 = new java.lang.Object[r5];
        r1[r4] = r11;
        r0 = java.lang.String.format(r0, r1);
        r1 = "assets/ijm_lib/%s/libexecmain.so";
        r2 = new java.lang.Object[r5];
        r2[r4] = r11;
        r1 = java.lang.String.format(r1, r2);
        r2 = new java.io.File;
        r3 = p;
        r4 = "libexec.so";
        r2.<init>(r3, r4);
        r3 = new java.io.File;
        r4 = p;
        r5 = "libexecmain.so";
        r3.<init>(r4, r5);
        r4 = new java.util.zip.ZipFile;
        r5 = f;
        r4.<init>(r5);
        r0 = r4.getEntry(r0);
        if (r0 == 0) goto L_0x005a;
    L_0x004b:
        r6 = r0.getCrc();
        r8 = g(r2);
        r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r5 == 0) goto L_0x005a;
    L_0x0057:
        c(r4, r0, r2);
    L_0x005a:
        r0 = m;
        if (r0 == 0) goto L_0x0073;
    L_0x005e:
        r0 = r4.getEntry(r1);
        if (r0 == 0) goto L_0x0073;
    L_0x0064:
        r6 = r0.getCrc();
        r8 = g(r3);
        r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r1 == 0) goto L_0x0073;
    L_0x0070:
        c(r4, r0, r3);
    L_0x0073:
        r4.close();
        return;
    L_0x0077:
        r0 = move-exception;
        r0 = r1;
    L_0x0079:
        if (r0 == 0) goto L_0x007e;
    L_0x007b:
        r0.hashCode();	 Catch:{ Exception -> 0x0095 }
    L_0x007e:
        if (r1 == 0) goto L_0x0018;
    L_0x0080:
        r3.hashCode();	 Catch:{ Exception -> 0x0085 }
        goto L_0x0018;
    L_0x0085:
        r0 = move-exception;
        goto L_0x0018;
    L_0x0088:
        r0 = move-exception;
        r2 = r1;
    L_0x008a:
        if (r2 == 0) goto L_0x008f;
    L_0x008c:
        r2.hashCode();	 Catch:{ Exception -> 0x0097 }
    L_0x008f:
        if (r1 == 0) goto L_0x0094;
    L_0x0091:
        r3.hashCode();	 Catch:{ Exception -> 0x0099 }
    L_0x0094:
        throw r0;
    L_0x0095:
        r0 = move-exception;
        goto L_0x007e;
    L_0x0097:
        r2 = move-exception;
        goto L_0x008f;
    L_0x0099:
        r1 = move-exception;
        goto L_0x0094;
    L_0x009b:
        r0 = move-exception;
        goto L_0x0013;
    L_0x009e:
        r0 = move-exception;
        goto L_0x0018;
    L_0x00a1:
        r2 = move-exception;
        r10 = r2;
        r2 = r0;
        r0 = r10;
        goto L_0x008a;
    L_0x00a6:
        r2 = move-exception;
        goto L_0x0079;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.c(java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A:{Catch:{ IOException -> 0x0063 }} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x003b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A:{SYNTHETIC, Splitter:B:22:0x0046} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b A:{SYNTHETIC, Splitter:B:25:0x004b} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020 A:{Catch:{ IOException -> 0x0063 }} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x003b A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0055 A:{SYNTHETIC, Splitter:B:31:0x0055} */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005a A:{SYNTHETIC, Splitter:B:34:0x005a} */
    public static void c(java.util.zip.ZipFile r6, java.util.zip.ZipEntry r7, java.io.File r8) {
        /*
        r1 = 0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0042, all -> 0x0051 }
        r0.<init>();	 Catch:{ Exception -> 0x0042, all -> 0x0051 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x0074, all -> 0x006f }
        r2.<init>();	 Catch:{ Exception -> 0x0074, all -> 0x006f }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r0.hashCode();	 Catch:{ Exception -> 0x006b }
    L_0x0011:
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        r2.hashCode();	 Catch:{ Exception -> 0x006d }
    L_0x0016:
        r0 = r8.getParentFile();	 Catch:{ IOException -> 0x0063 }
        r0 = r0.exists();	 Catch:{ IOException -> 0x0063 }
        if (r0 != 0) goto L_0x0027;
    L_0x0020:
        r0 = r8.getParentFile();	 Catch:{ IOException -> 0x0063 }
        r0.mkdirs();	 Catch:{ IOException -> 0x0063 }
    L_0x0027:
        r0 = r6.getInputStream(r7);	 Catch:{ IOException -> 0x0063 }
        r1 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0063 }
        r1.<init>(r8);	 Catch:{ IOException -> 0x0063 }
        r2 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r2 = new byte[r2];	 Catch:{ IOException -> 0x0063 }
    L_0x0034:
        r3 = r0.read(r2);	 Catch:{ IOException -> 0x0063 }
        r4 = -1;
        if (r3 != r4) goto L_0x005e;
    L_0x003b:
        r0.close();	 Catch:{ IOException -> 0x0063 }
        r1.close();	 Catch:{ IOException -> 0x0063 }
    L_0x0041:
        return;
    L_0x0042:
        r0 = move-exception;
        r0 = r1;
    L_0x0044:
        if (r0 == 0) goto L_0x0049;
    L_0x0046:
        r0.hashCode();	 Catch:{ Exception -> 0x0065 }
    L_0x0049:
        if (r1 == 0) goto L_0x0016;
    L_0x004b:
        r3.hashCode();	 Catch:{ Exception -> 0x004f }
        goto L_0x0016;
    L_0x004f:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0051:
        r0 = move-exception;
        r2 = r1;
    L_0x0053:
        if (r2 == 0) goto L_0x0058;
    L_0x0055:
        r2.hashCode();	 Catch:{ Exception -> 0x0067 }
    L_0x0058:
        if (r1 == 0) goto L_0x005d;
    L_0x005a:
        r3.hashCode();	 Catch:{ Exception -> 0x0069 }
    L_0x005d:
        throw r0;
    L_0x005e:
        r4 = 0;
        r1.write(r2, r4, r3);	 Catch:{ IOException -> 0x0063 }
        goto L_0x0034;
    L_0x0063:
        r0 = move-exception;
        goto L_0x0041;
    L_0x0065:
        r0 = move-exception;
        goto L_0x0049;
    L_0x0067:
        r2 = move-exception;
        goto L_0x0058;
    L_0x0069:
        r1 = move-exception;
        goto L_0x005d;
    L_0x006b:
        r0 = move-exception;
        goto L_0x0011;
    L_0x006d:
        r0 = move-exception;
        goto L_0x0016;
    L_0x006f:
        r2 = move-exception;
        r5 = r2;
        r2 = r0;
        r0 = r5;
        goto L_0x0053;
    L_0x0074:
        r2 = move-exception;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.c(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x006a A:{SYNTHETIC, Splitter:B:53:0x006a} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x006f A:{SYNTHETIC, Splitter:B:56:0x006f} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0079 A:{SYNTHETIC, Splitter:B:62:0x0079} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x007e A:{SYNTHETIC, Splitter:B:65:0x007e} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x006a A:{SYNTHETIC, Splitter:B:53:0x006a} */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x006f A:{SYNTHETIC, Splitter:B:56:0x006f} */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0079 A:{SYNTHETIC, Splitter:B:62:0x0079} */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x007e A:{SYNTHETIC, Splitter:B:65:0x007e} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0023 A:{SYNTHETIC, Splitter:B:17:0x0023} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0028 A:{SYNTHETIC, Splitter:B:20:0x0028} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0032 A:{SYNTHETIC, Splitter:B:26:0x0032} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0037 A:{SYNTHETIC, Splitter:B:29:0x0037} */
    public static long g(java.io.File r8) {
        /*
        r0 = 0;
        r3 = 0;
        r4 = 0;
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x001f, all -> 0x002e }
        r2.<init>();	 Catch:{ Exception -> 0x001f, all -> 0x002e }
        r5 = new java.lang.Object;	 Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
        r5.<init>();	 Catch:{ Exception -> 0x00a2, all -> 0x00a0 }
        if (r2 == 0) goto L_0x0013;
    L_0x0010:
        r2.hashCode();	 Catch:{ Exception -> 0x0088 }
    L_0x0013:
        if (r5 == 0) goto L_0x0018;
    L_0x0015:
        r5.hashCode();	 Catch:{ Exception -> 0x008a }
    L_0x0018:
        r2 = r8.exists();
        if (r2 != 0) goto L_0x003b;
    L_0x001e:
        return r0;
    L_0x001f:
        r2 = move-exception;
        r2 = r3;
    L_0x0021:
        if (r2 == 0) goto L_0x0026;
    L_0x0023:
        r2.hashCode();	 Catch:{ Exception -> 0x0082 }
    L_0x0026:
        if (r3 == 0) goto L_0x0018;
    L_0x0028:
        r4.hashCode();	 Catch:{ Exception -> 0x002c }
        goto L_0x0018;
    L_0x002c:
        r2 = move-exception;
        goto L_0x0018;
    L_0x002e:
        r0 = move-exception;
        r2 = r3;
    L_0x0030:
        if (r2 == 0) goto L_0x0035;
    L_0x0032:
        r2.hashCode();	 Catch:{ Exception -> 0x0084 }
    L_0x0035:
        if (r3 == 0) goto L_0x003a;
    L_0x0037:
        r4.hashCode();	 Catch:{ Exception -> 0x0086 }
    L_0x003a:
        throw r0;
    L_0x003b:
        r5 = new java.util.zip.CRC32;
        r5.<init>();
        r4 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0066, all -> 0x0075 }
        r4.<init>(r8);	 Catch:{ Exception -> 0x0066, all -> 0x0075 }
        r2 = new java.util.zip.CheckedInputStream;	 Catch:{ Exception -> 0x0099, all -> 0x0094 }
        r2.<init>(r4, r5);	 Catch:{ Exception -> 0x0099, all -> 0x0094 }
        r3 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        r3 = new byte[r3];	 Catch:{ Exception -> 0x009c, all -> 0x0096 }
    L_0x004e:
        r6 = r2.read(r3);	 Catch:{ Exception -> 0x009c, all -> 0x0096 }
        r7 = -1;
        if (r6 != r7) goto L_0x004e;
    L_0x0055:
        r0 = r5.getValue();	 Catch:{ Exception -> 0x009c, all -> 0x0096 }
        if (r4 == 0) goto L_0x005e;
    L_0x005b:
        r4.close();	 Catch:{ IOException -> 0x0092 }
    L_0x005e:
        if (r2 == 0) goto L_0x001e;
    L_0x0060:
        r2.close();	 Catch:{ IOException -> 0x0064 }
        goto L_0x001e;
    L_0x0064:
        r2 = move-exception;
        goto L_0x001e;
    L_0x0066:
        r2 = move-exception;
        r2 = r3;
    L_0x0068:
        if (r2 == 0) goto L_0x006d;
    L_0x006a:
        r2.close();	 Catch:{ IOException -> 0x008c }
    L_0x006d:
        if (r3 == 0) goto L_0x001e;
    L_0x006f:
        r3.close();	 Catch:{ IOException -> 0x0073 }
        goto L_0x001e;
    L_0x0073:
        r2 = move-exception;
        goto L_0x001e;
    L_0x0075:
        r0 = move-exception;
        r4 = r3;
    L_0x0077:
        if (r4 == 0) goto L_0x007c;
    L_0x0079:
        r4.close();	 Catch:{ IOException -> 0x008e }
    L_0x007c:
        if (r3 == 0) goto L_0x0081;
    L_0x007e:
        r3.close();	 Catch:{ IOException -> 0x0090 }
    L_0x0081:
        throw r0;
    L_0x0082:
        r2 = move-exception;
        goto L_0x0026;
    L_0x0084:
        r1 = move-exception;
        goto L_0x0035;
    L_0x0086:
        r1 = move-exception;
        goto L_0x003a;
    L_0x0088:
        r2 = move-exception;
        goto L_0x0013;
    L_0x008a:
        r2 = move-exception;
        goto L_0x0018;
    L_0x008c:
        r2 = move-exception;
        goto L_0x006d;
    L_0x008e:
        r1 = move-exception;
        goto L_0x007c;
    L_0x0090:
        r1 = move-exception;
        goto L_0x0081;
    L_0x0092:
        r3 = move-exception;
        goto L_0x005e;
    L_0x0094:
        r0 = move-exception;
        goto L_0x0077;
    L_0x0096:
        r0 = move-exception;
        r3 = r2;
        goto L_0x0077;
    L_0x0099:
        r2 = move-exception;
        r2 = r4;
        goto L_0x0068;
    L_0x009c:
        r3 = move-exception;
        r3 = r2;
        r2 = r4;
        goto L_0x0068;
    L_0x00a0:
        r0 = move-exception;
        goto L_0x0030;
    L_0x00a2:
        r5 = move-exception;
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.g(java.io.File):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0050 A:{SYNTHETIC, Splitter:B:39:0x0050} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x002e A:{SYNTHETIC, EDGE_INSN: B:73:0x002e->B:17:0x002e ?: BREAK  , EDGE_INSN: B:73:0x002e->B:17:0x002e ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A:{SYNTHETIC, Splitter:B:18:0x0030} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0038 A:{SYNTHETIC, Splitter:B:24:0x0038} */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x003d A:{SYNTHETIC, Splitter:B:27:0x003d} */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x002e A:{SYNTHETIC, EDGE_INSN: B:73:0x002e->B:17:0x002e ?: BREAK  , EDGE_INSN: B:73:0x002e->B:17:0x002e ?: BREAK  , EDGE_INSN: B:73:0x002e->B:17:0x002e ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0050 A:{SYNTHETIC, Splitter:B:39:0x0050} */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0030 A:{SYNTHETIC, Splitter:B:18:0x0030} */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0047 A:{SYNTHETIC, Splitter:B:33:0x0047} */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x004c A:{SYNTHETIC, Splitter:B:36:0x004c} */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0077 A:{SYNTHETIC, Splitter:B:55:0x0077} */
    public static boolean il() {
        /*
        r1 = 0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0034, all -> 0x0043 }
        r0.<init>();	 Catch:{ Exception -> 0x0034, all -> 0x0043 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x0093, all -> 0x008e }
        r2.<init>();	 Catch:{ Exception -> 0x0093, all -> 0x008e }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r0.hashCode();	 Catch:{ Exception -> 0x0081 }
    L_0x0011:
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        r2.hashCode();	 Catch:{ Exception -> 0x0083 }
    L_0x0016:
        r0 = 0;
        r2 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x006a, all -> 0x0073 }
        r3 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x006a, all -> 0x0073 }
        r4 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x006a, all -> 0x0073 }
        r5 = "/proc/self/maps";
        r4.<init>(r5);	 Catch:{ Exception -> 0x006a, all -> 0x0073 }
        r3.<init>(r4);	 Catch:{ Exception -> 0x006a, all -> 0x0073 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x006a, all -> 0x0073 }
    L_0x0028:
        r1 = r2.readLine();	 Catch:{ Exception -> 0x008b, all -> 0x0089 }
        if (r1 != 0) goto L_0x0050;
    L_0x002e:
        if (r2 == 0) goto L_0x0033;
    L_0x0030:
        r2.close();	 Catch:{ IOException -> 0x0087 }
    L_0x0033:
        return r0;
    L_0x0034:
        r0 = move-exception;
        r0 = r1;
    L_0x0036:
        if (r0 == 0) goto L_0x003b;
    L_0x0038:
        r0.hashCode();	 Catch:{ Exception -> 0x007b }
    L_0x003b:
        if (r1 == 0) goto L_0x0016;
    L_0x003d:
        r3.hashCode();	 Catch:{ Exception -> 0x0041 }
        goto L_0x0016;
    L_0x0041:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0043:
        r0 = move-exception;
        r2 = r1;
    L_0x0045:
        if (r2 == 0) goto L_0x004a;
    L_0x0047:
        r2.hashCode();	 Catch:{ Exception -> 0x007d }
    L_0x004a:
        if (r1 == 0) goto L_0x004f;
    L_0x004c:
        r3.hashCode();	 Catch:{ Exception -> 0x007f }
    L_0x004f:
        throw r0;
    L_0x0050:
        r3 = "/lib64/libart.so";
        r3 = r1.contains(r3);	 Catch:{ Exception -> 0x008b, all -> 0x0089 }
        if (r3 != 0) goto L_0x0068;
    L_0x0058:
        r3 = "/lib64/libaoc.so";
        r3 = r1.contains(r3);	 Catch:{ Exception -> 0x008b, all -> 0x0089 }
        if (r3 != 0) goto L_0x0068;
    L_0x0060:
        r3 = "/bin/linker64";
        r1 = r1.contains(r3);	 Catch:{ Exception -> 0x008b, all -> 0x0089 }
        if (r1 == 0) goto L_0x0028;
    L_0x0068:
        r0 = 1;
        goto L_0x002e;
    L_0x006a:
        r2 = move-exception;
    L_0x006b:
        if (r1 == 0) goto L_0x0033;
    L_0x006d:
        r1.close();	 Catch:{ IOException -> 0x0071 }
        goto L_0x0033;
    L_0x0071:
        r1 = move-exception;
        goto L_0x0033;
    L_0x0073:
        r0 = move-exception;
        r2 = r1;
    L_0x0075:
        if (r2 == 0) goto L_0x007a;
    L_0x0077:
        r2.close();	 Catch:{ IOException -> 0x0085 }
    L_0x007a:
        throw r0;
    L_0x007b:
        r0 = move-exception;
        goto L_0x003b;
    L_0x007d:
        r2 = move-exception;
        goto L_0x004a;
    L_0x007f:
        r1 = move-exception;
        goto L_0x004f;
    L_0x0081:
        r0 = move-exception;
        goto L_0x0011;
    L_0x0083:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0085:
        r1 = move-exception;
        goto L_0x007a;
    L_0x0087:
        r1 = move-exception;
        goto L_0x0033;
    L_0x0089:
        r0 = move-exception;
        goto L_0x0075;
    L_0x008b:
        r1 = move-exception;
        r1 = r2;
        goto L_0x006b;
    L_0x008e:
        r2 = move-exception;
        r6 = r2;
        r2 = r0;
        r0 = r6;
        goto L_0x0045;
    L_0x0093:
        r2 = move-exception;
        goto L_0x0036;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.il():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x001a A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3 A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009d A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070 A:{SYNTHETIC, Splitter:B:29:0x0070} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0075 A:{SYNTHETIC, Splitter:B:32:0x0075} */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001a A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028 A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x009d A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3 A:{Catch:{ IOException -> 0x008e }} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f A:{SYNTHETIC, Splitter:B:38:0x007f} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0084 A:{SYNTHETIC, Splitter:B:41:0x0084} */
    public static void l(android.content.Context r5) {
        /*
        r1 = 0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x006c, all -> 0x007b }
        r0.<init>();	 Catch:{ Exception -> 0x006c, all -> 0x007b }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x00ba, all -> 0x00b5 }
        r2.<init>();	 Catch:{ Exception -> 0x00ba, all -> 0x00b5 }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r0.hashCode();	 Catch:{ Exception -> 0x00af }
    L_0x0011:
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        r2.hashCode();	 Catch:{ Exception -> 0x00b2 }
    L_0x0016:
        r0 = p;	 Catch:{ IOException -> 0x008e }
        if (r0 != 0) goto L_0x0024;
    L_0x001a:
        r0 = r5.getFilesDir();	 Catch:{ IOException -> 0x008e }
        r0 = r0.getAbsolutePath();	 Catch:{ IOException -> 0x008e }
        p = r0;	 Catch:{ IOException -> 0x008e }
    L_0x0024:
        r0 = f;	 Catch:{ IOException -> 0x008e }
        if (r0 != 0) goto L_0x002e;
    L_0x0028:
        r0 = r5.getPackageCodePath();	 Catch:{ IOException -> 0x008e }
        f = r0;	 Catch:{ IOException -> 0x008e }
    L_0x002e:
        r0 = new java.io.BufferedReader;	 Catch:{ IOException -> 0x008e }
        r1 = new java.io.InputStreamReader;	 Catch:{ IOException -> 0x008e }
        r2 = java.lang.Runtime.getRuntime();	 Catch:{ IOException -> 0x008e }
        r3 = "getprop ro.product.cpu.abi";
        r2 = r2.exec(r3);	 Catch:{ IOException -> 0x008e }
        r2 = r2.getInputStream();	 Catch:{ IOException -> 0x008e }
        r1.<init>(r2);	 Catch:{ IOException -> 0x008e }
        r0.<init>(r1);	 Catch:{ IOException -> 0x008e }
        r1 = r0.readLine();	 Catch:{ IOException -> 0x008e }
        r0 = ld(r5);	 Catch:{ IOException -> 0x008e }
        r2 = "";
        r2 = r0.equals(r2);	 Catch:{ IOException -> 0x008e }
        if (r2 != 0) goto L_0x00bc;
    L_0x0056:
        if (r0 == 0) goto L_0x0097;
    L_0x0058:
        r1 = "x86";
        r0 = r0.contains(r1);	 Catch:{ IOException -> 0x008e }
        if (r0 == 0) goto L_0x0097;
    L_0x0060:
        r0 = il();	 Catch:{ IOException -> 0x008e }
        if (r0 == 0) goto L_0x0088;
    L_0x0066:
        r0 = "x86_64";
        c(r0);	 Catch:{ IOException -> 0x008e }
    L_0x006b:
        return;
    L_0x006c:
        r0 = move-exception;
        r0 = r1;
    L_0x006e:
        if (r0 == 0) goto L_0x0073;
    L_0x0070:
        r0.hashCode();	 Catch:{ Exception -> 0x00a9 }
    L_0x0073:
        if (r1 == 0) goto L_0x0016;
    L_0x0075:
        r3.hashCode();	 Catch:{ Exception -> 0x0079 }
        goto L_0x0016;
    L_0x0079:
        r0 = move-exception;
        goto L_0x0016;
    L_0x007b:
        r0 = move-exception;
        r2 = r1;
    L_0x007d:
        if (r2 == 0) goto L_0x0082;
    L_0x007f:
        r2.hashCode();	 Catch:{ Exception -> 0x00ab }
    L_0x0082:
        if (r1 == 0) goto L_0x0087;
    L_0x0084:
        r3.hashCode();	 Catch:{ Exception -> 0x00ad }
    L_0x0087:
        throw r0;
    L_0x0088:
        r0 = "x86";
        c(r0);	 Catch:{ IOException -> 0x008e }
        goto L_0x006b;
    L_0x008e:
        r0 = move-exception;
        r0 = "armeabi";
        c(r0);	 Catch:{ IOException -> 0x0095 }
        goto L_0x006b;
    L_0x0095:
        r0 = move-exception;
        goto L_0x006b;
    L_0x0097:
        r0 = il();	 Catch:{ IOException -> 0x008e }
        if (r0 == 0) goto L_0x00a3;
    L_0x009d:
        r0 = "arm64-v8a";
        c(r0);	 Catch:{ IOException -> 0x008e }
        goto L_0x006b;
    L_0x00a3:
        r0 = "armeabi";
        c(r0);	 Catch:{ IOException -> 0x008e }
        goto L_0x006b;
    L_0x00a9:
        r0 = move-exception;
        goto L_0x0073;
    L_0x00ab:
        r2 = move-exception;
        goto L_0x0082;
    L_0x00ad:
        r1 = move-exception;
        goto L_0x0087;
    L_0x00af:
        r0 = move-exception;
        goto L_0x0011;
    L_0x00b2:
        r0 = move-exception;
        goto L_0x0016;
    L_0x00b5:
        r2 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x007d;
    L_0x00ba:
        r2 = move-exception;
        goto L_0x006e;
    L_0x00bc:
        r0 = r1;
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.l(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0037 A:{SYNTHETIC, Splitter:B:31:0x0037} */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x001f A:{SYNTHETIC, Splitter:B:16:0x001f} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0024 A:{SYNTHETIC, Splitter:B:19:0x0024} */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A:{SYNTHETIC, RETURN, ORIG_RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0037 A:{SYNTHETIC, Splitter:B:31:0x0037} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x002e A:{SYNTHETIC, Splitter:B:25:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0033 A:{SYNTHETIC, Splitter:B:28:0x0033} */
    public static java.lang.String ld(android.content.Context r6) {
        /*
        r1 = 0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x001b, all -> 0x002a }
        r0.<init>();	 Catch:{ Exception -> 0x001b, all -> 0x002a }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x007d, all -> 0x0078 }
        r2.<init>();	 Catch:{ Exception -> 0x007d, all -> 0x0078 }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r0.hashCode();	 Catch:{ Exception -> 0x0072 }
    L_0x0011:
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        r2.hashCode();	 Catch:{ Exception -> 0x0074 }
    L_0x0016:
        r0 = "";
        if (r6 != 0) goto L_0x0037;
    L_0x001a:
        return r0;
    L_0x001b:
        r0 = move-exception;
        r0 = r1;
    L_0x001d:
        if (r0 == 0) goto L_0x0022;
    L_0x001f:
        r0.hashCode();	 Catch:{ Exception -> 0x006c }
    L_0x0022:
        if (r1 == 0) goto L_0x0016;
    L_0x0024:
        r3.hashCode();	 Catch:{ Exception -> 0x0028 }
        goto L_0x0016;
    L_0x0028:
        r0 = move-exception;
        goto L_0x0016;
    L_0x002a:
        r0 = move-exception;
        r2 = r1;
    L_0x002c:
        if (r2 == 0) goto L_0x0031;
    L_0x002e:
        r2.hashCode();	 Catch:{ Exception -> 0x006e }
    L_0x0031:
        if (r1 == 0) goto L_0x0036;
    L_0x0033:
        r3.hashCode();	 Catch:{ Exception -> 0x0070 }
    L_0x0036:
        throw r0;
    L_0x0037:
        r1 = r6.getAssets();	 Catch:{ Exception -> 0x0076 }
        r2 = "images/icon_max_data_encrypted_xxxxx.png";
        r1 = r1.open(r2);	 Catch:{ Exception -> 0x0076 }
        if (r1 == 0) goto L_0x001a;
    L_0x0043:
        r1.close();	 Catch:{ Exception -> 0x0076 }
        r1 = 20;
        r1 = new byte[r1];	 Catch:{ Exception -> 0x0076 }
        r2 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x0076 }
        r3 = new java.io.File;	 Catch:{ Exception -> 0x0076 }
        r4 = "/system/bin/linker";
        r3.<init>(r4);	 Catch:{ Exception -> 0x0076 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x0076 }
        if (r2 == 0) goto L_0x001a;
    L_0x0058:
        r2.read(r1);	 Catch:{ Exception -> 0x0076 }
        r2.close();	 Catch:{ Exception -> 0x0076 }
        r2 = 18;
        r1 = r1[r2];	 Catch:{ Exception -> 0x0076 }
        switch(r1) {
            case 3: goto L_0x0066;
            case 40: goto L_0x0069;
            default: goto L_0x0065;
        };	 Catch:{ Exception -> 0x0076 }
    L_0x0065:
        goto L_0x001a;
    L_0x0066:
        r0 = "x86";
        goto L_0x001a;
    L_0x0069:
        r0 = "armeabi";
        goto L_0x001a;
    L_0x006c:
        r0 = move-exception;
        goto L_0x0022;
    L_0x006e:
        r2 = move-exception;
        goto L_0x0031;
    L_0x0070:
        r1 = move-exception;
        goto L_0x0036;
    L_0x0072:
        r0 = move-exception;
        goto L_0x0011;
    L_0x0074:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0076:
        r1 = move-exception;
        goto L_0x001a;
    L_0x0078:
        r2 = move-exception;
        r5 = r2;
        r2 = r0;
        r0 = r5;
        goto L_0x002c;
    L_0x007d:
        r2 = move-exception;
        goto L_0x001d;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.ld(android.content.Context):java.lang.String");
    }

    /* Access modifiers changed, original: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A:{SYNTHETIC, Splitter:B:16:0x002b} */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0030 A:{SYNTHETIC, Splitter:B:19:0x0030} */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a A:{SYNTHETIC, Splitter:B:25:0x003a} */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003f A:{SYNTHETIC, Splitter:B:28:0x003f} */
    public void attachBaseContext(android.content.Context r6) {
        /*
        r5 = this;
        r1 = 0;
        super.attachBaseContext(r6);
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0027, all -> 0x0036 }
        r0.<init>();	 Catch:{ Exception -> 0x0027, all -> 0x0036 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x0052, all -> 0x004d }
        r2.<init>();	 Catch:{ Exception -> 0x0052, all -> 0x004d }
        if (r0 == 0) goto L_0x0014;
    L_0x0011:
        r0.hashCode();	 Catch:{ Exception -> 0x0049 }
    L_0x0014:
        if (r2 == 0) goto L_0x0019;
    L_0x0016:
        r2.hashCode();	 Catch:{ Exception -> 0x004b }
    L_0x0019:
        l(r6);
        r0 = "com.xiaoji.gamesirnsemulator";
        s.h.e.l.l.N.l(r5, r0);
        r0 = "io.switchdroid.NSApplication";
        s.h.e.l.l.N.r(r5, r0);
        return;
    L_0x0027:
        r0 = move-exception;
        r0 = r1;
    L_0x0029:
        if (r0 == 0) goto L_0x002e;
    L_0x002b:
        r0.hashCode();	 Catch:{ Exception -> 0x0043 }
    L_0x002e:
        if (r1 == 0) goto L_0x0019;
    L_0x0030:
        r3.hashCode();	 Catch:{ Exception -> 0x0034 }
        goto L_0x0019;
    L_0x0034:
        r0 = move-exception;
        goto L_0x0019;
    L_0x0036:
        r0 = move-exception;
        r2 = r1;
    L_0x0038:
        if (r2 == 0) goto L_0x003d;
    L_0x003a:
        r2.hashCode();	 Catch:{ Exception -> 0x0045 }
    L_0x003d:
        if (r1 == 0) goto L_0x0042;
    L_0x003f:
        r3.hashCode();	 Catch:{ Exception -> 0x0047 }
    L_0x0042:
        throw r0;
    L_0x0043:
        r0 = move-exception;
        goto L_0x002e;
    L_0x0045:
        r2 = move-exception;
        goto L_0x003d;
    L_0x0047:
        r1 = move-exception;
        goto L_0x0042;
    L_0x0049:
        r0 = move-exception;
        goto L_0x0014;
    L_0x004b:
        r0 = move-exception;
        goto L_0x0019;
    L_0x004d:
        r2 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0038;
    L_0x0052:
        r2 = move-exception;
        goto L_0x0029;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.attachBaseContext(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A:{SYNTHETIC, Splitter:B:19:0x002c} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0031 A:{SYNTHETIC, Splitter:B:22:0x0031} */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003b A:{SYNTHETIC, Splitter:B:28:0x003b} */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0040 A:{SYNTHETIC, Splitter:B:31:0x0040} */
    public void onCreate() {
        /*
        r5 = this;
        r1 = 0;
        r3 = 0;
        r0 = new java.lang.Object;	 Catch:{ Exception -> 0x0028, all -> 0x0037 }
        r0.<init>();	 Catch:{ Exception -> 0x0028, all -> 0x0037 }
        r2 = new java.lang.Object;	 Catch:{ Exception -> 0x0053, all -> 0x004e }
        r2.<init>();	 Catch:{ Exception -> 0x0053, all -> 0x004e }
        if (r0 == 0) goto L_0x0011;
    L_0x000e:
        r0.hashCode();	 Catch:{ Exception -> 0x004a }
    L_0x0011:
        if (r2 == 0) goto L_0x0016;
    L_0x0013:
        r2.hashCode();	 Catch:{ Exception -> 0x004c }
    L_0x0016:
        r0 = "io.switchdroid.NSApplication";
        s.h.e.l.l.N.ra(r5, r0);
        r0 = n;
        if (r0 == 0) goto L_0x0024;
    L_0x001f:
        r0 = n;
        r0.onCreate();
    L_0x0024:
        super.onCreate();
        return;
    L_0x0028:
        r0 = move-exception;
        r0 = r1;
    L_0x002a:
        if (r0 == 0) goto L_0x002f;
    L_0x002c:
        r0.hashCode();	 Catch:{ Exception -> 0x0044 }
    L_0x002f:
        if (r1 == 0) goto L_0x0016;
    L_0x0031:
        r3.hashCode();	 Catch:{ Exception -> 0x0035 }
        goto L_0x0016;
    L_0x0035:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0037:
        r0 = move-exception;
        r2 = r1;
    L_0x0039:
        if (r2 == 0) goto L_0x003e;
    L_0x003b:
        r2.hashCode();	 Catch:{ Exception -> 0x0046 }
    L_0x003e:
        if (r1 == 0) goto L_0x0043;
    L_0x0040:
        r3.hashCode();	 Catch:{ Exception -> 0x0048 }
    L_0x0043:
        throw r0;
    L_0x0044:
        r0 = move-exception;
        goto L_0x002f;
    L_0x0046:
        r2 = move-exception;
        goto L_0x003e;
    L_0x0048:
        r1 = move-exception;
        goto L_0x0043;
    L_0x004a:
        r0 = move-exception;
        goto L_0x0011;
    L_0x004c:
        r0 = move-exception;
        goto L_0x0016;
    L_0x004e:
        r2 = move-exception;
        r4 = r2;
        r2 = r0;
        r0 = r4;
        goto L_0x0039;
    L_0x0053:
        r2 = move-exception;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: s.h.e.l.l.S.onCreate():void");
    }
}
