package gf;

/* loaded from: classes7.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.a2 f271180d;

    public v1(gf.a2 a2Var) {
        this.f271180d = a2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.app.Activity v17;
        com.tencent.luggage.sdk.jsapi.component.b bVar = (com.tencent.luggage.sdk.jsapi.component.b) this.f271180d.f271013e.F();
        if (bVar == null || (v17 = bVar.v1()) == null) {
            return;
        }
        vj5.n.b(v17).e();
    }
}
