package s92;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f404993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404994e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f404995f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.a34 f404996g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, java.lang.String str, long j18, r45.a34 a34Var) {
        super(0);
        this.f404993d = j17;
        this.f404994e = str;
        this.f404995f = j18;
        this.f404996g = a34Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new y92.b(this.f404993d, this.f404994e, java.lang.Long.valueOf(this.f404995f), this.f404996g);
    }
}
