package of;

/* loaded from: classes14.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f344832a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f344833b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f344834c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f344835d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f344836e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f344837f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Integer f344838g;

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SmapsEntity(name=");
        sb6.append(this.f344832a);
        sb6.append(", permission=");
        sb6.append(this.f344835d);
        sb6.append(", virtual memory size=");
        of.n nVar = of.s.f344846c;
        kotlin.jvm.internal.o.d(this.f344836e);
        sb6.append(nVar.a(r2.intValue() * 1024));
        sb6.append(",pss=");
        kotlin.jvm.internal.o.d(this.f344837f);
        sb6.append(nVar.a(r2.intValue() * 1024));
        sb6.append(", rss=");
        kotlin.jvm.internal.o.d(this.f344838g);
        sb6.append(nVar.a(r2.intValue() * 1024));
        sb6.append(",startAddress=");
        sb6.append(this.f344833b);
        sb6.append(", endAddress=");
        sb6.append(this.f344834c);
        sb6.append(')');
        return sb6.toString();
    }
}
