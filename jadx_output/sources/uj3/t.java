package uj3;

/* loaded from: classes9.dex */
public final class t implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.z f428348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428349e;

    public t(uj3.z zVar, java.lang.String str) {
        this.f428348d = zVar;
        this.f428349e = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        uj3.z zVar = this.f428348d;
        android.widget.ImageView imageView = zVar.f428397d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        zVar.f428407n = false;
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView = zVar.f428396c;
        if (voIPRenderTextureView != null) {
            voIPRenderTextureView.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.voip.video.render.VoIPRenderTextureView voIPRenderTextureView2 = zVar.f428396c;
        if (voIPRenderTextureView2 == null) {
            return;
        }
        voIPRenderTextureView2.setVisibility(0);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        uj3.z zVar = this.f428348d;
        android.widget.RelativeLayout relativeLayout = zVar.f428394a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.content.Context context = zVar.f428403j;
        sb6.append(context != null ? context.getString(com.tencent.mm.R.string.b6r) : null);
        sb6.append(',');
        sb6.append(((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.f428349e, true).P0());
        relativeLayout.setContentDescription(sb6.toString());
    }
}
