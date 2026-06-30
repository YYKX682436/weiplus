package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adpag.y f163362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f163363e;

    public w(com.tencent.mm.plugin.sns.ad.widget.adpag.y yVar, com.tencent.mm.view.MMPAGView mMPAGView) {
        this.f163362d = yVar;
        this.f163363e = mMPAGView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$resetAndRemovePAGView$1$1$1$1$1");
        java.lang.String str = this.f163362d.j() + "reset_pagViewRelease";
        try {
            this.f163363e.h();
        } catch (java.lang.Throwable th6) {
            ca4.q.c(str, th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGGeneralComponent$resetAndRemovePAGView$1$1$1$1$1");
    }
}
