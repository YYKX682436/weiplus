package com.tencent.mm.ui.contact.privacy;

@db5.a(32768)
/* loaded from: classes10.dex */
public class FinderBlockListUI extends com.tencent.mm.ui.contact.privacy.ContactMgrUIBase {
    public java.lang.CharSequence H;
    public java.util.LinkedList I;
    public android.widget.TextView K;
    public int F = 0;
    public com.tencent.mm.plugin.finder.storage.uj0 G = null;

    /* renamed from: J, reason: collision with root package name */
    public java.util.Set f207120J = new java.util.HashSet();

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public uf5.w0 T6(com.tencent.mm.ui.contact.l4 l4Var) {
        return new uf5.d1(this, l4Var);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void V6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderBlockListUI", "doCallSelectContactUIForMultiRetransmit");
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectContactUI");
        intent.putExtra("list_type", 1);
        intent.putExtra("titile", getString(com.tencent.mm.R.string.eol));
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(this.f207100d, ","));
        com.tencent.mm.ui.contact.i5.e();
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.f206781b);
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("max_limit_num", 20);
        intent.putExtra("Forbid_SelectChatRoom", true);
        intent.putExtra("show_too_many_member", false);
        intent.putExtra("without_openim", true);
        intent.putExtra("filter_type", "@all.contact.without.chatroom.without.openim");
        startActivityForResult(intent, 1);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void W6() {
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.ui.contact.privacy.SelectPrivacyContactsFromRangeUI.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        int i17 = this.F;
        if (i17 == 2) {
            intent.putExtra("filter_type", "@finder.block.my.liked.android");
        } else if (i17 == 1) {
            intent.putExtra("filter_type", "@finder.block.his.liked.android");
        }
        b7(intent);
        intent.putExtra("titile", getResources().getString(com.tencent.mm.R.string.hla));
        startActivityForResult(intent, 2);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void X6(android.content.Intent intent, android.content.Context context) {
        java.util.ArrayList P1;
        java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        this.f207120J.clear();
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MMBatchModContactTypeMaxNumForServer", 30);
        int i17 = 0;
        while (i17 < P1.size()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 = 0; i17 < P1.size() && i18 < b17; i18++) {
                arrayList.add((java.lang.String) P1.get(i17));
                i17++;
            }
            this.f207120J.add(this.G.b(arrayList));
        }
        this.f207119z = true;
        this.D.a(new uf5.a1(this));
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","))) == null) {
            return;
        }
        this.D.b(new uf5.b1(this, P1), new uf5.c1(this));
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderBlockListUI", "onNotifyChange: event = " + i17 + " stg = " + a1Var + " obj = " + obj);
        if (i17 == 4) {
            g7();
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.c_z;
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void h7() {
        android.widget.TextView textView;
        uf5.w0 w0Var = this.f207103g;
        if (w0Var == null || w0Var.u() != 0 || (textView = this.K) == null) {
            this.K.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase
    public void i7() {
        java.lang.CharSequence charSequence;
        uf5.w0 w0Var = this.f207103g;
        if (w0Var == null || w0Var.u() <= 0) {
            setMMTitle(this.H);
            return;
        }
        java.lang.CharSequence charSequence2 = this.H;
        int u17 = this.f207103g.u();
        if ((charSequence2 instanceof android.text.SpannableString) || (charSequence2 instanceof android.text.SpannableStringBuilder)) {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            spannableStringBuilder.append('(').append((java.lang.CharSequence) (u17 + "")).append(')');
            charSequence = spannableStringBuilder;
        } else {
            charSequence = ((java.lang.Object) charSequence2) + "(" + this.f207103g.u() + ")";
        }
        setMMTitle(charSequence);
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        int intExtra = getIntent().getIntExtra("BLOCK_LIST_TYPE", 0);
        this.F = intExtra;
        if (intExtra == 1) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            this.G = new com.tencent.mm.plugin.finder.storage.ua0();
        } else if (intExtra == 2) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            this.G = new com.tencent.mm.plugin.finder.storage.za0();
        }
        if (this.G == null) {
            finish();
        }
        super.onCreate(bundle);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ogl);
        this.K = textView;
        if (textView != null) {
            textView.setText(this.G.e(this, true));
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.widget.TextView tv6 = this.K;
            ((c61.l7) b6Var).getClass();
            kotlin.jvm.internal.o.g(tv6, "tv");
            com.tencent.mm.plugin.finder.view.CollapsibleTextView.f130818x.a(tv6);
        }
        int i17 = this.F;
        if (i17 == 1) {
            this.f207112s = this.G.n().toString();
        } else if (i17 == 2) {
            this.f207112s = this.G.m().toString();
        }
        ve4.g.a(39);
        java.lang.CharSequence i18 = this.G.i();
        this.H = i18;
        setMMTitle(i18);
        android.widget.TextView textView2 = this.f207104h;
        if (textView2 != null) {
            textView2.setText(this.G.e(this, true));
            zy2.b6 b6Var2 = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.widget.TextView tv7 = this.f207104h;
            ((c61.l7) b6Var2).getClass();
            kotlin.jvm.internal.o.g(tv7, "tv");
            com.tencent.mm.plugin.finder.view.CollapsibleTextView.f130818x.a(tv7);
        }
        setBackBtn(new uf5.z0(this));
        this.I = this.G.g();
        this.f207100d.clear();
        java.util.List a17 = k35.c.a();
        for (int i19 = 0; i19 < this.I.size(); i19++) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.I.get(i19);
            if (finderContact != null) {
                if (!((java.util.ArrayList) a17).contains(finderContact.getUsername())) {
                    this.f207100d.add(finderContact.getUsername());
                }
            }
        }
        f7();
    }

    @Override // com.tencent.mm.ui.contact.privacy.ContactMgrUIBase, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        super.onSceneEnd(i17, i18, str, m1Var);
        this.D.c();
        w11.h0 h0Var = (w11.h0) m1Var;
        if (i17 == 0 && i18 == 0) {
            int i19 = h0Var.f442041g;
            if (i19 == 1) {
                if (h0Var.H() != null && h0Var.H().f376127e != null) {
                    java.util.Iterator it = h0Var.H().f376127e.iterator();
                    while (it.hasNext()) {
                        r45.vn4 vn4Var = (r45.vn4) it.next();
                        r45.un4 un4Var = vn4Var.f388397e;
                        if (un4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(un4Var.f387494d) && !this.f207100d.contains(vn4Var.f388397e.f387494d)) {
                            this.f207100d.add(vn4Var.f388397e.f387494d);
                        }
                    }
                }
                g7();
            }
            if (i19 == 2) {
                if (h0Var.H() != null && h0Var.H().f376127e != null) {
                    java.util.Iterator it6 = h0Var.H().f376127e.iterator();
                    while (it6.hasNext()) {
                        r45.vn4 vn4Var2 = (r45.vn4) it6.next();
                        r45.un4 un4Var2 = vn4Var2.f388397e;
                        if (un4Var2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(un4Var2.f387494d) && this.f207100d.contains(vn4Var2.f388397e.f387494d)) {
                            this.f207100d.remove(vn4Var2.f388397e.f387494d);
                        }
                    }
                }
                g7();
            }
            if (this.f207120J.contains(m1Var)) {
                this.f207120J.remove(m1Var);
                if (this.f207120J.isEmpty()) {
                    d7();
                    g7();
                }
            }
        } else if (this.f207120J.contains(m1Var)) {
            this.f207120J.remove(m1Var);
            if (this.f207120J.isEmpty()) {
                c7();
            }
            g7();
        }
        this.f207119z = false;
        this.A = false;
    }
}
