package com.tencent.mm.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class AccountExpiredUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public int f196547d;

    /* renamed from: e, reason: collision with root package name */
    public int f196548e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f196549f;

    public final void T6() {
        java.util.Map d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "errType = " + this.f196547d + " errCode = " + this.f196548e + " errMsg = " + this.f196549f);
        if (!com.tencent.mm.plugin.account.ui.d.b(4, this.f196548e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "errCode not  -100, quit");
            finish();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.ui.LauncherUI.class).putExtra("Intro_Switch", true).addFlags(67108864);
        gm0.j1.i();
        gm0.j1.b();
        java.lang.String str = gm0.m.f273235x;
        com.tencent.mars.xlog.Log.e("MicroMsg.AccountExpiredUI", "account expired=" + this.f196548e + " lastKickReason=" + str);
        new com.tencent.mm.autogen.events.BackupCoreResetEvent().e();
        gm0.m.o();
        com.tencent.mm.autogen.events.LogoutEvent logoutEvent = new com.tencent.mm.autogen.events.LogoutEvent();
        am.hj hjVar = logoutEvent.f54484g;
        hjVar.getClass();
        hjVar.f6836a = 1;
        logoutEvent.e();
        com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("switch_account_preferences", 0).edit().putBoolean("last_logout_switch_account", false).commit();
        int i17 = this.f196548e;
        if (i17 == -2023) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 0L, 1L, false);
        } else if (i17 == -205) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 5L, 1L, false);
        } else if (i17 == -100) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 1L, 1L, false);
        } else if (i17 == -72) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 6L, 1L, false);
        } else if (i17 == -9) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 4L, 1L, false);
        } else if (i17 == -4) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 3L, 1L, false);
        } else if (i17 == -3) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1582L, 2L, 1L, false);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            U6(this.f196547d, this.f196548e, this.f196549f, "empty!");
        } else {
            if (str != null && str.length() > 1024) {
                str.substring(0, 1024);
            }
            U6(this.f196547d, this.f196548e, this.f196549f, str);
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "account expired br showType[%d]", java.lang.Integer.valueOf(b17.f420400c));
                int i18 = b17.f420400c;
                if (i18 == 3 || i18 == 4) {
                    b17.c(this, new com.tencent.mm.ui.a(this, b17, intent), new com.tencent.mm.ui.b(this, intent));
                    return;
                }
                intent.putExtra("key_errType", this.f196547d);
                intent.putExtra("key_errCode", this.f196548e);
                intent.putExtra("key_errMsg", str);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/AccountExpiredUI", "handleExpired", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(this, "com/tencent/mm/ui/AccountExpiredUI", "handleExpired", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                db5.f.i(this);
                finish();
                return;
            }
            if (str.startsWith("<") && (d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "e", null)) != null && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) d17.get(".e.Content"))) {
                str = (java.lang.String) d17.get(".e.Content");
                com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "account expired summerauthkick errmsg=" + str + " |v=" + d17);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "account expired lastKickReason[%s]", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getString(com.tencent.mm.R.string.gqn);
        }
        db5.e1.M(this, str, getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.ui.c(this, intent), new com.tencent.mm.ui.d(this, intent));
        com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "show kickout dialog by old logic.");
    }

    public final void U6(int i17, int i18, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.autogen.mmdata.rpt.AccountExpiredActionStruct accountExpiredActionStruct = new com.tencent.mm.autogen.mmdata.rpt.AccountExpiredActionStruct();
        accountExpiredActionStruct.f55016e = i18;
        accountExpiredActionStruct.f55015d = i17;
        accountExpiredActionStruct.f55017f = accountExpiredActionStruct.b("errMsg", str, false);
        accountExpiredActionStruct.f55018g = accountExpiredActionStruct.b("lastKickReason", str2, false);
        accountExpiredActionStruct.k();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        this.f196547d = getIntent().getIntExtra("key_errType", 0);
        this.f196548e = getIntent().getIntExtra("key_errCode", 0);
        this.f196549f = getIntent().getStringExtra("key_errMsg");
        if (this.f196547d != 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AccountExpiredUI", "finish, errType = " + this.f196547d + " errCode = " + this.f196548e + " errMsg = " + this.f196549f);
            finish();
        }
        try {
            T6();
        } catch (java.lang.Exception unused) {
            finish();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }
}
