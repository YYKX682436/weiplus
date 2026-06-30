package ps3;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f358062d;

    /* renamed from: e, reason: collision with root package name */
    public final float f358063e;

    /* renamed from: f, reason: collision with root package name */
    public final float f358064f;

    /* renamed from: g, reason: collision with root package name */
    public final int f358065g;

    /* renamed from: h, reason: collision with root package name */
    public final int f358066h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f358067i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f358068m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f358069n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f358070o;

    public a(int i17, float f17, float f18, int i18, int i19, java.lang.String macAddr, java.lang.String cellId) {
        kotlin.jvm.internal.o.g(macAddr, "macAddr");
        kotlin.jvm.internal.o.g(cellId, "cellId");
        this.f358062d = i17;
        this.f358063e = f17;
        this.f358064f = f18;
        this.f358065g = i18;
        this.f358066h = i19;
        this.f358067i = macAddr;
        this.f358068m = cellId;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneRadarSearch", "opcode is wrong!");
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f358069n = callback;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pi5();
        lVar.f70665b = new r45.qi5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmradarsearch";
        lVar.f70667d = 425;
        lVar.f70668e = 209;
        lVar.f70669f = 1000000209;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f358070o = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.RadarSearchRequest");
        r45.pi5 pi5Var = (r45.pi5) fVar;
        pi5Var.f383077d = this.f358062d;
        pi5Var.f383082i = this.f358068m;
        pi5Var.f383083m = this.f358066h;
        pi5Var.f383079f = this.f358063e;
        pi5Var.f383078e = this.f358064f;
        pi5Var.f383081h = this.f358067i;
        pi5Var.f383080g = this.f358065g;
        return dispatch(dispatcher, this.f358070o, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 425;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.util.LinkedList<r45.oi5> linkedList;
        if (this.f358062d == 1 && i18 == 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.modelbase.o oVar = this.f358070o;
            java.lang.Object obj = oVar != null ? oVar.f70711b.f70700a : null;
            r45.qi5 qi5Var = obj instanceof r45.qi5 ? (r45.qi5) obj : null;
            if (qi5Var != null && (linkedList = qi5Var.f384028g) != null) {
                for (r45.oi5 oi5Var : linkedList) {
                    com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                    kotlin.jvm.internal.o.d(oi5Var);
                    java.lang.String str2 = oi5Var.f382283d;
                    if (str2 == null && (str2 = oi5Var.f382287h) == null) {
                        str2 = "";
                    }
                    r0Var.f70529a = str2;
                    r0Var.f70532d = oi5Var.f382286g;
                    r0Var.f70534f = 1;
                    arrayList.add(r0Var);
                }
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().m0(arrayList);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f358069n;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
