package i55;

/* loaded from: classes8.dex */
public final class l extends i55.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l() {
        super(3);
        f55.e eVar = f55.e.f259771e;
    }

    @Override // i55.d
    public boolean b(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        return true;
    }

    @Override // i55.d
    public java.lang.String c(java.lang.String eventId) {
        kotlin.jvm.internal.o.g(eventId, "eventId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String lowerCase = "MoreTabUI".toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append('_');
        sb6.append(eventId);
        return sb6.toString();
    }

    @Override // i55.d
    public void f(long j17, java.lang.String prefKey) {
        kotlin.jvm.internal.o.g(prefKey, "prefKey");
        super.f(j17, prefKey);
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabRedDotLogic", j17 + "  " + prefKey + " on click");
    }

    @Override // i55.d
    public void h(java.lang.String event, g55.e eVar) {
        kotlin.jvm.internal.o.g(event, "event");
        java.util.Objects.toString(eVar);
        java.util.Map a17 = eVar != null ? eVar.a() : new java.util.LinkedHashMap();
        e55.e eVar2 = e55.e.f249667a;
        a17.putAll(eVar2.j());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f288840a;
        sb6.append(i17);
        sb6.append(" callRedDotEvent ");
        sb6.append(event);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.MoreTabRedDotLogic", sb6.toString());
        com.tencent.mm.autogen.events.RedDotExposureEventEvent redDotExposureEventEvent = new com.tencent.mm.autogen.events.RedDotExposureEventEvent();
        am.jq jqVar = redDotExposureEventEvent.f54668g;
        jqVar.f7062a = i17;
        jqVar.f7063b = event;
        if (eVar != null) {
            java.lang.String str = eVar.f268962a;
            jqVar.f7065d = str;
            jqVar.f7064c = eVar2.a(str);
            jqVar.f7066e = a17;
        }
        redDotExposureEventEvent.e();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, a17, 37181);
    }
}
