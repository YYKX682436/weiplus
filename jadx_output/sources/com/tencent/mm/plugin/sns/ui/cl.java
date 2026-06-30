package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class cl implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.e86 f168134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.ns f168135c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsLikesTextView f168136d;

    public cl(com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView, int i17, r45.e86 e86Var, com.tencent.mm.plugin.sns.ui.ns nsVar) {
        this.f168136d = snsLikesTextView;
        this.f168133a = i17;
        this.f168134b = e86Var;
        this.f168135c = nsVar;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        r45.e86 e86Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$2");
        com.tencent.mm.plugin.sns.ui.SnsLikesTextView snsLikesTextView = this.f168136d;
        if (snsLikesTextView.f167250q != null) {
            if (this.f168133a == 0 && (e86Var = this.f168134b) != null && ca4.m0.T(this.f168135c.f170025a, e86Var)) {
                snsLikesTextView.f167250q.f170293b = 0;
            } else {
                snsLikesTextView.f167250q.f170293b = 102;
            }
            snsLikesTextView.f167250q.a(view, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsLikesTextView$2");
    }
}
