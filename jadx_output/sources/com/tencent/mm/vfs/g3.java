package com.tencent.mm.vfs;

/* loaded from: classes7.dex */
public class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f212949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.h3 f212950e;

    public g3(com.tencent.mm.vfs.h3 h3Var, android.os.CancellationSignal cancellationSignal) {
        this.f212950e = h3Var;
        this.f212949d = cancellationSignal;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        java.lang.String str;
        long j19;
        long j27;
        int i17;
        com.tencent.mm.vfs.x1 m17;
        long j28;
        long j29;
        long j37;
        long j38;
        com.tencent.mm.vfs.x1 m18;
        com.tencent.mm.vfs.x1 m19;
        com.tencent.mm.vfs.x1 m27;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.database.Cursor B = gm0.j1.u().f273153f.B("SELECT bigImgPath,thumbImgPath FROM ImgInfo2", null);
        long j39 = 0;
        long j47 = 0;
        long j48 = 0;
        long j49 = 0;
        long j57 = 0;
        long j58 = 0;
        long j59 = 0;
        long j66 = 0;
        while (true) {
            j17 = j39;
            if (!B.moveToNext()) {
                j18 = j47;
                str = "VFS.ImageGCFileSystem";
                j19 = j59;
                j27 = j66;
                i17 = 0;
                break;
            }
            java.lang.String string = B.getString(0);
            j18 = j47;
            java.lang.String string2 = B.getString(1);
            if (this.f212949d.isCanceled()) {
                j19 = j59;
                j27 = j66;
                str = "VFS.ImageGCFileSystem";
                i17 = 1;
                break;
            }
            java.lang.String c17 = com.tencent.mm.vfs.ImageGCFileSystem.c(string, "", "", false);
            java.lang.String c18 = com.tencent.mm.vfs.ImageGCFileSystem.c(string2, "", "", false);
            java.lang.String str2 = c18 + "hd";
            boolean j67 = com.tencent.mm.vfs.w6.j(c17);
            boolean j68 = com.tencent.mm.vfs.w6.j(str2);
            boolean j69 = com.tencent.mm.vfs.w6.j(c18);
            if (j67) {
                if (j68 && (m27 = com.tencent.mm.vfs.w6.m(str2)) != null) {
                    long j76 = j48 + 1;
                    long j77 = m27.f213234d;
                    j49 += j77;
                    j57++;
                    j58 += j77;
                    j48 = j76;
                }
                if (j69 && (m19 = com.tencent.mm.vfs.w6.m(c18)) != null) {
                    j28 = j48 + 1;
                    j29 = m19.f213234d;
                    j49 += j29;
                    j59++;
                    j37 = j18 + j29;
                }
                j28 = j48;
                j37 = j18;
            } else {
                if (j68 && j69 && (m17 = com.tencent.mm.vfs.w6.m(c18)) != null) {
                    j28 = j48 + 1;
                    j29 = m17.f213234d;
                    j49 += j29;
                    j59++;
                    j37 = j18 + j29;
                }
                j28 = j48;
                j37 = j18;
            }
            if (j68 && j69 && (m18 = com.tencent.mm.vfs.w6.m(c18)) != null) {
                j17++;
                j38 = j59;
                j66 += m18.f213234d;
                this.f212950e.getClass();
                com.tencent.mars.xlog.Log.i("VFS.ImageGCFileSystem", "delete unused thumb : " + c18, "ret = false");
            } else {
                j38 = j59;
                j66 = j66;
            }
            j39 = j17;
            j47 = j37;
            j59 = j38;
            j48 = j28;
        }
        long j78 = j19;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        B.close();
        com.tencent.mars.xlog.Log.i(str, "thumbRedundantFileCount = " + j17 + ", thumbRedundantFileDiskSpace = " + j27);
        com.tencent.mars.xlog.Log.i(str, "totalCount = " + j48 + ", totalSize = " + j49);
        com.tencent.mars.xlog.Log.i(str, "hdThCount = " + j57 + ", hdThSize = " + j58);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("thCount = ");
        int i18 = i17;
        long j79 = j48;
        sb6.append(j78);
        sb6.append(", thSize = ");
        long j86 = j27;
        long j87 = j18;
        sb6.append(j87);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mars.xlog.Log.i(str, "deletedCount = 0, deletedSize = 0");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("thumb scan duration = ");
        sb7.append(currentTimeMillis2);
        com.tencent.mars.xlog.Log.i(str, sb7.toString());
        long j88 = com.tencent.mm.sdk.platformtools.o4.L().getLong("extreme_storage_wechat_total", -1L);
        jx3.f.INSTANCE.d(22046, "image2-thumb", 0L, 0L, 0, 0, java.lang.Long.valueOf(j57), java.lang.Long.valueOf(j58), java.lang.Long.valueOf(j78), java.lang.Long.valueOf(j87), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j86), 0, 0, java.lang.Long.valueOf(j79), java.lang.Long.valueOf(j49), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(j88 != -1 ? (int) ((((float) j49) / ((float) j88)) * 100.0f) : -1), java.lang.Long.valueOf(currentTimeMillis2));
    }
}
