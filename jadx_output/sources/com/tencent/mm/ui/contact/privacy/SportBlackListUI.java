package com.tencent.mm.ui.contact.privacy;

/* loaded from: classes10.dex */
public class SportBlackListUI extends com.tencent.mm.ui.contact.privacy.ContactMgrUIBase {
    public java.lang.String F;

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public uf5.w0 T6(com.tencent.mm.ui.contact.l4 l4Var) {
        return new uf5.b2(this, l4Var);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void V6() {
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.tencent.mm.R.string.hl7));
        intent.putExtra("list_type", 1);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206781b);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        intent.putExtra("always_select_contact", c17);
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@werun.black.android");
        intent.putExtra("titile", getResources().getString(com.tencent.mm.R.string.hla));
        b7(intent);
        startActivityForResult(intent, 2);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.SportBlackListUI", "onAddContact before userNameStr: %s, tagList : %s.", stringExtra, this.f207100d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!this.f207100d.contains(str) && !r17.equals(str)) {
                this.f207100d.add(str);
                c01.e2.w0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true));
            }
        }
        this.f207119z = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.SportBlackListUI", "onAddContact after userNameStr: %s, tagList : %s.", stringExtra, this.f207100d);
        this.f207114u = db5.e1.Q(this, getResources().getString(com.tencent.mm.R.string.f490573yv), getResources().getString(com.tencent.mm.R.string.e_), true, false, new uf5.z1(this));
        g7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public boolean Y6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void Z6(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.contact.item.d item = this.f207103g.getItem(i17);
        if (item == null || !(item instanceof com.tencent.mm.ui.contact.item.u)) {
            return;
        }
        java.lang.String str = ((com.tencent.mm.ui.contact.item.u) item).f206819z;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        com.tencent.mars.xlog.Log.i("MicroMsg.SportBlackListUI", "onRemoveContact before userNameStr: %s, tagList : %s.", stringExtra, this.f207100d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                this.f207100d.remove(str);
                c01.e2.E0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true));
                ve4.g.a(40);
            }
        }
        this.A = true;
        g7();
        this.f207114u = db5.e1.Q(this, getResources().getString(com.tencent.mm.R.string.f490573yv), getResources().getString(com.tencent.mm.R.string.f489882ed), true, false, new uf5.a2(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.SportBlackListUI", "onRemoveContact after userNameStr: %s, tagList : %s.", stringExtra, this.f207100d);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SportBlackListUI", "onNotifyChange, event: %s, stg: %s, obj: %s.", java.lang.Integer.valueOf(i17), a1Var, obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void h7() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f207114u;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f207114u = null;
        }
        if (this.A) {
            this.A = false;
            dp.a.makeText(this, getResources().getString(com.tencent.mm.R.string.f489891em), 0).show();
        }
        if (this.f207119z) {
            this.f207119z = false;
            dp.a.makeText(this, getResources().getString(com.tencent.mm.R.string.f489888ej), 0).show();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void i7() {
        uf5.w0 w0Var = this.f207103g;
        if (w0Var == null || w0Var.u() <= 0) {
            setMMTitle(this.F);
            return;
        }
        setMMTitle(this.F + "(" + this.f207103g.u() + ")");
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ve4.g.a(39);
        if (this.f207100d == null) {
            this.f207100d = new java.util.ArrayList();
        }
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        android.database.Cursor x17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).x("@werun.black.android", "", null);
        while (x17.moveToNext()) {
            java.lang.String string = x17.getString(x17.getColumnIndex(dm.i4.COL_USERNAME));
            if (str.equals(string)) {
                c01.e2.E0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(string, true));
            } else {
                this.f207100d.add(string);
            }
        }
        x17.close();
        java.lang.String string2 = getString(com.tencent.mm.R.string.hlm);
        this.F = string2;
        setMMTitle(string2);
        setBackBtn(new uf5.y1(this));
        this.f207112s = getString(com.tencent.mm.R.string.hll);
        f7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f207114u;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f207114u = null;
        }
    }
}
