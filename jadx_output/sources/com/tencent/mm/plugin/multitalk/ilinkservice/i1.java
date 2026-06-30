package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f149606e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.j1 f149607f;

    public i1(com.tencent.mm.plugin.multitalk.ilinkservice.j1 j1Var, int i17, byte[] bArr) {
        this.f149607f = j1Var;
        this.f149605d = i17;
        this.f149606e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.j1 j1Var = this.f149607f;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = j1Var.f149662b;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.w();
        int i17 = this.f149605d;
        int i18 = (i17 == 18 || i17 == 7 || i17 == 51) ? i17 : -5;
        j1Var.f149662b.r(j1Var.f149661a, -10086, i18, "join room callback failed: " + i17, this.f149606e);
    }
}
