package vg2;

/* loaded from: classes3.dex */
public final class t extends vg2.c {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f436584f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.ui.tools.widget.q1 f436585g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.content.Context context, android.view.ViewGroup parentRoot, yz5.l rotateBlock) {
        super(context, parentRoot);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        kotlin.jvm.internal.o.g(rotateBlock, "rotateBlock");
        this.f436584f = rotateBlock;
        this.f436485c.setOnClickListener(new vg2.r(this));
    }

    @Override // vg2.c
    public int a() {
        return com.tencent.mm.R.layout.arl;
    }

    @Override // vg2.c
    public int b() {
        return -i65.a.b(this.f436483a, 4);
    }

    @Override // vg2.c
    public void d(android.view.ViewGroup attachView, java.lang.String giftId) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(attachView, "attachView");
        kotlin.jvm.internal.o.g(giftId, "giftId");
        ce2.i e17 = dk2.u7.f234181a.e(giftId);
        if (e17 == null || e17.field_jumpInfo == null) {
            f0Var = null;
        } else {
            super.d(attachView, giftId);
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            c();
            com.tencent.mars.xlog.Log.e("GiftActivityJumpToastWidget", "jumpInfo = null");
        }
    }

    public final void e(java.lang.String giftId) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.lang.String str;
        kotlin.jvm.internal.o.g(giftId, "giftId");
        ce2.i e17 = dk2.u7.f234181a.e(giftId);
        jz5.f0 f0Var = null;
        if (e17 != null && (finderJumpInfo = e17.field_jumpInfo) != null) {
            com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "bannerJumpImpl business_type:%d", java.lang.Integer.valueOf(finderJumpInfo.getBusiness_type()));
            if (finderJumpInfo.getJumpinfo_type() == 2) {
                com.tencent.mm.protocal.protobuf.Html5Info html5_info = finderJumpInfo.getHtml5_info();
                if (html5_info == null || (str = html5_info.getUrl()) == null) {
                    str = "";
                }
                com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "jump half h5 url:%s", str);
                if (finderJumpInfo.getHtml5_info() == null || android.text.TextUtils.isEmpty(str)) {
                    com.tencent.mars.xlog.Log.e("GiftActivityJumpToastWidget", "jumpToHalfScreenH5 html5_info is null or url is empty");
                } else {
                    com.tencent.mm.protocal.protobuf.Html5Info html5_info2 = finderJumpInfo.getHtml5_info();
                    boolean z17 = html5_info2 != null && html5_info2.getStyle() == 1;
                    android.content.Context context = this.f436483a;
                    if (!z17) {
                        com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "show FullScreenWebView");
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("rawUrl", str);
                        intent.putExtra("convertActivityFromTranslucent", true);
                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                    } else if (context.getResources().getConfiguration().orientation == 2) {
                        this.f436584f.invoke(this.f436487e);
                        com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "change to portrait and show dialog");
                    } else {
                        com.tencent.mm.protocal.protobuf.Html5Info html5_info3 = finderJumpInfo.getHtml5_info();
                        int height_percent = html5_info3 != null ? html5_info3.getHeight_percent() : 0;
                        com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "show HalfScreenWebView heightPercent:" + height_percent);
                        if (height_percent < df2.lt.Y || height_percent > df2.lt.Z) {
                            height_percent = 75;
                        }
                        float f17 = height_percent / 100;
                        com.tencent.mars.xlog.Log.i("GiftActivityJumpToastWidget", "realScreenHeightPercent:" + f17);
                        com.tencent.mm.plugin.webview.ui.tools.widget.q1 wi6 = ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(context, str, null, new com.tencent.mm.plugin.webview.ui.tools.widget.n1(f17, 0.0f, null, false, false, 0, false, false, 0, false, false, 0, false, false, false, null, false, 0, false, 0, false, false, false, 8388586, null));
                        this.f436585g = wi6;
                        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) wi6).show();
                        java.lang.Object obj = this.f436585g;
                        if (obj != null) {
                            ((hg5.d) obj).f281406o = new vg2.s(this);
                        }
                    }
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("GiftActivityJumpToastWidget", "giftActivityJumpToastWidget jump click null");
        }
    }
}
