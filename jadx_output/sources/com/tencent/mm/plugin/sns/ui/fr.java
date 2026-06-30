package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class fr extends com.tencent.mm.pluginsdk.ui.span.d1 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.hr f168357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr(com.tencent.mm.plugin.sns.ui.hr hrVar, android.content.Context context, java.lang.Object obj, com.tencent.mm.pluginsdk.ui.span.c1 c1Var) {
        super(context, obj, c1Var);
        this.f168357g = hrVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.d1, com.tencent.mm.pluginsdk.ui.span.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$2");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", view.getTag().toString());
        com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        android.app.Activity activity = this.f168357g.f168530p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter");
        y7Var.l(intent, activity);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsStrangerCommentDetailUI$CommentListAdapter$2");
    }
}
