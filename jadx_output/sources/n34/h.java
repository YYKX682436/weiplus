package n34;

/* loaded from: classes4.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.p f334609d;

    public h(n34.p pVar) {
        this.f334609d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        n34.p pVar = this.f334609d;
        com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI context = pVar.c();
        n34.g gVar = new n34.g(pVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showCancelStarAlbert", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        kotlin.jvm.internal.o.g(context, "context");
        db5.e1.L(context, false, i65.a.r(context, com.tencent.mm.R.string.jew), "", i65.a.r(context, com.tencent.mm.R.string.jev), i65.a.r(context, com.tencent.mm.R.string.jex), new n34.k4(gVar), n34.l4.f334674d, com.tencent.mm.R.color.Red_100, -1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showCancelStarAlbert", "com.tencent.mm.plugin.sns.SnsStarUIHelper");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$checkIsNeedToShowTeachViewAndSetStar$1");
    }
}
