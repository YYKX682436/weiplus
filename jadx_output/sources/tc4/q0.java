package tc4;

/* loaded from: classes4.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f417437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f417438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xc4.p f417440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tc4.r0 f417441h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.widget.TextView textView, android.text.SpannableString spannableString, java.lang.String str, xc4.p pVar, tc4.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f417437d = textView;
        this.f417438e = spannableString;
        this.f417439f = str;
        this.f417440g = pVar;
        this.f417441h = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        tc4.q0 q0Var = new tc4.q0(this.f417437d, this.f417438e, this.f417439f, this.f417440g, this.f417441h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        return q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        tc4.q0 q0Var = (tc4.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = ((java.lang.Object) this.f417438e) + this.f417439f;
        android.widget.TextView textView = this.f417437d;
        textView.setText(str);
        tc4.r0 r0Var = this.f417441h;
        textView.setOnClickListener(new tc4.p0(r0Var));
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.W(this.f417440g.y0(), true, r0Var.y());
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.item.FoldImproveTimelineItem$loadCustomItemInfo$2");
        return f0Var;
    }
}
