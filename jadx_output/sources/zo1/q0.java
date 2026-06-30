package zo1;

/* loaded from: classes5.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f474741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f474742e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(long j17, java.util.Map map) {
        super(1);
        this.f474741d = j17;
        this.f474742e = map;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String message;
        com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct it = (com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        it.f60073k = this.f474741d;
        java.util.Map dict = this.f474742e;
        kotlin.jvm.internal.o.g(dict, "dict");
        try {
            java.lang.String jSONObject = new org.json.JSONObject(dict).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            message = r26.i0.t(jSONObject, ",", ";", false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RoamReport28098", e17, "json error", new java.lang.Object[0]);
            message = e17.getMessage();
        }
        it.p(message);
        return jz5.f0.f302826a;
    }
}
