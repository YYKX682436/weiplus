package ph1;

/* loaded from: classes7.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PBool f354351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f354352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ph1.e0 f354353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f354354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ph1.g0 f354355h;

    public v(ph1.g0 g0Var, com.tencent.mm.pointers.PBool pBool, ik1.b0 b0Var, ph1.e0 e0Var, ik1.b0 b0Var2) {
        this.f354355h = g0Var;
        this.f354351d = pBool;
        this.f354352e = b0Var;
        this.f354353f = e0Var;
        this.f354354g = b0Var2;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f354351d.value) {
            return;
        }
        ph1.l lVar = new ph1.l();
        ph1.t tVar = new ph1.t(this);
        lVar.f354341h = tVar;
        fl1.a2 a2Var = lVar.f354339f;
        if (a2Var != null) {
            ((fl1.g1) a2Var).setOnCancelListener(tVar);
        }
        lVar.f354337d = new ph1.u(this);
        lVar.b(this.f354355h.f354329f, this.f354353f.f354317b);
        this.f354354g.f291824a = lVar;
    }
}
