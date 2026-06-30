package el2;

/* loaded from: classes3.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, el2.i0 i0Var) {
        super(0);
        this.f253797d = context;
        this.f253798e = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f253797d;
        com.tencent.mm.plugin.finder.live.view.gb gbVar = new com.tencent.mm.plugin.finder.live.view.gb(context);
        el2.i0 i0Var = this.f253798e;
        gbVar.S = new el2.a(i0Var);
        gbVar.T = new el2.b(i0Var, gbVar);
        gbVar.U = new el2.c(i0Var);
        gbVar.V = new el2.e(i0Var, context);
        gbVar.W = new el2.f(i0Var, gbVar);
        return gbVar;
    }
}
