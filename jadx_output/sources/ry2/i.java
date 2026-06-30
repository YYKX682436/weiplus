package ry2;

/* loaded from: classes10.dex */
public final class i implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f401395d;

    public i(java.util.List list) {
        this.f401395d = list;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        yz5.a aVar;
        java.util.Iterator it = this.f401395d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            ry2.f fVar = (ry2.f) obj;
            boolean z17 = false;
            if (menuItem != null && fVar.f401384a == menuItem.getItemId()) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        ry2.f fVar2 = (ry2.f) obj;
        if (fVar2 == null || (aVar = fVar2.f401387d) == null) {
            return;
        }
        aVar.invoke();
    }
}
