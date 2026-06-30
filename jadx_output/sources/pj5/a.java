package pj5;

/* loaded from: classes9.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj5.b f355367d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pj5.b bVar) {
        super(1);
        this.f355367d = bVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2 = this.f355367d.f355368d.get(((java.lang.Number) obj).intValue());
        kotlin.jvm.internal.o.f(obj2, "get(...)");
        return new pj5.l((r45.lo5) obj2);
    }
}
