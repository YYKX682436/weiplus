package xf2;

/* loaded from: classes8.dex */
public final class k implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454284a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454285b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454286c;

    public k(java.lang.String str, com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView, java.lang.String str2) {
        this.f454284a = str;
        this.f454285b = shellView;
        this.f454286c = str2;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public final void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            java.lang.String str2 = this.f454284a;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return;
            }
            g45.b.f268846a.a(str2 == null ? "" : str2, str, 0);
            ((dk5.s5) tg3.t1.a()).Vi(this.f454285b.getContext(), this.f454284a, this.f454286c, 0, "", "", null);
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) i95.n0.c(com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation.class)).Ai().g(str2);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("share_username", str2);
            jSONObject.put("type", 6);
            jSONObject.put("share_type", 1);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
