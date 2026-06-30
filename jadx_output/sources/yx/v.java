package yx;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f467088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f467090g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context, yz5.a aVar, n0.v2 v2Var, n0.v2 v2Var2) {
        super(0);
        this.f467087d = context;
        this.f467088e = aVar;
        this.f467089f = v2Var;
        this.f467090g = v2Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        this.f467089f.setValue(bool);
        this.f467090g.setValue(bool);
        android.content.Context context = this.f467087d;
        kotlin.jvm.internal.o.g(context, "context");
        if (b3.l.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0) {
            this.f467088e.invoke();
        }
        return jz5.f0.f302826a;
    }
}
