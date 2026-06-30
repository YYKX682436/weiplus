package com.tencent.mm.plugin.sns.ad.landingpage.component.comp;

/* loaded from: classes3.dex */
public final class p2 {
    public p2(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeTimeString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$Companion");
        if (i17 < 10) {
            str = "0" + i17;
        } else {
            str = i17 + "";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeTimeString", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingMusicComponent$Companion");
        return str;
    }
}
