package ki4;

/* loaded from: classes11.dex */
public final class h0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi4.b f308135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bi4.u0 f308136e;

    public h0(fi4.b bVar, bi4.u0 u0Var) {
        this.f308135d = bVar;
        this.f308136e = u0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        this.f308135d.getClass();
        d17.p(5907, this);
        gm0.j1.d().q(5907, this);
        bi4.u0 u0Var = this.f308136e;
        if (i17 != 0 || i18 != 0) {
            u0Var.getClass();
            return;
        }
        ki4.v vVar = (ki4.v) u0Var;
        ki4.x.wi(vVar.f308157a, new jz5.l(vVar.f308158b, vVar.f308159c.field_userName), null, null, false, 14, null);
    }
}
