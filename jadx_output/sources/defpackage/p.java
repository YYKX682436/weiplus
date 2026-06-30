package defpackage;

/* loaded from: classes5.dex */
public final class p implements com.tencent.mm.modelcdntran.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f350332a;

    public p(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(weakReference, "weakReference");
        this.f350332a = weakReference;
    }

    @Override // com.tencent.mm.modelcdntran.q0
    public void a(com.tencent.mm.modelcdntran.n1 event) {
        java.lang.ref.WeakReference weakReference;
        com.tencent.maas.camstudio.MJCDNBridgeService mJCDNBridgeService;
        dn.g gVar;
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mars.xlog.Log.i("MaasTemplateCdnManager", "event " + event + ' ');
        defpackage.t tVar = (defpackage.t) this.f350332a.get();
        if (tVar == null || (weakReference = tVar.f414254d) == null || (mJCDNBridgeService = (com.tencent.maas.camstudio.MJCDNBridgeService) weakReference.get()) == null) {
            return;
        }
        java.lang.Object obj = tVar.f414253c;
        java.util.HashMap hashMap = tVar.f414252b;
        java.lang.String str = event.f71104b;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (str2 == null) {
            return;
        }
        int ordinal = event.f71103a.ordinal();
        if (ordinal == 0) {
            int errorCode = com.tencent.maas.instamovie.base.MJError.MaasEC.NetworkFailed.getErrorCode();
            dn.h hVar = event.f71108f;
            mJCDNBridgeService.a(str2, new com.tencent.maas.instamovie.base.MJError(errorCode, java.lang.String.valueOf(hVar != null ? java.lang.Integer.valueOf(hVar.field_retCode) : null)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdn client id:");
            sb6.append(str);
            sb6.append(" sceneResult.retCode:");
            dn.h hVar2 = event.f71108f;
            sb6.append(hVar2 != null ? java.lang.Integer.valueOf(hVar2.field_retCode) : null);
            com.tencent.mars.xlog.Log.e("MaasTemplateCdnManager", sb6.toString());
            synchronized (tVar.f414253c) {
                if (tVar.f414252b.containsKey(str)) {
                    tVar.f414252b.remove(str);
                }
            }
            tVar.f();
            return;
        }
        if (ordinal == 1) {
            mJCDNBridgeService.c(str2);
            synchronized (tVar.f414253c) {
                if (tVar.f414252b.containsKey(str)) {
                    tVar.f414252b.remove(str);
                }
            }
            tVar.f();
            return;
        }
        if (ordinal == 2 && (gVar = event.f71107e) != null) {
            synchronized (obj) {
                com.tencent.mars.xlog.Log.i("MaasTemplateCdnManager", "field_finishedLength:" + gVar.field_finishedLength + " field_toltalLength:" + gVar.field_toltalLength);
                java.lang.String str3 = (java.lang.String) hashMap.get(str);
                if (str3 != null) {
                    mJCDNBridgeService.b(str3, gVar.field_finishedLength, gVar.field_toltalLength, 0.0f, 0.0f);
                }
            }
        }
    }
}
