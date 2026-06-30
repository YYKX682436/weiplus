package mh2;

/* loaded from: classes10.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326356e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(mh2.k0 k0Var, android.content.Context context) {
        super(0);
        this.f326355d = k0Var;
        this.f326356e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.k0 k0Var = this.f326355d;
        boolean z17 = k0Var.f326385f;
        ah2.f fVar = k0Var.f326383d;
        android.content.Context context = this.f326356e;
        return z17 ? new mh2.i1(context, k0Var, fVar) : new mh2.r1(context, k0Var, fVar, k0Var.getPluginAbility());
    }
}
