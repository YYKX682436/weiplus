package o72;

/* loaded from: classes12.dex */
public class l5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f343397d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f343398e;

    /* renamed from: f, reason: collision with root package name */
    public final int f343399f;

    /* renamed from: g, reason: collision with root package name */
    public final int f343400g;

    /* renamed from: h, reason: collision with root package name */
    public final o72.m2 f343401h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f343402i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f343403m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f343404n;

    /* renamed from: o, reason: collision with root package name */
    public final int f343405o;

    /* renamed from: p, reason: collision with root package name */
    public final o72.r2 f343406p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f343407q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f343408r;

    public l5(int i17, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, int i18) {
        o72.r2 re6;
        this.f343398e = null;
        this.f343407q = "";
        this.f343408r = "";
        if (com.tencent.mars.xlog.Log.isDebug()) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mm.sdk.platformtools.z3.b(true);
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.co4();
        lVar.f70665b = new r45.do4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/modfavitem";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetAgcRxOn;
        lVar.f70668e = 216;
        lVar.f70669f = 1000000216;
        this.f343397d = lVar.a();
        this.f343402i = linkedList2;
        this.f343403m = linkedList;
        this.f343399f = i17;
        this.f343400g = i18;
        long H = H();
        if (H <= 0 && (re6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i17)) != null) {
            H = re6.field_localId;
        }
        this.f343408r = o72.s2.f(H);
    }

    public long H() {
        o72.m2 m2Var = this.f343401h;
        if (m2Var == null) {
            return -1L;
        }
        return m2Var.field_localId;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        java.lang.String str;
        java.util.LinkedList linkedList = this.f343403m;
        int i17 = this.f343405o;
        if (i17 == 0 && (linkedList == null || linkedList.size() == 0)) {
            return -1;
        }
        com.tencent.mm.modelbase.o oVar = this.f343397d;
        r45.co4 co4Var = (r45.co4) oVar.f70710a.f70684a;
        co4Var.f371715e = linkedList.size();
        java.util.LinkedList linkedList2 = this.f343402i;
        if (linkedList2 != null) {
            co4Var.f371717g = linkedList2.size();
            co4Var.f371718h = linkedList2;
        } else {
            co4Var.f371717g = 0;
            co4Var.f371718h = new java.util.LinkedList();
        }
        java.lang.String str2 = this.f343404n;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            co4Var.f371719i = str2;
        }
        co4Var.f371715e = linkedList.size();
        co4Var.f371716f = linkedList;
        int i18 = this.f343399f;
        co4Var.f371714d = i18;
        co4Var.f371720m = i17;
        this.f343398e = u0Var;
        if (!this.f343407q.isEmpty()) {
            co4Var.f371723p = this.f343407q;
        }
        java.lang.String str3 = this.f343408r;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(co4Var.f371715e);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(co4Var.f371717g);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(i17);
        java.lang.String str4 = this.f343407q;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = o72.s2.f343461a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            str = "xmlLen=0";
        } else {
            str = "xmlLen=" + str2.length();
        }
        o72.s2.g("MicroMsg.Fav.NetSceneModFavItem", str3, "Request Start params: favId=%d, indexCount=%d, objectCount=%d, scene=%d, clientId=%s, %s", valueOf, valueOf2, valueOf3, valueOf4, str4, str);
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetAgcRxOn;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 4 && i19 != 0) {
            o72.r2 r2Var = this.f343406p;
            o72.d2.f(10002, i19, r2Var != null ? java.lang.String.format("itemType=%d;id=%d;localId=%s;errType:%d;errCode:%d;errMsg:%s", java.lang.Integer.valueOf(r2Var.field_type), java.lang.Integer.valueOf(r2Var.field_id), java.lang.Long.valueOf(r2Var.field_localId), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str) : java.lang.String.format("itemInfo null;errType:%d;errCode:%d;errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str));
        }
        boolean z17 = false;
        boolean z18 = i19 == 0;
        int i27 = this.f343399f;
        o72.d2.e(i27, i18, i19, z18, 1);
        o72.d2.b();
        java.lang.String str2 = this.f343408r;
        long H = H();
        int i28 = this.f343399f;
        if (i18 == 0 && i19 == 0) {
            z17 = true;
        }
        o72.s2.l("MicroMsg.Fav.NetSceneModFavItem", str2, H, i28, i18, i19, z17);
        this.f343398e.onSceneEnd(i18, i19, str, this);
        o72.x1.f(((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().re(i27));
    }

    public l5(o72.r2 r2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2) {
        this(r2Var.field_id, linkedList, linkedList2, 0);
        this.f343406p = r2Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l5(int r4, o72.m2 r5) {
        /*
            r3 = this;
            r45.kp0 r0 = r5.field_modItem
            java.util.LinkedList r1 = r0.f378888d
            java.util.LinkedList r0 = r0.f378889e
            r2 = 1
            r3.<init>(r4, r1, r0, r2)
            r3.f343401h = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o72.l5.<init>(int, o72.m2):void");
    }

    public l5(o72.r2 r2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str) {
        this(r2Var.field_id, linkedList, linkedList2, 0);
        this.f343404n = str;
        this.f343406p = r2Var;
    }

    public l5(o72.r2 r2Var, java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.lang.String str, int i17) {
        this(r2Var.field_id, linkedList, linkedList2, 0);
        this.f343404n = str;
        this.f343405o = i17;
        this.f343406p = r2Var;
    }
}
