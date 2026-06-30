package rh4;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f395683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rh4.k f395684e;

    public a(rh4.k kVar, java.util.ArrayList arrayList) {
        this.f395684e = kVar;
        this.f395683d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f395683d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rh4.k kVar = this.f395684e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f395753m.remove(arrayList);
                return;
            }
            rh4.j jVar = (rh4.j) it.next();
            androidx.recyclerview.widget.k3 k3Var = jVar.f395742a;
            kVar.getClass();
            android.view.View view = k3Var.itemView;
            int i17 = jVar.f395745d - jVar.f395743b;
            int i18 = jVar.f395746e - jVar.f395744c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            kVar.f395756p.add(k3Var);
            animate.setDuration(kVar.f12170e).setListener(new rh4.f(kVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
