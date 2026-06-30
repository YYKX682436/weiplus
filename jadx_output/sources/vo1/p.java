package vo1;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f438542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vo1.q f438543e;

    public p(java.util.ArrayList arrayList, vo1.q qVar) {
        this.f438542d = arrayList;
        this.f438543e = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = this.f438542d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vo1.q qVar = this.f438543e;
            if (!hasNext) {
                arrayList.clear();
                qVar.f438551m.remove(arrayList);
                return;
            }
            java.lang.Object next = it.next();
            kotlin.jvm.internal.o.f(next, "next(...)");
            vo1.d dVar = (vo1.d) next;
            qVar.getClass();
            androidx.recyclerview.widget.k3 holder = dVar.f438505a;
            kotlin.jvm.internal.o.g(holder, "holder");
            android.view.View itemView = holder.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            int i17 = dVar.f438508d - dVar.f438506b;
            int i18 = dVar.f438509e - dVar.f438507c;
            if (i17 != 0) {
                itemView.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                itemView.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = itemView.animate();
            qVar.f438554p.add(holder);
            animate.setDuration(qVar.f12170e).setListener(new vo1.l(qVar, holder, i17, itemView, i18, animate)).start();
        }
    }
}
