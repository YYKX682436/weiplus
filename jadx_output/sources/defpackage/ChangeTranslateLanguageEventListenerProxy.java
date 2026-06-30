package defpackage;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LChangeTranslateLanguageEventListenerProxy;", "Landroidx/lifecycle/x;", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ChangeTranslateLanguageEventListenerProxy implements androidx.lifecycle.x {

    /* renamed from: d, reason: collision with root package name */
    public static final defpackage.ChangeTranslateLanguageEventListenerProxy f33d = new defpackage.ChangeTranslateLanguageEventListenerProxy();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.ArrayList f34e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public static final android.util.ArraySet f35f = new android.util.ArraySet();

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f36g;

    static {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            f36g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(defpackage.o.f341670d) { // from class: ChangeTranslateLanguageEventListenerProxy.1
                {
                    this.__eventId = -348375692;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                    com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent event = changeTranslateLanguageEvent;
                    kotlin.jvm.internal.o.g(event, "event");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeTranslateLanguageEvent callProcessName:");
                    android.util.ArraySet arraySet = defpackage.ChangeTranslateLanguageEventListenerProxy.f35f;
                    sb6.append(arraySet);
                    com.tencent.mars.xlog.Log.i("Luggage.ListenerProxy", sb6.toString());
                    java.util.Iterator it = arraySet.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        android.os.Bundle bundle = new android.os.Bundle();
                        am.z1 z1Var = event.f54035g;
                        bundle.putString("newLanguageCode", z1Var.f8503b);
                        bundle.putString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, z1Var.f8502a);
                        com.tencent.mm.ipcinvoker.d0.d(str, bundle, defpackage.b.f16182d.getClass(), defpackage.c.f36847d);
                    }
                    return false;
                }
            };
        }
    }

    private ChangeTranslateLanguageEventListenerProxy() {
    }

    public final synchronized void a(defpackage.u listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("Luggage.ListenerProxy", "addOnTranslateLanguageChangeListener listener" + listener);
        java.util.ArrayList arrayList = f34e;
        arrayList.add(listener);
        if (arrayList.size() == 1) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("processName", bm5.f1.a());
            com.tencent.mm.ipcinvoker.d0.d(str, bundle, defpackage.d.f225060d.getClass(), defpackage.e.f245482d);
        }
    }

    public final synchronized void b(defpackage.u listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        com.tencent.mars.xlog.Log.i("Luggage.ListenerProxy", "removeOnTranslateLanguageChangeListener listener" + listener);
        java.util.ArrayList arrayList = f34e;
        arrayList.remove(listener);
        if (arrayList.size() <= 0) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("processName", bm5.f1.a());
            com.tencent.mm.ipcinvoker.d0.d(str, bundle, defpackage.f.f257968d.getClass(), defpackage.g.f267333d);
        }
    }
}
