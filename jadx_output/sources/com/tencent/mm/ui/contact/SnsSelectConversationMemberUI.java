package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class SnsSelectConversationMemberUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public java.util.List C;
    public java.lang.String D;
    public java.lang.String E;
    public java.util.ArrayList F = new java.util.ArrayList();
    public java.util.List G = new java.util.ArrayList();

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.F.remove(str);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.k(str);
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
            if (multiSelectContactView != null) {
                multiSelectContactView.e(this.F);
            }
            b7().notifyDataSetChanged();
            x7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.ui.contact.l3(this, true, this.G, this.C);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return null;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getResources().getString(com.tencent.mm.R.string.jho, java.lang.Integer.valueOf(this.G.size()));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.p4 b76 = b7();
        com.tencent.mm.ui.contact.item.d item = b76.getItem(i17 - this.f206446d.getHeaderViewsCount());
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationMemberUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f206850s;
        Y6();
        if (this.F.contains(str2)) {
            this.F.remove(str2);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.k(str2);
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
            if (multiSelectContactView != null) {
                multiSelectContactView.d(str2);
            }
        } else {
            if (w7(this.F.size() + 1)) {
                return;
            }
            this.F.add(str2);
            com.tencent.mm.plugin.sns.statistics.j0.f164861a.a(str2, 2);
            com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView2 = this.f206450h;
            if (multiSelectContactView2 != null) {
                multiSelectContactView2.d(str2);
            }
        }
        x7();
        b76.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        super.initView();
        this.f206446d.setBackgroundResource(com.tencent.mm.R.color.f478869jf);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        java.lang.String stringExtra = getIntent().getStringExtra("select_chatroom_name");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.D = stringExtra;
        this.F = new java.util.ArrayList();
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Conv_User");
        this.E = stringExtra2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            this.F.addAll(com.tencent.mm.sdk.platformtools.t8.P1(this.E.split(",")));
        }
        java.lang.String stringExtra3 = getIntent().getStringExtra("Block_list");
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((stringExtra3 != null ? stringExtra3 : "").split(","));
        java.util.HashSet b17 = com.tencent.mm.ui.contact.i5.b();
        b17.addAll(P1);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.C = arrayList;
        arrayList.addAll(b17);
        this.C.addAll(c01.e2.i());
        this.G = new java.util.LinkedList();
        java.util.List L0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().L0(this.D);
        p75.n0 n0Var = dm.e2.N1;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        linkedList.add(dm.e2.P1);
        p75.m c17 = dm.e2.P1.l(L0).c(dm.e2.T1.g(1, 1));
        p75.i0 g17 = dm.e2.N1.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        l75.k0 k0Var = gm0.j1.u().f273153f;
        if (!k0Var.isOpen()) {
            k0Var = null;
        }
        java.util.List k17 = a17.k(k0Var, com.tencent.mm.storage.z3.class);
        java.lang.String r17 = c01.z1.r();
        java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) it.next();
            if (!r17.equals(z3Var.d1()) && !android.text.TextUtils.isEmpty(z3Var.d1()) && !z3Var.d1().contains("openim")) {
                this.G.add(z3Var.d1());
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectConversationMemberUI", "Create!");
        addTextOptionMenu(1, getResources().getString(com.tencent.mm.R.string.f492531gv0), new com.tencent.mm.ui.contact.wb(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.ui.contact.xb(this));
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        if (multiSelectContactView != null) {
            multiSelectContactView.e(this.F);
        }
        x7();
        b7().notifyDataSetChanged();
        x7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.F.contains(str);
    }

    public final boolean w7(int i17) {
        if (i17 <= 10) {
            return false;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsSelectConversationMemberUI", "tooManySelection");
        db5.e1.t(getContext(), getString(com.tencent.mm.R.string.jhs, java.lang.Integer.valueOf(getIntent().getIntExtra("max_limit_num", 10))), "", new com.tencent.mm.ui.contact.yb(this));
        return true;
    }

    public final void x7() {
        updateOptionMenuText(1, getResources().getString(com.tencent.mm.R.string.f492531gv0));
        enableOptionMenu(1, this.F.size() >= 0);
    }
}
