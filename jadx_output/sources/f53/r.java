package f53;

/* loaded from: classes10.dex */
public final class r implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView f259686a;

    public r(com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView gameEmojiPickView) {
        this.f259686a = gameEmojiPickView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        java.lang.String valueOf;
        com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPickView gameEmojiPickView = this.f259686a;
        com.tencent.mm.pluginsdk.ui.k0 k0Var = gameEmojiPickView.f140001d;
        if (k0Var == null) {
            kotlin.jvm.internal.o.o("textListener");
            throw null;
        }
        k0Var.a(str);
        if (gameEmojiPickView.getPickEmojiStr().length() > 0) {
            valueOf = gameEmojiPickView.getPickEmojiStr() + ';' + str;
        } else {
            valueOf = java.lang.String.valueOf(str);
        }
        gameEmojiPickView.setPickEmojiStr(valueOf);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("emoticonID", str);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.game.report.l.c(gameEmojiPickView.getContext(), 90, 9001, 1, 2, gameEmojiPickView.getMsourceScene(), jSONObject.toString());
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
