package ep4;

/* loaded from: classes10.dex */
public final class j extends yt3.a implements bp4.b0, bp4.a0, com.tencent.mm.modelbase.u0 {

    /* renamed from: s, reason: collision with root package name */
    public static int f255747s;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f255748f;

    /* renamed from: g, reason: collision with root package name */
    public long f255749g;

    /* renamed from: h, reason: collision with root package name */
    public int f255750h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f255751i;

    /* renamed from: m, reason: collision with root package name */
    public zu3.p f255752m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f255753n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f255754o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.Runnable f255755p;

    /* renamed from: q, reason: collision with root package name */
    public final ep4.m f255756q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelcontrol.VideoTransPara f255757r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(parent, "parent");
        kotlin.jvm.internal.o.g(status, "status");
        this.f255748f = parent;
        this.f255750h = -1;
        this.f255753n = jz5.h.b(new ep4.h(this));
        jz5.h.b(new ep4.i(this));
        jz5.g b17 = jz5.h.b(new ep4.f(this));
        this.f255754o = jz5.h.b(new ep4.g(this));
        this.f255755p = new ep4.c(this);
        android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.a5u, parent, true);
        parent.setOnClickListener(new ep4.a(this));
        ((android.widget.TextView) ((jz5.n) b17).getValue()).setOnClickListener(new ep4.b(this));
        gm0.j1.n().f273288b.a(5207, this);
        this.f255756q = new ep4.m();
        this.f255757r = d11.s.fj().hj();
    }

    public final void A() {
        ((android.view.ViewGroup) ((jz5.n) this.f255753n).getValue()).setVisibility(4);
        ((android.view.ViewGroup) ((jz5.n) this.f255754o).getValue()).setVisibility(0);
        this.f255748f.postDelayed(this.f255755p, 2000L);
        uo4.a.f429674a.b(112L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(zu3.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String valueOf = data instanceof zu3.a0 ? java.lang.String.valueOf(((zu3.a0) data).f475764g) : data instanceof zu3.y ? ((zu3.y) data).f475867i : "";
        this.f255752m = data instanceof zu3.p ? (zu3.p) data : null;
        this.f255751i = true;
        ((android.view.ViewGroup) ((jz5.n) this.f255753n).getValue()).setVisibility(0);
        ((android.view.ViewGroup) ((jz5.n) this.f255754o).getValue()).setVisibility(4);
        this.f255748f.setVisibility(0);
        ep4.k kVar = new ep4.k(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj(), valueOf);
        int i17 = f255747s;
        f255747s = i17 + 1;
        this.f255750h = i17;
        kVar.f255761g = i17;
        gm0.j1.n().f273288b.g(kVar);
        uo4.a.f429674a.b(110L);
    }

    @Override // bp4.b0
    public void b(com.tencent.mm.plugin.vlog.model.h1 h1Var, long j17, boolean z17) {
        this.f255749g = h1Var != null ? h1Var.g() : 0L;
    }

    @Override // bp4.a0
    public void c(long j17) {
    }

    @Override // bp4.a0
    public void n(bp4.c0 c0Var) {
    }

    @Override // bp4.a0
    public void onFinish() {
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var instanceof ep4.k) {
            ep4.k kVar = (ep4.k) m1Var;
            if (kVar.f255761g == this.f255750h) {
                this.f255751i = false;
                ((android.view.ViewGroup) ((jz5.n) this.f255753n).getValue()).setVisibility(4);
                java.lang.String str2 = kVar.f255758d;
                if (i17 != 0 || i18 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EditorReadPlugin", "tts error, input text:" + str2 + ", errType:" + i17 + ", errCode:" + i18);
                    A();
                    return;
                }
                java.lang.String str3 = com.tencent.mm.plugin.sight.base.c.b() + '/' + java.util.UUID.randomUUID();
                java.lang.String str4 = str3 + ".tts";
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tts success, input text:");
                sb6.append(str2);
                sb6.append(", speech size:");
                byte[] bArr = kVar.f255762h;
                sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
                sb6.append(", speech duration:");
                sb6.append(kVar.f255763i);
                sb6.append(", path:");
                sb6.append(str3);
                com.tencent.mars.xlog.Log.i("MicroMsg.EditorReadPlugin", sb6.toString());
                com.tencent.mm.vfs.w6.R(str3, kVar.f255762h);
                kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new ep4.e(this, str4, m1Var, str3, null), 2, null);
            }
        }
    }

    @Override // yt3.r2
    public void release() {
        gm0.j1.n().f273288b.q(5207, this);
    }

    public final void z() {
        ((android.view.ViewGroup) ((jz5.n) this.f255754o).getValue()).setVisibility(4);
        android.view.ViewGroup viewGroup = this.f255748f;
        viewGroup.getHandler().removeCallbacks(this.f255755p);
        viewGroup.setVisibility(8);
        ju3.c0 c0Var = ju3.c0.F2;
        ju3.d0 d0Var = this.f465332d;
        ju3.d0.k(d0Var, c0Var, null, 2, null);
        ju3.d0.k(d0Var, ju3.c0.f301914x2, null, 2, null);
    }
}
