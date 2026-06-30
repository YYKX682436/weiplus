package ze2;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f471771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, int i18) {
        super(0);
        this.f471771d = i17;
        this.f471772e = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.nw1 nw1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("errCode:");
        sb6.append(this.f471771d);
        sb6.append(" errType:");
        sb6.append(this.f471772e);
        sb6.append(" localId:");
        mm2.e1 e1Var = (mm2.e1) dk2.ef.f233372a.i(mm2.e1.class);
        sb6.append((e1Var == null || (nw1Var = e1Var.f328988r) == null) ? null : java.lang.Long.valueOf(nw1Var.getLong(0)));
        return sb6.toString();
    }
}
