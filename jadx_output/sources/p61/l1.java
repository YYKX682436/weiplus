package p61;

/* loaded from: classes5.dex */
public class l1 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352307a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI f352308b;

    public l1(com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI, java.lang.String str) {
        this.f352308b = bindMContactIntroUI;
        this.f352307a = str;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI bindMContactIntroUI = this.f352308b;
        if (i17 != 2) {
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent(bindMContactIntroUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactVerifyUI.class);
                intent.putExtra("bindmcontact_mobile", this.f352307a);
                intent.putExtra("bind_scene", bindMContactIntroUI.f72977w);
                intent.putExtra("KEnterFromBanner", bindMContactIntroUI.f72973s);
                com.tencent.mm.ui.MMWizardActivity.X6(bindMContactIntroUI, intent);
                return;
            }
            return;
        }
        if (bindMContactIntroUI.f72977w != 1) {
            com.tencent.mm.ui.MMWizardActivity.X6(bindMContactIntroUI, new android.content.Intent(bindMContactIntroUI, (java.lang.Class<?>) com.tencent.mm.plugin.account.bind.ui.BindMContactStatusUI.class).putExtra("bind_scene", bindMContactIntroUI.f72977w));
            if (bindMContactIntroUI.f72973s) {
                if (bindMContactIntroUI.f72977w == 2) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 3, 3);
                    return;
                } else {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11002, 1, 2);
                    return;
                }
            }
            return;
        }
        if (!((c01.z1.o() & 16384) != 0)) {
            com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent updateLocalVerifySwitchEvent = new com.tencent.mm.autogen.events.UpdateLocalVerifySwitchEvent();
            am.zz zzVar = updateLocalVerifySwitchEvent.f54920g;
            zzVar.f8617a = true;
            zzVar.f8618b = true;
            updateLocalVerifySwitchEvent.e();
        }
        bindMContactIntroUI.V6();
        android.content.Intent intent2 = new android.content.Intent();
        intent2.addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.getClass();
        j45.l.j(bindMContactIntroUI, "account", ".security.ui.MySafeDeviceListUI", intent2, null);
    }
}
