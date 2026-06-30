package js1;

/* loaded from: classes4.dex */
public final class s implements js1.c {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f301502d;

    /* renamed from: a, reason: collision with root package name */
    public static final js1.s f301499a = new js1.s();

    /* renamed from: b, reason: collision with root package name */
    public static final js1.b f301500b = new js1.b();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.ArrayList f301501c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f301503e = new java.util.concurrent.ConcurrentHashMap();

    public static final boolean a(js1.b bVar, com.tencent.mm.plugin.brandservice.api.TransferRequestInfo requestInfo) {
        kotlin.jvm.internal.o.g(requestInfo, "requestInfo");
        if (bVar == null) {
            return false;
        }
        if (!(bVar.f301479a.length() > 0)) {
            return false;
        }
        if (requestInfo.f93920n) {
            if (!(bVar.f301480b.length() > 0)) {
                return false;
            }
        }
        return true;
    }
}
