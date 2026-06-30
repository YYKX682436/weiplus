package cr0;

/* loaded from: classes12.dex */
public final class n4 implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qh.b f221693a;

    public n4(qh.b bVar) {
        this.f221693a = bVar;
    }

    @Override // r.a
    public java.lang.Object apply(java.lang.Object obj) {
        return java.lang.Double.valueOf(uh.i.p((((java.lang.Number) obj).doubleValue() * 3600000) / this.f221693a.f363321n, 2));
    }
}
