package mh2;

/* loaded from: classes10.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.n0 f326404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(android.content.Context context, mh2.n0 n0Var) {
        super(0);
        this.f326403d = context;
        this.f326404e = n0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.n0 n0Var = this.f326404e;
        return new qh2.i(this.f326403d, n0Var.getPluginAbility(), n0Var.getService());
    }
}
