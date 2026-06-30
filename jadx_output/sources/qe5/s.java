package qe5;

/* loaded from: classes12.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.z f362184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f362187g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362188h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qe5.z zVar, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        super(0);
        this.f362184d = zVar;
        this.f362185e = str;
        this.f362186f = str2;
        this.f362187g = i17;
        this.f362188h = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        j75.f Q6 = this.f362184d.Q6();
        if (Q6 != null) {
            java.lang.String str = this.f362185e;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = this.f362186f;
            Q6.B3(new kd5.l(str, str2 != null ? str2 : "", this.f362187g, this.f362188h));
        }
        return jz5.f0.f302826a;
    }
}
