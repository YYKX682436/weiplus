package com.tencent.mm.ui.tools;

/* loaded from: classes13.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k0 f210587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210588e;

    public n0(com.tencent.mm.ui.tools.k0 k0Var, java.lang.String str) {
        this.f210587d = k0Var;
        this.f210588e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f210587d.a(this.f210588e);
    }
}
