package n44;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final n44.s f335043d = new n44.s();

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.ViewParent parent;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$instantiateItem$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$instantiateItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.ViewParent parent2 = view.getParent();
        android.view.ViewParent parent3 = (parent2 == null || (parent = parent2.getParent()) == null) ? null : parent.getParent();
        android.widget.FrameLayout frameLayout = parent3 instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) parent3 : null;
        if (frameLayout != null) {
            frameLayout.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/helper/halfscreen/AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$instantiateItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.helper.halfscreen.AdHalfScreenMultipleMaterialHelper$TurnPagerAdapter$instantiateItem$1");
    }
}
