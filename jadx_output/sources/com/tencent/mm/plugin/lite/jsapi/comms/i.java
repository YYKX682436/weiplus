package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.ui.ChatFooterPanel f143606a;

    /* renamed from: b, reason: collision with root package name */
    public final long f143607b;

    /* renamed from: c, reason: collision with root package name */
    public final long f143608c;

    public i(com.tencent.mm.pluginsdk.ui.ChatFooterPanel emoticonPanel, long j17, long j18) {
        kotlin.jvm.internal.o.g(emoticonPanel, "emoticonPanel");
        this.f143606a = emoticonPanel;
        this.f143607b = j17;
        this.f143608c = j18;
    }

    public static final void a(com.tencent.mm.plugin.lite.jsapi.comms.i iVar, java.lang.String str, cl0.g gVar) {
        iVar.getClass();
        cl0.g gVar2 = new cl0.g();
        gVar2.h("type", str);
        gVar2.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, gVar);
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(iVar.f143607b, iVar.f143608c, "emoticon.itemSelect", gVar2);
    }

    public final android.content.Context b() {
        java.lang.Object uICallback = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143607b);
        if (uICallback == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            return context;
        }
        if (uICallback instanceof android.app.Activity) {
            return (android.content.Context) uICallback;
        }
        if (uICallback instanceof android.app.Fragment) {
            android.app.Activity activity = ((android.app.Fragment) uICallback).getActivity();
            kotlin.jvm.internal.o.d(activity);
            return activity;
        }
        android.content.Context context2 = ((android.view.View) uICallback).getContext();
        kotlin.jvm.internal.o.d(context2);
        return context2;
    }

    public final void c(double d17, double d18, double d19) {
        cl0.g gVar = new cl0.g();
        gVar.n("originHeight", d17);
        gVar.n("nextHeight", d18);
        gVar.n("animateDuration", d19);
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(this.f143607b, this.f143608c, "emoticon.heightAnimateChange", gVar);
    }

    public final void d() {
        this.f143606a.animate().translationY(r0.getHeight()).withEndAction(new com.tencent.mm.plugin.lite.jsapi.comms.e(this)).setDuration(300L).start();
        c(i65.a.c(b(), r0.getHeight()), 0.0d, 0.3d);
    }
}
