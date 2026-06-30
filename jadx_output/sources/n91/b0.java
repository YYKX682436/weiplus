package n91;

/* loaded from: classes7.dex */
public final class b0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n91.c0 f335854d;

    public b0(n91.c0 c0Var) {
        this.f335854d = c0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/custom_loading/MagicGameLoadingImpl$setUpDefaultView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicGameLoadingImpl", "[gameload] requestFullScreen");
        n91.e eVar = this.f335854d.f335870n;
        if (eVar != null) {
            ((n91.h) eVar).f335878b.f335872b.K2.c();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/custom_loading/MagicGameLoadingImpl$setUpDefaultView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
