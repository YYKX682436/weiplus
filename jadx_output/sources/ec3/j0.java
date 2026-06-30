package ec3;

/* loaded from: classes9.dex */
public final class j0 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.g1 f251042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ec3.g1 g1Var) {
        super(false);
        this.f251042d = g1Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        java.lang.StringBuilder sb6;
        kotlin.jvm.internal.o.g(v17, "v");
        ec3.g1 g1Var = this.f251042d;
        com.tencent.mm.plugin.luckymoney.model.j jVar = g1Var.f251017n;
        g1Var.getClass();
        if (jVar == null) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[12];
        objArr[0] = 16;
        objArr[1] = 0;
        objArr[2] = g1Var.f251026w;
        androidx.appcompat.app.AppCompatActivity activity = g1Var.getActivity();
        com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI luckyMoneyNewPrepareUI = activity instanceof com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI ? (com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewPrepareUI) activity : null;
        objArr[3] = luckyMoneyNewPrepareUI != null ? luckyMoneyNewPrepareUI.s7() : null;
        objArr[4] = "";
        objArr[5] = "";
        objArr[6] = g1Var.Z6();
        objArr[7] = java.lang.Integer.valueOf(g1Var.f251011e.size());
        objArr[8] = g1Var.f251027x;
        objArr[9] = 0;
        objArr[10] = g1Var.f251025v;
        objArr[11] = java.lang.Integer.valueOf(g1Var.C);
        g0Var.d(18890, objArr);
        g1Var.R6(false);
        g1Var.Q6();
        if (g1Var.P6()) {
            com.tencent.mm.ui.widget.MMEditText mMEditText = g1Var.f251013g;
            if (mMEditText != null && mMEditText.hasFocus()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[clickLayout] beforeClickIsInRecommendStyle = true");
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", jVar.f145338d);
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, jVar.f145340f);
        java.lang.String str = jVar.f145339e;
        if (str == null || str.length() == 0) {
            sb6 = new java.lang.StringBuilder();
            sb6.append("bless_text=");
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder(str);
            sb7.append("&bless_text=");
            sb6 = sb7;
        }
        sb6.append(g1Var.a7());
        sb6.append("&sessionid=" + g1Var.f251026w);
        sb6.append("&requestid=" + g1Var.f251025v);
        sb6.append("&query_scene=" + g1Var.C);
        if (g1Var.C == 1) {
            sb6.append("&festival_text=" + g1Var.D);
        }
        bundle.putString("query", sb6.toString());
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUIRecommendUIC", "[openClickLiteApp] appid：" + jVar.f145338d + "、path：" + jVar.f145340f + "、query: " + ((java.lang.Object) sb6) + "、version：" + jVar.f145342h + "、is_half:" + jVar.f145341g + "、height：" + jVar.f145343i + "、is_transparent：" + jVar.f145344m);
        java.lang.String str2 = jVar.f145342h;
        if (str2 == null || str2.length() == 0) {
            bundle.putString("minVersion", "2.6.1");
        } else {
            bundle.putString("minVersion", jVar.f145342h);
        }
        bundle.putBoolean("isHalfScreen", jVar.f145341g == 1);
        bundle.putDouble("heightPercent", jVar.f145343i / 10000);
        bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, jVar.f145344m == 1);
        bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477876e0);
        bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        sVar.f144167d = new ec3.z0(g1Var);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(g1Var.getActivity(), bundle, true, false, sVar, new ec3.x0(g1Var));
    }
}
