package cr3;

/* loaded from: classes11.dex */
public class c0 implements db5.t4, db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cr3.d0 f221926d;

    public c0(cr3.d0 d0Var, cr3.p pVar) {
        this.f221926d = d0Var;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.storage.z3 z3Var = this.f221926d.f221932e;
        if (z3Var != null && com.tencent.mm.storage.z3.p4(z3Var.d1())) {
            g4Var.a(10, com.tencent.mm.R.string.bhb);
        }
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        cr3.d0 d0Var = this.f221926d;
        com.tencent.mm.storage.z3 z3Var = d0Var.f221932e;
        if (z3Var != null && com.tencent.mm.storage.z3.p4(z3Var.d1())) {
            d0Var.j(menuItem.getItemId());
        }
    }
}
