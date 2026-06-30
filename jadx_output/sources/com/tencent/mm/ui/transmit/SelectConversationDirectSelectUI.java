package com.tencent.mm.ui.transmit;

@db5.a(7)
@gm0.a2
/* loaded from: classes9.dex */
public class SelectConversationDirectSelectUI extends com.tencent.mm.ui.transmit.SelectConversationUI {
    @Override // com.tencent.mm.ui.transmit.SelectConversationUI, com.tencent.mm.ui.contact.MMBaseSelectContactUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f210991k2 = true;
        java.lang.String stringExtra = getIntent().getStringExtra("Select_Conv_User");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            throw new java.lang.IllegalArgumentException("not provide username for share. please use pure SelectConversationUI");
        }
        setContentViewVisibility(8);
        overridePendingTransition(0, 0);
        com.tencent.mm.ui.v9.e(getWindow());
        com.tencent.mm.ui.v9.c(getWindow(), false);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        setBackGroundColorResource(com.tencent.mm.R.color.f479206su);
        G7(stringExtra);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        supportRequestWindowFeature(1);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
    }
}
