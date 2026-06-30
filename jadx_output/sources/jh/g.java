package jh;

/* loaded from: classes12.dex */
public class g implements java.io.FileFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long[] f299703a;

    public g(jh.h hVar, long[] jArr) {
        this.f299703a = jArr;
    }

    @Override // java.io.FileFilter
    public boolean accept(java.io.File file) {
        try {
            android.system.StructStat lstat = android.system.Os.lstat(file.getAbsolutePath());
            long[] jArr = this.f299703a;
            jArr[0] = jArr[0] + 1;
            jArr[1] = jArr[1] + (lstat.st_blocks * lstat.st_blksize);
        } catch (android.system.ErrnoException e17) {
            oj.j.d("Matrix.WarmUpDelegate", e17, "", new java.lang.Object[0]);
        }
        return false;
    }
}
