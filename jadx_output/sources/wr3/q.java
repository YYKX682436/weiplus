package wr3;

/* loaded from: classes11.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment f448868d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabArticleFragment bizProfileTabArticleFragment) {
        super(1);
        this.f448868d = bizProfileTabArticleFragment;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View topicFlowView = (android.view.View) obj;
        kotlin.jvm.internal.o.g(topicFlowView, "topicFlowView");
        this.f448868d.J0().addHeaderView(topicFlowView);
        return jz5.f0.f302826a;
    }
}
