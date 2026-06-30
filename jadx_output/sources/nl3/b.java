package nl3;

/* loaded from: classes8.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338181d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f338182e;

    /* renamed from: f, reason: collision with root package name */
    public r45.bm3 f338183f;

    /* renamed from: g, reason: collision with root package name */
    public final ql3.a f338184g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f338185h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f338186i;

    public b(ql3.a aVar, boolean z17, boolean z18) {
        this.f338184g = aVar;
        this.f338185h = z17;
        this.f338186i = z18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.am3();
        lVar.f70665b = new r45.bm3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getqqmusiclyric";
        lVar.f70667d = 520;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f338182e = a17;
        r45.am3 am3Var = (r45.am3) a17.f70710a.f70684a;
        am3Var.f370119d = aVar.field_songId;
        java.lang.String str = aVar.field_songWebUrl;
        if (str != null) {
            am3Var.f370120e = x51.j1.a(str.getBytes());
        }
        java.lang.String str2 = aVar.field_songMId;
        if (str2 != null) {
            am3Var.f370123h = x51.j1.a(str2.getBytes());
        }
        am3Var.f370121f = !b21.q.a() ? 1 : 0;
        am3Var.f370122g = b21.q.b() ? 1 : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "songId=%d, url=%s IsOutsideGFW=%d ShakeMusicGlobalSwitch=%d", java.lang.Integer.valueOf(aVar.field_songId), aVar.field_songWebUrl, java.lang.Integer.valueOf(am3Var.f370121f), java.lang.Integer.valueOf(am3Var.f370122g));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f338181d = u0Var;
        return dispatch(sVar, this.f338182e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 520;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneGetQQMusicLyric", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f338181d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f338183f = (r45.bm3) this.f338182e.f70711b.f70700a;
            this.f338181d.onSceneEnd(i18, i19, str, this);
        }
    }
}
