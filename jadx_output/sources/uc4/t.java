package uc4;

/* loaded from: classes4.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.v f426453d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(uc4.v vVar) {
        super(2);
        this.f426453d = vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        android.view.View view = (android.view.View) obj;
        r45.e86 comment = (r45.e86) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(comment, "comment");
        java.lang.String str = comment.f373130h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        boolean b17 = kotlin.jvm.internal.o.b(comment.f373126d, pc4.d.f353410a.o());
        uc4.v vVar = this.f426453d;
        if (b17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            xc4.p c17 = vVar.c();
            if (c17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            } else {
                rl5.r rVar = new rl5.r(vVar.b());
                kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
                h0Var.f310123d = str;
                uc4.r rVar2 = new uc4.r(comment, vVar);
                uc4.q qVar = new uc4.q(h0Var, vVar, c17, comment, view);
                int[] iArr = new int[2];
                if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
                    java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ohu);
                    kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.IntArray");
                    iArr = (int[]) tag;
                }
                rVar.h(view, rVar2, qVar, iArr[0], iArr[1]);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$clickSelfComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            vVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            xc4.p c18 = vVar.c();
            if (c18 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            } else {
                com.tencent.mm.autogen.events.SnsReplyEvent snsReplyEvent = new com.tencent.mm.autogen.events.SnsReplyEvent();
                am.sw swVar = snsReplyEvent.f54836g;
                swVar.f7941a = c18;
                swVar.f7942b = comment;
                swVar.f7943c = view;
                snsReplyEvent.e();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$clickOtherComment", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        }
        xc4.p c19 = vVar.c();
        if (c19 != null) {
            com.tencent.mm.plugin.sns.ui.widget.j3.f171174a.c(c19.a1(), comment);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$1");
        return f0Var;
    }
}
