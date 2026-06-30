package yo5;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464356d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464357e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, int i17) {
        super(0);
        this.f464356d = str;
        this.f464357e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = "GLHandlerThread-" + this.f464356d + '-' + this.f464357e;
        int i17 = pu5.i.f358473b;
        return pu5.f.a(str, -4);
    }
}
