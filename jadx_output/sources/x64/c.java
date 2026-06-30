package x64;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x64.f f452271d;

    public c(x64.f fVar) {
        this.f452271d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            x64.f fVar = this.f452271d;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = fVar.f452285p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt");
            fVar.c(adClickActionInfo);
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/clicker/actionbutton/impl/AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.impl.AdCouponActionButtonClick$AdCouponHalfScreenPrompt$2");
    }
}
