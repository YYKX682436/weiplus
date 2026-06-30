package tm2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f420534d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420535e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, tm2.s2 s2Var) {
        super(1);
        this.f420534d = z17;
        this.f420535e = s2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", this.f420534d);
            fm2.b bVar = this.f420535e.f19601c;
            if (bVar != null) {
                bVar.statusChange(qo0.b.f365386n, bundle);
            }
        }
        return jz5.f0.f302826a;
    }
}
