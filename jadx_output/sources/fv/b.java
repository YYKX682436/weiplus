package fv;

/* loaded from: classes16.dex */
public final class b extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fv.k f266917b;

    public b(fv.k kVar) {
        this.f266917b = kVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        fv.k kVar = this.f266917b;
        com.tencent.mars.xlog.Log.i(kVar.d(), "onEnterBackground");
        pm0.v.X(new fv.a(kVar));
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
