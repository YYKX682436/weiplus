package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class t0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f185823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.m1 f185824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f185825f;

    public t0(android.content.Context context, ot0.m1 m1Var, int i17) {
        this.f185823d = context;
        this.f185824e = m1Var;
        this.f185825f = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f185825f;
        com.tencent.mm.plugin.webview.ui.tools.media.a aVar = com.tencent.mm.plugin.webview.ui.tools.media.a.f185739a;
        ot0.m1 msgInfo = this.f185824e;
        if (itemId == 1) {
            android.content.Context context = this.f185823d;
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183811d3.f185807a = msgInfo;
            com.tencent.mm.plugin.webview.ui.tools.media.j0.f185786a.b(context, msgInfo.f373343h, "", msgInfo.f373342g, msgInfo.f373339d, 2);
            aVar.a(1, i18, 3);
            return;
        }
        android.content.Context context2 = this.f185823d;
        if (itemId == 0) {
            kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
            com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable mpVideoDataParcelable = new com.tencent.mm.plugin.webview.ui.tools.media.MpVideoDataParcelable();
            mpVideoDataParcelable.f185733h = msgInfo;
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, mpVideoDataParcelable, com.tencent.mm.plugin.webview.ui.tools.media.o0.class, com.tencent.mm.plugin.webview.ui.tools.media.p0.f185810d);
            db5.e1.T(context2, context2.getString(com.tencent.mm.R.string.cbq));
            aVar.a(2, i18, 3);
            return;
        }
        if (itemId == 2) {
            com.tencent.mm.plugin.webview.ui.tools.media.g0 g0Var = com.tencent.mm.plugin.webview.ui.tools.media.g0.f185777a;
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            g0Var.a(msgInfo, (com.tencent.mm.ui.MMActivity) context2, msgInfo.f348587y);
            aVar.a(4, i18, 3);
        }
    }
}
