package com.tencent.mm.ui.contact;

@db5.a(8192)
/* loaded from: classes11.dex */
public class SnsAddressUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public final java.util.ArrayList C = new java.util.ArrayList();
    public java.util.List D;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 == 1) {
            this.C.remove(str);
            b7().notifyDataSetChanged();
            w7();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.ui.contact.i0 i0Var = new com.tencent.mm.ui.contact.i0();
        i0Var.f206762b = true;
        i0Var.f206771k = true;
        i0Var.f206773m = getString(com.tencent.mm.R.string.f489920fh);
        java.lang.String stringExtra = getIntent().getStringExtra("Add_get_from_sns");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        i0Var.f206772l = stringExtra;
        i0Var.f206770j = "@all.contact.without.chatroom.openim.openimfavour.snsblack.black.socialblack";
        return new com.tencent.mm.ui.contact.h0(this, this.D, true, true, i0Var);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return new com.tencent.mm.ui.contact.f5(this, this.D, true, this.A);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public int[] d7() {
        return new int[]{131072};
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        java.lang.String stringExtra = getIntent().getStringExtra("Add_address_titile");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return stringExtra == null ? "" : stringExtra;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.p4 b76 = b7();
        com.tencent.mm.ui.contact.item.d item = b76.getItem(i17 - this.f206446d.getHeaderViewsCount());
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAddressUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f206850s;
        Y6();
        java.util.ArrayList arrayList = this.C;
        if (arrayList.contains(str2)) {
            arrayList.remove(str2);
            this.f206450h.d(str2);
        } else if (arrayList.size() < com.tencent.mm.storage.t3.f195324a) {
            arrayList.add(str2);
            this.f206450h.d(str2);
        } else {
            dp.a.makeText(this, com.tencent.mm.R.string.jco, 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAddressUI", "select user size equal max size:%d", java.lang.Integer.valueOf(com.tencent.mm.storage.t3.f195324a));
        }
        w7();
        b76.notifyDataSetChanged();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public void initView() {
        android.widget.TextView textView;
        super.initView();
        java.lang.String stringExtra = getIntent().getStringExtra("address_ui_sub_title");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && (textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nrl)) != null) {
            textView.setText(stringExtra);
            textView.setVisibility(0);
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("footer_tip");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
            return;
        }
        android.view.View inflate = android.view.LayoutInflater.from(this).inflate(com.tencent.mm.R.layout.bse, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.gcc)).setText(stringExtra2);
        this.f206446d.addFooterView(inflate);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.D = new java.util.ArrayList();
        java.lang.String stringExtra = getIntent().getStringExtra("Block_list");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
        java.util.HashSet b17 = com.tencent.mm.ui.contact.i5.b();
        b17.addAll(P1);
        this.D.addAll(b17);
        this.D.addAll(c01.e2.i());
        this.D.addAll(((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).Ri());
        java.lang.String stringExtra2 = getIntent().getStringExtra("Select_Contact");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.C.addAll(com.tencent.mm.sdk.platformtools.t8.P1(str.split(",")));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean n7() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 3) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsAddressUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (java.lang.String str : stringExtra.split(",")) {
                if (this.C.add(str)) {
                    this.f206450h.d(str);
                }
            }
            w7();
            b7().notifyDataSetChanged();
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAddressUI", "Create!");
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.ui.contact.fb(this), null, com.tencent.mm.ui.fb.GREEN);
        setBackBtn(new com.tencent.mm.ui.contact.gb(this));
        this.f206450h.e(this.C);
        this.f206450h.setOnContactDeselectListener(new com.tencent.mm.ui.contact.hb(this));
        w7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        dx1.g.f244489a.j("SnsPublishProcess", "atPageStaytime_", java.lang.Long.valueOf(getActivityBrowseTimeMs()), bx1.u.f36310e);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void q7(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(this, "com.tencent.mm.ui.contact.SelectLabelContactUI");
        intent.putExtra("label", str);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(this.C);
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(new java.util.ArrayList(hashSet), ","));
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16384, 64));
        startActivityForResult(intent, 3);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return this.C.contains(str);
    }

    public final void w7() {
        java.util.ArrayList arrayList = this.C;
        updateOptionMenuText(1, arrayList.size() == 0 ? java.lang.String.format("%s", getString(com.tencent.mm.R.string.f490507x1)) : java.lang.String.format("%s(%d/%d)", getString(com.tencent.mm.R.string.f490507x1), java.lang.Integer.valueOf(arrayList.size()), java.lang.Integer.valueOf(com.tencent.mm.storage.t3.f195324a)));
        enableOptionMenu(1, arrayList.size() >= 0);
    }
}
