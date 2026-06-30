package e50;

/* loaded from: classes11.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f249493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e50.z0 z0Var) {
        super(1);
        this.f249493d = z0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pi0.a it = (pi0.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f249493d.getClass();
        com.tencent.mm.autogen.mmdata.rpt.FlutterEngineCreateInfoStruct flutterEngineCreateInfoStruct = new com.tencent.mm.autogen.mmdata.rpt.FlutterEngineCreateInfoStruct();
        flutterEngineCreateInfoStruct.f58152d = flutterEngineCreateInfoStruct.b("EngineId", it.f354502a, true);
        flutterEngineCreateInfoStruct.f58153e = it.f354504c ? 1L : 0L;
        flutterEngineCreateInfoStruct.f58154f = it.f354503b;
        flutterEngineCreateInfoStruct.f58155g = it.f354505d;
        flutterEngineCreateInfoStruct.f58156h = it.f354506e;
        flutterEngineCreateInfoStruct.f58157i = it.f354507f;
        flutterEngineCreateInfoStruct.f58158j = flutterEngineCreateInfoStruct.b("Route", it.f354508g, true);
        flutterEngineCreateInfoStruct.f58159k = it.f354509h;
        flutterEngineCreateInfoStruct.f58160l = it.f354511j;
        flutterEngineCreateInfoStruct.f58161m = it.f354510i ? 1L : 0L;
        flutterEngineCreateInfoStruct.f58162n = it.f354512k;
        flutterEngineCreateInfoStruct.f58164p = it.f354513l ? 1L : 0L;
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "reportEngineCreate: " + flutterEngineCreateInfoStruct.n());
        jz5.g gVar = e50.z0.f249556r;
        if (((java.lang.Boolean) ((jz5.n) e50.z0.f249556r).getValue()).booleanValue()) {
            flutterEngineCreateInfoStruct.k();
        }
        return jz5.f0.f302826a;
    }
}
