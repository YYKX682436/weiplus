package oa1;

/* loaded from: classes7.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f343806d;

    public b(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f343806d = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/game/litegame/LiteGameCapsuleWidget$setWidgetClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteGameCapsuleWidget", "this is home button click");
        mi1.v vVar = this.f343806d.f74821z;
        if (vVar != null) {
            mi1.i iVar = vVar.f326704c;
            if (iVar == null) {
                kotlin.jvm.internal.o.o("capsuleBarView");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.widget.actionbar.AppBrandCapsuleHomeButton capsuleHomeButton = iVar.getCapsuleHomeButton();
            kotlin.jvm.internal.o.f(capsuleHomeButton, "getCapsuleHomeButton(...)");
            capsuleHomeButton.performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/game/litegame/LiteGameCapsuleWidget$setWidgetClickEvent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
