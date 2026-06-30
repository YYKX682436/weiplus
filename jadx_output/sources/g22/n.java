package g22;

/* loaded from: classes15.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment f267849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment emojiStoreV3HomeBaseFragment) {
        super(2);
        this.f267849d = emojiStoreV3HomeBaseFragment;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        i22.a dataItem = (i22.a) obj2;
        kotlin.jvm.internal.o.g(dataItem, "dataItem");
        int i17 = com.tencent.mm.plugin.emoji.ui.v3.EmojiStoreV3HomeBaseFragment.C;
        i22.s m07 = this.f267849d.m0();
        m07.getClass();
        i22.h hVar = i22.h.f287978a;
        if (m07.f288020m.contains(java.lang.Integer.valueOf(intValue))) {
            m07.notifyItemChanged(intValue, hVar);
        }
        return jz5.f0.f302826a;
    }
}
