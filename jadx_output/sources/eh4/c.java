package eh4;

/* loaded from: classes4.dex */
public class c extends eh4.f {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f252933d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f252934e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f252935f;

    /* renamed from: g, reason: collision with root package name */
    public int f252936g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f252937h;

    /* renamed from: i, reason: collision with root package name */
    public final int f252938i;

    public c(int i17, long j17, java.lang.String str, int i18) {
        this.f252938i = 0;
        this.f252938i = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xo3();
        lVar.f70665b = new r45.yo3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/gettalkroommember";
        lVar.f70667d = 336;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f252934e = a17;
        r45.xo3 xo3Var = (r45.xo3) a17.f70710a.f70684a;
        xo3Var.f390292d = i17;
        xo3Var.f390293e = j17;
        this.f252935f = str;
        xo3Var.f390294f = i18;
    }

    @Override // eh4.f
    public java.lang.String H() {
        return this.f252935f;
    }

    @Override // eh4.f
    public int I() {
        return this.f252938i;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f252933d = u0Var;
        return dispatch(sVar, this.f252934e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 336;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            this.f252933d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.yo3 yo3Var = (r45.yo3) this.f252934e.f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetTalkRoomMember", "resp %s", yo3Var.toString());
        this.f252936g = yo3Var.f391256d;
        java.util.LinkedList linkedList = yo3Var.f391258f;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            r45.nk6 nk6Var = (r45.nk6) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(nk6Var.f381474e)) {
                linkedList2.add(nk6Var);
            }
        }
        this.f252937h = linkedList2;
        this.f252933d.onSceneEnd(i18, i19, str, this);
    }
}
