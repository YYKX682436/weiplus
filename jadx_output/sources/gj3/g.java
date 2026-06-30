package gj3;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gj3.h f272391d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gj3.h hVar) {
        super(0);
        this.f272391d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        gj3.h hVar = this.f272391d;
        fj3.k kVar = new fj3.k((hj3.m) ((jz5.n) hVar.f272398m).getValue());
        kotlinx.coroutines.l.d(kVar.f263217g, null, null, new fj3.j(kVar, null), 3, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRExecutor", "executor started");
        gj3.h.b(hVar, kVar, null, 1, 1, null);
        return kVar;
    }
}
