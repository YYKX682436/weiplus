package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public class r3 extends com.tencent.mm.vfs.k4 implements com.tencent.mm.vfs.p2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f213157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.MaintenanceGroup f213158e;

    public r3(com.tencent.mm.vfs.MaintenanceGroup maintenanceGroup, java.util.List list) {
        this.f213158e = maintenanceGroup;
        this.f213157d = list;
    }

    @Override // com.tencent.mm.vfs.p2
    public java.util.List E() {
        return this.f213157d;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.tencent.mm.vfs.r3) {
            if (this.f213157d.equals(((com.tencent.mm.vfs.r3) obj).f213157d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return com.tencent.mm.vfs.r3.class.hashCode() ^ this.f213157d.hashCode();
    }

    @Override // com.tencent.mm.vfs.k4, com.tencent.mm.vfs.q2
    public void q(android.os.CancellationSignal cancellationSignal) {
        for (com.tencent.mm.vfs.q2 q2Var : this.f213157d) {
            cancellationSignal.throwIfCanceled();
            q2Var.q(cancellationSignal);
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(512);
        sb6.append("maintenanceGroup:");
        for (com.tencent.mm.vfs.q2 q2Var : this.f213157d) {
            sb6.append("\n  ");
            sb6.append(q2Var);
        }
        return sb6.toString();
    }

    @Override // com.tencent.mm.vfs.q2
    public com.tencent.mm.vfs.FileSystem y() {
        return this.f213158e;
    }
}
