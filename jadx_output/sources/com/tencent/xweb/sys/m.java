package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class m implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.sys.q f220563d;

    public m(com.tencent.xweb.sys.q qVar) {
        this.f220563d = qVar;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        by5.c4.f("SysWebFactory", "getWebviewStorage, not yet init, try run in main loop.");
        return this.f220563d.i();
    }
}
