package h41;

/* loaded from: classes15.dex */
public final class a0 implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278757a;

    public a0(h41.i0 i0Var) {
        this.f278757a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return "ovc";
    }

    @Override // ey.t
    public java.lang.String b() {
        return "ovc::cancel_session";
    }

    @Override // ey.t
    public void c(com.tencent.wechat.aff.function_call.o notification) {
        kotlin.jvm.internal.o.g(notification, "notification");
        com.tencent.wechat.aff.ovc.d dVar = this.f278757a.f278794a;
        if (dVar != null) {
            dVar.G0();
        }
    }
}
