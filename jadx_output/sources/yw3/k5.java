package yw3;

/* loaded from: classes11.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final yw3.k5 f466788d = new yw3.k5();

    @Override // java.lang.Runnable
    public final void run() {
        java.io.RandomAccessFile randomAccessFile;
        java.lang.StringBuilder sb6;
        byte[] bArr;
        ((wv.a0) ((xv.i0) i95.n0.c(xv.i0.class))).getClass();
        java.lang.String str = y73.p.f459741a;
        java.io.File file = new java.io.File(c83.e.j() + "test_tmp.apk");
        if (file.length() <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "HdiffApk, filterApkExtInfo, tmpFile.length() <= 0.");
            return;
        }
        java.io.RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                bArr = new byte[]{10, 10};
                randomAccessFile = new java.io.RandomAccessFile(file, "rw");
            } catch (java.lang.Throwable th6) {
                th = th6;
                randomAccessFile = randomAccessFile2;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            randomAccessFile.seek(file.length() - 2);
            randomAccessFile.read(bArr);
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "commentLen = commentLen");
            try {
                randomAccessFile.close();
            } catch (java.lang.Exception e18) {
                e = e18;
                sb6 = new java.lang.StringBuilder("readData， e = ");
                sb6.append(e);
                com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", sb6.toString());
            }
        } catch (java.lang.Exception e19) {
            e = e19;
            randomAccessFile2 = randomAccessFile;
            com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "e = " + e);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (java.lang.Exception e27) {
                    e = e27;
                    sb6 = new java.lang.StringBuilder("readData， e = ");
                    sb6.append(e);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", sb6.toString());
                }
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.HdiffBootsCommand.HdiffApk", "readData， e = " + e28);
                }
            }
            throw th;
        }
    }
}
