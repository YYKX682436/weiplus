package lr;

/* loaded from: classes12.dex */
public final class w0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f320598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr.y0 f320599e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(int i17, lr.y0 y0Var) {
        super(0);
        this.f320598d = i17;
        this.f320599e = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f320598d;
        lr.y0 y0Var = this.f320599e;
        if (i17 == 0) {
            y0Var.f320615h.setVisibility(0);
        } else {
            y0Var.f320615h.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}
