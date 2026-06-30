package nn0;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.x f338630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.opengl.EGLContext f338631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(nn0.x xVar, android.opengl.EGLContext eGLContext) {
        super(0);
        this.f338630d = xVar;
        this.f338631e = eGLContext;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nn0.x xVar = this.f338630d;
        nn0.o oVar = xVar.f338584b;
        kotlin.jvm.internal.o.e(oVar, "null cannot be cast to non-null type com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener");
        xVar.setVideoRenderListener((com.tencent.rtmp.TXLivePlayer.ITXLivePlayVideoRenderListener) oVar, this.f338631e);
        return jz5.f0.f302826a;
    }
}
