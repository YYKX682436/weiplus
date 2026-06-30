package dl4;

/* loaded from: classes3.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p11.k f235493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f235495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(p11.k kVar, java.lang.String str, java.lang.Object[] objArr) {
        super(0);
        this.f235493d = kVar;
        this.f235494e = str;
        this.f235495f = objArr;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p11.k kVar = this.f235493d;
        if (kVar != null) {
            kVar.a(this.f235494e, null, null, this.f235495f);
        }
        return jz5.f0.f302826a;
    }
}
