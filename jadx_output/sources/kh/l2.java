package kh;

/* loaded from: classes10.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kh.m2 f307853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f307855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f307856g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(kh.m2 m2Var, java.lang.String str, int i17, long j17) {
        super(0);
        this.f307853d = m2Var;
        this.f307854e = str;
        this.f307855f = i17;
        this.f307856g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "#tracking " + this.f307853d.f307863a + ": " + this.f307854e + '@' + this.f307855f + ", costMs=" + (android.os.SystemClock.currentThreadTimeMillis() - this.f307856g);
    }
}
