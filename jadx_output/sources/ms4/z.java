package ms4;

/* loaded from: classes8.dex */
public class z implements js4.i {
    public z() {
        com.tencent.midas.api.APMidasPayAPI.setLogEnable(false);
        com.tencent.midas.api.APMidasPayAPI.setLogCallback(com.tencent.mm.plugin.wallet.wecoin.model.MidasPayLogCallbackImpl.class);
    }

    public final js4.k a(androidx.fragment.app.FragmentActivity fragmentActivity, js4.n nVar) {
        if (nVar.f301549g != js4.m.DIRECT_CHARGE) {
            if (fragmentActivity != null) {
                return new ns4.s(fragmentActivity, nVar);
            }
            return null;
        }
        if (fragmentActivity == null || android.text.TextUtils.isEmpty(nVar.f301548f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeCoinManagerImplement", "DirectRecharge productInfo is invalid.");
            ((ku5.t0) ku5.t0.f312615d).B(new ms4.y(this, nVar));
        } else {
            ms4.j0.f331046e.c(fragmentActivity, nVar);
        }
        return null;
    }

    public void b(js4.o oVar) {
        new ks4.e().l().h(new ms4.x(this, oVar));
    }

    public boolean c() {
        return "CN".equalsIgnoreCase(gm0.j1.u().c().u(274436, "CN")) || (c01.z1.i() & 8) != 0;
    }

    public js4.k d(androidx.fragment.app.FragmentActivity fragmentActivity, js4.n nVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinManagerImplement", "prepareWeCoinRecharge");
        if (nVar.f301552j) {
            java.lang.String uuid = java.util.UUID.randomUUID().toString();
            kotlin.jvm.internal.o.f(uuid, "toString(...)");
            js4.r.f301567c = uuid;
            js4.r.f301565a = nVar.f301544b;
        }
        if (c()) {
            return a(fragmentActivity, nVar);
        }
        f((com.tencent.mm.ui.MMActivity) fragmentActivity, new ms4.w(this, fragmentActivity, nVar));
        return null;
    }

    public js4.h e(android.content.Context context, boolean z17) {
        if (context == null) {
            return null;
        }
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_WECOIN_HAS_SHOW_ENTRANCE_TUTORIAL_BOOLEAN_SYNC;
        java.lang.Object m17 = c17.m(u3Var, java.lang.Boolean.FALSE);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) m17).booleanValue()) {
            return null;
        }
        gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
        return new ns4.p1(context, z17);
    }

    public void f(android.app.Activity activity, js4.o oVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeCoinManagerImplement", "showWecoinAuthDialog");
        if (activity == null) {
            return;
        }
        wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
        ms4.v vVar = new ms4.v(this, oVar);
        ((vd0.j2) q1Var).getClass();
        v24.o0.b(activity, 8L, true, vVar);
    }

    public java.lang.Object g(com.tencent.mm.ui.MMActivity mMActivity, js4.q qVar, java.lang.ref.WeakReference weakReference) {
        ls4.w wVar = new ls4.w(mMActivity, qVar, weakReference);
        r45.kj5 kj5Var = wVar.f321106b.f301559d;
        if (kj5Var == null || kj5Var.f378766i != 1) {
            wVar.a();
        } else {
            kotlinx.coroutines.l.d(v65.m.b(wVar.f321105a), null, null, new ls4.v(wVar, null), 3, null);
        }
        return wVar;
    }

    public void h(android.content.Context context, android.content.Intent intent, java.lang.String str, int i17, boolean z17, java.lang.String str2) {
        if (context == null) {
            return;
        }
        if (intent == null) {
            intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.class);
        } else {
            intent.setClass(context, com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinIncomeDetailView.class);
        }
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (str2 == null) {
            str2 = "";
        }
        intent.putExtra("wecoin_enter_encash_business_kv_data", new com.tencent.mm.plugin.wallet.wecoin.model.WecoinEncashKVData(1, str, ""));
        intent.putExtra("wecoin_enter_encash_business_kv_is_cocert_activate", z17);
        intent.putExtra("wecoin_enter_encash_business_kv_tips", str2);
        intent.putExtra("WECOIN_BUSINESS_ID", i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinIncomeDetailView", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinIncomeDetailView", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;IZLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void i(android.content.Context context) {
        if (context == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.wallet.wecoin.ui.WeCoinRechargeView.class);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinMainPageView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/wallet/wecoin/model/WeCoinManagerImplement", "startWeCoinMainPageView", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
