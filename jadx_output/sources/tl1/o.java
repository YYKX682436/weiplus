package tl1;

/* loaded from: classes15.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl1.v f420215d;

    public o(tl1.v vVar) {
        this.f420215d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tl1.v vVar = this.f420215d;
        com.tencent.mm.plugin.appbrand.jsapi.picker.f fVar = vVar.f420218d;
        if (fVar != null) {
            fVar.stopSmoothScrollingAndCalibrateSelectedData();
            vVar.c(true, vVar.f420218d.currentValue());
        } else {
            vVar.c(true, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/picker/AppBrandPickerBottomPanelBase$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
