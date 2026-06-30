package g22;

/* loaded from: classes15.dex */
public final class i implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final int f267822d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.emoji.model.q f267823e;

    /* renamed from: f, reason: collision with root package name */
    public z12.v f267824f;

    /* renamed from: g, reason: collision with root package name */
    public z12.l f267825g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f267826h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f267827i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f267828m;

    /* renamed from: n, reason: collision with root package name */
    public long f267829n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.EmoticonStoreActionStruct f267830o = com.tencent.mm.plugin.emoji.model.EmojiLogic.b();

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f267831p = new androidx.lifecycle.j0();

    /* renamed from: q, reason: collision with root package name */
    public final int f267832q = 1;

    /* renamed from: r, reason: collision with root package name */
    public final int f267833r = 2;

    /* renamed from: s, reason: collision with root package name */
    public final int f267834s = 3;

    /* renamed from: t, reason: collision with root package name */
    public final int f267835t = 4;

    /* renamed from: u, reason: collision with root package name */
    public final int f267836u = 5;

    /* renamed from: v, reason: collision with root package name */
    public final int f267837v = 6;

    /* renamed from: w, reason: collision with root package name */
    public final ec0.e f267838w = new g22.g(this);

    public i(int i17) {
        this.f267822d = i17;
    }

    public final void a() {
        if (this.f267824f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "requestNetGetStoreRecList failed, mGetStoreRecListNetScene null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "ready to doScene NetSceneGetEmotionStoreRecList");
        this.f267827i = true;
        gm0.j1.n().f273288b.g(this.f267824f);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "onSceneEnd errType:" + i17 + ",errCode:" + i18 + ",errMsg:" + str);
        this.f267831p.setValue(java.lang.Integer.valueOf(this.f267833r));
        if (m1Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "onSceneEnd scene null");
            return;
        }
        if (m1Var.getType() != 6910) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "unknow scene type.");
            return;
        }
        if (!(m1Var instanceof z12.v)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3HomeBaseDataRepo", "sceneType:6910,scene cast NetSceneGetEmotionStoreRecList Failed");
            return;
        }
        this.f267827i = false;
        if (!(i17 == 0 || i17 == 4)) {
            if (this.f267828m) {
                return;
            }
            this.f267831p.setValue(java.lang.Integer.valueOf(this.f267835t));
            return;
        }
        this.f267831p.setValue(java.lang.Integer.valueOf(this.f267837v));
        com.tencent.mm.modelbase.o oVar = ((z12.v) m1Var).f469371d;
        r45.oo3 oo3Var = null;
        if (oVar != null) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            if (fVar instanceof r45.oo3) {
                oo3Var = (r45.oo3) fVar;
            }
        }
        if (oo3Var == null && !this.f267828m) {
            this.f267831p.setValue(java.lang.Integer.valueOf(this.f267835t));
        }
        this.f267823e = new com.tencent.mm.plugin.emoji.model.q(oo3Var);
        if (i18 != 0) {
            this.f267831p.setValue(java.lang.Integer.valueOf(this.f267834s));
        } else {
            this.f267831p.setValue(java.lang.Integer.valueOf(this.f267832q));
            ((ku5.t0) ku5.t0.f312615d).q(new g22.h(oo3Var, this));
        }
    }
}
