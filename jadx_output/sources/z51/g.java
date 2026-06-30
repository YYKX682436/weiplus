package z51;

/* loaded from: classes10.dex */
public final class g extends z51.x {

    /* renamed from: f, reason: collision with root package name */
    public android.animation.AnimatorSet f470185f;

    /* renamed from: g, reason: collision with root package name */
    public android.animation.AnimatorSet f470186g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(y51.a pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
    }

    @Override // z51.x
    public java.lang.String c() {
        return "MicroMsg.LivePhotoPlayAniPc";
    }

    @Override // z51.x
    public void h() {
        super.h();
        boolean k17 = ((z51.p) a(z51.p.class)).k();
        f("pause >> isPlaying: " + k17);
        if (k17) {
            k();
        }
    }

    @Override // z51.x
    public void j() {
        super.j();
        android.animation.AnimatorSet animatorSet = this.f470185f;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        android.animation.AnimatorSet animatorSet2 = this.f470186g;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
    }

    public final void k() {
        f("aniToThumbView");
        com.tencent.mm.plugin.thumbplayer.view.ThumbPlayerViewContainer thumbPlayerViewContainer = ((z51.p) a(z51.p.class)).f470200g;
        if (thumbPlayerViewContainer == null) {
            kotlin.jvm.internal.o.o("tpPlayerView");
            throw null;
        }
        android.widget.FrameLayout frameLayout = ((z51.p) a(z51.p.class)).f470199f;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("videoViewContainer");
            throw null;
        }
        this.f470186g = new android.animation.AnimatorSet();
        frameLayout.post(new z51.f(thumbPlayerViewContainer, this, frameLayout));
    }
}
