package mh2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.k0 f326370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f326371e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(mh2.k0 k0Var, android.content.Context context) {
        super(0);
        this.f326370d = k0Var;
        this.f326371e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mh2.k0 k0Var = this.f326370d;
        boolean z17 = k0Var.f326385f;
        ah2.f fVar = k0Var.f326383d;
        android.content.Context context = this.f326371e;
        return z17 ? new mh2.m1(context, k0Var, fVar) : new mh2.f1(context, k0Var, fVar, k0Var.getPluginAbility());
    }
}
