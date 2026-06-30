package g22;

/* loaded from: classes15.dex */
public final class r extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment f267859a;

    public r(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        this.f267859a = emojiStoreV3HomeBaseFragment;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message msg) {
        java.lang.String string;
        java.lang.String string2;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment = this.f267859a;
        emojiStoreV3HomeBaseFragment.getClass();
        int i17 = msg.what;
        int i18 = emojiStoreV3HomeBaseFragment.f98416h;
        java.lang.String str = emojiStoreV3HomeBaseFragment.f98413e;
        if (i17 == i18) {
            if (msg.getData() == null || (string2 = msg.getData().getString(str)) == null) {
                return;
            }
            emojiStoreV3HomeBaseFragment.m0().E(new i22.n(string2, msg.getData().getInt(emojiStoreV3HomeBaseFragment.f98414f)));
            return;
        }
        if (i17 != emojiStoreV3HomeBaseFragment.f98417i) {
            if (i17 == emojiStoreV3HomeBaseFragment.f98418m) {
                emojiStoreV3HomeBaseFragment.m0().B(true);
            }
        } else {
            if (msg.getData() == null || (string = msg.getData().getString(str)) == null) {
                return;
            }
            emojiStoreV3HomeBaseFragment.m0().E(new i22.o(string, msg.getData().getInt(emojiStoreV3HomeBaseFragment.f98415g)));
        }
    }
}
