package x3;

/* loaded from: classes15.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final x3.o f451572a;

    /* renamed from: b, reason: collision with root package name */
    public final x3.p f451573b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f451574c = true;

    public k(x3.o oVar, x3.p pVar) {
        this.f451572a = oVar;
        this.f451573b = pVar;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f451572a);
        sb6.append(" ");
        sb6.append(!this.f451574c ? "+>" : "->");
        sb6.append(" ");
        sb6.append(this.f451573b);
        return sb6.toString();
    }
}
