package if0;

/* loaded from: classes16.dex */
public final class b extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ if0.k f291017b;

    public b(if0.k kVar) {
        this.f291017b = kVar;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        if0.k kVar = this.f291017b;
        com.tencent.mars.xlog.Log.i(kVar.d(), "onEnterBackground");
        pm0.v.X(new if0.a(kVar));
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
    }
}
