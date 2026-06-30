package ym5;

/* loaded from: classes10.dex */
public final class t5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463540d;

    public t5(ym5.y5 y5Var) {
        this.f463540d = y5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/StickerDrawingView$initBottomControlLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.s2 s2Var = c01.s2.f37441q;
        ym5.y5 y5Var = this.f463540d;
        ym5.y5.e(y5Var, s2Var, false, 2, null);
        com.tencent.mars.xlog.Log.i(y5Var.f463581x, "doOnDrawCancel: ");
        yz5.a aVar = y5Var.E;
        if (aVar != null) {
            aVar.invoke();
        }
        yj0.a.h(this, "com/tencent/mm/view/StickerDrawingView$initBottomControlLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
