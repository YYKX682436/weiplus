package n34;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.p f334601d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(n34.p pVar) {
        super(0);
        this.f334601d = pVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1$1");
        n34.p pVar = this.f334601d;
        com.tencent.mm.plugin.sns.storage.SnsInfo B7 = pVar.c().B7(false);
        kotlin.jvm.internal.o.d(B7);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doChangeStar$default", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        pVar.a(B7, 2, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doChangeStar$default", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1$1");
        return f0Var;
    }
}
