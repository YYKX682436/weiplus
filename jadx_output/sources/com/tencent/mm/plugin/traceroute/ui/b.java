package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f175320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.AnonymousClass1 f175321e;

    public b(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.AnonymousClass1 anonymousClass1, int i17) {
        this.f175321e = anonymousClass1;
        this.f175320d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI networkDiagnoseAllInOneUI = com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseAllInOneUI.this;
        networkDiagnoseAllInOneUI.f175285d = this.f175320d;
        networkDiagnoseAllInOneUI.T6();
    }
}
