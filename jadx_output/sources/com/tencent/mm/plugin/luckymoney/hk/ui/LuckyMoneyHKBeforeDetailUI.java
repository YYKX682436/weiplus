package com.tencent.mm.plugin.luckymoney.hk.ui;

@db5.a(7)
/* loaded from: classes9.dex */
public class LuckyMoneyHKBeforeDetailUI extends com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI {

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f145132m = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.l0g);

    /* renamed from: g, reason: collision with root package name */
    public android.app.Dialog f145133g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f145134h;

    /* renamed from: i, reason: collision with root package name */
    public wb3.a f145135i;

    public final void V6(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "go to detail ui");
        android.app.Dialog dialog = this.f145133g;
        if (dialog != null) {
            dialog.dismiss();
        }
        xb3.b bVar = new xb3.b(this);
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.i(bVar, 100L);
        } else {
            bVar.run();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.plugin.luckymoney.model.e1 e1Var;
        super.onCreate(bundle);
        overridePendingTransition(0, com.tencent.mm.R.anim.f477867dq);
        com.tencent.mm.ui.bk.p0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        setContentViewVisibility(8);
        this.f145134h = getIntent().getStringExtra("key_sendid");
        java.lang.String stringExtra = getIntent().getStringExtra("key_native_url");
        int intExtra = getIntent().getIntExtra("key_jump_from", 2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendid=");
        java.lang.String str = this.f145134h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(", nativeurl=");
        sb6.append(stringExtra != null ? stringExtra : "");
        sb6.append(", jumpFrom=");
        sb6.append(intExtra);
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", sb6.toString());
        if (intExtra == 2) {
            if (gb3.l.a(this.f145134h) != null) {
                V6(false);
                return;
            }
            try {
                byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_detail_info");
                if (byteArrayExtra != null && (e1Var = (com.tencent.mm.plugin.luckymoney.model.e1) new com.tencent.mm.plugin.luckymoney.model.e1().parseFrom(byteArrayExtra)) != null) {
                    gb3.l.b(this.f145134h, e1Var);
                    V6(false);
                    return;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHKBeforeDetailUI", "Parse LuckyMoneyDetail fail!" + e17.getLocalizedMessage());
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145134h) && !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            try {
                this.f145134h = android.net.Uri.parse(stringExtra).getQueryParameter("sendid");
            } catch (java.lang.Exception unused) {
            }
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f145134h)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LuckyMoneyHKBeforeDetailUI", "sendid null or nil, finish");
            finish();
            return;
        }
        java.lang.String str2 = this.f145134h;
        this.f145133g = db5.e1.O(getContext(), null, 3, com.tencent.mm.R.style.f494256i6, getString(com.tencent.mm.R.string.ggc), true, true, new xb3.c(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKBeforeDetailUI", "do query detail");
        wb3.a aVar = new wb3.a(stringExtra, str2, 11, 0, 1, getIntent().getIntExtra("key_hk_scene", 0));
        this.f145135i = aVar;
        aVar.l().h(new xb3.d(this, str2)).f(this);
    }

    @Override // com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyBaseUI
    public boolean onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        return false;
    }
}
