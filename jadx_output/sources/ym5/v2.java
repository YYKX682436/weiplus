package ym5;

/* loaded from: classes10.dex */
public final class v2 extends com.tencent.mm.view.RecyclerHorizontalViewPager {

    /* renamed from: i2, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MediaBanner f463554i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.view.MediaBanner mediaBanner, android.content.Context context) {
        super(context);
        this.f463554i2 = mediaBanner;
        kotlin.jvm.internal.o.d(context);
    }

    @Override // com.tencent.mm.view.RecyclerHorizontalViewPager
    public void g1(int i17, boolean z17, boolean z18) {
        super.g1(i17, z17, z18);
        com.tencent.mm.view.MediaBanner mediaBanner = this.f463554i2;
        mediaBanner.setFocusPosition(i17);
        mediaBanner.getIndicator().setCurrentIndex(i17);
        mediaBanner.getPageChangeCallback();
    }
}
