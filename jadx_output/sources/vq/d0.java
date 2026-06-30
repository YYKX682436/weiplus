package vq;

/* loaded from: classes12.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439145d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.vfs.w6.f(rr.s.f399149a.c());
        com.tencent.mm.vfs.w6.f(lp0.b.e() + "emoji/cover/");
        ar.c.f13357b.clear();
        for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : gr.t.g().a()) {
            if (!n22.m.l(emojiInfo)) {
                emojiInfo.field_state = 4;
                com.tencent.mm.storage.n5.f().c().V2(emojiInfo);
            }
        }
        java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiGroupInfo> d17 = gr.t.g().d();
        kotlin.jvm.internal.o.f(d17, "getEmojiGroupInfoList(...)");
        for (com.tencent.mm.storage.emotion.EmojiGroupInfo emojiGroupInfo : d17) {
            emojiGroupInfo.field_sync = 1;
            com.tencent.mm.storage.n5.f().b().update(emojiGroupInfo, new java.lang.String[0]);
        }
        gr.t.g().l(true);
        pr.z zVar = pr.k0.f357723q;
        zVar.b(false).b(true);
        zVar.a(false).b(true);
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).Ai().b();
        dp.a.makeText((android.content.Context) this.f439145d, (java.lang.CharSequence) "done", 0).show();
        return jz5.f0.f302826a;
    }
}
