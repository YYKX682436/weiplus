package sc2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f406223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(sc2.h1 h1Var) {
        super(0);
        this.f406223d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sc2.h1 h1Var = this.f406223d;
        android.animation.AnimatorSet animatorSet = h1Var.f405933y0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        h1Var.f405933y0 = null;
        android.view.View view = h1Var.X;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$dismissLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/CrossPlatformCardJumperObserver$dismissLoading$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.finder.video.FinderHorizontalLongVideoPlayerSeekBar finderHorizontalLongVideoPlayerSeekBar = h1Var.U;
        if (finderHorizontalLongVideoPlayerSeekBar != null) {
            finderHorizontalLongVideoPlayerSeekBar.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}
