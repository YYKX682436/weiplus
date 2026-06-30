package vo1;

/* loaded from: classes3.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f438538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438539e;

    public n(java.util.ArrayList arrayList, vo1.q qVar) {
        this.f438538d = arrayList;
        this.f438539e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f438538d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vo1.q qVar = this.f438539e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f438550l.remove(arrayList);
                return;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) next;
            qVar.getClass();
            android.view.View itemView = k3Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            android.view.ViewPropertyAnimator animate = itemView.animate();
            qVar.f438553o.add(k3Var);
            animate.alpha(1.0f).setDuration(qVar.f12168c).setListener(new vo1.e(qVar, k3Var, itemView, animate)).start();
        }
    }
}
