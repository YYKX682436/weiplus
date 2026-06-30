package e22;

/* loaded from: classes10.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment f246673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment) {
        super(0);
        this.f246673d = multiSelectFinderTabFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = this.f246673d;
        boolean z17 = true;
        db5.e1.s(multiSelectFinderTabFragment.requireContext(), "", multiSelectFinderTabFragment.requireContext().getString(com.tencent.mm.R.string.obk, 1));
        if (multiSelectFinderTabFragment.getActivity() instanceof com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI) {
            androidx.fragment.app.FragmentActivity activity = multiSelectFinderTabFragment.getActivity();
            com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI multiEmojiMediaPickerUI = activity instanceof com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI ? (com.tencent.mm.plugin.emoji.ui.picker.MultiEmojiMediaPickerUI) activity : null;
            java.lang.String str = multiEmojiMediaPickerUI != null ? multiEmojiMediaPickerUI.f98158o : null;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                or.d.c(str, 5, 2, null, 0, or.c.c("warning_pup_win", str, 4, null, null, 24, null), 16, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
