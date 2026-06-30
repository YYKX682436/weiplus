package j93;

/* loaded from: classes.dex */
public final class j2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.p2 f298423d;

    public j2(j93.p2 p2Var) {
        this.f298423d = p2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f stateCenter;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/label/ui/uic/SelectLabelFooterViewUIC$initFooterView$2$view$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f298423d.P6();
        if (P6 != null && (stateCenter = P6.getStateCenter()) != null) {
            stateCenter.B3(new wi5.e());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/label/ui/uic/SelectLabelFooterViewUIC$initFooterView$2$view$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
