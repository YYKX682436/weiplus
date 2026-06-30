package rs;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs.k f399237e;

    public a(rs.k kVar, java.util.ArrayList arrayList) {
        this.f399237e = kVar;
        this.f399236d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f399236d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rs.k kVar = this.f399237e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f399281m.remove(arrayList);
                return;
            }
            rs.j jVar = (rs.j) it.next();
            androidx.recyclerview.widget.k3 k3Var = jVar.f399270a;
            kVar.getClass();
            android.view.View view = k3Var.itemView;
            int i17 = jVar.f399273d - jVar.f399271b;
            int i18 = jVar.f399274e - jVar.f399272c;
            if (i17 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i18 != 0) {
                view.animate().translationY(0.0f);
            }
            android.view.ViewPropertyAnimator animate = view.animate();
            kVar.f399284p.add(k3Var);
            animate.setDuration(kVar.f12170e).setListener(new rs.f(kVar, k3Var, i17, view, i18, animate)).start();
        }
    }
}
