package vq;

/* loaded from: classes4.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.emoji.debug.EmojiDebugUI f439177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.emoji.debug.EmojiDebugUI emojiDebugUI) {
        super(0);
        this.f439177d = emojiDebugUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_suggest_remote_enable, false);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_request_interval, 24);
        int Ni2 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_prefetch, 0);
        int Ni3 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_personal_words_interval, 0);
        sb6.append("remote: " + fj6 + " \n");
        sb6.append("remote interval: " + Ni + " \n");
        sb6.append("remote preload type: " + Ni2 + " \n");
        sb6.append("word update interval: " + Ni3 + " \n");
        sb6.append("remote shuffle: " + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_emoji_suggest_remote_shuffle, false) + ", size:" + ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_remote_shuffle_size, 20) + " \n");
        int Ni4 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_emoji_suggest_show_delay, 250);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("show delay: ");
        sb7.append(Ni4);
        sb7.append(" \n");
        sb6.append(sb7.toString());
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f439177d);
        u1Var.g(sb6.toString());
        u1Var.a(true);
        u1Var.q(false);
        return jz5.f0.f302826a;
    }
}
