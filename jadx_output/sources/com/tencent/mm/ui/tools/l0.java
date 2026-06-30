package com.tencent.mm.ui.tools;

/* loaded from: classes13.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k0 f210538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210539e;

    public l0(com.tencent.mm.ui.tools.k0 k0Var, java.lang.String str) {
        this.f210538d = k0Var;
        this.f210539e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f210538d.a(this.f210539e);
    }
}
