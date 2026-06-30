package com.tencent.mm.ui.contact.privacy;

@db5.a(32768)
/* loaded from: classes10.dex */
public class ContactMgrOnlyChatUI extends com.tencent.mm.ui.contact.privacy.ContactMgrUIBase {
    public java.lang.String F;

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.contact.l4
    public android.widget.ListView O3() {
        return null;
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public uf5.w0 T6(com.tencent.mm.ui.contact.l4 l4Var) {
        return new uf5.g0(this, l4Var);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public java.lang.CharSequence U6() {
        return getResources().getString(com.tencent.mm.R.string.f489874e5);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void V6() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.tencent.mm.R.string.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        intent.putExtra("without_openim", true);
        intent.putExtra("show_too_many_member", false);
        com.tencent.mm.ui.contact.i5.e();
        int g17 = com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206781b, com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING), 131072);
        intent.putExtra("max_limit_num", this.f207116w);
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        intent.putExtra("list_attr", g17);
        intent.putExtra("always_select_contact", c17);
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@social.black.android");
        intent.putExtra("titile", getResources().getString(com.tencent.mm.R.string.hla));
        b7(intent);
        startActivityForResult(intent, 2);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null || P1.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.String r17 = c01.z1.r();
        if (this.f207100d != null) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!this.f207100d.contains(str) && !r17.equals(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    arrayList.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!r17.equals(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList: %s, tagList : %s, memBerListTmp = %s.", P1, this.f207100d, arrayList);
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList.isEmpty.");
            return;
        }
        w11.h0 h0Var = new w11.h0(arrayList, 8388608, 1, this.f207115v);
        gm0.j1.n().f273288b.g(h0Var);
        this.f207114u = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.e_), true, true, new uf5.c0(this, h0Var));
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
        uf5.w0 w0Var = this.f207103g;
        if (w0Var.f207078f) {
            java.util.LinkedList linkedList = (java.util.LinkedList) w0Var.f427318r;
            if (linkedList.contains(str)) {
                linkedList.remove(str);
            } else {
                linkedList.add(str);
            }
            w0Var.notifyDataSetChanged();
            if (((java.util.LinkedList) this.f207103g.f427318r).size() <= 0) {
                this.f207111r.setText(getString(com.tencent.mm.R.string.f489881ec));
                this.f207111r.setEnabled(false);
                return;
            }
            this.f207111r.setText(getString(com.tencent.mm.R.string.f489881ec) + "(" + ((java.util.LinkedList) this.f207103g.f427318r).size() + ")");
            this.f207111r.setEnabled(true);
            return;
        }
        if (com.tencent.mm.storage.z3.k4(str)) {
            android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.contact.AddressUI.class);
            intent.putExtra("Contact_GroupFilter_Type", "@biz.contact");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/ContactMgrOnlyChatUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/privacy/ContactMgrOnlyChatUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", str);
        intent2.putExtra("Contact_Scene", 3);
        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 4);
        if (str == null || str.length() <= 0) {
            return;
        }
        j45.l.j(getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void a7(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null || P1.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onAddContact , memBerList: %s, tagList : %s.", P1, this.f207100d);
        w11.h0 h0Var = new w11.h0(P1, 8388608, 2, this.f207115v);
        gm0.j1.n().f273288b.g(h0Var);
        this.f207114u = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f489882ed), true, true, new uf5.d0(this, h0Var));
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactMgrOnlyChatUI", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.contact.l4
    public android.app.Activity getActivity() {
        return this;
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c_x;
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
        setMMTitle(U6());
        this.f207103g.s();
        e7();
        this.f207112s = getString(com.tencent.mm.R.string.f489880eb);
        this.F = getResources().getString(com.tencent.mm.R.string.f489874e5);
        i7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.String errMsg;
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var instanceof w11.h0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f207114u;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f207114u = null;
            }
            w11.h0 h0Var = (w11.h0) m1Var;
            int i19 = h0Var.f442041g;
            if (i17 == 0 && i18 == 0) {
                dp.a.makeText(this, getString(i19 == 1 ? com.tencent.mm.R.string.f489888ej : com.tencent.mm.R.string.f489891em), 0).show();
                return;
            }
            int i27 = com.tencent.mm.R.string.f489886eh;
            if (i18 == -3503) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this);
                java.lang.String errMsg2 = m1Var.getReqResp().getRespObj().getErrMsg();
                java.lang.String string = getString(com.tencent.mm.R.string.f489886eh);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (errMsg2 == null) {
                    errMsg2 = string;
                }
                u1Var.g(errMsg2);
                u1Var.a(true);
                u1Var.j(getString(com.tencent.mm.R.string.hmr));
                u1Var.m(com.tencent.mm.R.string.hms);
                u1Var.b(new uf5.e0(this));
                u1Var.q(false);
                return;
            }
            com.tencent.mm.ui.widget.dialog.u1 u1Var2 = new com.tencent.mm.ui.widget.dialog.u1(this);
            if (i18 == -3500) {
                errMsg = getString(i19 == 1 ? com.tencent.mm.R.string.f489887ei : com.tencent.mm.R.string.f489890el, java.lang.Integer.valueOf(h0Var.f442045n - ((java.util.LinkedList) h0Var.f442039e).size()));
            } else {
                errMsg = m1Var.getReqResp().getRespObj().getErrMsg();
                if (com.tencent.mm.sdk.platformtools.t8.K0(errMsg)) {
                    if (i19 != 1) {
                        i27 = com.tencent.mm.R.string.f489889ek;
                    }
                    errMsg = getString(i27);
                }
            }
            u1Var2.g(errMsg);
            u1Var2.m(com.tencent.mm.R.string.f490507x1);
            u1Var2.l(new uf5.f0(this));
            u1Var2.q(false);
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        return false;
    }
}
