package r00;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f368010a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final kk.j f368011b = new kk.l(100);

    public static final void a(java.lang.String url, r00.b getType, android.graphics.Bitmap bitmap, r00.h hVar) {
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(getType, "getType");
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        java.lang.String str = url + '_' + getType.name();
        r00.a aVar = (r00.a) ((com.tencent.mm.sdk.platformtools.r2) f368011b).get(str);
        if (aVar != null) {
            pm0.v.X(new r00.c(hVar, aVar));
        } else {
            ((ku5.t0) ku5.t0.f312615d).h(new r00.d(str, getType, bitmap, hVar), "MicroMsg.EcsGetImgColorMgr");
        }
    }
}
