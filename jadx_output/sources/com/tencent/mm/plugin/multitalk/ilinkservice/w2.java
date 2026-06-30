package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class w2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.x2 f149849e;

    public w2(com.tencent.mm.plugin.multitalk.ilinkservice.x2 x2Var, int i17) {
        this.f149849e = x2Var;
        this.f149848d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.x2 x2Var = this.f149849e;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = x2Var.f149859a;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.w();
        x2Var.f149859a.o(null, -10086, -6, "accept callback failed: " + this.f149848d);
    }
}
