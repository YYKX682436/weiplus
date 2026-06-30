package ir1;

/* loaded from: classes11.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f293930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f293931e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ir1.e0 e0Var, l75.w0 w0Var) {
        super(0);
        this.f293930d = e0Var;
        this.f293931e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f293931e.f316976d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.conversation.storage.BizFansContact");
        hr1.a aVar = (hr1.a) obj;
        ir1.e0 e0Var = this.f293930d;
        e0Var.getClass();
        e0Var.f293964n.put(aVar.field_openid, aVar);
        hr1.e eVar = (hr1.e) e0Var.f293962i.get(aVar.field_openid);
        int c07 = kz5.n0.c0(e0Var.f293961h, eVar);
        if (eVar != null) {
            eVar.u0();
        }
        e0Var.notifyItemChanged(c07);
        return jz5.f0.f302826a;
    }
}
