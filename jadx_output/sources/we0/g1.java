package we0;

/* loaded from: classes9.dex */
public final class g1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ej4.c f445117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xe0.k0 f445118e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f445119f;

    public g1(ej4.c cVar, xe0.k0 k0Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f445117d = cVar;
        this.f445118e = k0Var;
        this.f445119f = u3Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        ej4.c cVar = this.f445117d;
        cVar.getClass();
        d17.p(4301, this);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        cVar.getClass();
        d18.q(4301, this);
        xe0.k0 k0Var = this.f445118e;
        if (i17 == 0 && i18 == 0) {
            pj4.f fVar = cVar.f253334f;
            if (fVar != null) {
                ((com.tencent.mm.ui.chatting.viewitems.ul) k0Var).a(true, fVar.f355036d);
            }
        } else {
            ((com.tencent.mm.ui.chatting.viewitems.ul) k0Var).a(false, null);
        }
        this.f445119f.dismiss();
    }
}
