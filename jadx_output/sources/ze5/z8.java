package ze5;

/* loaded from: classes9.dex */
public final class z8 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f472352b;

    public final ze5.z8 a(android.view.View view, com.tencent.mm.mvvm.MvvmView mvvmView) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.uma);
        if (frameLayout != null && mvvmView != null) {
            this.f472352b = mvvmView;
            frameLayout.addView(mvvmView);
        }
        return this;
    }
}
