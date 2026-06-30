package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186992f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(nw4.k kVar, nw4.y2 y2Var, java.lang.String str) {
        super(1);
        this.f186990d = kVar;
        this.f186991e = y2Var;
        this.f186992f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin finderFeedInfo = (com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.FinderFeedInfoForVideoPlugin) obj;
        kotlin.jvm.internal.o.g(finderFeedInfo, "finderFeedInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderFeedInfo callback result: %s", finderFeedInfo);
        boolean z17 = finderFeedInfo.f186976d.length() == 0;
        nw4.k kVar = this.f186990d;
        nw4.y2 y2Var = this.f186991e;
        if (z17) {
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        } else {
            nw4.g gVar = kVar.f340863d;
            java.lang.String str = y2Var.f341013c;
            java.lang.String str2 = y2Var.f341019i + ":ok";
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("localFeedId", this.f186992f);
            hashMap.put("isLike", java.lang.Boolean.valueOf(finderFeedInfo.f186977e));
            hashMap.put("likeCount", java.lang.Integer.valueOf(finderFeedInfo.f186979g));
            hashMap.put("isFav", java.lang.Boolean.valueOf(finderFeedInfo.f186978f));
            hashMap.put("favCount", java.lang.Integer.valueOf(finderFeedInfo.f186980h));
            gVar.e(str, str2, hashMap);
        }
        return jz5.f0.f302826a;
    }
}
