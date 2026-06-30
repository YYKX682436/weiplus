package mc4;

/* loaded from: classes4.dex */
public final class a implements com.tencent.mm.pluginsdk.ui.span.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f325642b;

    public a(java.lang.String str, android.view.View view) {
        this.f325641a = str;
        this.f325642b = view;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.w
    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper$dealSpanText$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("click again ");
        java.lang.String str2 = this.f325641a;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveSnsSecurityPassFooterHelper", sb6.toString());
        mc4.c.a(mc4.c.f325645a, str2);
        android.view.View view = this.f325642b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/component/footer/ImproveSnsSecurityPassFooterHelper$dealSpanText$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/component/footer/ImproveSnsSecurityPassFooterHelper$dealSpanText$1", "onClick", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getClickCallback$p", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        mc4.e eVar = mc4.c.f325647c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getClickCallback$p", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper");
        if (eVar != null) {
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$l snsCommentDetailUI$$l = (com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$l) eVar;
            int i17 = com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI.O2;
            com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI snsCommentDetailUI = snsCommentDetailUI$$l.f166931a;
            snsCommentDetailUI.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$setSecurityPassTipsView$5", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
            snsCommentDetailUI.S7(snsCommentDetailUI$$l.f166932b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$setSecurityPassTipsView$5", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.footer.ImproveSnsSecurityPassFooterHelper$dealSpanText$1");
    }
}
