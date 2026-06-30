package te5;

/* loaded from: classes5.dex */
public final class t1 {
    public t1(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(java.lang.String str, java.lang.String tag, java.lang.String key, java.lang.String newValue) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(newValue, "newValue");
        int L = str != null ? r26.n0.L(str, "<".concat(tag), 0, false, 6, null) : -1;
        if (L < 0) {
            com.tencent.mars.xlog.Log.e("MircoMsg.ServiceNotifyChattingUtils", "can not find the tag <%s>", tag);
            return null;
        }
        if (L > 0) {
            kotlin.jvm.internal.o.d(str);
            str = str.substring(L);
            kotlin.jvm.internal.o.f(str, "substring(...)");
        }
        try {
            return new te5.u1(str).a(key, newValue);
        } catch (java.lang.Exception e17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("change value fail, xml: ");
            sb6.append(str);
            sb6.append(", err: ");
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(com.tencent.mm.sdk.platformtools.z3.c(e17));
            com.tencent.mars.xlog.Log.e("MircoMsg.ServiceNotifyChattingUtils", sb6.toString());
            return null;
        }
    }
}
