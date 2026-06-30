package f93;

/* loaded from: classes11.dex */
public class o3 implements k93.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f260413a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260414b;

    public o3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260414b = contactLabelSelectUI;
    }

    @Override // k93.a
    public void a() {
        k93.j jVar = this.f260414b.E;
        if (jVar.f305905t != jVar.f305904s) {
            jVar.f305903r++;
        }
        jVar.f305905t = -1;
        jVar.f305904s = -1;
        this.f260413a = false;
    }

    @Override // k93.a
    public void b(int i17) {
    }

    @Override // k93.a
    public void onItemSelected(int i17) {
        this.f260414b.E.f305905t = i17;
        if (!this.f260413a) {
            com.tencent.mm.ui.jk.a();
        }
        this.f260413a = true;
    }

    @Override // k93.a
    public boolean onMove(int i17, int i18) {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260414b;
        k93.j jVar = contactLabelSelectUI.E;
        jVar.f305904s = i18;
        if (i18 == 0 || (arrayList = jVar.f305893e) == null) {
            return false;
        }
        if (jVar.f305892d) {
            java.util.Collections.swap(arrayList, i17, i18);
            contactLabelSelectUI.E.notifyItemMoved(i17, i18);
            return true;
        }
        if (!contactLabelSelectUI.T) {
            contactLabelSelectUI.T = true;
            java.lang.String string = contactLabelSelectUI.getResources().getString(com.tencent.mm.R.string.g9y);
            f93.l3 l3Var = new f93.l3(this);
            com.tencent.mm.ui.widget.dialog.j0 j0Var = contactLabelSelectUI.f143292x0;
            if (j0Var == null || !j0Var.isShowing()) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(contactLabelSelectUI);
                u1Var.g(string);
                u1Var.m(com.tencent.mm.R.string.f490454vi);
                u1Var.l(new f93.p3(contactLabelSelectUI, l3Var));
                contactLabelSelectUI.f143292x0 = u1Var.f211998c;
                u1Var.q(false);
            }
        }
        return true;
    }
}
