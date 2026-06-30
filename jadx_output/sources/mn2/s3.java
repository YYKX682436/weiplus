package mn2;

/* loaded from: classes4.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.x3 f330111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f330113f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f330114g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(mn2.x3 x3Var, java.lang.String str, long j17, long j18) {
        super(0);
        this.f330111d = x3Var;
        this.f330112e = str;
        this.f330113f = j17;
        this.f330114g = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        t21.h0 h0Var = this.f330111d.f330160e;
        if (h0Var != null) {
            h0Var.onDataAvailable(this.f330112e, this.f330113f, this.f330114g);
        }
        return jz5.f0.f302826a;
    }
}
