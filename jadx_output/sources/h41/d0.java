package h41;

/* loaded from: classes15.dex */
public final class d0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278775a;

    public d0(h41.i0 i0Var) {
        this.f278775a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return "voip";
    }

    @Override // ey.k
    public java.lang.String b() {
        return "voip::make_voice_call";
    }

    @Override // ey.k
    public void c(com.tencent.wechat.aff.function_call.e notification) {
        int i17;
        kotlin.jvm.internal.o.g(notification, "notification");
        boolean z17 = false;
        try {
            i17 = new org.json.JSONObject(notification.b()).getInt("voip_scene");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCFunctionCallEventStubImpl", "make voip parametersJson error " + e17);
            i17 = 0;
        }
        try {
            z17 = new org.json.JSONObject(notification.c()).getBoolean(ya.b.SUCCESS);
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "make voip " + i17 + ' ' + z17);
        com.tencent.wechat.aff.ovc.d dVar = this.f278775a.f278794a;
        if (dVar != null) {
            dVar.n1(i17, z17);
        }
    }
}
