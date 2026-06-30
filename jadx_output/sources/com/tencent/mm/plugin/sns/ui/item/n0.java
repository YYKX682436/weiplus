package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f169390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.p0 f169391e;

    public n0(com.tencent.mm.plugin.sns.ui.item.q0 q0Var, int i17, com.tencent.mm.plugin.sns.ui.item.p0 p0Var) {
        this.f169390d = i17;
        this.f169391e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SphereImageView.SphereCardAdTimeLineItem", "enable touch, delay=" + this.f169390d);
        this.f169391e.G0.setTouchEnabled(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.item.SphereCardAdTimeLineItem$1");
    }
}
