package com.tencent.mm.ui.transmit;

/* loaded from: classes9.dex */
public class OpenImKefuTransmitUI extends com.tencent.mm.ui.transmit.SelectConversationUI {
    @Override // com.tencent.mm.ui.transmit.SelectConversationUI
    public boolean U7() {
        return false;
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.a5 Z6() {
        return new dk5.i2(this, null, this.f210983c2, this.E1, this.Y);
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public com.tencent.mm.ui.contact.o4 a7() {
        return null;
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public java.lang.String g7() {
        return getString(com.tencent.mm.R.string.her);
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void h7(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        super.h7(adapterView, view, i17, j17);
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public boolean l7() {
        return false;
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        boolean booleanExtra = getIntent().getBooleanExtra("KIsMultiSelect", false);
        this.E1 = booleanExtra;
        if (booleanExtra) {
            java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
            java.util.List linkedList = android.text.TextUtils.isEmpty(stringExtra) ? new java.util.LinkedList() : com.tencent.mm.sdk.platformtools.t8.P1(stringExtra.split(","));
            this.F1 = linkedList;
            if (linkedList == null) {
                this.F1 = new java.util.ArrayList();
            }
            this.G1 = new java.util.HashMap();
        }
        super.onCreate(bundle);
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void p7() {
        if (this.E1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Select_Conv_User", com.tencent.mm.sdk.platformtools.t8.c1(this.F1, ","));
            setResult(0, intent);
        }
        super.p7();
    }

    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI
    public void r7(android.widget.ListView listView, int i17) {
    }
}
