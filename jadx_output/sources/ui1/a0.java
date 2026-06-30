package ui1;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.y f428025a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f428026b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f428027c;

    /* renamed from: d, reason: collision with root package name */
    public final int f428028d;

    public a0(com.tencent.mm.plugin.appbrand.y env, java.lang.String api, java.lang.String str, java.lang.String str2, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(api, "api");
        this.f428025a = env;
        this.f428026b = api;
        this.f428027c = str2;
        this.f428028d = i17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JsAuthExecuteContext(appId='");
        sb6.append(this.f428025a.getAppId());
        sb6.append("', api='");
        sb6.append(this.f428026b);
        sb6.append("', privateArgs='");
        java.lang.String str = this.f428027c;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("', callbackId=");
        sb6.append(this.f428028d);
        sb6.append(')');
        return sb6.toString();
    }
}
