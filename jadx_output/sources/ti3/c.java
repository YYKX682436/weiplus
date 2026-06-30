package ti3;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ti3.c f419579a = new ti3.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f419580b = jz5.h.b(ti3.b.f419578d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f419581c = jz5.h.b(ti3.a.f419577d);

    public final g15.b a(java.lang.String msgTalker) {
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        java.lang.String t17 = b().f193038a.t(msgTalker);
        if (t17 != null) {
            try {
                g15.b bVar = new g15.b();
                bVar.fromXml(t17);
                return bVar;
            } catch (java.io.IOException unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Conversation.ConversationDraftMMKV", "can not parse from mmkv data for ".concat(msgTalker));
            } catch (java.lang.ClassCastException unused2) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Conversation.ConversationDraftMMKV", "can not parse to msg processing info for ".concat(msgTalker));
                return null;
            }
        }
        return null;
    }

    public final com.tencent.mm.sdk.platformtools.v4 b() {
        return (com.tencent.mm.sdk.platformtools.v4) ((jz5.n) f419581c).getValue();
    }

    public final void c(java.lang.String msgTalker, java.lang.String modifyFrom) {
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        kotlin.jvm.internal.o.g(modifyFrom, "modifyFrom");
        com.tencent.mm.sdk.platformtools.v4 b17 = b();
        b17.getClass();
        b17.f193038a.W(msgTalker);
        ((e75.g) ((jz5.n) b().f193039b).getValue()).notify(new ti3.d(com.tencent.mm.sdk.platformtools.x3.f193080e, msgTalker, null, modifyFrom));
    }

    public final void d(g15.b draftInfo, java.lang.String talker, java.lang.String modifyFrom) {
        kotlin.jvm.internal.o.g(draftInfo, "draftInfo");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(modifyFrom, "modifyFrom");
        boolean z17 = true;
        if (!(draftInfo.k().length() > 0)) {
            g15.d l17 = draftInfo.l();
            if ((l17 != null ? l17.j() : 0L) <= 0 && !draftInfo.o() && !(!draftInfo.n().isEmpty()) && !(!draftInfo.j().isEmpty())) {
                z17 = false;
            }
        }
        if (z17) {
            b().a(talker, draftInfo.toXml(), false);
            ((e75.g) ((jz5.n) b().f193039b).getValue()).notify(new ti3.d(com.tencent.mm.sdk.platformtools.x3.f193079d, talker, draftInfo, modifyFrom));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Conversation.ConversationDraftMMKV", "[" + talker + "]'s draft not valid,will do remove");
        c(talker, modifyFrom);
    }
}
