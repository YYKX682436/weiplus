package y1;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d1.g f458703d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d1.g gVar) {
        super(1);
        this.f458703d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        u1.w it = (u1.w) obj;
        kotlin.jvm.internal.o.g(it, "it");
        u1.c1 c17 = y1.q0.c(it);
        if (c17.p0()) {
            if (!kotlin.jvm.internal.o.b(this.f458703d, s1.a0.b(c17))) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
