package com.tencent.mm.plugin.product.ui;

/* loaded from: classes14.dex */
public abstract class MallBaseUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f153192d;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setBackBtn(new com.tencent.mm.plugin.product.ui.e(this));
    }

    @Override // android.app.Activity
    public android.app.Dialog onCreateDialog(int i17) {
        if (i17 == -10002) {
            return com.tencent.mm.wallet_core.ui.b2.h(getContext(), false, new com.tencent.mm.plugin.product.ui.g(this));
        }
        if (i17 != -10001) {
            return super.onCreateDialog(i17);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153192d)) {
            this.f153192d = getString(com.tencent.mm.R.string.gro);
        }
        return db5.e1.G(this, this.f153192d, null, false, new com.tencent.mm.plugin.product.ui.f(this));
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 == 4 && keyEvent.getAction() == 1) {
            callBackMenu();
        }
        return super.onKeyUp(i17, keyEvent);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setContentViewVisibility(int i17) {
        android.view.View contentView = getContentView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/product/ui/MallBaseUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/plugin/product/ui/MallBaseUI", "setContentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 0) {
            showTitleView();
        } else {
            hideTitleView();
        }
    }
}
