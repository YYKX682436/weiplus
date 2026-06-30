package rp1;

/* loaded from: classes3.dex */
public class a2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f398355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398356e;

    public a2(rp1.k2 k2Var, java.util.ArrayList arrayList) {
        this.f398356e = k2Var;
        this.f398355d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f398355d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rp1.k2 k2Var = this.f398356e;
            if (!hasNext) {
                arrayList.clear();
                k2Var.f398460n.remove(arrayList);
                return;
            }
            rp1.h2 h2Var = (rp1.h2) it.next();
            k2Var.getClass();
            androidx.recyclerview.widget.k3 k3Var = h2Var.f398411a;
            android.view.View view = k3Var == null ? null : k3Var.itemView;
            androidx.recyclerview.widget.k3 k3Var2 = h2Var.f398412b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = k2Var.f398464r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(k2Var.f12171f);
                arrayList2.add(h2Var.f398411a);
                duration.translationX(h2Var.f398415e - h2Var.f398413c);
                duration.translationY(h2Var.f398416f - h2Var.f398414d);
                duration.alpha(0.0f).setListener(new rp1.f2(k2Var, h2Var, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(h2Var.f398412b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(k2Var.f12171f).alpha(1.0f).setListener(new rp1.g2(k2Var, h2Var, animate, view2)).start();
            }
        }
    }
}
