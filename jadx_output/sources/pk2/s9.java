package pk2;

/* loaded from: classes3.dex */
public final class s9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.e9 f356243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f356244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f356245f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.p7 f356246g;

    public s9(pk2.e9 e9Var, yz5.l lVar, yz5.l lVar2, pk2.p7 p7Var) {
        this.f356243d = e9Var;
        this.f356244e = lVar;
        this.f356245f = lVar2;
        this.f356246g = p7Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f356243d.f355712a.iterator();
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
        } else {
            yz5.l lVar = this.f356244e;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
            }
        }
        yz5.l lVar2 = this.f356245f;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Integer.valueOf(menuItem.getItemId()));
        }
        this.f356246g.c().h();
    }
}
