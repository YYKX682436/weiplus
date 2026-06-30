package g22;

/* loaded from: classes.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267813d;

    public f0(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        this.f267813d = emojiStoreV3HomeUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f267813d;
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).wi(a17, emojiStoreV3HomeUI.f98437g == 17 ? 50 : 24, false, 384);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsInitToSearch", true);
        j45.l.y(emojiStoreV3HomeUI.getContext(), a17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13054, java.lang.Integer.valueOf(emojiStoreV3HomeUI.f98438h == 0 ? 0 : 1), 0, "");
    }
}
