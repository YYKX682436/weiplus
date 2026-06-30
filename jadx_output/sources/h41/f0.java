package h41;

/* loaded from: classes15.dex */
public final class f0 implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278778a;

    public f0(h41.i0 i0Var) {
        this.f278778a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.t
    public java.lang.String b() {
        return "contact::search_contacts";
    }

    @Override // ey.t
    public void c(com.tencent.wechat.aff.function_call.o notification) {
        kotlin.jvm.internal.o.g(notification, "notification");
        this.f278778a.f278801h = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "search_contacts start");
    }
}
