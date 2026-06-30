package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.f3 f198072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.k3 f198073e;

    public c3(com.tencent.mm.ui.k3 k3Var, com.tencent.mm.ui.f3 f3Var) {
        this.f198073e = k3Var;
        this.f198072d = f3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i(this.f198073e.f209017d, "select db count: %d", java.lang.Integer.valueOf(this.f198072d.a()));
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.b3(this));
    }
}
