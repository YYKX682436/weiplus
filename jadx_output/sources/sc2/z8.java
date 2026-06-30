package sc2;

/* loaded from: classes2.dex */
public final class z8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.a9 f406424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f406425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(sc2.a9 a9Var, android.content.Context context) {
        super(0);
        this.f406424d = a9Var;
        this.f406425e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        sc2.a9 a9Var = this.f406424d;
        boolean z17 = a9Var.f405771d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (z17) {
            android.app.Dialog dialog = a9Var.f405770c;
            if (dialog != null) {
                dialog.show();
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                android.content.Context context = this.f406425e;
                a9Var.f405770c = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, false, sc2.y8.f406397d);
            }
        }
        return f0Var2;
    }
}
