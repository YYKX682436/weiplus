package com.tencent.mm.plugin.location.ui;

/* loaded from: classes9.dex */
public class RemarkUI extends com.tencent.mm.ui.tools.MMTextInputUI {
    @Override // com.tencent.mm.ui.tools.MMTextInputUI
    public void U6(java.lang.CharSequence charSequence) {
        long longExtra = getIntent().getLongExtra("kFavInfoLocalId", -1L);
        if (longExtra > 0) {
            java.lang.String charSequence2 = charSequence == null ? "" : charSequence.toString();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMTextInputUI", "same remark[%s]", charSequence2);
            if (charSequence2.equals(getIntent().getStringExtra("kRemark"))) {
                return;
            }
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            am.c4 c4Var = doFavoriteEvent.f54090g;
            c4Var.f6317c = -2;
            c4Var.f6320f = java.lang.Long.toString(longExtra);
            c4Var.f6319e = charSequence2;
            java.lang.String str = c4Var.f6320f;
            doFavoriteEvent.e();
        }
    }

    @Override // com.tencent.mm.ui.tools.MMTextInputUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cdu;
    }

    @Override // com.tencent.mm.ui.tools.MMTextInputUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.ggs);
        java.lang.String stringExtra = getIntent().getStringExtra("Kwebmap_locaion");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            ((android.widget.TextView) findViewById(com.tencent.mm.R.id.inw)).setText(stringExtra);
            return;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ina);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/location/ui/RemarkUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/location/ui/RemarkUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
