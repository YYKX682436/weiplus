package rh4;

/* loaded from: classes3.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f395780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395781e;

    public r(rh4.b0 b0Var, java.util.ArrayList arrayList) {
        this.f395781e = b0Var;
        this.f395780d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f395780d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.b0 b0Var = this.f395781e;
            if (!hasNext) {
                arrayList.clear();
                b0Var.f395698m.remove(arrayList);
                return;
            }
            rh4.a0 a0Var = (rh4.a0) it.next();
            androidx.recyclerview.widget.k3 k3Var = a0Var.f395685a;
            b0Var.getClass();
            android.view.View view = k3Var.itemView;
            int i17 = a0Var.f395688d - a0Var.f395686b;
            int i18 = a0Var.f395689e - a0Var.f395687c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            b0Var.f395701p.add(k3Var);
            animate.setDuration(b0Var.f12170e).setListener(new rh4.w(b0Var, k3Var, i17, view, i18, animate)).start();
        }
    }
}
