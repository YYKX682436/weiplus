package zi4;

/* loaded from: classes11.dex */
public final class g0 implements com.tencent.pigeon.status.FLTStatusActionPlatformApi {

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f473214g;

    /* renamed from: a, reason: collision with root package name */
    public android.app.Activity f473215a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.pigeon.status.FLTStatusCommonApi f473216b;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.sdk.coroutines.LifecycleScope f473218d;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f473217c = jz5.h.b(zi4.c0.f473196d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f473219e = jz5.h.b(zi4.x.f473272d);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f473220f = new java.util.ArrayList();

    static {
        java.util.Map synchronizedMap = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        kotlin.jvm.internal.o.f(synchronizedMap, "synchronizedMap(...)");
        f473214g = synchronizedMap;
    }

    public static final /* synthetic */ java.lang.String a(zi4.g0 g0Var) {
        g0Var.getClass();
        return "MicroMsg.FLTStatusActionHost";
    }

    public final void b(android.app.Activity activity) {
        this.f473215a = activity;
        if (activity != null) {
            f473214g.put(activity, this);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f473220f;
        arrayList.addAll(list);
        ((java.util.ArrayList) list).clear();
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f473218d;
        if (lifecycleScope != null) {
            kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.q1.f310568a, null, new zi4.e0(arrayList, null), 2, null);
        }
    }

    public final void c(android.app.Activity activity) {
        if (activity != null) {
            java.util.Map map = f473214g;
            if (map.get(activity) == this) {
                map.remove(activity);
            }
        }
        this.f473215a = activity;
        ((java.util.ArrayList) this.f473220f).clear();
        synchronized (aj4.w.f5378a) {
            aj4.w.f5380c.clear();
        }
    }

    @Override // com.tencent.pigeon.status.FLTStatusActionPlatformApi
    public void fltStatusAction(com.tencent.pigeon.status.FLTStatusActionRequest request, yz5.l callback) {
        byte[] byteArray;
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fltStatusAction: cmdId=");
        sb6.append(request.getCmdId());
        sb6.append(", dataLen=");
        com.tencent.pigeon.status.FLTStatusPlatformProto proto = request.getProto();
        sb6.append((proto == null || (byteArray = proto.getByteArray()) == null) ? 0 : byteArray.length);
        com.tencent.mars.xlog.Log.i("MicroMsg.FLTStatusActionHost", sb6.toString());
        zi4.d dVar = (zi4.d) ((jz5.n) this.f473219e).getValue();
        java.lang.String cmdId = request.getCmdId();
        dVar.getClass();
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        zi4.c cVar = (zi4.c) ((java.util.LinkedHashMap) dVar.f473198a).get(cmdId);
        jz5.f0 f0Var = null;
        if (cVar != null) {
            boolean z17 = cVar.f473195b.f473189a;
            zi4.a0 a0Var = new zi4.a0(cVar, request, this, callback);
            if (z17) {
                if (this.f473215a != null) {
                    a0Var.invoke();
                } else {
                    com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = this.f473218d;
                    if (lifecycleScope != null) {
                        v65.i.c(lifecycleScope, null, new zi4.z(this, a0Var, null), 1, null);
                    }
                }
            } else {
                a0Var.invoke();
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FLTStatusActionHost", "fltStatusAction not found action handle, cmdId=" + request.getCmdId());
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("not found action handle " + request.getCmdId())))));
        }
    }
}
