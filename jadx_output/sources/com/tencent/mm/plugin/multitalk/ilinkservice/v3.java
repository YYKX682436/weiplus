package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class v3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.w3 f149839e;

    public v3(com.tencent.mm.plugin.multitalk.ilinkservice.w3 w3Var, int i17) {
        this.f149839e = w3Var;
        this.f149838d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.w3 w3Var = this.f149839e;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = w3Var.f149850a;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.w();
        int i17 = this.f149838d;
        int i18 = (i17 == 15 || i17 == 7) ? i17 : -5;
        w3Var.f149850a.s(null, -10086, i18, "join room callback failed: " + i17);
    }
}
