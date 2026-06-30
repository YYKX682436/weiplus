package e00;

/* loaded from: classes9.dex */
public final class e0 implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final int f245756a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f245757b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f245758c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f245759d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f245760e;

    public e0(int i17, java.util.List reqInfo, boolean z17) {
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        this.f245756a = i17;
        this.f245757b = reqInfo;
        this.f245758c = z17;
        this.f245760e = jz5.h.b(new e00.d0(this));
    }

    @Override // e00.n
    public boolean a() {
        return this.f245758c;
    }

    @Override // e00.n
    public int b() {
        return this.f245756a;
    }

    @Override // e00.n
    public int c() {
        return this.f245757b.size();
    }

    @Override // e00.n
    public void d() {
        bw5.te0 te0Var = new bw5.te0();
        te0Var.f33414e = this.f245756a;
        te0Var.f33415f[3] = true;
        te0Var.f33413d.addAll(this.f245757b);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = te0Var;
        lVar.f70665b = new bw5.ve0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_batchgetshopcard";
        lVar.f70667d = 15872;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new e00.c0(this, te0Var, currentTimeMillis));
    }

    @Override // e00.n
    public java.lang.String getCardType() {
        return "shopCard";
    }

    @Override // e00.n
    public java.lang.String getKey() {
        return (java.lang.String) ((jz5.n) this.f245760e).getValue();
    }
}
