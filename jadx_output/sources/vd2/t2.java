package vd2;

/* loaded from: classes3.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km2.t f435920d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(km2.t tVar) {
        super(1);
        this.f435920d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        km2.t it = (km2.t) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.d(this.f435920d) == 0);
    }
}
