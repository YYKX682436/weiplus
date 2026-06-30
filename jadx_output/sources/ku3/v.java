package ku3;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i0 f312427d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f312428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f312429f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zt3.c f312430g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ku3.x f312431h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f312432i;

    public v(ku3.i0 i0Var, int i17, int i18, zt3.c cVar, ku3.x xVar, android.widget.FrameLayout frameLayout) {
        this.f312427d = i0Var;
        this.f312428e = i17;
        this.f312429f = i18;
        this.f312430g = cVar;
        this.f312431h = xVar;
        this.f312432i = frameLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        zt3.c cVar;
        zt3.c cVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ku3.i0 i0Var = this.f312427d;
        java.lang.Integer num = (java.lang.Integer) i0Var.f312251d.f475578f.get(java.lang.Integer.valueOf(this.f312428e));
        if (num == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int intValue = num.intValue();
        zt3.a aVar = i0Var.f312251d;
        androidx.lifecycle.j0 j0Var = (androidx.lifecycle.j0) aVar.f475579g.get(java.lang.Integer.valueOf(intValue));
        if (!((j0Var == null || (cVar2 = (zt3.c) j0Var.getValue()) == null) ? true : cVar2.f475590d)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitMenuPlugin", "checkFun is no can select " + intValue);
            yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (intValue == 5) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(12, 0, bundle);
            zt3.a.U6(i0Var.f312251d, 16, 4, null, 4, null);
        } else if (intValue == 6) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(13, 0, bundle2);
            zt3.a.U6(i0Var.f312251d, 16, 4, null, 4, null);
        } else if (intValue == 7) {
            android.os.Bundle bundle3 = new android.os.Bundle();
            bundle3.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(14, 0, bundle3);
            zt3.a.U6(i0Var.f312251d, 16, 4, null, 4, null);
        } else if (intValue != 9) {
            androidx.lifecycle.j0 j0Var2 = (androidx.lifecycle.j0) aVar.f475579g.get(java.lang.Integer.valueOf(intValue));
            if (j0Var2 == null || (cVar = (zt3.c) j0Var2.getValue()) == null) {
                cVar = new zt3.c(this.f312429f, false, null, false, false, 30, null);
            }
            boolean z17 = !cVar.f475588b;
            zt3.a aVar2 = i0Var.f312251d;
            zt3.c cVar3 = this.f312430g;
            zt3.a.V6(aVar2, cVar3.f475587a, z17, null, false, false, 28, null);
            this.f312431h.x(new zt3.c(cVar3.f475587a, z17, null, false, false, 28, null), this.f312432i);
        } else {
            android.os.Bundle bundle4 = new android.os.Bundle();
            bundle4.putFloat("PARAM_1_FLOAT", view.getX());
            aVar.T6(15, 0, bundle4);
            zt3.a.U6(i0Var.f312251d, 16, 4, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitMenuPlugin$initLogic$2$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
