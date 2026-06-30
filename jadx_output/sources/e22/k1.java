package e22;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment f246677d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment) {
        super(1);
        this.f246677d = multiSelectFinderTabFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        androidx.fragment.app.FragmentActivity activity = this.f246677d.getActivity();
        com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI = activity instanceof com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI ? (com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI) activity : null;
        if (multiEmojiMediaPickerUI != null) {
            multiEmojiMediaPickerUI.e7();
        }
        return jz5.f0.f302826a;
    }
}
