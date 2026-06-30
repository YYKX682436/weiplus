package k55;

/* loaded from: classes8.dex */
public class i extends k55.g {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.remoteservice.RemoteService f304468e;

    public i(com.tencent.mm.remoteservice.RemoteService remoteService) {
        this.f304468e = remoteService;
    }

    @Override // k55.h
    public void Na(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, k55.e eVar) {
        k55.b bVar;
        try {
            java.lang.Class<?> loadClass = this.f304468e.getClassLoader().loadClass(str);
            java.lang.reflect.Constructor<?>[] constructors = loadClass.getConstructors();
            if (constructors.length > 0) {
                java.lang.Object[] objArr = new java.lang.Object[constructors[0].getParameterTypes().length];
                objArr[0] = null;
                bVar = (k55.b) constructors[0].newInstance(objArr);
            } else {
                bVar = (k55.b) loadClass.newInstance();
            }
            bVar.f304464e = eVar;
            bVar.onCallback(str2, bundle, false);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.RemoveService", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
    }
}
