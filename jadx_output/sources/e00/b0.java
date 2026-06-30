package e00;

/* loaded from: classes9.dex */
public final class b0 implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f245740a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f245741b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f245742c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f245743d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f245744e;

    public b0(int i17, java.util.List reqInfo, boolean z17) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        this.f245740a = i17;
        this.f245741b = reqInfo;
        this.f245742c = z17;
        this.f245744e = jz5.h.b(new e00.a0(this));
    }

    @Override // e00.n
    public boolean a() {
        return this.f245742c;
    }

    @Override // e00.n
    public int b() {
        return this.f245740a;
    }

    @Override // e00.n
    public int c() {
        return this.f245741b.size();
    }

    @Override // e00.n
    public void d() {
        bw5.oe0 oe0Var = new bw5.oe0();
        oe0Var.f31081e = this.f245740a;
        oe0Var.f31082f[3] = true;
        oe0Var.f31080d.addAll(this.f245741b);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = oe0Var;
        lVar.f70665b = new bw5.re0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_batchgetproductcard";
        lVar.f70667d = 17166;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new e00.z(this, oe0Var, currentTimeMillis));
    }

    @Override // e00.n
    public java.lang.String getCardType() {
        return "productCard";
    }

    @Override // e00.n
    public java.lang.String getKey() {
        return (java.lang.String) ((jz5.n) this.f245744e).getValue();
    }
}
