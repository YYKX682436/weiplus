package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class o0 extends com.tencent.mm.vfs.k4 implements com.tencent.mm.vfs.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.vfs.q2 f213100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.DeleteAllFileSystem f213101e;

    public o0(com.tencent.mm.vfs.DeleteAllFileSystem deleteAllFileSystem, com.tencent.mm.vfs.q2 q2Var) {
        this.f213101e = deleteAllFileSystem;
        this.f213100d = q2Var;
    }

    @Override // com.tencent.mm.vfs.p2
    public java.util.List E() {
        return java.util.Collections.singletonList(this.f213100d);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.o0) {
            if (this.f213100d.equals(((com.tencent.mm.vfs.o0) obj).f213100d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.o0.class.hashCode() ^ this.f213100d.hashCode();
    }

    @Override // com.tencent.mm.vfs.k4, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        com.tencent.mm.vfs.q2 q2Var = this.f213100d;
        q2Var.e("", true);
        cancellationSignal.throwIfCanceled();
        q2Var.q(cancellationSignal);
    }

    public java.lang.String toString() {
        return "delete <- " + this.f213100d;
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213101e;
    }
}
