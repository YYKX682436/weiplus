package yx;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467083d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f467084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f.r f467085f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467086g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.content.Context context, yz5.a aVar, f.r rVar, n0.v2 v2Var) {
        super(0);
        this.f467083d = context;
        this.f467084e = aVar;
        this.f467085f = rVar;
        this.f467086g = v2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f467086g.setValue(java.lang.Boolean.TRUE);
        android.content.Context context = this.f467083d;
        kotlin.jvm.internal.o.g(context, "context");
        if (b3.l.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
            this.f467084e.invoke();
        } else {
            this.f467085f.a("android.permission.RECORD_AUDIO", null);
        }
        return jz5.f0.f302826a;
    }
}
