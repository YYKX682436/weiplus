package vd2;

/* loaded from: classes3.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vd2.s1 f435874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435875e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f435876f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(vd2.s1 s1Var, boolean z17, android.content.Context context) {
        super(0);
        this.f435874d = s1Var;
        this.f435875e = z17;
        this.f435876f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vd2.s1 s1Var = this.f435874d;
        if (((java.util.ArrayList) s1Var.f435908n).size() >= 2) {
            com.tencent.mars.xlog.Log.i(s1Var.f435907m, "checkProduceVisitorView: do not need to produce, view size = " + ((java.util.ArrayList) s1Var.f435908n).size());
        } else {
            boolean z17 = this.f435875e;
            android.content.Context context = this.f435876f;
            if (z17) {
                pm0.v.V(0L, new vd2.q1(s1Var, context));
            } else {
                vd2.s1.x(s1Var, context);
            }
        }
        return jz5.f0.f302826a;
    }
}
