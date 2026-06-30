package px2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358932d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f358932d.getContext());
        frameLayout.setBackground(frameLayout.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.d0t));
        frameLayout.setVisibility(4);
        return frameLayout;
    }
}
