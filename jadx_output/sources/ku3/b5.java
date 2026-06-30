package ku3;

/* loaded from: classes3.dex */
public final class b5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f312174d;

    public b5(ku3.i5 i5Var) {
        this.f312174d = i5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuRatioPlugin$initRatioBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.i5 i5Var = this.f312174d;
        if (i5Var.f312278w != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuRatioPlugin", "select RATIO_1_1");
            zt3.a aVar = i5Var.f312262d;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("PARAM_1_INT", 1);
            bundle.putInt("PARAM_2_INT", i5Var.f312278w);
            zt3.a.V6(aVar, 7, false, bundle, false, false, 24, null);
            i5Var.f312278w = 1;
            ku3.i5.a(i5Var, i5Var.f312273r);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuRatioPlugin$initRatioBar$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
