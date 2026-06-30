package m91;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final m91.f f324951a = new m91.f();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f324952b = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.LinkedHashMap f324953c = new java.util.LinkedHashMap(5, 0.7f, true);

    static {
        com.tencent.mm.sdk.platformtools.h.f192721a = m91.a.f324941d;
    }

    public static final void b(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        java.util.LinkedHashMap linkedHashMap = f324953c;
        synchronized (linkedHashMap) {
        }
    }

    public static final void c(com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        java.util.LinkedHashMap linkedHashMap = f324953c;
        synchronized (linkedHashMap) {
        }
        tx5.j.d(com.tencent.thumbplayer.tmediacodec.codec.CodecError.FLUSH_CODECEXCEPTION, new java.lang.Object[]{runtime.f74803n});
    }

    public java.lang.String a() {
        java.lang.String str;
        m91.c cVar;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader = com.tencent.mm.plugin.appbrand.appcache.e8.f75515a;
        linkedList.add(new jz5.l("weapp_lib_version_int", java.lang.Integer.valueOf(iCommLibReader != null ? iCommLibReader.i() : -1)));
        if (iCommLibReader == null || (str = iCommLibReader.W0()) == null) {
            str = com.eclipsesource.mmv8.Platform.UNKNOWN;
        }
        linkedList.add(new jz5.l("weapp_lib_version_str", str));
        java.util.LinkedHashMap linkedHashMap = f324953c;
        synchronized (linkedHashMap) {
            if (linkedHashMap.size() > 0) {
                java.util.Iterator it = linkedHashMap.keySet().iterator();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                while (true) {
                    java.lang.Object next = it.next();
                    kotlin.jvm.internal.o.f(next, "next(...)");
                    cVar = (m91.c) next;
                    if (!it.hasNext()) {
                        break;
                    }
                    sb6.append(cVar.f324943d);
                    sb6.append(',');
                }
                linkedList.add(new jz5.l("weapp_id", cVar.f324943d));
                linkedList.add(new jz5.l("weapp_name", cVar.f324944e));
                linkedList.add(new jz5.l("weapp_version", java.lang.Integer.valueOf(cVar.f324946g)));
                linkedList.add(new jz5.l("weapp_service_type", java.lang.Integer.valueOf(cVar.f324947h)));
                linkedList.add(new jz5.l("weapp_render_backend", java.lang.Integer.valueOf(cVar.f324948i)));
                java.lang.String sb7 = sb6.toString();
                kotlin.jvm.internal.o.d(sb7);
                java.lang.String substring = sb7.substring(0, java.lang.Math.max(r26.n0.O(sb7, ',', 0, false, 6, null), 0));
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                if (!android.text.TextUtils.isEmpty(substring)) {
                    linkedList.add(new jz5.l("weapp_other_ids", substring));
                }
            }
        }
        java.lang.String version = com.tencent.skyline.SkylineLogic.version();
        kotlin.jvm.internal.o.f(version, "version(...)");
        linkedList.add(new jz5.l("weapp_skyline_version", r26.i0.t(version, ";", "_", false)));
        linkedList.add(new jz5.l("liteav_version", com.tencent.live2.V2TXLivePremier.getSDKVersionStr()));
        linkedList.add(new jz5.l("flutter_revision", a03.h.b()));
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            jz5.l lVar = (jz5.l) it6.next();
            java.lang.String str2 = (java.lang.String) lVar.f302833d;
            java.lang.Object obj = lVar.f302834e;
            sb8.append(str2);
            sb8.append(':');
            sb8.append(obj.toString());
            sb8.append(';');
        }
        java.lang.String sb9 = sb8.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }
}
