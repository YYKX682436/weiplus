package jj3;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.c f300012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jj3.j f300013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, jj3.c cVar, jj3.j jVar) {
        super(1);
        this.f300011d = str;
        this.f300012e = cVar;
        this.f300013f = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "onSurfaceTextureDestroyed " + this.f300011d + ' ' + it);
        jj3.c cVar = this.f300012e;
        jj3.d a17 = cVar.a();
        if (kotlin.jvm.internal.o.b(a17 != null ? a17.getRenderTarget() : null, it)) {
            this.f300013f.a(cVar);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MTR.RenderTargetHolder", "bindOutputView: not current surface");
        }
        return jz5.f0.f302826a;
    }
}
