package ye;

/* loaded from: classes7.dex */
public abstract class e {
    public static final com.tencent.luggage.sdk.processes.main.RuntimeInfo a(ze.n runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        int i17 = runtime.u0().X;
        java.lang.String str = runtime.f74803n;
        kotlin.jvm.internal.o.f(str, "getAppId(...)");
        int i18 = runtime.f74805p.f77281g;
        boolean k17 = runtime.u0().k();
        int i19 = runtime.u0().f47284z + 1000;
        java.lang.String str2 = runtime.u0().f47277w;
        kotlin.jvm.internal.o.f(str2, "getWxaLaunchInstanceId(...)");
        java.lang.String username = runtime.u0().f47278x;
        kotlin.jvm.internal.o.f(username, "username");
        com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = runtime.u0();
        kotlin.jvm.internal.o.f(u07, "getInitConfig(...)");
        boolean z17 = runtime.u0().Y;
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
        return new com.tencent.luggage.sdk.processes.main.RuntimeInfo(i17, str, i18, k17, i19, str2, username, u07, z17, "debug use only");
    }
}
