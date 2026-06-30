package v82;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v82.a f434066a = new v82.a();

    public final void a(java.lang.String viewId, java.lang.String eventId, java.util.HashMap eventParams) {
        kotlin.jvm.internal.o.g(viewId, "viewId");
        kotlin.jvm.internal.o.g(eventId, "eventId");
        kotlin.jvm.internal.o.g(eventParams, "eventParams");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report32903 viewId:");
        sb6.append(viewId);
        sb6.append(", eventId:");
        sb6.append(eventId);
        sb6.append(", eventParams:");
        java.util.ArrayList arrayList = new java.util.ArrayList(eventParams.size());
        for (java.util.Map.Entry entry : eventParams.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + ':' + entry.getValue());
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FavViewEventReporter", sb6.toString());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(viewId, eventId, eventParams, 32903);
    }
}
