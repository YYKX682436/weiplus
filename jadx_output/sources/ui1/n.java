package ui1;

/* loaded from: classes7.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ui1.z f428064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ui1.o f428066f;

    public n(ui1.o oVar, ui1.z zVar, java.lang.String str) {
        this.f428066f = oVar;
        this.f428064d = zVar;
        this.f428065e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/permission/jsauth/AppBrandJsApiUserAuth$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ui1.o oVar = this.f428066f;
        com.tencent.mm.plugin.appbrand.y yVar = oVar.f428068e;
        this.f428064d.h(yVar, this.f428065e, (com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).r(oVar.f428068e);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/permission/jsauth/AppBrandJsApiUserAuth$6$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
