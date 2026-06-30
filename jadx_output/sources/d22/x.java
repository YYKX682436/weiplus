package d22;

/* loaded from: classes12.dex */
public final class x implements d22.p {
    @Override // d22.p
    public java.lang.String d(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        boolean Ai = ((com.tencent.mm.storage.h5) ((com.tencent.mm.feature.emoji.api.c6) i95.n0.c(com.tencent.mm.feature.emoji.api.c6.class))).Ai();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("privacySettingPage", Ai ? 1 : 0);
        jSONObject.put("customEmoticonPage", Ai ? 1 : 0);
        jSONObject.put("selfieEmoticonPage", Ai ? 1 : 0);
        jSONObject.put("productEmoticonPage", 1);
        if (context instanceof d22.w) {
            jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, ((d22.w) context).f225877j);
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/setting";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public com.tencent.mm.plugin.lite.s i(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.lite.s();
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxalite3781e0acb99de51167d8cc934ce9f490";
    }

    @Override // d22.p
    public void k(android.content.Context viewContext, d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(viewContext, "viewContext");
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
    }

    @Override // d22.p
    public boolean l() {
        return false;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return true;
    }
}
