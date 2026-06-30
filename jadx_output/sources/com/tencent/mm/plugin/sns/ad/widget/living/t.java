package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class t implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f163763a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f163764b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Long f163765c;

    public t(java.lang.ref.WeakReference helperRef, java.lang.String snsId, java.lang.Long l17) {
        kotlin.jvm.internal.o.g(helperRef, "helperRef");
        kotlin.jvm.internal.o.g(snsId, "snsId");
        this.f163763a = helperRef;
        this.f163764b = snsId;
        this.f163765c = l17;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ad.widget.living.v vVar;
        int i18;
        java.lang.String str = this.f163764b;
        java.lang.Long l17 = this.f163765c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
        try {
            vVar = (com.tencent.mm.plugin.sns.ad.widget.living.v) this.f163763a.get();
        } catch (java.lang.Throwable unused) {
        }
        if (vVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doRequestFinderObject, onLiveStatusCallback, snsId is ");
        sb6.append(str);
        sb6.append(", liveId is ");
        sb6.append(l17);
        sb6.append(", respLiveId is ");
        sb6.append(j17);
        sb6.append(", status is ");
        sb6.append(i17);
        sb6.append(", mShouldVideoPlay is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        boolean z17 = vVar.f163770c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
        sb6.append(z17);
        sb6.append(", mPlayerStatus is ");
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e17 = vVar.e();
        sb6.append(e17 != null ? java.lang.Integer.valueOf(e17.getMPlayerStatus()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamHelper", sb6.toString());
        boolean z18 = false;
        if (l17 != null && j17 == l17.longValue()) {
            if (i17 != 2) {
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e18 = vVar.e();
                if (e18 != null) {
                    e18.setMIsPlayCompleted(false);
                }
                i18 = 770;
            } else {
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e19 = vVar.e();
                if (e19 != null) {
                    e19.setMIsPlayCompleted(true);
                }
                i18 = 771;
            }
            com.tencent.mm.plugin.sns.ad.widget.living.i0.g(str, i18);
        }
        if (j17 == l17.longValue() && (obj instanceof r45.l71)) {
            if (((r45.nw1) ((r45.l71) obj).getCustom(1)) == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AdLivingStreamHelper", "liveInfoResp liveInfo is null");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
                return;
            }
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e27 = vVar.e();
            if (e27 != null) {
                e27.setMGetLiveInfoResp((r45.l71) obj);
            }
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.setLiveInfo((r45.nw1) ((r45.l71) obj).getCustom(1));
            com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e28 = vVar.e();
            if (e28 != null) {
                e28.setMFinderObject(finderObject);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            boolean z19 = vVar.f163770c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMShouldVideoPlay", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper");
            if (z19) {
                com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer e29 = vVar.e();
                if (e29 != null && e29.getMPlayerStatus() == 0) {
                    z18 = true;
                }
                if (z18) {
                    vVar.e().p();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLiveStatusCallback", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamHelper$Companion$FinderLiveStatusCallback");
    }
}
