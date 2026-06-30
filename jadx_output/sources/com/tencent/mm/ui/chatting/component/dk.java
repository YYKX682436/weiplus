package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.t1.class)
/* loaded from: classes15.dex */
public final class dk extends com.tencent.mm.ui.chatting.component.a implements sb5.t1 {
    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        java.util.HashMap hashMap = oc5.h0.f344435a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashMap.size());
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = oc5.h0.f344436b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageSearchPreviewManager", "clearCache previewResult size: %d, msgIdToPHashCache size: %d", valueOf, java.lang.Integer.valueOf(concurrentHashMap.size()));
        hashMap.clear();
        concurrentHashMap.clear();
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        boolean z17 = gx5.f.f277458a;
        ((ku5.t0) ku5.t0.f312615d).h(new gx5.c(), "WordDetectThread");
        ((jd0.u1) ((kd0.h2) i95.n0.c(kd0.h2.class))).getClass();
        zs5.u0.f475485h.e();
    }
}
