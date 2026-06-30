package cp4;

/* loaded from: classes8.dex */
public final class h1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f221027d;

    /* renamed from: e, reason: collision with root package name */
    public final int f221028e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f221029f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f221030g;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f221032i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f221034n;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f221031h = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f221033m = "";

    public h1(int i17, com.tencent.mm.protobuf.g gVar, int i18, int i19, int i27, com.tencent.mm.protobuf.g gVar2) {
        this.f221027d = i17;
        this.f221028e = i18;
        this.f221029f = gVar2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.js();
        lVar.f70665b = new r45.ks();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmccvoicetrans";
        lVar.f70667d = 3835;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f221030g = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransRequest");
        r45.js jsVar = (r45.js) fVar;
        if (gVar2 == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append(hashCode());
            byte[] bytes = sb6.toString().getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            this.f221029f = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
        }
        jsVar.f378077d = this.f221029f;
        jsVar.f378078e = i18;
        jsVar.f378079f = gVar;
        jsVar.f378080g = i19;
        jsVar.f378081h = i27;
        jsVar.f378082i = 10;
        if (gVar == null) {
            this.f221032i = true;
        } else if (gVar.f192156a.length + i19 >= i27) {
            this.f221032i = true;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetVideoCaption", "doScene");
        this.f221034n = u0Var;
        return dispatch(sVar, this.f221030g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3835;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetVideoCaption", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetVideoCaption", "onGYNetEnd error");
        }
        java.util.ArrayList arrayList = this.f221031h;
        arrayList.clear();
        com.tencent.mm.protobuf.f fVar = this.f221030g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
        arrayList.addAll(((r45.ks) fVar).f378913d);
        com.tencent.mm.modelbase.u0 u0Var = this.f221034n;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
