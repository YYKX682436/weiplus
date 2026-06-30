package th1;

/* loaded from: classes7.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f419317d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f419318e;

    /* renamed from: f, reason: collision with root package name */
    public r45.q77 f419319f;

    public e() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.p77();
        lVar.f70665b = new r45.q77();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/weappsearchtitle";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.ad.jsapi.r.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f419317d = a17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetWeAppSearchTitle", "doScene");
        this.f419318e = u0Var;
        return dispatch(sVar, this.f419317d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.ad.jsapi.r.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetWeAppSearchTitle", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f419319f = (r45.q77) this.f419317d.f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f419318e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        if (this.f419319f.f383750d == null) {
            return;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        c17.x(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_LANG_STRING_SYNC, java.util.Locale.getDefault().getLanguage());
        c17.x(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_STRING_SYNC, this.f419319f.f383750d.f384599d);
        c17.x(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_CONTENT_ID_STRING_SYNC, this.f419319f.f383750d.f384600e);
        c17.x(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_INPUT_HINT_UPDATE_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        c17.x(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_FROM_DESKTOP_INPUT_HINT_CONTENT_STRING_SYNC, this.f419319f.f383751e.f384599d);
        c17.x(com.tencent.mm.storage.u3.USERINFO_WXA_SEARCH_FROM_DESKTOP_MORE_INPUT_HINT_CONTENT_STRING_SYNC, this.f419319f.f383752f.f384599d);
    }
}
