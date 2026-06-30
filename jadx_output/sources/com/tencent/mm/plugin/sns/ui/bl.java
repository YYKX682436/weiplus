package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class bl implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f167951a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLikesTextView f167952b;

    public bl(com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView, java.lang.String str) {
        this.f167952b = snsLikesTextView;
        this.f167951a = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$1");
        com.tencent.mm.plugin.sns.ui.q1 q1Var = this.f167952b.f167250q;
        if (q1Var != null) {
            q1Var.f170293b = 102;
            q1Var.a(view, obj);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f167951a, 7L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$1");
    }
}
