package g22;

/* loaded from: classes11.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI f267883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI) {
        super(1);
        this.f267883d = emojiStoreV3HomeUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeUI emojiStoreV3HomeUI = this.f267883d;
        boolean containsKey = emojiStoreV3HomeUI.f98440m.containsKey(java.lang.Integer.valueOf(intValue));
        java.util.HashMap hashMap = emojiStoreV3HomeUI.f98440m;
        if (containsKey) {
            com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) hashMap.get(java.lang.Integer.valueOf(intValue));
            return mMFragment == null ? emojiStoreV3HomeUI.T6(intValue) : mMFragment;
        }
        com.tencent.mm.ui.MMFragment T6 = emojiStoreV3HomeUI.T6(intValue);
        hashMap.put(java.lang.Integer.valueOf(intValue), T6);
        return T6;
    }
}
