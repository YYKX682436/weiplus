package com.tencent.mm.plugin.profile.ui.tab.observer;

/* loaded from: classes9.dex */
public class BizProfileWidgetOperateObserver extends com.tencent.mm.plugin.profile.ui.tab.observer.BaseBizProfileOperateObserver {

    /* renamed from: e, reason: collision with root package name */
    public boolean f154503e = true;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.profile.ui.ContactInfoUI f154504f;

    public BizProfileWidgetOperateObserver(com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI) {
        this.f154504f = contactInfoUI;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.observer.BaseBizProfileOperateObserver, zr3.a
    public boolean Q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17, int i17) {
        if (this.f154503e) {
            this.f154503e = false;
            qr3.c0.a(z3Var.d1());
            qk.o b17 = r01.z.b(z3Var.d1());
            this.f154502d = null;
            if (b17 != null) {
                b17.D0(false);
            }
            if (b17 != null) {
                b17.v0();
                qk.n D0 = b17.D0(false);
                this.f154502d = D0;
                D0.m();
                if (this.f154502d.l() != null && this.f154502d.l().length() > 0) {
                    this.f154502d.l();
                }
            }
            com.tencent.mm.plugin.profile.ui.ContactInfoUI contactInfoUI = this.f154504f;
            java.lang.String stringExtra = contactInfoUI.getIntent().getStringExtra("Contact_BIZ_PopupInfoMsg");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                contactInfoUI.getIntent().putExtra("Contact_BIZ_PopupInfoMsg", "");
                db5.e1.y(contactInfoUI, stringExtra, "", contactInfoUI.getString(com.tencent.mm.R.string.f490507x1), null);
            }
        }
        return false;
    }
}
