package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f176805d;

    public u0(com.tencent.mm.plugin.voip.model.v0 v0Var, boolean z17) {
        this.f176805d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.model.a2.a().b(this.f176805d);
    }
}
