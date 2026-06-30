package d0;

/* loaded from: classes14.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.d f225234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(z0.d dVar) {
        super(2);
        this.f225234d = dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long j17 = ((p2.q) obj).f351396a;
        p2.s layoutDirection = (p2.s) obj2;
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        return new p2.m(((z0.g) this.f225234d).a(0L, j17, layoutDirection));
    }
}
