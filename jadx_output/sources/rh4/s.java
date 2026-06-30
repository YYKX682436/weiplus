package rh4;

/* loaded from: classes3.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f395782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.b0 f395783e;

    public s(rh4.b0 b0Var, java.util.ArrayList arrayList) {
        this.f395783e = b0Var;
        this.f395782d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f395782d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.b0 b0Var = this.f395783e;
            if (!hasNext) {
                arrayList.clear();
                b0Var.f395699n.remove(arrayList);
                return;
            }
            rh4.z zVar = (rh4.z) it.next();
            b0Var.getClass();
            androidx.recyclerview.widget.k3 k3Var = zVar.f395808a;
            android.view.View view = k3Var == null ? null : k3Var.itemView;
            androidx.recyclerview.widget.k3 k3Var2 = zVar.f395809b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = b0Var.f395703r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(b0Var.f12171f);
                arrayList2.add(zVar.f395808a);
                duration.translationX(zVar.f395812e - zVar.f395810c);
                duration.translationY(zVar.f395813f - zVar.f395811d);
                duration.alpha(0.0f).setListener(new rh4.x(b0Var, zVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(zVar.f395809b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(b0Var.f12171f).alpha(1.0f).setListener(new rh4.y(b0Var, zVar, animate, view2)).start();
            }
        }
    }
}
