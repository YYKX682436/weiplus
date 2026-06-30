package ec3;

/* loaded from: classes9.dex */
public final class d extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.l f250994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.model.k0 f250995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ec3.l lVar, com.tencent.mm.plugin.luckymoney.model.k0 k0Var) {
        super(false);
        this.f250994d = lVar;
        this.f250995e = k0Var;
    }

    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View v17) {
        kotlin.jvm.internal.o.g(v17, "v");
        ec3.l lVar = this.f250994d;
        com.tencent.mm.plugin.luckymoney.model.k0 k0Var = this.f250995e;
        lVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell]");
        if (k0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] resp is null");
        } else {
            androidx.appcompat.app.AppCompatActivity activity = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            androidx.lifecycle.c1 a17 = zVar.a(activity).a(ec3.g1.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((ec3.g1) a17).R6(false);
            androidx.appcompat.app.AppCompatActivity activity2 = lVar.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((ec3.g1) zVar.a(activity2).a(ec3.g1.class)).Q6();
            com.tencent.mm.plugin.luckymoney.model.j jVar = k0Var.f145378u;
            if (jVar != null) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("appId", jVar.f145338d);
                bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, jVar.f145340f);
                java.lang.String str = jVar.f145339e;
                if (str == null) {
                    str = "";
                }
                bundle.putString("query", str);
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] open Liteapp，appid：" + jVar.f145338d + "、path：" + jVar.f145340f + "、query: " + ((java.lang.Object) str) + "、version：" + jVar.f145342h);
                java.lang.String str2 = jVar.f145342h;
                if (str2 == null || str2.length() == 0) {
                    bundle.putString("minVersion", "3.0.0");
                } else {
                    bundle.putString("minVersion", jVar.f145342h);
                }
                bundle.putBoolean("isHalfScreen", jVar.f145341g == 1);
                if (jVar.f145343i > 0) {
                    bundle.putDouble("heightPercent", r0 / 10000);
                }
                bundle.putBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_TRANSPARENT, jVar.f145344m == 1);
                bundle.putInt("nextAnimIn", com.tencent.mm.R.anim.f477876e0);
                bundle.putInt("currentAnimOut", com.tencent.mm.R.anim.f477877e1);
                com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
                sVar.f144167d = new ec3.i(lVar);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(lVar.getActivity(), bundle, true, false, sVar, new ec3.g(lVar));
            } else {
                com.tencent.mm.plugin.luckymoney.model.q0 q0Var = k0Var.f145379v;
                if (q0Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewPrepareUINewFunctionUIC", "[openNewFunctionClickCell] open tinyapp，action_type：" + q0Var.f145553g + "、action_app_username：" + q0Var.f145555i + "、action_url：" + q0Var.f145554h);
                    if (q0Var.f145553g == 3) {
                        com.tencent.mm.wallet_core.ui.r1.c0(q0Var.f145555i, q0Var.f145554h, 0, 1100, new ec3.k(lVar));
                    }
                }
            }
        }
        ((ku5.t0) ku5.t0.f312615d).B(new ec3.c(this.f250994d));
    }
}
