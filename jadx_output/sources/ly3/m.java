package ly3;

/* loaded from: classes13.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final ly3.m f322273a = new ly3.m();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f322274b = lp0.b.h() + "so_res";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f322275c = com.tencent.mm.vfs.q7.c("rtos_watch_so") + "/so_res";

    public final java.lang.String a(java.lang.String soName, java.lang.String patchId) {
        kotlin.jvm.internal.o.g(soName, "soName");
        kotlin.jvm.internal.o.g(patchId, "patchId");
        return f322275c + '/' + soName + '/' + patchId + "/lib" + soName + ".so";
    }

    public final java.lang.String b(java.lang.String soName, java.lang.String patchId) {
        kotlin.jvm.internal.o.g(soName, "soName");
        kotlin.jvm.internal.o.g(patchId, "patchId");
        return f322275c + '/' + soName + '/' + patchId + '/';
    }

    public final java.lang.String c(java.lang.String soName) {
        kotlin.jvm.internal.o.g(soName, "soName");
        return f322275c + '/' + soName + '/';
    }
}
