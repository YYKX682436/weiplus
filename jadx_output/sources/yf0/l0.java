package yf0;

/* loaded from: classes12.dex */
public final class l0 extends qi3.e0 {

    /* renamed from: i, reason: collision with root package name */
    public qi3.i0 f461585i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(qi3.g0 status, qi3.b0 sendTask) {
        super(status, sendTask);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(sendTask, "sendTask");
    }

    @Override // qi3.e0
    public int a() {
        qi3.d0 d0Var = this.f363695e;
        if (d0Var != null) {
            return d0Var.f363683a;
        }
        qi3.i0 i0Var = this.f363694d;
        if (i0Var != null) {
            return i0Var.f363725a;
        }
        qi3.i0 i0Var2 = this.f461585i;
        if (i0Var2 != null) {
            return i0Var2.f363725a;
        }
        qi3.f0 f0Var = this.f363693c;
        if (f0Var != null) {
            return f0Var.f363700a;
        }
        return 0;
    }
}
