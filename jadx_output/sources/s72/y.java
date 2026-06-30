package s72;

/* loaded from: classes12.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tp0 f404174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.lang.String str, r45.tp0 tp0Var) {
        super(0);
        this.f404173d = str;
        this.f404174e = tp0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("source:");
        sb6.append(this.f404173d);
        sb6.append(";favId:");
        r45.tp0 tp0Var = this.f404174e;
        sb6.append(tp0Var.f386638d);
        sb6.append(";seq:");
        sb6.append(tp0Var.f386643i);
        sb6.append(";updateTime:");
        sb6.append(tp0Var.f386642h);
        sb6.append(";xml:");
        sb6.append(tp0Var.f386640f);
        return sb6.toString();
    }
}
