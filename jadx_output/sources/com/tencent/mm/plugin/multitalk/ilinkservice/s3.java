package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149782e;

    public s3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.lang.String str) {
        this.f149782e = i4Var;
        this.f149781d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149782e;
        com.tencent.mm.plugin.multitalk.ilinkservice.w b17 = i4Var.f149623f.b(i4Var.f149656y0);
        java.lang.String str = b17 != null ? b17.f149841b : null;
        com.tencent.mm.ipcinvoker.wx_extension.x xVar = (com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class);
        com.tencent.mm.plugin.multitalk.ilinkservice.v vVar = i4Var.f149629i;
        int i17 = (int) i4Var.f149633l1;
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = i4Var.f149623f;
        ((h80.i) xVar).wi(vVar.a(i17, c0Var.f149520d, c0Var.f149524h, c0Var.f149518b, i4Var.f149656y0, str, this.f149781d), new com.tencent.mm.plugin.multitalk.ilinkservice.r3(this));
        long j17 = i4Var.f149623f.f149518b;
    }
}
