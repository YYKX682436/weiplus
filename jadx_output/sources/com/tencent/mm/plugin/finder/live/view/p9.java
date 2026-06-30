package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class p9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView f116587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f116588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f116589f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView finderLiveProductSizeAssistPanelView, int i17, int i18) {
        super(0);
        this.f116587d = finderLiveProductSizeAssistPanelView;
        this.f116588e = i17;
        this.f116589f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.FinderLiveProductSizeAssistPanelView finderLiveProductSizeAssistPanelView = this.f116587d;
        finderLiveProductSizeAssistPanelView.getLayoutParams().height = this.f116588e + finderLiveProductSizeAssistPanelView.getPaddingTop();
        finderLiveProductSizeAssistPanelView.getLayoutParams().width = this.f116589f;
        finderLiveProductSizeAssistPanelView.requestLayout();
        return jz5.f0.f302826a;
    }
}
