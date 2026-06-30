package oj5;

/* loaded from: classes14.dex */
public final class e implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f345840d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.r f345841e;

    public e(android.view.View view, oj5.r rVar) {
        this.f345840d = view;
        this.f345841e = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f345840d.removeOnAttachStateChangeListener(this);
        oj5.r rVar = this.f345841e;
        java.util.Iterator it = oj5.x.b(rVar.f345878a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            android.view.View itemView = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            oj5.r.a(rVar, itemView);
            android.view.View itemView2 = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView2, "itemView");
            rVar.c(itemView2, true);
        }
        rVar.f345882e.clear();
        int[] b17 = rVar.b();
        int i17 = b17[0];
        int b18 = a06.d.b((i17 * 100.0f) / (1 < i17 + b17[1] ? r3 : 1));
        com.tencent.mars.xlog.Log.i(rVar.f345879b, "[doOnDetach] " + kz5.z.x0(b17) + " hitRate=" + b18 + '%');
        java.util.HashMap hashMap = oj5.r.f345877h;
        java.util.HashMap hashMap2 = oj5.r.f345877h;
        androidx.recyclerview.widget.f2 adapter = rVar.f345878a.getAdapter();
        hashMap2.remove(java.lang.Integer.valueOf(adapter != null ? adapter.hashCode() : 0));
    }
}
