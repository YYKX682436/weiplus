package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.xweb.e1 f220564d;

    public n(com.tencent.xweb.e1 e1Var) {
        this.f220564d = e1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.xweb.sys.o.a();
            by5.c4.f("SysWebFactory.PreIniter", "preInit, enforce main looper & finish init");
            com.tencent.xweb.sys.o.f220565a = true;
            com.tencent.xweb.e1 e1Var = this.f220564d;
            if (e1Var != null) {
                e1Var.a();
            }
        } catch (java.lang.Throwable th6) {
            by5.c4.d("SysWebFactory.PreIniter", "ensureSystemWebViewGlobalLooper error", th6);
            by5.s0.e(577L, 233L, 1L);
        }
    }
}
