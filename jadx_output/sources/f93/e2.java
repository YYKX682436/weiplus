package f93;

/* loaded from: classes11.dex */
public class e2 implements k93.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f260326a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelManagerUI f260327b;

    public e2(com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI) {
        this.f260327b = contactLabelManagerUI;
    }

    @Override // k93.a
    public void a() {
        k93.j jVar = this.f260327b.A;
        if (jVar.f305905t != jVar.f305904s) {
            jVar.f305903r++;
        }
        jVar.f305905t = -1;
        jVar.f305904s = -1;
        this.f260326a = false;
    }

    @Override // k93.a
    public void b(int i17) {
    }

    @Override // k93.a
    public void onItemSelected(int i17) {
        this.f260327b.A.f305905t = i17;
        if (!this.f260326a) {
            com.tencent.mm.ui.jk.a();
        }
        this.f260326a = true;
    }

    @Override // k93.a
    public boolean onMove(int i17, int i18) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.label.ui.ContactLabelManagerUI contactLabelManagerUI = this.f260327b;
        k93.j jVar = contactLabelManagerUI.A;
        jVar.f305904s = i18;
        if (i18 == 0 || (arrayList = jVar.f305893e) == null) {
            return false;
        }
        if (jVar.f305892d) {
            java.util.Collections.swap(arrayList, i17, i18);
            contactLabelManagerUI.A.notifyItemMoved(i17, i18);
            return true;
        }
        if (!contactLabelManagerUI.I) {
            contactLabelManagerUI.I = true;
            java.lang.String string = contactLabelManagerUI.getResources().getString(com.tencent.mm.R.string.g9y);
            f93.d2 d2Var = new f93.d2(this);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = contactLabelManagerUI.S;
            if (j0Var == null || !j0Var.isShowing()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(contactLabelManagerUI);
                u1Var.g(string);
                u1Var.m(com.tencent.mm.R.string.f490454vi);
                u1Var.l(new f93.f2(contactLabelManagerUI, d2Var));
                contactLabelManagerUI.S = u1Var.f211998c;
                u1Var.q(false);
            }
        }
        return true;
    }
}
