package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class h3 extends com.tencent.mm.vfs.m0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f212972e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f212973f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.ImageGCFileSystem f212974g;

    public h3(com.tencent.mm.vfs.ImageGCFileSystem imageGCFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f212974g = imageGCFileSystem;
        this.f212972e = q2Var;
        this.f212973f = java.util.Collections.singletonList(q2Var);
    }

    @Override // com.tencent.mm.vfs.m0
    public java.util.List K() {
        return this.f212973f;
    }

    @Override // com.tencent.mm.vfs.m0
    public com.tencent.mm.vfs.q2 L(java.lang.String str, int i17) {
        return this.f212972e;
    }

    public final boolean O(com.tencent.mm.vfs.x1 x1Var) {
        if (!com.tencent.mm.vfs.ImageGCFileSystem.f212713f || java.lang.System.currentTimeMillis() - x1Var.f213235e <= 86400000) {
            return false;
        }
        boolean b17 = x1Var.b(true);
        com.tencent.mars.xlog.Log.i("VFS.ImageGCFileSystem", "deleteFile, fe = " + x1Var.f213231a + ", ret = " + b17 + ", modifiedTime = " + x1Var.f213235e);
        return b17;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0227  */
    @Override // com.tencent.mm.vfs.m0, com.tencent.mm.vfs.a, com.tencent.mm.vfs.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(android.os.CancellationSignal r56) {
        /*
            Method dump skipped, instructions count: 871
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.h3.q(android.os.CancellationSignal):void");
    }

    @Override // com.tencent.mm.vfs.a
    public java.lang.String toString() {
        return "imageGC <- " + this.f212972e;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f212974g;
    }
}
