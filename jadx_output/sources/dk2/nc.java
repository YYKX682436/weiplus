package dk2;

/* loaded from: classes3.dex */
public final class nc {

    /* renamed from: a, reason: collision with root package name */
    public static final dk2.nc f233817a = new dk2.nc();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f233818b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f233819c;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_NET_DISCONNECT));
        hashSet.add(-2304);
        hashSet.add(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_ERR_STREAM_SWITCH_FAIL));
        hashSet.add(java.lang.Integer.valueOf(com.tencent.rtmp.TXLiveConstants.PLAY_WARNING_RECONNECT));
        f233818b = hashSet;
        f233819c = new java.util.HashMap();
    }

    public final java.lang.String a(r45.ah5 ah5Var) {
        kotlin.jvm.internal.o.g(ah5Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tagInfo = \n");
        java.util.LinkedList items = ah5Var.f370013d;
        kotlin.jvm.internal.o.f(items, "items");
        int i17 = 0;
        for (java.lang.Object obj : items) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.bh5 bh5Var = (r45.bh5) obj;
            sb6.append("[ tagItem index: " + bh5Var.f370767d + " block: " + bh5Var.f370768e + " ] \n");
            i17 = i18;
        }
        sb6.append("cacheBuffer: " + ah5Var.f370014e);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
