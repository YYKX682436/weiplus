package com.tencent.mm.plugin.luckymoney.ui;

/* loaded from: classes9.dex */
public class SelectLuckyMoneyContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public android.view.View C;
    public java.util.List D;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        rd0.j1 j1Var = (rd0.j1) i95.n0.c(rd0.j1.class);
        java.util.List list = this.D;
        ((qd0.y0) j1Var).getClass();
        return new com.tencent.mm.ui.contact.o8(this, list, true, false, false, 0);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.D, false, this.A);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getString(com.tencent.mm.R.string.gnj);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        if (i17 >= this.f206446d.getHeaderViewsCount()) {
            com.tencent.mm.ui.contact.item.d dVar = (com.tencent.mm.ui.contact.item.d) this.f206446d.getAdapter().getItem(i17);
            if (dVar == null || (str = dVar.f206850s) == null) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", str);
            ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).wi(this.mController, null, str, getString(com.tencent.mm.R.string.i28), str, com.tencent.mm.storage.z3.R4(str) ? getString(com.tencent.mm.R.string.kz7, java.lang.Integer.valueOf(((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str))) : null, getString(com.tencent.mm.R.string.f490551ya), new com.tencent.mm.plugin.luckymoney.ui.vp(this, intent));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", java.lang.Integer.valueOf(i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
        int intExtra = getIntent().getIntExtra("key_friends_num", 0);
        android.content.Intent intent2 = new android.content.Intent();
        int g17 = com.tencent.mm.ui.contact.i5.g(16, 1, 2, 4, 16384, 64, 65536, 131072);
        intent2.putExtra("list_type", 0);
        intent2.putExtra("list_attr", g17);
        intent2.putExtra("max_limit_num", intExtra);
        intent2.putExtra("titile", getString(com.tencent.mm.R.string.gni, java.lang.Integer.valueOf(intExtra)));
        intent2.putExtra("sub_title", getString(com.tencent.mm.R.string.l8q));
        j45.l.v(this, ".ui.contact.SelectContactUI", intent2, 1);
        overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477784bd);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.tencent.mm.ui.contact.i5.b());
        hashSet.addAll(c01.e2.i());
        java.lang.String stringExtra = getIntent().getStringExtra("Select_block_List");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            hashSet.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.D = arrayList;
        arrayList.addAll(hashSet);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (intent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = " + intent.toString());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + i17 + ", resultCode = " + i18 + ", data = null");
        }
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + i17);
        } else if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
            setResult(-1, intent);
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4) {
            p7();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        super.p7();
        hideVKB();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
        if (this.C == null) {
            android.view.View inflate = android.view.View.inflate(this, com.tencent.mm.R.layout.cjm, null);
            this.C = inflate.findViewById(com.tencent.mm.R.id.cgi);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o_q)).setText(com.tencent.mm.R.string.gl9);
            listView.addHeaderView(inflate);
        }
        android.view.View view = this.C;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/SelectLuckyMoneyContactUI", "setHeaderView", "(Landroid/widget/ListView;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
