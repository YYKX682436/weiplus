package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class f implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.i f143572a;

    public f(com.tencent.mm.plugin.lite.jsapi.comms.i iVar) {
        this.f143572a = iVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        java.lang.String str;
        if (iEmojiInfo != null) {
            java.lang.String md52 = iEmojiInfo.getMd5();
            com.tencent.mm.feature.emoji.api.o6 o6Var = (com.tencent.mm.feature.emoji.api.o6) i95.n0.c(com.tencent.mm.feature.emoji.api.o6.class);
            if (o6Var != null) {
                kotlin.jvm.internal.o.d(md52);
                iEmojiInfo = ((com.tencent.mm.feature.emoji.c4) o6Var).Zi(md52, null);
            }
            cl0.g gVar = new cl0.g();
            gVar.h("md5", md52);
            com.tencent.mm.plugin.lite.jsapi.comms.i iVar = this.f143572a;
            com.tencent.mm.plugin.lite.jsapi.comms.i.a(iVar, "image", gVar);
            r45.ri0 ri0Var = new r45.ri0();
            ri0Var.f384886d = iEmojiInfo.getMd5();
            ri0Var.f384887e = iEmojiInfo.l0();
            ri0Var.f384888f = iEmojiInfo.l();
            ri0Var.f384889g = iEmojiInfo.X0();
            ri0Var.f384890h = iEmojiInfo.J1();
            ri0Var.f384891i = iEmojiInfo.getAesKey();
            ri0Var.f384892m = iEmojiInfo.getGroupId();
            ri0Var.f384893n = iEmojiInfo.Z();
            ri0Var.f384894o = iEmojiInfo.g1();
            ri0Var.f384895p = iEmojiInfo.S0();
            ri0Var.f384896q = iEmojiInfo.q0();
            ri0Var.f384897r = iEmojiInfo.k0();
            ri0Var.f384898s = iEmojiInfo.H1();
            try {
                str = android.util.Base64.encodeToString(ri0Var.toByteArray(), 2);
                kotlin.jvm.internal.o.f(str, "encodeToString(...)");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppEmoticonContext", e17, "failed to encode emojiInfo.", new java.lang.Object[0]);
                str = "";
            }
            gVar.h("emojiInfo", str);
            if (iEmojiInfo.E0()) {
                gVar.h(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, iEmojiInfo.T());
            }
            com.tencent.mm.plugin.lite.jsapi.comms.i.a(iVar, "emoticon", gVar);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
        com.tencent.mm.plugin.lite.jsapi.comms.i iVar = this.f143572a;
        iVar.getClass();
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).dk(iVar.f143607b, "__LiteAppEmoticonContextTag", null);
        iVar.d();
    }
}
