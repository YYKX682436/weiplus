package pk2;

/* loaded from: classes3.dex */
public final class q9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.e9 f356198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f356199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f356200f;

    public q9(pk2.e9 e9Var, yz5.l lVar, pk2.p7 p7Var) {
        this.f356198d = e9Var;
        this.f356199e = lVar;
        this.f356200f = p7Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f356198d.f355712a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((qk2.h) obj).y() == menuItem.getItemId()) {
                    break;
                }
            }
        }
        qk2.h hVar = (qk2.h) obj;
        if (hVar != null) {
            hVar.A();
        }
        yz5.l lVar = this.f356199e;
        if (lVar != null) {
            lVar.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
        }
        this.f356200f.c().h();
    }
}
