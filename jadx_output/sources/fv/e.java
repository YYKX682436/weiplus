package fv;

/* loaded from: classes16.dex */
public final class e extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fv.k f266920b;

    public e(fv.k kVar) {
        this.f266920b = kVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        fv.k kVar = this.f266920b;
        com.tencent.mars.xlog.Log.i(kVar.d(), "onEnterDeepBackground");
        pm0.v.X(new fv.d(kVar));
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
