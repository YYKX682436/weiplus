package jj3;

/* loaded from: classes14.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300009d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.c f300010e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, jj3.c cVar) {
        super(1);
        this.f300009d = str;
        this.f300010e = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "onSurfaceTextureAvailable " + this.f300009d + ' ' + it);
        jj3.d a17 = this.f300010e.a();
        if (kotlin.jvm.internal.o.b(a17 != null ? a17.getRenderTarget() : null, it)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", "bindOutputView: set inUse");
            this.f300010e.f300008e = true;
        }
        return jz5.f0.f302826a;
    }
}
