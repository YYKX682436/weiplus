package o;

/* loaded from: classes15.dex */
public class g implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o.l f341715d;

    public g(o.l lVar) {
        this.f341715d = lVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        o.l lVar = this.f341715d;
        if (!lVar.isShowing() || ((java.util.ArrayList) lVar.f341732o).size() <= 0 || ((o.k) ((java.util.ArrayList) lVar.f341732o).get(0)).f341722a.D) {
            return;
        }
        android.view.View view = lVar.f341739v;
        if (view == null || !view.isShown()) {
            lVar.dismiss();
            return;
        }
        java.util.Iterator it = ((java.util.ArrayList) lVar.f341732o).iterator();
        while (it.hasNext()) {
            ((o.k) it.next()).f341722a.show();
        }
    }
}
