package t74;

/* loaded from: classes4.dex */
public final class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f416216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w64.n f416217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f416218g;

    public o1(t74.w1 w1Var, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, w64.n nVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f416215d = w1Var;
        this.f416216e = adClickActionInfo;
        this.f416217f = nVar;
        this.f416218g = snsInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        t74.w1 w1Var = this.f416215d;
        kotlinx.coroutines.y0 h17 = w1Var.h();
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(t74.w1.P(w1Var)), null, new t74.n1(this.f416215d, this.f416216e, this.f416217f, view, this.f416218g, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/item/flipcard/AdFlipCardComponent$setClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$setClickEvent$1");
    }
}
