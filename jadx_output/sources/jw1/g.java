package jw1;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jw1.h f302301d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(jw1.h hVar) {
        super(0);
        this.f302301d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jw1.h hVar = this.f302301d;
        iw1.k kVar = new iw1.k((kw1.k) ((jz5.n) hVar.f302308m).getValue());
        kotlinx.coroutines.l.d(kVar.f295222g, null, null, new iw1.j(kVar, null), 3, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.MTRExecutor", "executor started");
        jw1.h.a(hVar, kVar, null, 1, 1, null);
        return kVar;
    }
}
