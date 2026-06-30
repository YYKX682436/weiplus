package uc4;

/* loaded from: classes4.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.v f426456d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(uc4.v vVar) {
        super(2);
        this.f426456d = vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        android.view.View view = (android.view.View) obj;
        r45.e86 comment = (r45.e86) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(comment, "comment");
        int[] iArr = new int[2];
        if (view.getTag(com.tencent.mm.R.id.ohu) instanceof int[]) {
            java.lang.Object tag = view.getTag(com.tencent.mm.R.id.ohu);
            kotlin.jvm.internal.o.e(tag, "null cannot be cast to non-null type kotlin.IntArray");
            iArr = (int[]) tag;
        }
        uc4.v vVar = this.f426456d;
        xc4.p c17 = vVar.c();
        kotlin.jvm.internal.o.d(c17);
        view.setTag(new com.tencent.mm.plugin.sns.ui.u1(c17.W0(), c17.a1(), comment, comment.f373126d, comment.f373130h, null, 1, c17.getUserName(), c17.h1().Id));
        rl5.r f17 = vVar.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getCommentMenuListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        uc4.s sVar = vVar.f426457f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getCommentMenuListener$p", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick");
        f17.h(view, sVar, vVar.e(), iArr[0], iArr[1]);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$register$2");
        return f0Var;
    }
}
