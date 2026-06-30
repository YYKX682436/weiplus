package h41;

/* loaded from: classes15.dex */
public final class e0 implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f278776a;

    public e0(h41.i0 i0Var) {
        this.f278776a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return "contact";
    }

    @Override // ey.k
    public java.lang.String b() {
        return "contact::search_contacts";
    }

    @Override // ey.k
    public void c(com.tencent.wechat.aff.function_call.e notification) {
        kotlin.jvm.internal.o.g(notification, "notification");
        h41.i0 i0Var = this.f278776a;
        if (i0Var.f278801h > 0) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - i0Var.f278801h;
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCFunctionCallEventStubImpl", "search_contacts end costMs=" + currentTimeMillis);
            com.tencent.wechat.aff.ovc.d dVar = i0Var.f278794a;
            if (dVar != null) {
                dVar.N0(currentTimeMillis);
            }
            i0Var.f278801h = 0L;
        }
    }
}
