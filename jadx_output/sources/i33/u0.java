package i33;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.y0 f288273d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(i33.y0 y0Var) {
        super(0);
        this.f288273d = y0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Integer h17 = r26.h0.h(bm5.o1.f22719a.l(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumRecyclerPoolCacheSize()));
        int intValue = h17 != null ? h17.intValue() : 100;
        java.lang.String str = this.f288273d.f288290f;
        return java.lang.Integer.valueOf(intValue);
    }
}
