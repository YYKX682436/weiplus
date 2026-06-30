package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xw extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f120386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew f120387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xw(boolean z17, com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew) {
        super(0);
        this.f120386d = z17;
        this.f120387e = finderLiveTaskBannerViewNew;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = this.f120386d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew finderLiveTaskBannerViewNew = this.f120387e;
        if (z17) {
            android.view.View view = finderLiveTaskBannerViewNew.f117688f;
            if (view == null) {
                kotlin.jvm.internal.o.o("bgView");
                throw null;
            }
            view.setBackground(finderLiveTaskBannerViewNew.getContext().getDrawable(com.tencent.mm.R.drawable.f481792cv1));
        } else {
            android.view.View view2 = finderLiveTaskBannerViewNew.f117688f;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("bgView");
                throw null;
            }
            view2.setBackground(finderLiveTaskBannerViewNew.getContext().getDrawable(com.tencent.mm.R.drawable.f481791cv0));
        }
        return jz5.f0.f302826a;
    }
}
