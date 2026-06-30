package jj3;

/* loaded from: classes14.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.j f300016e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView f300017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, jj3.j jVar, com.tencent.mm.plugin.multitalk.mt_render.mt_render_impl.render.VideoView videoView) {
        super(1);
        this.f300015d = str;
        this.f300016e = jVar;
        this.f300017f = videoView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrame ");
        java.lang.String str = this.f300015d;
        sb6.append(str);
        sb6.append(' ');
        sb6.append(it);
        com.tencent.mars.xlog.Log.i("MicroMsg.MTR.RenderTargetHolder", sb6.toString());
        jj3.j jVar = this.f300016e;
        yz5.a aVar = (yz5.a) jVar.f300021f.get(str);
        if (aVar != null) {
            aVar.invoke();
        }
        jVar.f300021f.remove(str);
        this.f300017f.setOnSurfaceTextureUpdate(jj3.g.f300014d);
        return jz5.f0.f302826a;
    }
}
