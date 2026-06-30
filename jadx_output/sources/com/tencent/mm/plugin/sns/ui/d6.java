package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.f6 f168173d;

    public d6(com.tencent.mm.plugin.sns.ui.f6 f6Var) {
        this.f168173d = f6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.MusicWidget$3");
        com.tencent.mm.plugin.sns.ui.f6 f6Var = this.f168173d;
        if (3 == com.tencent.mm.plugin.sns.ui.f6.o(f6Var).getType()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            f6Var.f168303r = true;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            com.tencent.mm.opensdk.modelmsg.WXMusicObject wXMusicObject = (com.tencent.mm.opensdk.modelmsg.WXMusicObject) com.tencent.mm.plugin.sns.ui.f6.o(f6Var).mediaObject;
            java.lang.String str = !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicUrl) ? wXMusicObject.musicUrl : wXMusicObject.musicLowBandUrl;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = !com.tencent.mm.sdk.platformtools.t8.K0(wXMusicObject.musicDataUrl) ? wXMusicObject.musicDataUrl : wXMusicObject.musicUrl;
            if (str2 == null) {
                str2 = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            java.lang.String str3 = f6Var.f168298m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                java.lang.String str4 = java.lang.System.currentTimeMillis() + "";
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.MusicWidget");
                f6Var.f168298m = str4;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            }
            b21.r rVar = new b21.r();
            rVar.f17345d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            java.lang.String str5 = f6Var.f168298m;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            rVar.f17346e = str5;
            rVar.f17347f = 0.0f;
            rVar.f17350i = "";
            rVar.f17356r = null;
            rVar.f17355q = null;
            rVar.f17348g = com.tencent.mm.plugin.sns.ui.f6.o(f6Var).title;
            rVar.f17349h = com.tencent.mm.plugin.sns.ui.f6.o(f6Var).description;
            rVar.f17354p = str;
            rVar.f17353o = str2;
            rVar.f17352n = str2;
            rVar.f17361w = "";
            com.tencent.mm.plugin.sns.model.l4.Bi();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            java.lang.String str6 = f6Var.f168299n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.MusicWidget");
            rVar.f17358t = str6;
            b21.m.i(rVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.MusicWidget$3");
    }
}
