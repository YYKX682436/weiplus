package wo0;

/* loaded from: classes15.dex */
public final class a extends cp0.d {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f447869c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz5.p pVar, cp0.n nVar) {
        super(nVar);
        this.f447869c = pVar;
    }

    @Override // cp0.d, cp0.f
    public /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, cp0.n nVar) {
        b((android.graphics.Bitmap) obj, nVar);
        return true;
    }

    @Override // cp0.d
    /* renamed from: e */
    public boolean b(android.graphics.Bitmap bitmap, cp0.n viewWeakHolder) {
        kotlin.jvm.internal.o.g(viewWeakHolder, "viewWeakHolder");
        super.b(bitmap, viewWeakHolder);
        yz5.p pVar = this.f447869c;
        if (pVar == null) {
            return true;
        }
        pVar.invoke(viewWeakHolder, bitmap);
        return true;
    }
}
