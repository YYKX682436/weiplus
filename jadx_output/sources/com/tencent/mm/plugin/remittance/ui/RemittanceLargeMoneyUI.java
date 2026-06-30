package com.tencent.mm.plugin.remittance.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/remittance/ui/RemittanceLargeMoneyUI;", "Lcom/tencent/mm/plugin/remittance/ui/RemittanceF2fLargeMoneyUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class RemittanceLargeMoneyUI extends com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI {

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f157427u;

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI
    public void U6(double d17) {
        com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent remittanceLargeMoneyPayEvent = new com.tencent.mm.autogen.events.RemittanceLargeMoneyPayEvent();
        am.rq rqVar = remittanceLargeMoneyPayEvent.f54676g;
        rqVar.f7835b = d17;
        rqVar.f7834a = this.f157427u;
        rqVar.getClass();
        remittanceLargeMoneyPayEvent.e();
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI
    public void V6() {
        this.f157420p = getIntent().getIntExtra("key_amount_remind_bit", 4);
        this.f157422r = getIntent().getStringExtra("key_title");
        this.f157423s = getIntent().getStringExtra("key_desc");
        getIntent().getStringExtra("key_display_name");
        this.f157427u = getIntent().getStringExtra("key_place_attach");
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI
    public void W6() {
        this.f157412e.setText(this.f157422r);
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.remittance.model.s1 s1Var = (com.tencent.mm.plugin.remittance.model.s1) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.remittance.model.s1.class);
        java.lang.String mTitle = this.f157422r;
        kotlin.jvm.internal.o.f(mTitle, "mTitle");
        s1Var.setValue("page_title_key", mTitle);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String str = this.f157423s;
        float textSize = this.f157413f.getTextSize();
        ((ke0.e) xVar).getClass();
        this.f157413f.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str, textSize));
    }

    @Override // com.tencent.mm.plugin.remittance.ui.RemittanceF2fLargeMoneyUI, com.tencent.mm.wallet_core.ui.WalletBaseUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.RemittanceLargeMoneyUI", "onResume()");
        com.tencent.mm.plugin.remittance.ui.h2.b();
        com.tencent.mm.plugin.remittance.ui.g2.f157719a.c(this);
    }
}
