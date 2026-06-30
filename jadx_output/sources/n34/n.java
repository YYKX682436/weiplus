package n34;

/* loaded from: classes4.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n34.p f334684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334685e;

    public n(n34.p pVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f334684d = pVar;
        this.f334685e = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$getSnsStarTeachView$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/CommentDetailStarHelper$getSnsStarTeachView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.CommentDetailStarHelper", "click teach btn");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        n34.p pVar = this.f334684d;
        n34.o2 o2Var = pVar.f334704e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getClickCallback$p", "com.tencent.mm.plugin.sns.CommentDetailStarHelper");
        if (o2Var != null) {
            ((com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI$$d) o2Var).a();
        }
        pVar.a(this.f334685e, 1, 3);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/CommentDetailStarHelper$getSnsStarTeachView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$getSnsStarTeachView$1");
    }
}
