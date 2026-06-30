package rp1;

/* loaded from: classes3.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f398360d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398361e;

    public b2(rp1.k2 k2Var, java.util.ArrayList arrayList) {
        this.f398361e = k2Var;
        this.f398360d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f398360d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rp1.k2 k2Var = this.f398361e;
            if (!hasNext) {
                arrayList.clear();
                k2Var.f398458l.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            k2Var.getClass();
            android.view.View view = k3Var.itemView;
            android.view.ViewPropertyAnimator animate = view.animate();
            k2Var.f398461o.add(k3Var);
            animate.alpha(1.0f).setDuration(k2Var.f12168c).setListener(new rp1.d2(k2Var, k3Var, view, animate)).start();
        }
    }
}
