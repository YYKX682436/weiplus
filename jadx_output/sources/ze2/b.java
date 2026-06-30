package ze2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f471773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f471775f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, int i18, r45.nw1 nw1Var) {
        super(0);
        this.f471773d = i17;
        this.f471774e = i18;
        this.f471775f = nw1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errCode:");
        sb6.append(this.f471773d);
        sb6.append(" errType:");
        sb6.append(this.f471774e);
        sb6.append(" svrId:");
        r45.nw1 nw1Var = this.f471775f;
        sb6.append(nw1Var != null ? java.lang.Long.valueOf(nw1Var.getLong(0)) : null);
        return sb6.toString();
    }
}
