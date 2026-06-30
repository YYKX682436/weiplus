package xe;

/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final xe.g f453740a = new xe.g();

    /* renamed from: b, reason: collision with root package name */
    public static final xe.c f453741b = new xe.d();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f453742c = java.util.Collections.synchronizedSet(new x.d(0));

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.tencent.luggage.sdk.processes.client.LuggageClientProcessMessage message) {
        java.lang.Object obj;
        com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo tipsMsgInfo;
        kotlin.jvm.internal.o.g(message, "message");
        java.util.Set runtimeList = f453742c;
        kotlin.jvm.internal.o.f(runtimeList, "runtimeList");
        java.util.Iterator it = runtimeList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((ze.n) obj).f74803n, message.getF47636d())) {
                    break;
                }
            }
        }
        ze.n nVar = (ze.n) obj;
        boolean z17 = true;
        if (nVar != null) {
            if (message instanceof xe.a) {
                com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage appBrandFinishMessage = (com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage) ((xe.a) message);
                java.lang.String str = appBrandFinishMessage.f89036f;
                if ((str == null || str.length() == 0) == false) {
                    java.lang.String str2 = appBrandFinishMessage.f89036f;
                    com.tencent.luggage.sdk.config.AppBrandInitConfigLU u07 = nVar.u0();
                    if (!u46.l.c(str2, u07 != null ? u07.f47277w : null)) {
                        z17 = false;
                    }
                }
            }
            if (z17) {
                message.b(nVar);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.w("Luggage.LuggageClientProcessMessageDispatcher", "dispatch: dispatch message[%s]appId[%s] fail", message.getClass().getSimpleName(), message.getF47636d());
        if (message instanceof xe.h) {
            java.util.ArrayList arrayList = ((com.tencent.mm.plugin.appbrand.tipsmsg.AppBrandOnGetTipsMsg) ((xe.h) message)).f89229f;
            java.util.ArrayList arrayList2 = true ^ arrayList.isEmpty() ? arrayList : null;
            if (arrayList2 != null && (tipsMsgInfo = (com.tencent.mm.plugin.appbrand.tipsmsg.TipsMsgInfo) kz5.n0.X(arrayList2)) != null) {
                rj1.m.c(tipsMsgInfo);
            }
        }
        if (message instanceof xe.a) {
            xe.c cVar = f453741b;
            xe.b bVar = new xe.b(message.getF47636d(), ((com.tencent.mm.plugin.appbrand.task.ipc.AppBrandFinishMessage) ((xe.a) message)).f89036f);
            xe.d dVar = (xe.d) cVar;
            dVar.getClass();
            dVar.f453737a.add(bVar);
        }
    }
}
