package gi5;

/* loaded from: classes12.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f272299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f272300e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ai5.c f272301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gi5.g f272302g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f272303h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272304i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f272305m;

    public d(java.util.List list, r45.gp0 gp0Var, ai5.c cVar, gi5.g gVar, mf3.k kVar, java.lang.String str, java.lang.Runnable runnable) {
        this.f272299d = list;
        this.f272300e = gp0Var;
        this.f272301f = cVar;
        this.f272302g = gVar;
        this.f272303h = kVar;
        this.f272304i = str;
        this.f272305m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (java.lang.String str : this.f272299d) {
            c01.h7 h7Var = new c01.h7();
            h7Var.f37231f = this.f272300e.f375431q2;
            ai5.c cVar = this.f272301f;
            h7Var.f37227b = cVar.f5208b;
            h7Var.f37229d = cVar.f5209c;
            ((dk5.s5) tg3.t1.a()).Vi(this.f272302g.getActivity(), str, this.f272303h.g(), 0, "", "", h7Var);
            ((dk5.s5) tg3.t1.a()).Ui(this.f272304i, str);
        }
        ((ku5.t0) ku5.t0.f312615d).B(new gi5.c(this.f272305m, this.f272302g));
    }
}
