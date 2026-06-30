package s72;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404160d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tp0 f404161e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, r45.tp0 tp0Var) {
        super(0);
        this.f404160d = str;
        this.f404161e = tp0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("source:");
        sb6.append(this.f404160d);
        sb6.append(";favId:");
        r45.tp0 tp0Var = this.f404161e;
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
