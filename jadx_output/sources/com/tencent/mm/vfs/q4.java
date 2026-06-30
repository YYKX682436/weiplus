package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class q4 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213135e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f213136f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem f213137g;

    public q4(com.tencent.mm.vfs.QQMusicCacheCleanupFileSystem qQMusicCacheCleanupFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f213137g = qQMusicCacheCleanupFileSystem;
        this.f213135e = q2Var;
        this.f213136f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f213136f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f213135e;
    }

    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        long s17 = com.tencent.mm.vfs.e8.s("qq-music-cache-clean");
        if (s17 < 1209600000) {
            com.tencent.mars.xlog.Log.i("VFS.QQMusicCacheCleanupFileSystem", "Image cleanup interval not match, skip cleanup. %d / %d", java.lang.Long.valueOf(s17), 1209600000L);
        } else {
            java.lang.Iterable<com.tencent.mm.vfs.x1> list = list("");
            if (list == null) {
                list = java.util.Collections.emptyList();
            }
            java.util.regex.Pattern compile = java.util.regex.Pattern.compile("mediaHttpCommonPlayer[0-9]+tmp");
            int i17 = 0;
            long j17 = 0;
            long j18 = 0;
            int i18 = 0;
            for (com.tencent.mm.vfs.x1 x1Var : list) {
                if (!x1Var.f213236f) {
                    boolean matches = compile.matcher(x1Var.f213232b).matches();
                    long j19 = x1Var.f213234d;
                    if (matches) {
                        x1Var.a();
                        i17++;
                        j17 += j19;
                    } else {
                        i18++;
                        j18 += j19;
                    }
                    cancellationSignal.throwIfCanceled();
                }
            }
            com.tencent.mars.xlog.Log.i("VFS.QQMusicCacheCleanupFileSystem", " > deletedFiles: %d, deletedSize: %d\n > keptFiles: %d, keptSize: %d", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j18));
            J(2, "deletedFiles", java.lang.Integer.valueOf(i17), "deletedSize", java.lang.Long.valueOf(j17), "keptFiles", java.lang.Integer.valueOf(i18), "keptSize", java.lang.Long.valueOf(j18));
            com.tencent.mm.vfs.e8.t("qq-music-cache-clean");
        }
        cancellationSignal.throwIfCanceled();
        super.q(cancellationSignal);
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "qqMusicCacheGC <- " + this.f213135e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213137g;
    }
}
