package yx;

/* loaded from: classes14.dex */
public final class g implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout f467021d;

    public g(com.tencent.mm.feature.chatbot.brand.ui.view.ControlledRipplesLayout controlledRipplesLayout) {
        this.f467021d = controlledRipplesLayout;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        this.f467021d.setRunning(bool.booleanValue());
    }
}
