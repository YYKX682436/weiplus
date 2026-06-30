package sc3;

/* loaded from: classes7.dex */
public final class o implements qk.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sc3.k1 f406507a;

    public o(sc3.k1 k1Var) {
        this.f406507a = k1Var;
    }

    @Override // qk.u6
    public java.lang.String a() {
        return this.f406507a.f406476e;
    }

    @Override // qk.u6
    public void b(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f406507a.s2("devtools:receive", msg);
    }

    @Override // qk.u6
    public void c() {
        this.f406507a.f406491w.startInspector(0);
    }

    @Override // qk.u6
    public void d(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        this.f406507a.f406491w.sendInspectorMsg(0, msg);
    }

    @Override // qk.u6
    public java.lang.String description() {
        return this.f406507a.f406476e;
    }

    @Override // qk.u6
    public java.lang.String name() {
        return this.f406507a.f406476e;
    }

    @Override // qk.u6
    public void onClose() {
        this.f406507a.f406491w.stopInspector(0);
    }
}
