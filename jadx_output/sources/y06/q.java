package y06;

/* loaded from: classes16.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y06.r f458688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(y06.r rVar) {
        super(0);
        this.f458688d = rVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e16.b bVar = this.f458688d.f458670d;
        t16.g a17 = bVar instanceof e16.e ? y06.h.f458677a.a(((u06.n) ((e16.e) bVar)).a()) : bVar instanceof e16.m ? y06.h.f458677a.a(kz5.b0.c(bVar)) : null;
        java.util.Map e17 = a17 != null ? kz5.b1.e(new jz5.l(y06.f.f458673c, a17)) : null;
        return e17 == null ? kz5.q0.f314001d : e17;
    }
}
