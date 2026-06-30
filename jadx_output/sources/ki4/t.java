package ki4;

/* loaded from: classes9.dex */
public final class t implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi4.a f308152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bi4.v0 f308153e;

    public t(fi4.a aVar, bi4.v0 v0Var) {
        this.f308152d = aVar;
        this.f308153e = v0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        fi4.a aVar = this.f308152d;
        aVar.getClass();
        d17.p(5829, this);
        com.tencent.mm.modelbase.r1 d18 = gm0.j1.d();
        aVar.getClass();
        d18.q(5829, this);
        bi4.v0 v0Var = this.f308153e;
        if (i17 != 0 || i18 != 0) {
            if (v0Var != null) {
                v0Var.a(false, null);
            }
        } else {
            pj4.i iVar = aVar.f263060i;
            if (iVar == null || v0Var == null) {
                return;
            }
            v0Var.a(true, iVar.f355109d);
        }
    }
}
