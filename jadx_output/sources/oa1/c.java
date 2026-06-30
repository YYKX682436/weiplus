package oa1;

/* loaded from: classes7.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f343807d;

    public c(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f343807d = o6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/game/litegame/LiteGameCapsuleWidget$setWidgetClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteGameCapsuleWidget", "this is option button click");
        mi1.v vVar = this.f343807d.f74821z;
        if (vVar != null) {
            vVar.d().performClick();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/game/litegame/LiteGameCapsuleWidget$setWidgetClickEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
