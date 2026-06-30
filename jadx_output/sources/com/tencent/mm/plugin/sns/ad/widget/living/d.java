package com.tencent.mm.plugin.sns.ad.widget.living;

/* loaded from: classes4.dex */
public final class d implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f163698d;

    public d(java.lang.ref.WeakReference containerRef) {
        kotlin.jvm.internal.o.g(containerRef, "containerRef");
        this.f163698d = containerRef;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer adLivingStreamContainer;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        com.tencent.mm.modelbase.f result = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        kotlin.jvm.internal.o.g(result, "result");
        try {
            adLivingStreamContainer = (com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer) this.f163698d.get();
        } catch (java.lang.Throwable unused) {
        }
        if (adLivingStreamContainer == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
            jz5.f0 f0Var = jz5.f0.f302826a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
            return f0Var;
        }
        if (result.f70615a == 0 && result.f70616b == 0) {
            r45.up1 up1Var = (r45.up1) ((r45.hc1) result.f70618d).getCustom(68);
            if ((((int) (up1Var != null ? up1Var.getLong(1) : 0L)) & 1) != 1) {
                adLivingStreamContainer.setMNeedExitAdRoomReq(false);
            }
            adLivingStreamContainer.setMFinderJoinLiveResp((r45.hc1) result.f70618d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("do joinLiveRequest callback, result errType is ");
        sb6.append(result.f70615a);
        sb6.append(", errCode is ");
        sb6.append(result.f70616b);
        sb6.append(", preview_joinlive_flag is ");
        r45.up1 up1Var2 = (r45.up1) ((r45.hc1) result.f70618d).getCustom(68);
        sb6.append(up1Var2 != null ? java.lang.Long.valueOf(up1Var2.getLong(1)) : null);
        sb6.append(", mNeedExitAdRoomReq is ");
        sb6.append(adLivingStreamContainer.getMNeedExitAdRoomReq());
        com.tencent.mars.xlog.Log.i("MicroMsg.AdLivingStreamContainer", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.living.AdLivingStreamContainer$Companion$FinderJoinLiveCallback");
        return f0Var2;
    }
}
