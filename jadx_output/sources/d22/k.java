package d22;

/* loaded from: classes12.dex */
public final class k implements d22.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f225851d;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f225851d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.liteapp.MMEmoticonEmojiSearchCreator$Companion$liteAppLifeCycleListener$1
            {
                this.__eventId = 1907495603;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.LiteAppLifeCycleEvent liteAppLifeCycleEvent) {
                com.tencent.mm.autogen.events.LiteAppLifeCycleEvent event = liteAppLifeCycleEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ri riVar = event.f54468g;
                if (com.tencent.mm.sdk.platformtools.t8.K0(riVar.f7819c) || !riVar.f7819c.equals("wxalite279f07556d0da57154990988e8cfcecb") || riVar.f7817a != 3) {
                    return false;
                }
                y75.d dVar = y75.a.f459786a;
                if (dVar != null) {
                    dVar.f320568d = null;
                }
                y75.a.f459786a = null;
                dead();
                return false;
            }
        };
    }

    @Override // d22.p
    public boolean a() {
        return true;
    }

    @Override // d22.p
    public java.lang.String d(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof d22.j)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonEmojiSearchCreator", "unable to cast emojiSearch page context");
            return "";
        }
        d22.j jVar = (d22.j) context;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, jVar.f364092j);
        linkedHashMap.put("defaultTag", java.lang.Integer.valueOf(jVar.f364089g));
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(jVar.f364091i));
        linkedHashMap.put("enterTime", java.lang.Long.valueOf(jVar.f364158d));
        linkedHashMap.put("searchScene", java.lang.Long.valueOf(jVar.f364090h));
        linkedHashMap.put("toSendText", jVar.f364093k);
        linkedHashMap.put("isNativeContainer", java.lang.Boolean.valueOf(jVar.f364159e));
        java.lang.String gVar = new cl0.g(linkedHashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmoticonEmojiSearchCreator", "get query: ".concat(gVar));
        return gVar;
    }

    @Override // d22.p
    public java.lang.String e() {
        return j62.e.g().i("clicfg_android_emoticon_search_native_container", 0, false, true) == 1 ? "pages/emonative/entry" : "pages/emosearch/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
        f225851d.alive();
    }

    @Override // d22.p
    public boolean h() {
        return true;
    }

    @Override // d22.p
    public com.tencent.mm.plugin.lite.s i(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.lite.s();
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxalite279f07556d0da57154990988e8cfcecb";
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
    public java.lang.String m() {
        return j62.e.g().i("clicfg_android_emoticon_search_native_container", 0, false, true) == 1 ? "modal" : com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH;
    }

    @Override // d22.p
    public boolean n(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return true;
    }
}
