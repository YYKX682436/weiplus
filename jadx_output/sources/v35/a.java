package v35;

/* loaded from: classes10.dex */
public class a implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView f433172a;

    public a(com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView) {
        this.f433172a = rTChattingEmojiView;
    }

    @Override // sr.b
    public void a(int i17) {
        com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView rTChattingEmojiView = this.f433172a;
        if (i17 == 0) {
            rTChattingEmojiView.d(!rTChattingEmojiView.f190830q ? 1 : 0);
        } else if (i17 == -1) {
            int i18 = com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView.f190819r;
            rTChattingEmojiView.d(3);
        } else {
            int i19 = com.tencent.mm.pluginsdk.ui.emoji.RTChattingEmojiView.f190819r;
            rTChattingEmojiView.d(2);
        }
    }
}
