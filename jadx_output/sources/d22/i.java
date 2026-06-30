package d22;

/* loaded from: classes9.dex */
public final class i implements d22.p {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f225847d;

    static {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f225847d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.LiteAppLifeCycleEvent>(a0Var) { // from class: com.tencent.mm.plugin.emoji.ui.liteapp.MMEmoticonEmojiRelativeCreator$Companion$liteAppLifeCycleListener$1
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
        if (!(context instanceof d22.h)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonEmojiRelativeCreator", "unable to cast emojiRelative page context");
            return "";
        }
        d22.h hVar = (d22.h) context;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, hVar.f364079k);
        linkedHashMap.put("defaultTag", java.lang.Integer.valueOf(hVar.f364075g));
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(hVar.f364077i));
        linkedHashMap.put("enterTime", java.lang.Long.valueOf(hVar.f364158d));
        linkedHashMap.put("searchScene", java.lang.Long.valueOf(hVar.f364076h));
        linkedHashMap.put("chatId", hVar.f364078j);
        linkedHashMap.put("md5", hVar.f364080l);
        linkedHashMap.put("aesKey", hVar.f364081m);
        linkedHashMap.put("encryptUrl", hVar.f364082n);
        java.lang.String gVar = new cl0.g(linkedHashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/emorelative/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
        f225847d.alive();
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
    public boolean n(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return true;
    }
}
