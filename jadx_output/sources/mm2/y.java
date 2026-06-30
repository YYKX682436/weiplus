package mm2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final mm2.y f329547d = new mm2.y();

    public y() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.util.concurrent.ConcurrentHashMap safeSetValue = (java.util.concurrent.ConcurrentHashMap) obj;
        kotlin.jvm.internal.o.g(safeSetValue, "$this$safeSetValue");
        for (java.util.Map.Entry entry : safeSetValue.entrySet()) {
            ((lm2.k0) entry.getValue()).f319416a = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismiss reddot of ");
            sb6.append((java.lang.String) entry.getKey());
            sb6.append(", lastBuffer:");
            com.tencent.mm.protobuf.g gVar = ((lm2.k0) entry.getValue()).f319417b;
            if (gVar != null) {
                try {
                    str = android.util.Base64.encodeToString(gVar.g(), 2);
                    kotlin.jvm.internal.o.f(str, "encodeToString(...)");
                } catch (java.lang.Throwable unused) {
                    com.tencent.mars.xlog.Log.i("Finder", "ByteString encode failed.");
                    str = "";
                }
            } else {
                str = null;
            }
            sb6.append(str);
            java.lang.String str2 = sb6.toString();
            kotlin.jvm.internal.o.g(str2, "str");
            com.tencent.mars.xlog.Log.i("Finder.LiveBoxSlice", "redDotFlowLog ".concat(str2));
        }
        return jz5.f0.f302826a;
    }
}
