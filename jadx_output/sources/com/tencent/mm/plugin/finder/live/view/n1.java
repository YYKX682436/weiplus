package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView f116495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.plugin.finder.live.view.FinderLiveAnchorDataPanelView finderLiveAnchorDataPanelView) {
        super(1);
        this.f116495d = finderLiveAnchorDataPanelView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.KeyEvent.Callback it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof io.flutter.embedding.engine.renderer.RenderSurface) {
            this.f116495d.f115806h = (io.flutter.embedding.engine.renderer.RenderSurface) it;
        }
        return jz5.f0.f302826a;
    }
}
