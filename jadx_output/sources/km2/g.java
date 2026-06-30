package km2;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static int f309102c;

    /* renamed from: a, reason: collision with root package name */
    public static final km2.g f309100a = new km2.g();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.List f309101b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f309103d = jz5.h.b(km2.f.f309096d);

    public final void a(java.lang.String liveType) {
        kotlin.jvm.internal.o.g(liveType, "liveType");
        com.tencent.mars.xlog.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#clearLocalSelectCache liveType=".concat(liveType));
        e().putString(b(liveType), "");
        e().putInt(c(liveType), 0);
    }

    public final java.lang.String b(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("path_");
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        sb6.append(I1 != null ? I1.field_username : null);
        sb6.append('_');
        sb6.append(str);
        return sb6.toString();
    }

    public final java.lang.String c(java.lang.String str) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("time_");
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        sb6.append(I1 != null ? I1.field_username : null);
        sb6.append('_');
        sb6.append(str);
        return sb6.toString();
    }

    public final km2.e d(java.lang.String liveType) {
        kotlin.jvm.internal.o.g(liveType, "liveType");
        java.lang.String string = e().getString(b(liveType), "");
        com.tencent.mars.xlog.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#getLocalSelectCache liveType=" + liveType + " cachePath=" + string);
        if (string != null && (android.webkit.URLUtil.isNetworkUrl(string) || com.tencent.mm.vfs.w6.j(string))) {
            return new km2.e(string, e().getInt(c(liveType), 0));
        }
        com.tencent.mars.xlog.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#getLocalSelectCache file not exist");
        return null;
    }

    public final com.tencent.mm.sdk.platformtools.o4 e() {
        return (com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f309103d).getValue();
    }

    public final void f(java.lang.String path, java.lang.String liveType) {
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(liveType, "liveType");
        com.tencent.mars.xlog.Log.i("FinderAnchorUploadCoverPrepareCgiCache", "#saveLocalSelectCache liveType=" + liveType + " path=" + path);
        e().putString(b(liveType), path);
        e().putInt(c(liveType), c01.id.e());
    }
}
