package fk2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fk2.n f263429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mh1 f263430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fk2.n nVar, r45.mh1 mh1Var, android.content.Context context) {
        super(1);
        this.f263429d = nVar;
        this.f263430e = mh1Var;
        this.f263431f = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g((android.view.View) obj, "<anonymous parameter 0>");
        fk2.n nVar = this.f263429d;
        com.tencent.mm.plugin.finder.live.view.k0 p17 = nVar.f263436m.p();
        r45.mh1 mh1Var = this.f263430e;
        r45.y23 y23Var = (r45.y23) mh1Var.getCustom(0);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (p17 == null || y23Var == null) {
            f0Var = null;
        } else {
            dk2.q4.f233938a.n(this.f263431f, p17.getBuContext(), st2.c2.f412249a.c(y23Var, 1205, null, "", null, true), p17);
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(nVar.f263437n, "product click failed, curlayout = " + nVar.f263436m.p() + ", productInfo = " + mh1Var);
        }
        return f0Var2;
    }
}
