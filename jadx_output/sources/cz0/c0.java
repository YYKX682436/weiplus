package cz0;

/* loaded from: classes5.dex */
public final class c0 extends com.tencent.mm.sdk.event.n {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f224938d = new java.util.LinkedHashMap();

    public c0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent event = (com.tencent.mm.autogen.events.CheckResUpdatePreOperationEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.t2 t2Var = event.f54055g;
        if (t2Var.f7966a != 103 || t2Var.f7968c != 0) {
            return false;
        }
        int i17 = t2Var.f7967b;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Map map = f224938d;
        java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(i17));
        if (currentTimeMillis - (l17 != null ? l17.longValue() : 0L) < 1000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MassSdkResPreEventListener", "skip duplicate download start report: subtype=" + i17);
            return false;
        }
        map.put(java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis));
        com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct maasSdkResStruct = new com.tencent.mm.autogen.mmdata.rpt.MaasSdkResStruct();
        maasSdkResStruct.f59003d = cz0.y.f224970b;
        maasSdkResStruct.f59006g = 6;
        maasSdkResStruct.f59007h = i17;
        maasSdkResStruct.f59011l = 2;
        com.tencent.mars.xlog.Log.i("MicroMsg.MassSdkResPreEventListener", "download start: subtype=" + i17);
        maasSdkResStruct.k();
        return false;
    }
}
