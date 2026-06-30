package eh4;

/* loaded from: classes8.dex */
public class a extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252921d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252922e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f252923f;

    /* renamed from: g, reason: collision with root package name */
    public int f252924g;

    /* renamed from: h, reason: collision with root package name */
    public long f252925h;

    /* renamed from: i, reason: collision with root package name */
    public int f252926i;

    /* renamed from: m, reason: collision with root package name */
    public int f252927m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.LinkedList f252928n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f252929o;

    /* renamed from: p, reason: collision with root package name */
    public final int f252930p;

    public a(java.lang.String str, int i17) {
        this.f252930p = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        this.f252930p = i17;
        lVar.f70664a = new r45.zk0();
        lVar.f70665b = new r45.al0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/entertalkroom";
        lVar.f70667d = 332;
        lVar.f70668e = 147;
        lVar.f70669f = 1000000147;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252922e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        ((r45.zk0) fVar).f392157d = str;
        ((r45.zk0) fVar).f392158e = i17;
        this.f252923f = str;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f252923f;
    }

    @Override // eh4.f
    public int I() {
        return this.f252930p;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252921d = u0Var;
        return dispatch(sVar, this.f252922e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 332;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f252921d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.al0 al0Var = (r45.al0) this.f252922e.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneEnterTalkRoom", "resp %s", al0Var.toString());
        this.f252924g = al0Var.f370079d;
        this.f252925h = al0Var.f370080e;
        this.f252926i = al0Var.f370081f;
        this.f252927m = al0Var.f370084i;
        java.util.LinkedList linkedList = al0Var.f370083h;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.nk6 nk6Var = (r45.nk6) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nk6Var.f381474e)) {
                linkedList2.add(nk6Var);
            }
        }
        this.f252928n = linkedList2;
        java.util.LinkedList linkedList3 = al0Var.f370086n;
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList3.iterator();
        while (it6.hasNext()) {
            linkedList4.add((r45.mk6) it6.next());
        }
        this.f252929o = linkedList4;
        this.f252921d.onSceneEnd(i18, i19, str, this);
    }
}
