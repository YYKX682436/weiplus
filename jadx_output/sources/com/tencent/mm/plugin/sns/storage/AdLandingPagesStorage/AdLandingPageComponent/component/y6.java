package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class y6 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 {
    public ca4.b0 B;
    public final ab4.f0 C;
    public java.lang.String D;
    public com.tencent.mm.ui.widget.dialog.u3 E;
    public com.tencent.mm.sdk.event.IListener F;
    public com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 G;
    public final ca4.a0 H;

    public y6(android.content.Context context, ab4.f0 f0Var, android.view.ViewGroup viewGroup) {
        super(context, f0Var, viewGroup);
        this.D = "";
        this.E = null;
        this.H = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.v6(this);
        this.C = f0Var;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        super.L();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("uninstallDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        com.tencent.mm.sdk.event.IListener iListener = this.F;
        if (iListener != null) {
            iListener.dead();
            this.F = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("uninstallDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 x9Var = this.G;
        if (x9Var != null) {
            x9Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            kotlinx.coroutines.y0 y0Var = x9Var.f165827c;
            if (y0Var != null) {
                kotlinx.coroutines.z0.c(y0Var, null);
            }
            x9Var.f165827c = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        }
        try {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.E;
            if (u3Var != null && u3Var.isShowing()) {
                this.E.dismiss();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        h0();
        ab4.f0 f0Var = this.C;
        int i17 = f0Var.B1;
        android.content.Context context = this.f165049d;
        if (i17 == 1) {
            try {
                com.tencent.mars.xlog.Log.i("SnsAd.AdLandingPageQRCodeBtnComp", "qrScanDirectJump=" + f0Var.C1);
                this.f165386t.a("qrScanDirectJump", (long) f0Var.C1);
                com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 x9Var = this.G;
                if (x9Var != null) {
                    x9Var.c(context, u(), z(), this.B);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAd.AdLandingPageQRCodeBtnComp", th6.toString());
            }
        } else {
            if (this.E == null && (context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                this.E = l54.a.h(context, com.tencent.mm.R.string.j7v, null);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.E;
            if (u3Var != null && !u3Var.isShowing()) {
                this.E.show();
            }
            if (!android.text.TextUtils.isEmpty(this.D)) {
                try {
                    this.f165386t.b("qrUrl", f0Var.f2837z1);
                    this.f165386t.a("qrScanDirectJump", f0Var.C1);
                    int i18 = f0Var.C1;
                    ca4.a0 a0Var = this.H;
                    if (i18 == 1) {
                        this.B.k(this.D, f0Var.f2837z1, a0Var);
                    } else {
                        this.B.l(this.D, f0Var.f2837z1, a0Var);
                    }
                } catch (java.lang.Throwable th7) {
                    com.tencent.mars.xlog.Log.e("SnsAd.AdLandingPageQRCodeBtnComp", "the ad qr helper has something wrong. exception: " + th7);
                }
            }
            P();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        super.h();
        h0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("installDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        if (this.F == null) {
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent>(a0Var) { // from class: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3
                {
                    this.__eventId = 1862118658;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent snsAdQRBtnDownloadEvent) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
                    com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent snsAdQRBtnDownloadEvent2 = snsAdQRBtnDownloadEvent;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
                    try {
                        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.y6.this.i0(snsAdQRBtnDownloadEvent2);
                    } catch (java.lang.Throwable unused) {
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp$3");
                    return false;
                }
            };
            this.F = iListener;
            iListener.alive();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("installDownloadEventListener", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createView", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    public final void h0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("ensureAdQRHelper", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        if (this.B == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            ab4.f0 f0Var = this.C;
            bundle.putString("qrExtInfo", f0Var != null ? f0Var.A1 : "");
            bundle.putInt("qrIsDirectJump", f0Var != null ? f0Var.C1 : 0);
            this.B = new ca4.b0(this.f165049d, u(), 3, bundle);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("ensureAdQRHelper", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    public void i0(com.tencent.mm.autogen.events.SnsAdQRBtnDownloadEvent snsAdQRBtnDownloadEvent) {
        am.gv gvVar;
        ab4.f0 f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDownloadEventFromOthers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        if (snsAdQRBtnDownloadEvent == null || (gvVar = snsAdQRBtnDownloadEvent.f54798g) == null || (f0Var = this.C) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadEventFromOthers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
            return;
        }
        java.lang.String str = gvVar.f6791a;
        java.lang.String str2 = gvVar.f6792b;
        int i17 = gvVar.f6794d;
        if (!com.tencent.mm.sdk.platformtools.t8.D0(str, z()) && !android.text.TextUtils.isEmpty(gvVar.f6793c)) {
            java.lang.String str3 = gvVar.f6793c;
            if (i17 == 0 && com.tencent.mm.sdk.platformtools.t8.D0(str2, f0Var.f2837z1) && android.text.TextUtils.isEmpty(this.D)) {
                this.D = str3;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDownloadEventFromOthers", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
        super.k();
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9 x9Var = this.G;
        ab4.f0 f0Var = this.C;
        if (x9Var == null) {
            this.G = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x9(this, f0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingQRCodeBtnCompDelegate");
        }
        if (f0Var != null) {
            za4.t0.c(f0Var.f2837z1, false, X().f2818e, 0, new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.x6(this, false));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageQRCodeBtnComp");
    }
}
