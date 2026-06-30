package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class xh extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView f171513d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.lh0 f171514e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171515f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f171516g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh(com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView, r45.lh0 lh0Var, java.lang.String str, long j17) {
        super(0);
        this.f171513d = snsEcsShareTailView;
        this.f171514e = lh0Var;
        this.f171515f = str;
        this.f171516g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        int i17 = com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView.f167147f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView snsEcsShareTailView = this.f171513d;
        snsEcsShareTailView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        c00.z2 z2Var = (c00.z2) i95.n0.c(c00.z2.class);
        android.content.Context context = snsEcsShareTailView.getContext();
        ((b00.r) z2Var).getClass();
        r45.lh0 shareInfo = this.f171514e;
        kotlin.jvm.internal.o.g(shareInfo, "shareInfo");
        java.lang.String str = this.f171515f;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || r26.i0.q(str, "0", false, 2, null)) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "requestProductCardInfo snsId nil");
        } else {
            java.lang.String Ai = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(str, this.f171516g);
            com.tencent.mars.xlog.Log.i("Ecs.EcsCardMgrService", "requestProductCardInfo productId:" + shareInfo.f379475f + " lastGmsgId:" + shareInfo.f379477h + " gMsgId:" + Ai);
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlinx.coroutines.l.d(context instanceof androidx.lifecycle.y ? new com.tencent.mm.sdk.coroutines.LifecycleScope("Ecs.EcsCardMgrService", (androidx.lifecycle.y) context, 0, 4, null) : kotlinx.coroutines.i2.f310477d, null, null, new b00.o(shareInfo, Ai, null), 3, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$requestProductCardInfo", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.SnsEcsShareTailView$bindEcsShareInfo$2");
        return f0Var;
    }
}
