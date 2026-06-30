package yw3;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yw3.j f466695d;

    public b(yw3.j jVar) {
        this.f466695d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        androidx.lifecycle.c1 a17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(yw3.d.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(yw3.d.class);
        }
        com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(((yw3.d) a17).P6(yw3.k.class), this.f466695d.f466773d, false, false, 6, null);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/DemoConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
