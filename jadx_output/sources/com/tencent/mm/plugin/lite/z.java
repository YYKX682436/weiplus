package com.tencent.mm.plugin.lite;

/* loaded from: classes8.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f144582f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f144583g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f144584h;

    public z(com.tencent.mm.plugin.lite.w wVar, java.lang.String str, java.lang.String str2, boolean z17, long j17, long j18) {
        this.f144580d = str;
        this.f144581e = str2;
        this.f144582f = z17;
        this.f144583g = j17;
        this.f144584h = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent liteAppShowStatusChangeEvent = new com.tencent.mm.autogen.events.LiteAppShowStatusChangeEvent();
        am.ui uiVar = liteAppShowStatusChangeEvent.f54471g;
        uiVar.f8097a = this.f144580d;
        uiVar.f8098b = this.f144581e;
        boolean z17 = this.f144582f;
        uiVar.f8101e = z17;
        uiVar.f8099c = java.lang.Long.valueOf(this.f144583g);
        uiVar.f8100d = java.lang.Long.valueOf(this.f144584h);
        liteAppShowStatusChangeEvent.e();
        if (!z17) {
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ri(this.f144583g, this.f144584h, "destroyCamera", null, null);
            return;
        }
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        java.lang.String str = this.f144580d;
        long j17 = this.f144583g;
        long j18 = this.f144584h;
        com.tencent.mm.feature.lite.i iVar = (com.tencent.mm.feature.lite.i) g0Var;
        iVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.feature.lite.y0(iVar, true, j17, str, j18, null, null, null, null, null));
    }
}
