package vd0;

@j95.b
/* loaded from: classes5.dex */
public final class o3 extends jm0.o implements wd0.z1 {
    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(xd0.c.class);
    }

    public void Zi(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.setClass(context, com.tencent.mm.plugin.setting.ui.setting.SettingsManageFindMoreV2UI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/setting/SettingsFeatureService", "enterSettingsManagerFindMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/setting/SettingsFeatureService", "enterSettingsManagerFindMoreUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean aj(com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest, wd0.l2 result) {
        kotlin.jvm.internal.o.g(result, "result");
        if (!jm0.g.class.isAssignableFrom(xd0.c.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(xd0.c.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.String lastLanguageCode = result.f444748a;
        java.lang.String newLanguageCode = result.f444750c;
        boolean equals = android.text.TextUtils.equals(lastLanguageCode, newLanguageCode);
        java.lang.String str = result.f444751d;
        if (!((equals && android.text.TextUtils.equals(result.f444749b, str)) ? false : true)) {
            return false;
        }
        com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent = new com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent();
        java.lang.String str2 = settingsTranslateLanguageRequest != null ? settingsTranslateLanguageRequest.f67822e : null;
        am.z1 z1Var = changeTranslateLanguageEvent.f54035g;
        z1Var.f8502a = str2;
        z1Var.f8503b = newLanguageCode;
        z1Var.f8504c = str;
        changeTranslateLanguageEvent.e();
        kotlin.jvm.internal.o.f(lastLanguageCode, "lastLanguageCode");
        kotlin.jvm.internal.o.f(newLanguageCode, "newLanguageCode");
        int i17 = settingsTranslateLanguageRequest != null ? settingsTranslateLanguageRequest.f67824g : 0;
        if (kotlin.jvm.internal.o.b(lastLanguageCode, newLanguageCode)) {
            return true;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("current_language_code", lastLanguageCode);
        hashMap.put("target_language_code", newLanguageCode);
        hashMap.put("modify_language_sence", java.lang.Integer.valueOf(i17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("modify_translate_language_end", hashMap, 35268);
        return true;
    }

    public void bj(android.content.Context context, java.lang.String query) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(query, "query");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsFeatureService", "openWeLab. query:".concat(query));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalitebf3a88de4da873052ba340892dc97559");
        bundle.putString("query", query);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(context, bundle, true, false, new vd0.n3());
    }

    public void cj(android.content.Context fromContext) {
        kotlin.jvm.internal.o.g(fromContext, "fromContext");
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(xd0.a.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.Object l17 = gm0.j1.u().c().l(7, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        boolean z17 = (((java.lang.Integer) l17).intValue() & 2) != 0;
        java.lang.Object l18 = gm0.j1.u().c().l(5, null);
        java.lang.String str = l18 instanceof java.lang.String ? (java.lang.String) l18 : null;
        android.content.Intent intent = new android.content.Intent(fromContext, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.hb.class);
        lk5.s.e(intent, true);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.i1() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_SETTING_EMAIL_VERIFY_SEND_TIME_LONG, 0L) >= 300;
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsEmailFSC", "SettingsEmailUtil.isVerifyEmailOverTime(): " + z18);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsEmailFSC", "settings email enter SettingsBindEmailUIC");
            intent.putExtra("BINDED_EMAIL", str);
            pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.k8.class);
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsEmailFSC", "settings email enter SettingsEmailEditUIC");
            pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.nb.class);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsEmailFSC", "settings email enter SettingsEmailVerifyUIC");
            intent.putExtra("verify_email_address", str);
            pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.tb.class);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fromContext, arrayList.toArray(), "com/tencent/mm/feature/setting/fsc/SettingsEmailFSC", "startSettingEmailBindUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fromContext.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fromContext, "com/tencent/mm/feature/setting/fsc/SettingsEmailFSC", "startSettingEmailBindUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void fj(android.content.Context fromContext, com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest) {
        kotlin.jvm.internal.o.g(fromContext, "fromContext");
        if (!jm0.g.class.isAssignableFrom(xd0.c.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        androidx.lifecycle.c1 a17 = new androidx.lifecycle.j1(getViewModel(), new jm0.e(this)).a(xd0.c.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        android.content.Intent intent = new android.content.Intent(fromContext, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageUI.class);
        if (settingsTranslateLanguageRequest != null) {
            try {
                kotlin.jvm.internal.o.d(intent.putExtra("BundleKey_SettingsTranslateLanguageParams", settingsTranslateLanguageRequest));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SettingsTranslateLanguageFSC", e17, "startSettingTranslateLanguageUI", new java.lang.Object[0]);
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(fromContext, arrayList.toArray(), "com/tencent/mm/feature/setting/fsc/SettingsTranslateLanguageFSC", "startSettingTranslateLanguageUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/setting/api/SettingsTranslateLanguageRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        fromContext.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(fromContext, "com/tencent/mm/feature/setting/fsc/SettingsTranslateLanguageFSC", "startSettingTranslateLanguageUI", "(Landroid/content/Context;Lcom/tencent/mm/feature/setting/api/SettingsTranslateLanguageRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
