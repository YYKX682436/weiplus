package com.tencent.mm.ui.tools;

/* loaded from: classes13.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.k0 f210627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210628e;

    public p0(com.tencent.mm.ui.tools.k0 k0Var, java.lang.String str) {
        this.f210627d = k0Var;
        this.f210628e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f210627d.a(this.f210628e);
    }
}
