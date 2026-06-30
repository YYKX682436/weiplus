package im2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mo0.a f292395d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.k f292396e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f292397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(mo0.a aVar, im2.k kVar, ug5.v vVar) {
        super(0);
        this.f292395d = aVar;
        this.f292396e = kVar;
        this.f292397f = vVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        im2.k kVar = this.f292396e;
        mo0.a aVar = this.f292395d;
        aVar.post(new im2.i(kVar, aVar, this.f292397f));
        return jz5.f0.f302826a;
    }
}
