package nl3;

/* loaded from: classes10.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f338178d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f338179e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.m10 f338180f;

    public a(int i17, ql3.a aVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 940;
        lVar.f70666c = "/cgi-bin/micromsg-bin/checkmusic";
        lVar.f70664a = new r45.m10();
        lVar.f70665b = new r45.n10();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f338179e = a17;
        r45.m10 m10Var = (r45.m10) a17.f70710a.f70684a;
        this.f338180f = m10Var;
        m10Var.f380066o = i17;
        m10Var.f380065n = aVar.field_appId;
        m10Var.f380060f = aVar.field_songAlbumUrl;
        m10Var.f380061g = aVar.field_songHAlbumUrl;
        m10Var.f380063i = aVar.field_songWifiUrl;
        m10Var.f380064m = aVar.field_songWapLinkUrl;
        m10Var.f380062h = aVar.field_songWebUrl;
        m10Var.f380059e = aVar.field_songName;
        m10Var.f380058d = aVar.field_musicId;
        m10Var.f380069r = aVar.field_songSinger;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f338178d = u0Var;
        return dispatch(sVar, this.f338179e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 940;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Music.NetSceneCheckMusic", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f338178d.onSceneEnd(i18, i19, str, this);
    }
}
