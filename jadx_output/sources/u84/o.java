package u84;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.f0 f425616d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u84.f0 f0Var) {
        super(0);
        this.f425616d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context;
        android.content.res.Resources resources;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$backgroundColor$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$backgroundColor$2");
        u84.f0 f0Var = this.f425616d;
        f0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getItemRootView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
        android.view.View view = f0Var.f425517o;
        java.lang.Integer valueOf = (view == null || (context = view.getContext()) == null || (resources = context.getResources()) == null) ? null : java.lang.Integer.valueOf(resources.getColor(com.tencent.mm.R.color.f478553an));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$backgroundColor$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$backgroundColor$2");
        return valueOf;
    }
}
