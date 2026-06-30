package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class SnsSelectFromConvBoxUI extends com.tencent.mm.ui.contact.SnsSelectConversationUI {
    public android.content.Intent P;
    public java.util.List Q = new java.util.LinkedList();

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new com.tencent.mm.ui.contact.fc(this, null, true, true, false);
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return null;
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getString(com.tencent.mm.R.string.jhi);
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.lang.String str;
        com.tencent.mm.ui.contact.item.d item = b7().getItem(i17 - this.f206446d.getHeaderViewsCount());
        if (item == null || (str = item.f206850s) == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSelectFromConvBoxUI", "ClickUser=%s", str);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.ui.contact.SnsSelectConversationMemberUI.class);
        intent.putExtra("no_result_tip", getContext().getString(com.tencent.mm.R.string.jhp));
        intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.Q, ","));
        intent.putExtra("select_chatroom_name", str);
        startActivityForResult(intent, 6);
        A7(this.Q);
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.P = intent;
        if (intent != null) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                this.Q.clear();
                this.Q.addAll(com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(",")));
            }
        }
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        java.util.List linkedList = android.text.TextUtils.isEmpty(stringExtra) ? new java.util.LinkedList() : com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
        this.Q = linkedList;
        if (linkedList == null) {
            this.Q = new java.util.ArrayList();
        }
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        setResult(-1, this.P);
        super.p7();
    }

    @Override // com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI
    public void w7() {
    }

    @Override // com.tencent.mm.ui.contact.SnsSelectConversationUI
    public void z7() {
    }
}
