package mx0;

/* loaded from: classes5.dex */
public final class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332200e;

    public o9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, int i17) {
        this.f332199d = shootComposingPluginLayout;
        this.f332200e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        android.view.ViewGroup bottomMenuBarContainer;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332199d;
        rootView = shootComposingPluginLayout.getRootView();
        kotlin.jvm.internal.o.g(rootView, "<this>");
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.g3 a17 = n3.b1.a(rootView);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = a18 != null ? a18.f247047d - a18.f247045b : com.tencent.mm.ui.bl.c(rootView.getContext());
        bottomMenuBarContainer = shootComposingPluginLayout.getBottomMenuBarContainer();
        bottomMenuBarContainer.getLayoutParams().height = this.f332200e + c17;
    }
}
