package on3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final on3.a f347102a = new on3.a();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f347103b = new java.util.HashMap();

    public final com.tencent.mm.sdk.platformtools.o4 a(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var;
        java.util.HashMap hashMap = f347103b;
        synchronized (hashMap) {
            java.lang.Object obj = hashMap.get(str);
            if (obj == null) {
                obj = com.tencent.mm.sdk.platformtools.o4.N("NewLifeConfig." + str, 2, null);
                kotlin.jvm.internal.o.f(obj, "getMMKV(...)");
                hashMap.put(str, obj);
            }
            o4Var = (com.tencent.mm.sdk.platformtools.o4) obj;
        }
        return o4Var;
    }
}
