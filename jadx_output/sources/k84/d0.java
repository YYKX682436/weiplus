package k84;

/* loaded from: classes4.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k84.q1 f304991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w64.n f304992e;

    public d0(k84.q1 q1Var, w64.n nVar) {
        this.f304991d = q1Var;
        this.f304992e = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$bindTagInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k84.m mVar = (k84.m) ((kotlinx.coroutines.flow.h3) k84.q1.z(this.f304991d)).getValue();
        if (mVar == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$bindTagInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$3");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$LikeState");
        if (mVar.f305110a && !mVar.b() && !mVar.a()) {
            this.f304992e.k(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdContinuousLikeComponent$bindTagInfo$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdContinuousLikeComponent$bindTagInfo$3");
    }
}
