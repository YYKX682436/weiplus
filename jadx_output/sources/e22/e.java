package e22;

/* loaded from: classes10.dex */
public final class e extends androidx.fragment.app.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment f246640d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment f246641e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.plugin.emoji.ui.picker.GalleryTabFragment galleryTabFragment, com.tencent.mm.plugin.emoji.ui.picker.FinderTabFragment finderTabFragment, androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 1);
        this.f246640d = galleryTabFragment;
        this.f246641e = finderTabFragment;
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return 2;
    }

    @Override // androidx.fragment.app.e2
    public androidx.fragment.app.Fragment getItem(int i17) {
        return i17 == 0 ? this.f246640d : this.f246641e;
    }
}
