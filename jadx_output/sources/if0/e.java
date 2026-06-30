package if0;

/* loaded from: classes16.dex */
public final class e extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ if0.k f291020b;

    public e(if0.k kVar) {
        this.f291020b = kVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        if0.k kVar = this.f291020b;
        com.tencent.mars.xlog.Log.i(kVar.d(), "onEnterDeepBackground");
        pm0.v.X(new if0.d(kVar));
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
