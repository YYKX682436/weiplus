package uc4;

/* loaded from: classes3.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f426419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uc4.l1 f426420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(android.content.Context context, uc4.l1 l1Var) {
        super(0);
        this.f426419d = context;
        this.f426420e = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
        android.content.Context context = this.f426419d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.view.View decorView = ((android.app.Activity) context).getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        uc4.l1 l1Var = this.f426420e;
        l1Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        android.view.View.OnClickListener onClickListener = (android.view.View.OnClickListener) ((jz5.n) l1Var.f426430f).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getOpenimTagUnlikeClickListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick");
        com.tencent.mm.plugin.sns.ui.m7 m7Var = new com.tencent.mm.plugin.sns.ui.m7(context, onClickListener, (android.widget.FrameLayout) decorView, (android.view.View) null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveWeTagClick$openIMUnlikeHelper$2");
        return m7Var;
    }
}
