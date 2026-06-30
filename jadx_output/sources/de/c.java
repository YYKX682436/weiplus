package de;

/* loaded from: classes7.dex */
public final class c implements de.a {
    @Override // de.a
    public void a(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime, yz5.l callback) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.String iconUrl = runtime.u0().f77280f;
        kotlin.jvm.internal.o.f(iconUrl, "iconUrl");
        com.tencent.mm.plugin.appbrand.utils.d0.c(runtime.C0(), iconUrl, null, new de.b(this, callback));
    }
}
