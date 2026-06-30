package vr3;

/* loaded from: classes11.dex */
public final class o implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f439640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j0 f439641f;

    public o(yz5.l lVar, yz5.l lVar2, androidx.lifecycle.j0 j0Var) {
        this.f439639d = lVar;
        this.f439640e = lVar2;
        this.f439641f = j0Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public final int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        r45.wl wlVar = fVar instanceof r45.wl ? (r45.wl) fVar : null;
        yz5.l lVar = this.f439639d;
        if (i17 != 0 || i18 != 0 || wlVar == null) {
            lVar.invoke(java.lang.Boolean.FALSE);
            gr3.c.c(55L);
            return 0;
        }
        yz5.l lVar2 = this.f439640e;
        if (lVar2 != null) {
            lVar2.invoke(wlVar);
        }
        r45.wl wlVar2 = new r45.wl();
        wlVar2.parseFrom(wlVar.toByteArray());
        this.f439641f.setValue(wlVar2);
        lVar.invoke(java.lang.Boolean.FALSE);
        return 0;
    }
}
