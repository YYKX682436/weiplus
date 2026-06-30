package nh1;

/* loaded from: classes7.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f337092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nh1.j f337093e;

    public h(nh1.j jVar, int i17) {
        this.f337093e = jVar;
        this.f337092d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/menu/base/SecondaryMenuSheet$SecondaryMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nh1.g gVar = this.f337093e.f337096e;
        if (gVar != null) {
            gVar.a(view, this.f337092d);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/menu/base/SecondaryMenuSheet$SecondaryMenuAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
