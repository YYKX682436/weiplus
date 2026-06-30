package hc2;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f280304e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String str, long j17) {
        super(0);
        this.f280303d = str;
        this.f280304e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "tag=" + this.f280303d + " feedId=" + pm0.v.u(this.f280304e);
    }
}
