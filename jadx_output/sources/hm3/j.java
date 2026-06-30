package hm3;

/* loaded from: classes10.dex */
public final class j extends hm3.a {

    /* renamed from: r, reason: collision with root package name */
    public static final hm3.i f282250r = new hm3.i(null);

    /* renamed from: i, reason: collision with root package name */
    public final r45.hf2 f282251i;

    /* renamed from: m, reason: collision with root package name */
    public final int f282252m;

    /* renamed from: n, reason: collision with root package name */
    public final int f282253n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282254o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282255p;

    /* renamed from: q, reason: collision with root package name */
    public r45.tr4 f282256q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.hf2 songInfo, int i17, int i18, int i19) {
        super(i19);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f282251i = songInfo;
        this.f282252m = i17;
        this.f282253n = i18;
        r45.sr4 sr4Var = new r45.sr4();
        sr4Var.f385939d = songInfo.getString(5);
        sr4Var.f385940e = songInfo.getString(0);
        sr4Var.f385941f = songInfo.getString(1);
        sr4Var.f385943h = songInfo.getString(2);
        sr4Var.f385942g = songInfo.getString(4);
        sr4Var.f385944i = i17;
        sr4Var.f385945m = songInfo;
        this.f282255p = f282250r.a(sr4Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282254o = callback;
        return dispatch(dispatcher, this.f282255p, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5904;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetBeatTrack", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282254o;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282255p.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetBeatTrackResp");
        this.f282256q = (r45.tr4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282254o;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
