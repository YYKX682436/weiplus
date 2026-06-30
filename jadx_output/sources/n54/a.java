package n54;

/* loaded from: classes4.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n54.f f335123d;

    public a(n54.f fVar) {
        this.f335123d = fVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        n54.f.a(this.f335123d).l8();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/landingpage/halfscreen/AdHalfScreenLandingPageHelper$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.landingpage.halfscreen.AdHalfScreenLandingPageHelper$1");
    }
}
