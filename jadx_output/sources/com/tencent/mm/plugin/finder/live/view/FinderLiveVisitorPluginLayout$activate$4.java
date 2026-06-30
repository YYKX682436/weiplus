package com.tencent.mm.plugin.finder.live.view;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "interrupted", "Ljz5/f0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveVisitorPluginLayout$activate$4 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderLiveVisitorPluginLayout$activate$4(com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout) {
        super(1);
        this.this$0 = finderLiveVisitorPluginLayout;
    }

    @Override // yz5.l
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        invoke(((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }

    public final void invoke(boolean z17) {
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = this.this$0;
        bundle.putInt("PARAM_LIVE_ANCHOR_STATUS_EXCEPTION_SECNE", 2);
        if (z17) {
            finderLiveVisitorPluginLayout.statusChange(qo0.b.f365330b2, bundle);
        } else {
            finderLiveVisitorPluginLayout.statusChange(qo0.b.f365334c2, bundle);
        }
    }
}
