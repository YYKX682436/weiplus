package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class t50 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout f135982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC f135983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.SimpleTouchableLayout f135984f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t50(com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout, com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC, com.tencent.mm.plugin.finder.view.SimpleTouchableLayout simpleTouchableLayout) {
        super(1);
        this.f135982d = finderFullSeekBarLayout;
        this.f135983e = finderSpeedControlUIC;
        this.f135984f = simpleTouchableLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        com.tencent.mm.plugin.finder.video.FinderFullSeekBarLayout finderFullSeekBarLayout = this.f135982d;
        if (!(finderFullSeekBarLayout != null && finderFullSeekBarLayout.isSeekMode)) {
            this.f135983e.f133649t.a(motionEvent);
            this.f135984f.requestDisallowInterceptTouchEvent(true);
        }
        return java.lang.Boolean.TRUE;
    }
}
