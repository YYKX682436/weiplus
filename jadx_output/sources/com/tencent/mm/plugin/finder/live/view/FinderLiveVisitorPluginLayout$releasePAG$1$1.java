package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljz5/f0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveVisitorPluginLayout$releasePAG$1$1 extends kotlin.jvm.internal.q implements yz5.a {
    final /* synthetic */ android.view.View $it;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout$releasePAG$1$1(android.view.View view) {
        super(0);
        this.$it = view;
    }

    @Override // yz5.a
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        m122invoke();
        return jz5.f0.f302826a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m122invoke() {
        android.view.View view = this.$it;
        org.libpag.PAGView pAGView = view instanceof org.libpag.PAGView ? (org.libpag.PAGView) view : null;
        if (pAGView != null) {
            pAGView.release();
        }
        android.view.View view2 = this.$it;
        com.tencent.mm.rfx.RfxPagView rfxPagView = view2 instanceof com.tencent.mm.rfx.RfxPagView ? (com.tencent.mm.rfx.RfxPagView) view2 : null;
        if (rfxPagView != null) {
            rfxPagView.release();
        }
    }
}
