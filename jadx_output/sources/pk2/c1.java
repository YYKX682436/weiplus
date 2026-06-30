package pk2;

/* loaded from: classes3.dex */
public final class c1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355594h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355595i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355594h = helper.C;
        this.f355595i = n() ? "anchorlive.more.help" : "startlive.more.help";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, "");
        kotlin.jvm.internal.o.d(v17);
        if (r26.n0.N(v17)) {
            com.tencent.mars.xlog.Log.w("AnchorFeedbackOption", "onItemClicked: feedback url is blank, webview will render empty (storage 仅在开播页 createliveprepare 写入)");
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", v17);
        intent.putExtra("convertActivityFromTranslucent", true);
        j45.l.j(o9Var.f356078d, "webview", ".ui.tools.WebViewUI", intent, null);
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 8, 2, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 7);
        jSONObject.put("type", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355595i;
    }

    @Override // qk2.f
    public boolean o() {
        boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_ENABLED_BOOLEAN_SYNC, false);
        java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_HELP_AND_FEEDBACK_ENTRY_URL_STRING_SYNC, "");
        if (!o17) {
            return false;
        }
        kotlin.jvm.internal.o.d(v17);
        return r26.n0.N(v17) ^ true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.dxg);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        s(menu, this.f355594h, string, com.tencent.mm.R.raw.icons_outlined_help);
        if (n()) {
            pk2.f8.a(pk2.f8.f355747a, 8, 1, null, 4, null);
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("element", 7);
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 37L, jSONObject.toString(), null, 4, null);
    }

    @Override // qk2.h
    public int y() {
        return this.f355594h;
    }
}
