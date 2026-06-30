package e00;

/* loaded from: classes9.dex */
public final class v implements e00.n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f245821a;

    /* renamed from: b, reason: collision with root package name */
    public final w05.h f245822b;

    /* renamed from: c, reason: collision with root package name */
    public final int f245823c;

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f245824d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f245825e;

    public v(java.lang.String path, w05.h reqInfo, int i17) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(reqInfo, "reqInfo");
        this.f245821a = path;
        this.f245822b = reqInfo;
        this.f245823c = i17;
        this.f245825e = jz5.h.b(new e00.u(this));
    }

    @Override // e00.n
    public boolean a() {
        return false;
    }

    @Override // e00.n
    public int b() {
        return this.f245823c;
    }

    @Override // e00.n
    public int c() {
        return 1;
    }

    @Override // e00.n
    public void d() {
        bw5.ye0 ye0Var = new bw5.ye0();
        ye0Var.f35456d = this.f245821a;
        boolean[] zArr = ye0Var.f35461i;
        zArr[2] = true;
        w05.h hVar = this.f245822b;
        ye0Var.f35457e = hVar.y();
        zArr[3] = true;
        ye0Var.f35458f = hVar.j();
        zArr[4] = true;
        ye0Var.f35459g = hVar.l();
        zArr[5] = true;
        ye0Var.f35460h = this.f245823c;
        zArr[6] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = ye0Var;
        lVar.f70665b = new bw5.ze0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getecjumpinfo";
        lVar.f70667d = 13462;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new e00.t(this, ye0Var, currentTimeMillis));
    }

    @Override // e00.n
    public java.lang.String getCardType() {
        return "BulkBuyCard";
    }

    @Override // e00.n
    public java.lang.String getKey() {
        return (java.lang.String) ((jz5.n) this.f245825e).getValue();
    }
}
