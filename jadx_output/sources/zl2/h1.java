package zl2;

/* loaded from: classes3.dex */
public final class h1 implements zy2.sa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f473797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473798b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473799c;

    public h1(gk2.e eVar, android.content.Context context, yz5.a aVar) {
        this.f473797a = eVar;
        this.f473798b = context;
        this.f473799c = aVar;
    }

    @Override // zy2.sa
    public boolean a(long j17, long j18, java.lang.String str, java.lang.Object obj, int i17) {
        if (!kotlin.jvm.internal.o.b(str, "notifyHideIdentitySwitch")) {
            return false;
        }
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = this.f473797a;
        dk2.xf k17 = efVar.k(eVar);
        if (k17 == null) {
            return false;
        }
        dk2.xf.i(k17, xy2.c.e(this.f473798b), 2, null, false, 0L, null, new zl2.g1(eVar, this.f473799c), 56, null);
        return false;
    }
}
