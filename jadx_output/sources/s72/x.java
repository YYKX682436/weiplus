package s72;

/* loaded from: classes12.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tp0 f404170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(java.lang.String str, r45.tp0 tp0Var) {
        super(0);
        this.f404169d = str;
        this.f404170e = tp0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("source:");
        sb6.append(this.f404169d);
        sb6.append(";favId:");
        r45.tp0 tp0Var = this.f404170e;
        sb6.append(tp0Var.f386638d);
        sb6.append(";seq:");
        sb6.append(tp0Var.f386643i);
        sb6.append(";updateTime:");
        sb6.append(tp0Var.f386642h);
        sb6.append(";xml:");
        java.lang.String str = tp0Var.f386640f;
        sb6.append(str != null ? r26.i0.t(str, ",", ";", false) : null);
        return sb6.toString();
    }
}
