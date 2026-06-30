package qv;

/* loaded from: classes5.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sk.f f366857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr.g f366858e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(sk.f fVar, vr.g gVar) {
        super(1);
        this.f366857d = fVar;
        this.f366858e = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.core.e3 e3Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.webview.ui.tools.u4 u4Var = null;
        sk.f fVar = this.f366857d;
        if (booleanValue) {
            if (fVar != null) {
                com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd ydVar = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd) fVar;
                vr.g bizEmoticonContext = this.f366858e;
                kotlin.jvm.internal.o.g(bizEmoticonContext, "bizEmoticonContext");
                nw4.k kVar = ydVar.f186690a;
                android.content.Context context = kVar.f340860a;
                com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI ? (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context : null;
                if (webViewUI != null && (e3Var = webViewUI.L1) != null) {
                    u4Var = e3Var.Z0;
                }
                if (u4Var != null) {
                    u4Var.f186925a = bizEmoticonContext;
                }
                pm0.v.X(new vr.a(bizEmoticonContext, new com.tencent.mm.plugin.webview.ui.tools.newjsapi.xd(kVar, ydVar.f186691b)));
            }
        } else if (fVar != null) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd ydVar2 = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.yd) fVar;
            nw4.g gVar = ydVar2.f186690a.f340863d;
            nw4.y2 y2Var = ydVar2.f186691b;
            gVar.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
        }
        return jz5.f0.f302826a;
    }
}
