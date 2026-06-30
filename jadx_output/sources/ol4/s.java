package ol4;

/* loaded from: classes.dex */
public final class s extends com.tencent.unit_rc.BaseObject {

    /* renamed from: d, reason: collision with root package name */
    public static final ol4.s f346206d = new ol4.s();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f346207e = jz5.h.b(ol4.r.f346205d);

    static {
        new java.util.LinkedList();
        new java.util.concurrent.ConcurrentHashMap();
        kotlinx.coroutines.z0.b();
    }

    public final java.lang.String a(java.lang.String listenId, int i17, java.lang.String audioUrl, java.lang.String str) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        kotlin.jvm.internal.o.g(audioUrl, "audioUrl");
        boolean z17 = false;
        if (str != null && (!r26.n0.N(str))) {
            z17 = true;
        }
        if (z17) {
            return "ting_" + i17 + '_' + listenId + "_cacheKey_" + str;
        }
        char[] cArr = com.tencent.mm.sdk.platformtools.w2.f193046a;
        return "ting_" + i17 + '_' + listenId + '_' + com.tencent.mm.sdk.platformtools.w2.b(audioUrl.getBytes());
    }

    public final java.lang.String d(java.lang.String taskKeyId) {
        kotlin.jvm.internal.o.g(taskKeyId, "taskKeyId");
        return ((java.lang.String) ((jz5.n) f346207e).getValue()) + '/' + taskKeyId + ".player";
    }
}
