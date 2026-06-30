package ol1;

/* loaded from: classes15.dex */
public final class a implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ol1.t f346122a;

    public a(ol1.t tVar) {
        this.f346122a = tVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo == null) {
            return;
        }
        com.tencent.mm.feature.emoji.api.f6 f6Var = (com.tencent.mm.feature.emoji.api.f6) i95.n0.c(com.tencent.mm.feature.emoji.api.f6.class);
        java.lang.String md52 = iEmojiInfo.getMd5();
        ((com.tencent.mm.feature.emoji.p1) f6Var).getClass();
        java.lang.String desc = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().v(md52);
        java.lang.String groupId = iEmojiInfo.getGroupId();
        if (groupId == null) {
            groupId = "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSendCustomEmoji productId:");
        sb6.append(iEmojiInfo.getGroupId());
        sb6.append(", md5:");
        sb6.append(iEmojiInfo.getMd5());
        sb6.append(", desc:");
        sb6.append(desc);
        sb6.append(", designerId:");
        java.lang.String X0 = iEmojiInfo.X0();
        if (X0 == null) {
            X0 = "";
        }
        sb6.append(X0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandInputNewSmileyPanel", sb6.toString());
        ol1.t tVar = this.f346122a;
        if (tVar != null) {
            java.lang.String md53 = iEmojiInfo.getMd5();
            java.lang.String X02 = iEmojiInfo.X0();
            java.lang.String str = X02 != null ? X02 : "";
            com.tencent.luggage.game.jsapi.keyboard.q qVar = (com.tencent.luggage.game.jsapi.keyboard.q) tVar;
            com.tencent.luggage.game.jsapi.keyboard.u uVar = qVar.f47250b.f47254m;
            uVar.getClass();
            com.tencent.mm.plugin.appbrand.e9 service = qVar.f47249a;
            kotlin.jvm.internal.o.g(service, "service");
            kotlin.jvm.internal.o.g(md53, "md5");
            kotlin.jvm.internal.o.g(desc, "desc");
            if (service.isRunning()) {
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("md5", md53);
                hashMap.put("productId", groupId);
                hashMap.put("desc", desc);
                hashMap.put("designerId", str);
                uVar.t(hashMap);
                uVar.u(service);
                uVar.m();
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }
}
