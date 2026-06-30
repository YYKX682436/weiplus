package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.l2 f149674e;

    public k2(com.tencent.mm.plugin.multitalk.ilinkservice.l2 l2Var, int i17) {
        this.f149674e = l2Var;
        this.f149673d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f149674e.f149688a.n(this.f149673d, false);
    }
}
