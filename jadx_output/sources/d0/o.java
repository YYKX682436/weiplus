package d0;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.c f225180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z0.c cVar) {
        super(2);
        this.f225180d = cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        kotlin.jvm.internal.o.g((p2.s) obj2, "<anonymous parameter 1>");
        return java.lang.Integer.valueOf(((z0.f) this.f225180d).a(0, intValue));
    }
}
