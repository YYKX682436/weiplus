package lk5;

/* loaded from: classes14.dex */
public final class e extends androidx.appcompat.app.b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.vas.VASActivity f319027a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f319028b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f319029c;

    public e(com.tencent.mm.ui.vas.VASActivity vasActivity) {
        kotlin.jvm.internal.o.g(vasActivity, "vasActivity");
        this.f319027a = vasActivity;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(vasActivity.get_activity());
        this.f319028b = frameLayout;
        frameLayout.setId(com.tencent.mm.R.id.hvf);
    }

    @Override // androidx.appcompat.app.b
    public void B(boolean z17) {
    }

    @Override // androidx.appcompat.app.b
    public void C(int i17) {
    }

    @Override // androidx.appcompat.app.b
    public void D(boolean z17) {
    }

    @Override // androidx.appcompat.app.b
    public void E(boolean z17) {
    }

    @Override // androidx.appcompat.app.b
    public void F(boolean z17) {
    }

    @Override // androidx.appcompat.app.b
    public void G(float f17) {
    }

    @Override // androidx.appcompat.app.b
    public void H(int i17) {
    }

    @Override // androidx.appcompat.app.b
    public void I(android.graphics.drawable.Drawable drawable) {
    }

    @Override // androidx.appcompat.app.b
    public void L() {
        this.f319027a._showActionBar();
    }

    @Override // androidx.appcompat.app.b
    public android.view.View j() {
        return this.f319029c;
    }

    @Override // androidx.appcompat.app.b
    public int k() {
        return 0;
    }

    @Override // androidx.appcompat.app.b
    public int l() {
        return 0;
    }

    @Override // androidx.appcompat.app.b
    public java.lang.CharSequence n() {
        return "";
    }

    @Override // androidx.appcompat.app.b
    public void o() {
        this.f319027a._hideActionBar();
    }

    @Override // androidx.appcompat.app.b
    public boolean q() {
        return this.f319028b.getVisibility() == 0;
    }

    @Override // androidx.appcompat.app.b
    public void w(android.graphics.drawable.Drawable drawable) {
        this.f319028b.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.app.b
    public void x(int i17) {
    }

    @Override // androidx.appcompat.app.b
    public void y(android.view.View view) {
        android.view.View view2 = this.f319029c;
        android.view.ViewGroup viewGroup = this.f319028b;
        if (view2 != null) {
            viewGroup.removeView(view2);
        }
        if (view != null) {
            viewGroup.addView(view);
        }
        this.f319029c = view;
    }

    @Override // androidx.appcompat.app.b
    public void z(android.view.View view, androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
    }
}
