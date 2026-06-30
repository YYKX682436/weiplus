package y;

/* loaded from: classes16.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ android.view.View C;
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout D;
    public final /* synthetic */ mi2.h E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(android.view.View view, com.tencent.mm.plugin.finder.live.view.FinderLiveInterceptRelativeLayout finderLiveInterceptRelativeLayout, mi2.h hVar) {
        super(0);
        this.C = view;
        this.D = finderLiveInterceptRelativeLayout;
        this.E = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewPropertyAnimator translationX;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        float width = this.D.getWidth();
        android.view.View view = this.C;
        view.setTranslationX(width);
        mi2.h hVar = this.E;
        hVar.X(true);
        android.view.ViewPropertyAnimator animate = view.animate();
        if (animate == null || (translationX = animate.translationX(0.0f)) == null || (duration = translationX.setDuration(300L)) == null || (withEndAction = duration.withEndAction(new y.n2(hVar))) == null) {
            return null;
        }
        withEndAction.start();
        return jz5.f0.f302826a;
    }
}
