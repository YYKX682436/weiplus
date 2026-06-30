package lx;

/* loaded from: classes11.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f321840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f321841e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx.u f321842f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f321843g;

    public l(int i17, int i18, lx.u uVar, boolean z17) {
        this.f321840d = i17;
        this.f321841e = i18;
        this.f321842f = uVar;
        this.f321843g = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg0.e2 e2Var = (sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class));
        int i17 = this.f321840d;
        int i18 = this.f321841e;
        boolean z17 = !e2Var.wi(i17, i18);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492174fh4));
        a17.putExtra("searchbar_tips", com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492174fh4));
        a17.putExtra("KRightBtn", true);
        a17.putExtra("ftsneedkeyboard", z17);
        a17.putExtra("publishIdPrefix", "bs");
        a17.putExtra("ftsType", i18);
        a17.putExtra("ftsbizscene", i17);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(i17, true, i18);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) hashMap.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), 0);
        ((sg0.y3) o1Var).getClass();
        java.lang.String f17 = su4.r2.f(D1);
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        a17.putExtra("key_preload_biz", 4);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, f17);
        ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).getClass();
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        a17.putExtra("key_load_js_without_delay", true);
        a17.addFlags(67108864);
        boolean C = com.tencent.mm.ui.bk.C();
        lx.u uVar = this.f321842f;
        android.os.Bundle bundle = !C ? android.app.ActivityOptions.makeSceneTransitionAnimation(uVar.f321957e, new android.util.Pair[0]).toBundle() : null;
        java.lang.String str = this.f321843g ? "bizPicAccountTopSearch" : "bizAccountTopSearch";
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("entranceWording").optString(str);
        if (!android.text.TextUtils.isEmpty(optString)) {
            a17.putExtra("key_search_input_hint", optString);
        }
        j45.l.z(uVar.f321957e, a17, bundle);
    }
}
