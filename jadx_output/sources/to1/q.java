package to1;

/* loaded from: classes15.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ to1.r f420932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f420933e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(to1.r rVar, java.lang.String str) {
        super(0);
        this.f420932d = rVar;
        this.f420933e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.net.Uri a17 = this.f420932d.a(this.f420933e);
        to1.n nVar = to1.r.f420934d;
        to1.r rVar = a17.getPath() != null ? (to1.r) to1.r.f420935e.get(a17.getPath()) : null;
        if (rVar == null && (rVar = nVar.b(a17)) != null && a17.getPath() != null) {
            to1.r.f420935e.put(a17.getPath(), rVar);
        }
        return rVar;
    }
}
