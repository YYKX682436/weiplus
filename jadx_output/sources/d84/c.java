package d84;

/* loaded from: classes4.dex */
public final class c implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227050d;

    public c(d84.j0 j0Var) {
        this.f227050d = j0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2");
        jz5.l lVar = (jz5.l) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2");
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) lVar.f302834e).booleanValue();
        d84.j0 j0Var = this.f227050d;
        java.lang.String j17 = j0Var.j();
        try {
            com.tencent.mars.xlog.Log.i(j0Var.j(), "handleAtCommentClick, pageValue is " + booleanValue + ", focusValue is " + booleanValue2);
            if (booleanValue && booleanValue2) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                android.os.Handler handler = j0Var.Y;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                handler.postDelayed(new d84.b(j0Var), 40L);
            }
        } catch (java.lang.Throwable th6) {
            ca4.q.c(j17, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleAtCommentClick$1$2");
        return f0Var;
    }
}
