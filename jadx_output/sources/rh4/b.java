package rh4;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f395690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.k f395691e;

    public b(rh4.k kVar, java.util.ArrayList arrayList) {
        this.f395691e = kVar;
        this.f395690d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f395690d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.k kVar = this.f395691e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f395754n.remove(arrayList);
                return;
            }
            rh4.i iVar = (rh4.i) it.next();
            kVar.getClass();
            androidx.recyclerview.widget.k3 k3Var = iVar.f395735a;
            android.view.View view = k3Var == null ? null : k3Var.itemView;
            androidx.recyclerview.widget.k3 k3Var2 = iVar.f395736b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = kVar.f395758r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(kVar.f12171f);
                arrayList2.add(iVar.f395735a);
                duration.alpha(0.0f).setInterpolator(new android.view.animation.AccelerateInterpolator()).setDuration(kVar.f12171f).setListener(new rh4.g(kVar, iVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(iVar.f395736b);
                animate.translationX(0.0f).translationY(0.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(kVar.f12171f).alpha(1.0f).setListener(new rh4.h(kVar, iVar, animate, view2)).start();
            }
        }
    }
}
