package ku3;

/* loaded from: classes3.dex */
public final class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.y3 f312361d;

    public p3(ku3.y3 y3Var) {
        this.f312361d = y3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuCountDownPlugin$initSecondBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.y3 y3Var = this.f312361d;
        if (y3Var.B != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RecordMenuCountDownPlugin", "select none count down");
            zt3.a.V6(y3Var.f312469d, 9, false, null, false, false, 28, null);
            y3Var.B = 0;
            ku3.y3.a(y3Var, y3Var.f312478p);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordMenuCountDownPlugin$initSecondBar$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
