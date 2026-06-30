package xa5;

/* loaded from: classes14.dex */
public final class b extends zb.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f452839a;

    public b(wa5.f fVar, android.app.Activity activity) {
        this.f452839a = activity;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(android.transition.Transition transition) {
        android.app.Activity activity = this.f452839a;
        activity.getWindow().getSharedElementEnterTransition().removeListener(this);
        wa5.d.f444315a.a(activity).f444314f = true;
        com.tencent.mm.sdk.platformtools.u3.h(new xa5.a(activity));
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(android.transition.Transition transition) {
    }
}
