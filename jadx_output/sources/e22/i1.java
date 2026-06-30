package e22;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment f246667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment) {
        super(1);
        this.f246667d = multiSelectFinderTabFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        int i17 = com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment.f98159m;
        com.tencent.mm.plugin.emoji.ui.picker.MultiSelectFinderTabFragment multiSelectFinderTabFragment = this.f246667d;
        multiSelectFinderTabFragment.getClass();
        android.content.Intent intent = new android.content.Intent(multiSelectFinderTabFragment.requireContext(), (java.lang.Class<?>) com.tencent.mm.plugin.emoji.ui.EmojiFinderPreviewUI.class);
        intent.putExtra("key_finder_object_bytes", finderObject.toByteArray());
        multiSelectFinderTabFragment.startActivityForResult(intent, 1048577);
        return jz5.f0.f302826a;
    }
}
