package com.tencent.mm.ui.contact;

@db5.a(8192)
/* loaded from: classes9.dex */
public class SelectSpecialContactUI extends com.tencent.mm.ui.contact.MMBaseSelectContactUI {
    public java.lang.String C;
    public int D;

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.ui.contact.kc(this, getIntent().getStringExtra("filter_type"));
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return null;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return this.C;
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.item.d item = b7().getItem(i17);
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectSpecialContactUI", "ClickUser=%s", str);
        java.lang.String str2 = this.C;
        if (str2 != null && str2.equals(getString(com.tencent.mm.R.string.ix6))) {
            vf5.d dVar = (vf5.d) component(vf5.d.class);
            dVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.ContactBlackListPageReportUIC", "reportClick user=" + str + ", position=" + i17);
            if (((java.lang.Boolean) ((jz5.n) dVar.f436413d).getValue()).booleanValue()) {
                pm0.v.K(null, new vf5.c(dVar, str, i17));
            }
        }
        android.content.Intent intent = new android.content.Intent();
        if (com.tencent.mm.ui.contact.i5.d(this.D, 16384)) {
            intent.putExtra("Select_Contact", str);
            setResult(-1, intent);
            finish();
            return;
        }
        if (com.tencent.mm.ui.contact.i5.d(this.D, 32768)) {
            intent.putExtra("Contact_User", str);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 20);
            j45.l.n(this, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, 1);
            return;
        }
        intent.setClass(this, com.tencent.mm.ui.chatting.ChattingUI.class);
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/contact/SelectSpecialContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/contact/SelectSpecialContactUI", "handleItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void j7() {
        super.j7();
        this.C = getIntent().getStringExtra("titile");
        this.D = getIntent().getIntExtra("list_attr", 0);
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
        if (i17 != 1) {
            return;
        }
        this.f206448f.s();
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(vf5.d.class);
    }
}
