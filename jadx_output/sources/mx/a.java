package mx;

/* loaded from: classes8.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String str) {
        eq1.o0 a17 = eq1.a.f255785a.a(str);
        if (a17 == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(a17.f255848c);
        sb6.append(a17.f255846a);
        sb6.append(a17.f255847b);
        java.lang.String a18 = com.tencent.mm.sdk.platformtools.w2.a(sb6.toString());
        kotlin.jvm.internal.o.f(a18, "getMD5String(...)");
        return a18;
    }
}
