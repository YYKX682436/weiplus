package com.tencent.mm.ui.contact.privacy;

@db5.a(32768)
/* loaded from: classes10.dex */
public class SnsTagDetailUI extends com.tencent.mm.ui.contact.privacy.ContactMgrUIBase {
    public static final /* synthetic */ int K = 0;
    public long G;
    public final java.util.List F = new java.util.ArrayList();
    public java.lang.String H = "";
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public int f207122J = 0;

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public uf5.w0 T6(com.tencent.mm.ui.contact.l4 l4Var) {
        return new uf5.x1(this, l4Var);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void V6() {
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("titile", getString(com.tencent.mm.R.string.hl7));
        intent.putExtra("list_type", 1);
        intent.putExtra("KBlockOpenImFav", true);
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206781b);
        intent.putExtra("always_select_contact", c17);
        intent.putExtra("without_openim", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        j45.l.v(this, ".ui.contact.SelectContactUI", intent, 1);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        long j17 = this.G;
        if (j17 == 4) {
            intent.putExtra("filter_type", "@sns.black.android");
        } else if (j17 == 5) {
            intent.putExtra("filter_type", "@sns.unlike.android");
        }
        b7(intent);
        intent.putExtra("titile", getResources().getString(com.tencent.mm.R.string.hla));
        startActivityForResult(intent, 2);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void X6(android.content.Intent intent, android.content.Context context) {
        long j17 = this.G;
        if (j17 == 4) {
            m7(true, intent);
        } else if (j17 == 5) {
            l7(true, intent);
        }
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
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/SnsTagDetailUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/contact/privacy/SnsTagDetailUI", "onListViewItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        long j18 = this.G;
        if (j18 == 4) {
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 18);
        } else if (j18 == 5) {
            intent2.putExtra("CONTACT_INFO_UI_SOURCE", 19);
        }
        intent2.putExtra("Contact_User", str);
        if (str == null || str.length() <= 0) {
            return;
        }
        j45.l.j(getContext(), com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent2, null);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void a7(android.content.Intent intent, android.content.Context context) {
        long j17 = this.G;
        if (j17 == 4) {
            m7(false, intent);
        } else if (j17 == 5) {
            l7(false, intent);
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (this.G == 4 && i17 == 4) {
            g7();
        }
        if (this.G == 5 && i17 == 4) {
            g7();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void h7() {
        if (this.G == 4) {
            this.D.c();
            d7();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void i7() {
        uf5.w0 w0Var = this.f207103g;
        if (w0Var == null || w0Var.u() <= 0) {
            setMMTitle(this.H);
            return;
        }
        setMMTitle(this.H + "(" + this.f207103g.u() + ")");
    }

    public java.util.List j7() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        if (this.G == 4) {
            new java.util.LinkedList();
            return k35.c.b();
        }
        com.tencent.mm.plugin.sns.storage.q2 D0 = com.tencent.mm.plugin.sns.model.l4.Lj().D0(this.G);
        java.lang.String str = D0.field_memberList;
        return (str == null || str.equals("")) ? linkedList : com.tencent.mm.sdk.platformtools.t8.P1(D0.field_memberList.split(","));
    }

    public final void k7() {
        long j17 = this.G;
        java.util.List list = this.f207101e;
        java.util.List list2 = this.F;
        if (j17 == 5) {
            ((java.util.ArrayList) list2).clear();
            gm0.j1.i();
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            android.database.Cursor x17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).x("@sns.unlike.android", "", null);
            while (x17.moveToNext()) {
                ((java.util.ArrayList) list2).add(x17.getString(x17.getColumnIndex(dm.i4.COL_USERNAME)));
            }
            x17.close();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "initTagList before localContactTagList: %s, tagList : %s.", list2, this.f207100d);
            for (int i17 = 0; i17 < ((java.util.ArrayList) list2).size(); i17++) {
                java.lang.String str2 = (java.lang.String) ((java.util.ArrayList) list2).get(i17);
                if (!this.f207100d.contains(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    c01.e2.A0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str2, true));
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "initTagList tag no container db tagName: %s", str2);
                }
            }
            for (int i18 = 0; i18 < this.f207100d.size(); i18++) {
                java.lang.String str3 = (java.lang.String) this.f207100d.get(i18);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && !((java.util.ArrayList) list2).contains(str3)) {
                    c01.e2.s0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str3, true));
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "initTagList db no container tag tagName: %s", str3);
                }
            }
            if (this.f207100d.contains(str)) {
                this.f207100d.remove(str);
                c01.e2.A0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true));
            }
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).addAll(this.f207100d);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "initTagList after localContactTagList: %s, tagList : %s, orginTagList: %s.", list2, this.f207100d, list);
    }

    public final boolean l7(boolean z17, android.content.Intent intent) {
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null) {
            return false;
        }
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        java.lang.String r17 = c01.z1.r();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp , before memBerList: %s, tagList : %s, md5: %s.", P1, this.f207100d, this.I);
        if (z17) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str) && !this.f207100d.contains(str)) {
                    this.f207100d.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((com.tencent.mm.storage.k4) pj6).n(str2, true).r2() && !r17.equals(str2) && this.f207100d.contains(str2)) {
                    this.f207100d.remove(str2);
                }
            }
        }
        if ((this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",")).equals(this.I) && this.G != 0) {
            return false;
        }
        this.I = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        if (z17) {
            this.f207119z = true;
        } else {
            this.A = true;
        }
        com.tencent.mm.plugin.sns.model.e3 e3Var = new com.tencent.mm.plugin.sns.model.e3(3, this.G, this.H, this.f207100d.size(), this.f207100d, this.f207122J);
        gm0.j1.i();
        gm0.j1.n().f273288b.g(e3Var);
        this.f207114u = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(z17 ? com.tencent.mm.R.string.e_ : com.tencent.mm.R.string.f489882ed), true, false, new uf5.w1(this, e3Var));
        return true;
    }

    public final boolean m7(boolean z17, android.content.Intent intent) {
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(intent.getStringExtra("Select_Contact").split(","));
        if (P1 == null) {
            return false;
        }
        java.lang.String r17 = c01.z1.r();
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        if (z17) {
            java.util.Iterator it = P1.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str) && !this.f207100d.contains(str)) {
                    this.f207100d.add(str);
                }
            }
        } else {
            java.util.Iterator it6 = P1.iterator();
            while (it6.hasNext()) {
                java.lang.String str2 = (java.lang.String) it6.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((com.tencent.mm.storage.k4) pj6).n(str2, true).r2() && !r17.equals(str2) && this.f207100d.contains(str2)) {
                    this.f207100d.remove(str2);
                }
            }
        }
        java.lang.String str3 = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        if (str3.equals(this.I) && this.G != 0) {
            return false;
        }
        java.lang.String str4 = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        this.I = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp , md5: %s, tagList : %s, newMd5: %s, add : %s, memBerList: %s..", str4, this.f207100d, str3, java.lang.Boolean.valueOf(z17), P1);
        java.util.List<java.lang.String> j76 = j7();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        for (java.lang.String str5 : j76) {
            if (!this.f207100d.contains(str5)) {
                linkedList.add(str5);
            }
        }
        for (java.lang.String str6 : this.f207100d) {
            if (!j76.contains(str6)) {
                linkedList2.add(str6);
            }
        }
        uf5.j1 j1Var = this.D;
        if (z17) {
            this.f207119z = true;
            android.content.Context context = j1Var.f427252a;
            j1Var.f427253b = db5.e1.Q(context, context.getResources().getString(com.tencent.mm.R.string.f490573yv), j1Var.f427252a.getResources().getString(com.tencent.mm.R.string.e_), true, false, new uf5.h1(j1Var));
        } else {
            this.A = true;
            android.content.Context context2 = j1Var.f427252a;
            j1Var.f427253b = db5.e1.Q(context2, context2.getResources().getString(com.tencent.mm.R.string.f490573yv), j1Var.f427252a.getResources().getString(com.tencent.mm.R.string.f489882ed), true, false, new uf5.i1(j1Var));
        }
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            c01.e2.l0((java.lang.String) it7.next(), false);
        }
        java.util.Iterator it8 = linkedList2.iterator();
        while (it8.hasNext()) {
            c01.e2.l0((java.lang.String) it8.next(), true);
        }
        g7();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "noSeeHimDataOp  memBerList: %s, tagList : %s, md5: %s， delContact： %s, addContact: %s.", P1, this.f207100d, this.I, linkedList, linkedList2);
        return true;
    }

    public final void n7() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "revertFailData , 1, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.I, this.f207100d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f207119z));
        if (this.A && this.f207119z) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "revertFailData , error happen.");
        }
        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
        java.lang.String r17 = c01.z1.r();
        if (this.G == 5) {
            boolean z17 = this.A;
            java.util.List list = this.f207101e;
            if (z17) {
                this.A = false;
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str) && !this.f207100d.contains(str)) {
                        this.f207100d.add(str);
                    }
                }
            }
            if (this.f207119z) {
                this.f207119z = false;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.String str2 : this.f207100d) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && ((com.tencent.mm.storage.k4) pj6).n(str2, true).r2() && !r17.equals(str2) && !((java.util.ArrayList) list).contains(str2)) {
                        arrayList.add(str2);
                    }
                }
                this.f207100d.removeAll(arrayList);
            }
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).addAll(this.f207100d);
            this.I = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "revertFailData , 2, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.I, this.f207100d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f207119z));
        f7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        this.G = getIntent().getLongExtra("k_sns_tag_id", 0L);
        this.f207122J = getIntent().getIntExtra("k_tag_detail_sns_block_scene", 0);
        super.onCreate(bundle);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.a(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX, this);
        if (((java.util.ArrayList) com.tencent.mm.plugin.sns.model.l4.Lj().z0()).size() == 0) {
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.d3(1));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onCreate snsTagId: %s, scene : %s.", java.lang.Long.valueOf(this.G), java.lang.Integer.valueOf(this.f207122J));
        long j17 = this.G;
        if (j17 == 4) {
            this.H = getString(com.tencent.mm.R.string.hlq);
        } else if (j17 == 5) {
            this.H = getString(com.tencent.mm.R.string.hlp);
        } else {
            this.H = com.tencent.mm.plugin.sns.model.l4.Lj().D0(this.G).field_tagName;
        }
        long j18 = this.G;
        if (j18 == 4) {
            this.f207112s = getString(com.tencent.mm.R.string.hlg);
        } else if (j18 == 5) {
            this.f207112s = getString(com.tencent.mm.R.string.hlh);
        }
        if (this.G == 0) {
            java.lang.String stringExtra = getIntent().getStringExtra("k_sns_tag_list");
            java.lang.String stringExtra2 = getIntent().getStringExtra("k_sns_tag_name");
            if (stringExtra2 == null) {
                stringExtra2 = "";
            }
            this.H = stringExtra2;
            com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
            java.lang.String r17 = c01.z1.r();
            java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            if (P1 != null) {
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !this.f207100d.contains(str) && ((com.tencent.mm.storage.k4) pj6).n(str, true).r2() && !r17.equals(str)) {
                        this.f207100d.add(str);
                    }
                }
            }
        } else {
            this.f207100d = j7();
        }
        k7();
        java.lang.String str2 = this.H;
        if (str2 == null || str2.equals("")) {
            this.H = getString(com.tencent.mm.R.string.jfq);
            this.H = com.tencent.mm.plugin.sns.model.s5.g(getString(com.tencent.mm.R.string.jfq));
        }
        setBackBtn(new uf5.v1(this));
        if (this.G == 0) {
            enableOptionMenu(true);
        } else {
            enableOptionMenu(false);
        }
        this.I = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
        f7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f207114u;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.D.c();
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(291, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(292, this);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        int type = m1Var.getType();
        uf5.j1 j1Var = this.D;
        switch (type) {
            case com.tencent.mm.plugin.appbrand.jsapi.audio.a0.CTRL_INDEX /* 290 */:
                finish();
                return;
            case 291:
                com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f207114u;
                if (u3Var != null) {
                    u3Var.dismiss();
                    this.f207114u = null;
                }
                j1Var.c();
                if (m1Var instanceof com.tencent.mm.plugin.sns.model.e3) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd 1, md5: %s, tagList : %s.", this.I, this.f207100d);
                    if (i17 == 0 && i18 == 0) {
                        java.lang.String str2 = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
                        this.I = str2;
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "updateSuccessData , 1, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", str2, this.f207100d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f207119z));
                        if (this.A && this.f207119z) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "updateSuccessData , error happen.");
                        }
                        com.tencent.mm.storage.e8 pj6 = com.tencent.mm.plugin.sns.model.l4.pj();
                        java.lang.String r17 = c01.z1.r();
                        if (this.G == 5) {
                            boolean z17 = this.A;
                            java.util.List list = this.f207101e;
                            if (z17) {
                                this.A = false;
                                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                                while (it.hasNext()) {
                                    java.lang.String str3 = (java.lang.String) it.next();
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str3) && ((com.tencent.mm.storage.k4) pj6).n(str3, true).r2() && !r17.equals(str3) && !this.f207100d.contains(str3)) {
                                        c01.e2.A0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str3, true));
                                    }
                                }
                            }
                            if (this.f207119z) {
                                this.f207119z = false;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                for (java.lang.String str4 : this.f207100d) {
                                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str4) && ((com.tencent.mm.storage.k4) pj6).n(str4, true).r2() && !r17.equals(str4) && !((java.util.ArrayList) list).contains(str4)) {
                                        arrayList.add(str4);
                                        c01.e2.s0(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str4, true));
                                    }
                                }
                            }
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
                            arrayList2.clear();
                            arrayList2.addAll(this.f207100d);
                            this.I = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "updateSuccessData , 2, md5: %s, tagList : %s, isRemovingContact: %s, isAddingContact: %s.", this.I, this.f207100d, java.lang.Boolean.valueOf(this.A), java.lang.Boolean.valueOf(this.f207119z));
                        g7();
                        d7();
                    } else {
                        n7();
                        c7();
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd 2, md5: %s, tagList : %s.", this.I, this.f207100d);
                    return;
                }
                return;
            case 292:
                com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f207114u;
                if (u3Var2 != null) {
                    u3Var2.dismiss();
                    this.f207114u = null;
                }
                j1Var.c();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd update form net 1, md5: %s, tagList : %s.", this.I, this.f207100d);
                com.tencent.mm.plugin.sns.model.d3 d3Var = (com.tencent.mm.plugin.sns.model.d3) m1Var;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                if (!com.tencent.mm.sdk.platformtools.t8.L0(d3Var.H(this.G))) {
                    for (int i19 = 0; i19 < ((java.util.LinkedList) d3Var.H(this.G)).size(); i19++) {
                        java.lang.String str5 = (java.lang.String) ((java.util.LinkedList) d3Var.H(this.G)).get(i19);
                        if (str5 != null) {
                            arrayList3.add(str5);
                        }
                    }
                }
                new java.util.LinkedList();
                java.util.List<java.lang.String> list2 = this.f207100d;
                this.f207100d = j7();
                if (list2 != null) {
                    for (java.lang.String str6 : list2) {
                        if (!this.f207100d.contains(str6)) {
                            this.f207100d.add(str6);
                        }
                    }
                }
                k7();
                this.I = this.H + " " + com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ",");
                g7();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsTagDetailUI", "onSceneEnd update form net 2, md5: %s, tagList : %s.", this.I, this.f207100d);
                return;
            default:
                return;
        }
    }
}
