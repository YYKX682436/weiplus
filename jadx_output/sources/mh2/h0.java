package mh2;

/* loaded from: classes10.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326364d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326365e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(mh2.k0 k0Var, android.content.Context context) {
        super(0);
        this.f326364d = k0Var;
        this.f326365e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.k0 k0Var = this.f326364d;
        boolean z17 = k0Var.f326385f;
        android.content.Context context = this.f326365e;
        return z17 ? new mh2.j1(context, k0Var) : new mh2.v1(context, k0Var);
    }
}
