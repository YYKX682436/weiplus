package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f116494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView) {
        super(1);
        this.f116494d = finderLiveAfterPluginRecommendLiveView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        this.f116494d.getClass();
        android.graphics.Rect rect = new android.graphics.Rect();
        view.getGlobalVisibleRect(rect);
        return java.lang.Boolean.valueOf(!((((float) rect.height()) * 1.0f) / ((float) view.getHeight()) < 0.5f || (((float) rect.width()) * 1.0f) / ((float) view.getWidth()) < 0.5f));
    }
}
