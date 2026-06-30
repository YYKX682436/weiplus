package cw2;

/* loaded from: classes15.dex */
public final class o extends com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final /* synthetic */ int r0(cw2.o oVar) {
        super.w();
        return 0;
    }

    public final void A0(java.lang.String str, java.lang.Runnable runnable) {
        if (java.lang.Thread.currentThread().getId() != android.os.Looper.getMainLooper().getThread().getId()) {
            runnable.run();
            return;
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        ((ku5.t0) u0Var).h(new cw2.b(runnable), "FinderAsyncVideoView#" + hashCode());
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, cw2.da
    public boolean F() {
        A0("prepareToPlay", new cw2.g(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, cw2.da
    public void G() {
        A0("prepareforReuse", new cw2.h(this));
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean J(java.lang.Integer num) {
        A0("startOrPlay", new cw2.m(this, num));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean a(double d17, boolean z17) {
        A0("seekTo", new cw2.i(this, d17, z17));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, cw2.da
    public /* bridge */ /* synthetic */ android.widget.ImageView getCoverImage() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean pause() {
        A0("pause", new cw2.d(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean play() {
        A0(com.tencent.tav.core.AssetExtension.SCENE_PLAY, new cw2.f(this));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy
    public void q(int i17) {
        cw2.c cVar = new cw2.c(this, i17);
        if (java.lang.Thread.currentThread().getId() == android.os.Looper.getMainLooper().getThread().getId()) {
            cVar.run();
        } else {
            ((ku5.t0) ku5.t0.f312615d).B(cVar).get();
        }
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public boolean r(double d17, boolean z17, int i17) {
        A0("seekTo", new cw2.j(this, d17, z17, i17));
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public void setCustomSurfaceTexture(android.graphics.SurfaceTexture texture) {
        kotlin.jvm.internal.o.g(texture, "texture");
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public void setLoop(boolean z17) {
        A0("setLoop", new cw2.k(this, z17));
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public void setMute(boolean z17) {
        A0("setMute", new cw2.l(this, z17));
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, zy2.g5
    public void stop() {
        A0("stop", new cw2.n(this));
    }

    @Override // com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy, cw2.da
    public int w() {
        A0("pauseWithCancel", new cw2.e(this));
        return 0;
    }
}
