package e00;

/* loaded from: classes9.dex */
public final class y implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f245830a;

    /* renamed from: b, reason: collision with root package name */
    public final w05.h f245831b;

    /* renamed from: c, reason: collision with root package name */
    public final int f245832c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f245833d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f245834e;

    public y(java.lang.String path, w05.h reqInfo, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        this.f245830a = path;
        this.f245831b = reqInfo;
        this.f245832c = i17;
        this.f245834e = jz5.h.b(new e00.x(this));
    }

    @Override // e00.n
    public boolean a() {
        return false;
    }

    @Override // e00.n
    public int b() {
        return this.f245832c;
    }

    @Override // e00.n
    public int c() {
        return 1;
    }

    @Override // e00.n
    public void d() {
        bw5.p10 p10Var = new bw5.p10();
        w05.h hVar = this.f245831b;
        p10Var.f31432d = hVar.n();
        boolean[] zArr = p10Var.f31436h;
        zArr[2] = true;
        p10Var.f31433e = hVar.x();
        zArr[3] = true;
        p10Var.f31434f = this.f245830a;
        zArr[4] = true;
        p10Var.f31435g = this.f245832c;
        zArr[5] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = p10Var;
        lVar.f70665b = new bw5.q10();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getcardecsjumpinfo";
        lVar.f70667d = 29379;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new e00.w(this, p10Var, currentTimeMillis));
    }

    @Override // e00.n
    public java.lang.String getCardType() {
        return "NativeAppMsgCard";
    }

    @Override // e00.n
    public java.lang.String getKey() {
        return (java.lang.String) ((jz5.n) this.f245834e).getValue();
    }
}
