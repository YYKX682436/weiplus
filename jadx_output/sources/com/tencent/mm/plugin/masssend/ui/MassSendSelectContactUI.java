package com.tencent.mm.plugin.masssend.ui;

/* loaded from: classes11.dex */
public class MassSendSelectContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public android.widget.Button C;
    public java.util.List D;
    public java.util.List E;
    public boolean F;
    public com.tencent.mm.pluginsdk.ui.MultiSelectContactView G;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        com.tencent.mm.ui.contact.i0 i0Var = new com.tencent.mm.ui.contact.i0();
        i0Var.f206762b = true;
        i0Var.f206770j = "@all.contact.without.chatroom.without.openim.without.openimfavour";
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
        return getString(com.tencent.mm.R.string.gtf);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489265bx5;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.p4 b76 = b7();
        com.tencent.mm.ui.contact.item.d item = b76.getItem(i17 - this.f206446d.getHeaderViewsCount());
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "ClickUser=%s", str);
        java.lang.String str2 = item.f206850s;
        Y6();
        if (((java.util.LinkedList) this.E).contains(str2)) {
            ((java.util.LinkedList) this.E).remove(str2);
            this.G.d(str2);
        } else {
            ((java.util.LinkedList) this.E).add(str2);
            this.G.d(str2);
        }
        w7(((java.util.LinkedList) this.E).size());
        b76.notifyDataSetChanged();
        Y6();
        X6();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.D = arrayList;
        arrayList.addAll(com.tencent.mm.ui.contact.i5.b());
        this.D.addAll(c01.e2.i());
        this.D.add(c01.z1.r());
        this.E = new java.util.LinkedList();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean m7() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "requestCode=%d | resultCode=%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (i18 == -1 && i17 == 0) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Contact");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS return usernames is null or empty");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "GET_LABEL_USERS select username=%s", stringExtra);
            for (java.lang.String str : stringExtra.split(",")) {
                if (((java.util.LinkedList) this.E).add(str)) {
                    this.G.d(str);
                }
            }
            w7(((java.util.LinkedList) this.E).size());
            b7().notifyDataSetChanged();
            com.tencent.mm.ui.tools.c9 c9Var = this.f206451i;
            if (c9Var != null) {
                c9Var.a();
                this.f206451i.b();
            }
        }
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSendSelectContactUI", "create!");
        com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = this.f206450h;
        this.G = multiSelectContactView;
        if (multiSelectContactView == null) {
            finish();
            return;
        }
        multiSelectContactView.setBackgroundDrawable(null);
        addTextOptionMenu(1, getString(com.tencent.mm.R.string.gtd), new kf3.g2(this), null, com.tencent.mm.ui.fb.GREEN);
        android.widget.Button button = (android.widget.Button) findViewById(com.tencent.mm.R.id.f486797mi0);
        this.C = button;
        button.setOnClickListener(new kf3.h2(this));
        this.G.setOnContactDeselectListener(new kf3.i2(this));
        w7(((java.util.LinkedList) this.E).size());
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void q7(java.lang.String str) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11225, 1, 0);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("label", str);
        intent.putExtra("always_select_contact", com.tencent.mm.sdk.platformtools.t8.c1(new java.util.ArrayList(this.E), ","));
        intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(16384, 64));
        j45.l.v(this, ".ui.contact.SelectLabelContactUI", intent, 0);
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.contact.l4
    public boolean t4(com.tencent.mm.ui.contact.item.d dVar) {
        java.lang.String str;
        if (!dVar.d() || (str = dVar.f206850s) == null) {
            return false;
        }
        return ((java.util.LinkedList) this.E).contains(str);
    }

    public final void w7(int i17) {
        if (i17 <= 0) {
            updateOptionMenuText(1, getString(com.tencent.mm.R.string.gtd));
            enableOptionMenu(1, false);
            return;
        }
        updateOptionMenuText(1, getString(com.tencent.mm.R.string.gtd) + "(" + ((java.util.LinkedList) this.E).size() + ")");
        enableOptionMenu(1, true);
    }
}
