package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class j7 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.o7 f209000d;

    public j7(com.tencent.mm.ui.o7 o7Var) {
        this.f209000d = o7Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert onSceneEnd " + i17 + " errCode " + i18 + " errMsg " + str + "  " + m1Var.getType());
        com.tencent.mm.ui.o7 o7Var = this.f209000d;
        android.app.ProgressDialog progressDialog = o7Var.f209456g;
        if (progressDialog != null) {
            progressDialog.dismiss();
            o7Var.f209456g = null;
        }
        if (m1Var.getType() == 255) {
            c01.d9.e().q(255, o7Var.f209458i);
            if (i17 == 0 && i18 == 0) {
                o7Var.d(true);
                return;
            } else {
                if (com.tencent.mm.ui.pc.a(o7Var.f209450a, i17, i18, str, 4)) {
                    return;
                }
                o7Var.d(false);
                return;
            }
        }
        if (m1Var.getType() == 384) {
            if (i17 != 0 || i18 != 0) {
                o7Var.f209457h = true;
                db5.e1.m(o7Var.f209450a, com.tencent.mm.R.string.iun, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.ui.i7(this));
                return;
            }
            c01.d9.b().p().w(77830, ((com.tencent.mm.modelsimple.l1) m1Var).H());
            android.content.Intent intent = new android.content.Intent(o7Var.f209450a, (java.lang.Class<?>) com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI.class);
            intent.putExtra("kintent_hint", o7Var.c(com.tencent.mm.R.string.itc));
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = o7Var.f209450a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mMFragmentActivity, arrayList.toArray(), "com/tencent/mm/ui/GlobalAlertMgr$7", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMFragmentActivity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(mMFragmentActivity, "com/tencent/mm/ui/GlobalAlertMgr$7", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }
}
