package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class j5 extends com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2 implements java.io.Serializable {
    public final ab4.i B;
    public boolean C;
    public final com.tencent.mm.plugin.sns.model.t D;
    public final com.tencent.mm.sdk.event.IListener E;

    public j5(android.content.Context context, ab4.i iVar, android.view.ViewGroup viewGroup) {
        super(context, iVar, viewGroup);
        this.C = false;
        this.D = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5(this);
        com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2 adLandingPageGetHBCoverBtnComp$2 = new com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp$2(this, com.tencent.mm.app.a0.f53288d);
        this.E = adLandingPageGetHBCoverBtnComp$2;
        this.B = iVar;
        adLandingPageGetHBCoverBtnComp$2.alive();
    }

    public static boolean h0(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromSourcesSupportHbCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        boolean z17 = true;
        if (i17 != 1 && i17 != 16 && i17 != 2) {
            z17 = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "isFromSourcesSupportHbCover, source=" + i17 + ", ret=" + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromSourcesSupportHbCover", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.K();
        if (this.C) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "viewWillAppear, isClicked=true, doGetHbCoverState");
            this.C = false;
            com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doGetHbCoverState(this.B.A1, this.D);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.L();
        this.E.dead();
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "viewWillDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewWillDestroy", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2
    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.Y();
        this.C = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    public void i0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBtnDisabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        this.f165859v.setEnabled(false);
        this.f165859v.setTextColor(android.graphics.Color.parseColor("#33000000"));
        this.f165859v.setBackgroundColor(android.graphics.Color.parseColor("#0d000000"));
        l44.f4.e(this.f165049d, X(), this.f165859v);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBtnDisabled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }

    @Override // com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z2, com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.a2
    public void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
        super.k();
        if (h0(u().l())) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            ab4.i iVar = this.B;
            sb6.append(iVar.A1);
            sb6.append(com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().getUin());
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            boolean z17 = false;
            java.lang.String str = "";
            if (android.text.TextUtils.isEmpty(sb7)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            } else {
                str = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("adLandingPageSp", 0).getString(sb7, "");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageSp");
            }
            boolean equals = "0".equals(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "fillItem, hasGetHbCober=" + equals);
            if (equals) {
                this.f165859v.setText(iVar.f2841z1);
                i0();
            } else {
                iVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
                try {
                    long e17 = c01.id.e() * 1000;
                    long j17 = iVar.B1;
                    if (j17 > 0 && j17 < e17) {
                        z17 = true;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isExpired", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.AdLandingPageCompGetHBCoverBtnInfo");
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "fillItem, doGetHbCoverState");
                    com.tencent.mm.plugin.sns.model.AdLandingPagesProxy.getInstance().doGetHbCoverState(iVar.A1, this.D);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AdLandingPageGetHBCoverBtnComp", "fillItem, from source unSupport");
            i0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageGetHBCoverBtnComp");
    }
}
