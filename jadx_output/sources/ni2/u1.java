package ni2;

/* loaded from: classes3.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.z1 f337477e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.content.Context context, ni2.z1 z1Var) {
        super(0);
        this.f337476d = context;
        this.f337477e = z1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f337476d;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        com.tencent.mm.ui.tools.f5 f5Var = new com.tencent.mm.ui.tools.f5((android.app.Activity) context);
        f5Var.f210400e = new ni2.t1(this.f337477e);
        return f5Var;
    }
}
