package eh5;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.immersive.ImmersiveBaseChromeView f252965e;

    public l(android.view.View view, com.tencent.mm.ui.immersive.ImmersiveBaseChromeView immersiveBaseChromeView) {
        this.f252964d = view;
        this.f252965e = immersiveBaseChromeView;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f252964d.removeOnAttachStateChangeListener(this);
        com.tencent.mm.ui.immersive.ImmersiveBaseChromeView immersiveBaseChromeView = this.f252965e;
        immersiveBaseChromeView.setVisibility(immersiveBaseChromeView.getDefaultVisibility());
        immersiveBaseChromeView.f208944d = immersiveBaseChromeView.a();
        android.view.View view2 = immersiveBaseChromeView.f208944d;
        if (view2 != null) {
            immersiveBaseChromeView.addView(view2);
        } else {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
