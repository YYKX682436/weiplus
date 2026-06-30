package i33;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f288172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(i33.t0 t0Var) {
        super(0);
        this.f288172d = t0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Long j17 = r26.h0.j(bm5.o1.f22719a.l(new com.tencent.mm.repairer.config.albumpicker.RepairerConfigAlbumAutoExitFullScreenModeCountdown()));
        long longValue = j17 != null ? j17.longValue() : 300L;
        java.lang.String str = this.f288172d.f288247f;
        return java.lang.Long.valueOf(longValue);
    }
}
