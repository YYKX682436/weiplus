package rh4;

/* loaded from: classes3.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f395704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.k f395705e;

    public c(rh4.k kVar, java.util.ArrayList arrayList) {
        this.f395705e = kVar;
        this.f395704d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f395704d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.k kVar = this.f395705e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f395752l.remove(arrayList);
                return;
            }
            androidx.recyclerview.widget.k3 k3Var = (androidx.recyclerview.widget.k3) it.next();
            kVar.getClass();
            android.view.View view = k3Var.itemView;
            android.view.ViewPropertyAnimator animate = view.animate();
            kVar.f395755o.add(k3Var);
            animate.scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(new android.view.animation.DecelerateInterpolator()).setDuration(kVar.f12168c).setListener(new rh4.e(kVar, k3Var, view, animate)).start();
        }
    }
}
