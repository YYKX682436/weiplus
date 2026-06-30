package rp1;

/* loaded from: classes3.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f398565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rp1.k2 f398566e;

    public z1(rp1.k2 k2Var, java.util.ArrayList arrayList) {
        this.f398566e = k2Var;
        this.f398565d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f398565d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rp1.k2 k2Var = this.f398566e;
            if (!hasNext) {
                arrayList.clear();
                k2Var.f398459m.remove(arrayList);
                return;
            }
            rp1.j2 j2Var = (rp1.j2) it.next();
            androidx.recyclerview.widget.k3 k3Var = j2Var.f398442a;
            k2Var.getClass();
            android.view.View view = k3Var.itemView;
            int i17 = j2Var.f398445d - j2Var.f398443b;
            int i18 = j2Var.f398446e - j2Var.f398444c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            k2Var.f398462p.add(k3Var);
            animate.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).setDuration(k2Var.f12170e).setListener(new rp1.e2(k2Var, k3Var, i17, view, i18, animate)).start();
        }
    }
}
