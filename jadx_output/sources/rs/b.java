package rs;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f399238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rs.k f399239e;

    public b(rs.k kVar, java.util.ArrayList arrayList) {
        this.f399239e = kVar;
        this.f399238d = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = this.f399238d;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            rs.k kVar = this.f399239e;
            if (!hasNext) {
                arrayList.clear();
                kVar.f399282n.remove(arrayList);
                return;
            }
            rs.i iVar = (rs.i) it.next();
            kVar.getClass();
            androidx.recyclerview.widget.k3 k3Var = iVar.f399264a;
            android.view.View view = k3Var == null ? null : k3Var.itemView;
            androidx.recyclerview.widget.k3 k3Var2 = iVar.f399265b;
            android.view.View view2 = k3Var2 != null ? k3Var2.itemView : null;
            java.util.ArrayList arrayList2 = kVar.f399286r;
            if (view != null) {
                android.view.ViewPropertyAnimator duration = view.animate().setDuration(kVar.f12171f);
                arrayList2.add(iVar.f399264a);
                duration.translationX(iVar.f399268e - iVar.f399266c);
                duration.translationY(iVar.f399269f - iVar.f399267d);
                duration.alpha(0.0f).setListener(new rs.g(kVar, iVar, duration, view)).start();
            }
            if (view2 != null) {
                android.view.ViewPropertyAnimator animate = view2.animate();
                arrayList2.add(iVar.f399265b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f12171f).alpha(1.0f).setListener(new rs.h(kVar, iVar, animate, view2)).start();
            }
        }
    }
}
