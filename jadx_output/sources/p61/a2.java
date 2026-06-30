package p61;

/* loaded from: classes5.dex */
public class a2 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI f352208a;

    public a2(com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI bindMContactVerifyUI) {
        this.f352208a = bindMContactVerifyUI;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        boolean z17;
        com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI bindMContactVerifyUI = this.f352208a;
        if (i17 != 2) {
            if (i17 == 3) {
                bindMContactVerifyUI.f73010q = bundle.getString("setpwd_ticket");
                return;
            }
            return;
        }
        int i18 = bindMContactVerifyUI.f73008o;
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "to startMySafedeviceListUI");
            if (!((c01.z1.o() & 16384) != 0)) {
                com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent();
                am.zz zzVar = updateLocalVerifySwitchEvent.f54920g;
                zzVar.f8617a = true;
                zzVar.f8618b = true;
                updateLocalVerifySwitchEvent.e();
            }
            bindMContactVerifyUI.W6(1);
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
            j45.l.j(bindMContactVerifyUI, "account", ".security.ui.MySafeDeviceListUI", intent, null);
            return;
        }
        if (i18 != 3) {
            if (i18 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "to RegByMobileSetPwdUI for reset pwd");
                bindMContactVerifyUI.finish();
                android.content.Intent intent2 = new android.content.Intent();
                intent2.addFlags(com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62);
                intent2.addFlags(603979776);
                intent2.putExtra("setpwd_ticket_type", 4);
                intent2.putExtra("setpwd_ticket", bundle.getString("setpwd_ticket", ""));
                j45.l.j(bindMContactVerifyUI, "account", ".ui.RegByMobileSetPwdUI", intent2, null);
                return;
            }
            if (i18 == 5) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "to finish  finishWizard for get phone number");
                bindMContactVerifyUI.W6(-1);
                return;
            }
            if (bindMContactVerifyUI.f73005i) {
                if (i18 == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 3, 3);
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 1, 2);
                }
            }
            if (bindMContactVerifyUI.f73008o == 0 && bundle.getBoolean("restart_wechat", false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "restart after bind mobile!");
                db5.e1.G(bindMContactVerifyUI, bindMContactVerifyUI.getString(com.tencent.mm.R.string.f490816ax0), bindMContactVerifyUI.getString(com.tencent.mm.R.string.f490573yv), false, new p61.z1(this));
                return;
            }
            android.content.Intent intent3 = new android.content.Intent(bindMContactVerifyUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI.class);
            if (r61.e1.f392859i == 1) {
                int i19 = com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI.f72979i;
                intent3.putExtra("intent_back_launcherui", true);
            }
            if (bindMContactVerifyUI.f73006m) {
                intent3.putExtra("WizardRootClass", com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI.class.getCanonicalName());
            }
            com.tencent.mm.ui.MMWizardActivity.X6(bindMContactVerifyUI, intent3);
            bindMContactVerifyUI.finish();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "to BindMContactStatusUI for change mobile");
        if (j62.e.g().i("clicfg_update_login_mobile_number_flag", 1, true, true) == 1 && gm0.j1.b().n()) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(2, null);
            c01.b9 b9Var = c01.b9.f37069c;
            java.lang.String a17 = b9Var.a("login_user_name", "");
            java.lang.String a18 = b9Var.a("last_login_bind_mobile", "");
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "updateMobile userId:%s lastLoginUserName:%s lastLoginBindMobile:%s", str, a17, a18);
            boolean startsWith = a17.startsWith("+");
            boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(a18);
            boolean z19 = startsWith && z18 && a17.contains(a18);
            if (z19) {
                java.lang.String str2 = bindMContactVerifyUI.f73002f;
                com.tencent.mm.sdk.platformtools.c5 c5Var = new com.tencent.mm.sdk.platformtools.c5();
                java.lang.String replace = str2.replace("+", "");
                java.lang.String c17 = com.tencent.mm.sdk.platformtools.c5.c(replace);
                if (c17 != null) {
                    replace = replace.substring(c17.length());
                }
                java.lang.String f17 = c5Var.f(c17, replace);
                com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "try to update last login mobile mobile:%s formatMobile:%s", bindMContactVerifyUI.f73002f, f17);
                b9Var.d("last_login_bind_mobile", f17);
                b9Var.d("login_user_name", bindMContactVerifyUI.f73002f);
                c01.uc ucVar = c01.uc.f37514c;
                if (ucVar.f37516a.contains(str)) {
                    ucVar.h(str, "last_login_bind_mobile", f17);
                    ucVar.h(str, "login_user_name", bindMContactVerifyUI.f73002f);
                }
                gm0.j1.u().c().w(6, f17);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_USERNAME_STRING, bindMContactVerifyUI.f73002f);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "login not by mobile isUseMobileLogin:%s isBindMobile:%s isLoginWithBindMobile:%s", java.lang.Boolean.valueOf(startsWith), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            }
            z17 = false;
        } else {
            z17 = false;
        }
        if (bundle.getBoolean("restart_wechat", z17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BindMContactVerifyUI", "restart after change mobile!");
            db5.e1.G(bindMContactVerifyUI, bindMContactVerifyUI.getString(com.tencent.mm.R.string.f490816ax0), bindMContactVerifyUI.getString(com.tencent.mm.R.string.f490573yv), z17, new p61.y1(this));
        } else {
            db5.e1.V(bindMContactVerifyUI, bindMContactVerifyUI.getString(com.tencent.mm.R.string.f490441v5), com.tencent.mm.R.string.afx, null);
            com.tencent.mm.ui.MMWizardActivity.X6(bindMContactVerifyUI, new android.content.Intent(bindMContactVerifyUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI.class));
        }
    }
}
