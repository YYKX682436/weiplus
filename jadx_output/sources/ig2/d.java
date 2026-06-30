package ig2;

/* loaded from: classes3.dex */
public final class d implements ig2.r {

    /* renamed from: d, reason: collision with root package name */
    public ig2.n f291370d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f291371e;

    @Override // kg2.a
    public void a() {
        ig2.m.f291393a.d();
    }

    @Override // kg2.a
    public void b(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
    }

    @Override // ig2.r
    public ig2.n c() {
        return this.f291370d;
    }

    @Override // kg2.a
    public void d(og2.a switchParams) {
        kotlin.jvm.internal.o.g(switchParams, "switchParams");
    }

    @Override // kg2.b
    public void e(ig2.n switchParams) {
        kotlin.jvm.internal.o.g(switchParams, "switchParams");
        this.f291370d = switchParams;
    }

    @Override // kg2.b
    public void f(com.tencent.mm.live.core.view.LiveVideoView renderView, yz5.l onFirstFrameRenderCallback, yz5.a isDetachInvokeFun) {
        kotlin.jvm.internal.o.g(renderView, "renderView");
        kotlin.jvm.internal.o.g(onFirstFrameRenderCallback, "onFirstFrameRenderCallback");
        kotlin.jvm.internal.o.g(isDetachInvokeFun, "isDetachInvokeFun");
        android.view.TextureView textureView = new android.view.TextureView(renderView.getContext());
        ig2.n nVar = this.f291370d;
        mn0.b0 b0Var = nVar != null ? nVar.f291409h : null;
        renderView.addVideoView(textureView);
        textureView.setSurfaceTextureListener(new ig2.b(this, b0Var, renderView));
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new ig2.c(this, onFirstFrameRenderCallback));
        }
    }

    @Override // ez2.b
    public void g(yz5.a onAnimationEndCallback) {
        kotlin.jvm.internal.o.g(onAnimationEndCallback, "onAnimationEndCallback");
        onAnimationEndCallback.invoke();
    }

    @Override // ez2.b
    public void h() {
    }

    @Override // kg2.b
    public boolean i() {
        return false;
    }
}
