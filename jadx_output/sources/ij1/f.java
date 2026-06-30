package ij1;

/* loaded from: classes3.dex */
public class f implements android.view.View.OnClickListener {
    public f(ij1.j jVar) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/share/api/WxaShareMessageService$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/share/api/WxaShareMessageService$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
