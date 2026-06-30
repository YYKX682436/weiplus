package com.tencent.mm.plugin.webview.model;

/* loaded from: classes7.dex */
public final class n2 implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.f3 f183040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f183041e;

    public n2(com.tencent.mm.plugin.webview.model.f3 f3Var, android.app.Activity activity) {
        this.f183040d = f3Var;
        this.f183041e = activity;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.webview.model.f3 f3Var = this.f183040d;
        f3Var.getClass();
        android.app.Activity activity = this.f183041e;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.webview.model.e3 e3Var = f3Var.f182875a;
        if (e3Var == null || intent == null || i17 != 204) {
            return;
        }
        if (intent.getIntExtra(dm.i4.COL_ID, -1) == -1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.onActivityResult] START_CREATE_AVATAR_UI_REQUEST_CODE");
        com.tencent.mm.plugin.webview.model.y2 y2Var = e3Var.f182856f;
        if (y2Var != null) {
            int intExtra = intent.getIntExtra(dm.i4.COL_ID, -1);
            java.lang.String stringExtra = intent.getStringExtra("nickname");
            java.lang.String stringExtra2 = intent.getStringExtra("avatarurl");
            java.util.ArrayList arrayList = y2Var.f183198f;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((fl1.h1) it.next()).f263784f = false;
            }
            r45.jv5 jv5Var = y2Var.f183197e;
            java.lang.String str = jv5Var != null ? jv5Var.f378131d : null;
            kotlin.jvm.internal.o.d(stringExtra2);
            arrayList.add(new fl1.h1(0, stringExtra, "", str, null, true, stringExtra2, intExtra));
            r45.jv5 jv5Var2 = y2Var.f183197e;
            kotlin.jvm.internal.o.d(jv5Var2);
            y2Var.a(jv5Var2, y2Var.f183195c, arrayList, y2Var.f183199g, y2Var.f183200h);
        }
    }
}
