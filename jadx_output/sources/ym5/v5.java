package ym5;

/* loaded from: classes10.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.y5 f463559d;

    public v5(ym5.y5 y5Var) {
        this.f463559d = y5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/StickerDrawingView$initBottomControlLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        c01.s2 s2Var = c01.s2.f37443s;
        ym5.y5 y5Var = this.f463559d;
        ym5.y5.e(y5Var, s2Var, false, 2, null);
        com.tencent.mars.xlog.Log.i(y5Var.f463581x, "doOnDrawConfirm: ");
        yz5.l lVar = y5Var.F;
        if (lVar != null) {
            lVar.invoke(null);
        }
        yj0.a.h(this, "com/tencent/mm/view/StickerDrawingView$initBottomControlLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
