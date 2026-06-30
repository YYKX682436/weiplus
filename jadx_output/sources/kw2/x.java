package kw2;

/* loaded from: classes15.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dn.h f313114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(kw2.y yVar, java.lang.String str, java.lang.String str2, dn.h hVar) {
        super(0);
        this.f313111d = yVar;
        this.f313112e = str;
        this.f313113f = str2;
        this.f313114g = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        kw2.y yVar = this.f313111d;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = yVar.f313115a;
        java.lang.String str = this.f313112e;
        kw2.e eVar = (kw2.e) concurrentHashMap.remove(str);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = yVar.f313115a;
        java.lang.String str2 = this.f313113f;
        if (eVar != null) {
            com.tencent.mars.xlog.Log.i("FinderNetworkFlowReport", "PRELOAD_stopPreload " + eVar.Q + ' ' + str2 + " mediaId:" + str + " size:" + concurrentHashMap2.size());
            kw2.d dVar = kw2.e.V;
            dn.h hVar = this.f313114g;
            dVar.e(eVar, hVar);
            long j17 = hVar.field_recvedTotalBytes;
            eVar.f312964j = j17;
            yVar.c(j17);
            yVar.f(eVar, "stopPreload");
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w("FinderNetworkFlowReport", "PRELOAD_stopPreload hit null mediaId:" + str + ' ' + str2 + " return for size:" + concurrentHashMap2.size() + " list:");
        }
        return f0Var2;
    }
}
