package el2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f253947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253948e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.content.Context context, el2.i0 i0Var) {
        super(0);
        this.f253947d = context;
        this.f253948e = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f253947d;
        com.tencent.mm.plugin.finder.live.view.c4 c4Var = new com.tencent.mm.plugin.finder.live.view.c4(context);
        el2.i0 i0Var = this.f253948e;
        c4Var.P = new el2.w(i0Var);
        c4Var.Q = new el2.x(i0Var, context);
        return c4Var;
    }
}
