package re5;

/* loaded from: classes10.dex */
public final class l0 extends lf3.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // lf3.c0
    public void Z6(com.tencent.mm.plugin.media.view.gesture.XGestureInterceptorView gestureInterceptorView) {
        kotlin.jvm.internal.o.g(gestureInterceptorView, "gestureInterceptorView");
        mg3.m mVar = new mg3.m();
        mVar.a(new ng3.n(getContext()));
        mVar.a(new ng3.k(getContext()));
        mVar.a(new ng3.r(getContext()));
        gestureInterceptorView.setupCoordinator(mVar);
    }
}
