package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.w1 f174305d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f174306e;

    public t1(com.tencent.mm.plugin.textstatus.ui.w1 w1Var, int i17) {
        this.f174305d = w1Var;
        this.f174306e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f174305d.g(this.f174306e, false);
    }
}
