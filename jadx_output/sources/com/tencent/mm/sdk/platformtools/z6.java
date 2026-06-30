package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class z6 extends com.tencent.mm.sdk.platformtools.a7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193136d;

    public z6(java.lang.String str) {
        super(null, null, null);
        this.f193136d = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.a7
    public void a() {
        com.tencent.mm.vfs.w6.h(this.f193136d);
    }

    @Override // com.tencent.mm.sdk.platformtools.a7
    public java.io.OutputStream b() {
        try {
            return com.tencent.mm.vfs.w6.K(this.f193136d, false);
        } catch (java.io.FileNotFoundException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ScopedStorageUtil", "VFSFileOp openWrite fail: " + e17.getMessage());
            return null;
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.a7
    public void c() {
    }
}
