package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f174442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f174443e;

    public y1(com.tencent.mm.plugin.textstatus.ui.j2 j2Var, yz5.a aVar) {
        this.f174442d = j2Var;
        this.f174443e = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f174442d.i();
        this.f174443e.invoke();
    }
}
