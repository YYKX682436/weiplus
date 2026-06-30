package rr;

/* loaded from: classes12.dex */
public final class h implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr.n f399128d;

    public h(rr.n nVar) {
        this.f399128d = nVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        rr.n nVar = this.f399128d;
        java.lang.Integer num = nVar.f399142h != null ? 698 : null;
        kotlin.jvm.internal.o.d(num);
        r1Var.q(num.intValue(), this);
        z12.g gVar = nVar.f399142h;
        if (gVar == null || m1Var != gVar) {
            return;
        }
        if (gVar != null && gVar.f469295g == 3) {
            if (i17 != 0 || i18 != 0) {
                rr.n.a(nVar, false);
                return;
            }
            gr.t.g().n(true);
            gr.t.g().l(true);
            z85.l c17 = com.tencent.mm.storage.n5.f().c();
            java.lang.String md52 = nVar.f399137c.getMd5();
            kotlin.jvm.internal.o.f(md52, "getMd5(...)");
            c17.y2(0, kz5.b0.c(md52));
            com.tencent.mm.storage.z4.f196391j.g();
            rr.n.a(nVar, true);
        }
    }
}
