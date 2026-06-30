package xt1;

/* loaded from: classes4.dex */
public class j0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456501d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456502e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f456503f;

    /* renamed from: g, reason: collision with root package name */
    public int f456504g;

    /* renamed from: h, reason: collision with root package name */
    public int f456505h;

    /* renamed from: i, reason: collision with root package name */
    public int f456506i;

    public j0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jc3();
        lVar.f70665b = new r45.kc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getcardserial";
        lVar.f70667d = nd1.a2.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456501d = a17;
        ((r45.jc3) a17.f70710a.f70684a).f377697d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456502e = u0Var;
        return dispatch(sVar, this.f456501d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return nd1.a2.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.kc3 kc3Var = (r45.kc3) this.f456501d.f70711b.f70700a;
            this.f456503f = kc3Var.f378583d;
            this.f456504g = kc3Var.f378584e;
            this.f456505h = kc3Var.f378585f;
            this.f456506i = kc3Var.f378586g;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp request_time = %d, request_count = %d, refresh_interval = %d,", java.lang.Integer.valueOf(this.f456504g), java.lang.Integer.valueOf(this.f456505h), java.lang.Integer.valueOf(this.f456506i));
        if (this.f456503f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetCardSerial", "onGYNetEnd, resp codes size is " + this.f456503f.size());
        }
        this.f456502e.onSceneEnd(i18, i19, str, this);
    }
}
