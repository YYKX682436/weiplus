package lk5;

/* loaded from: classes14.dex */
public final class p0 extends android.view.Window {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f319058a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.Fragment f319059b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f319060c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(android.app.Activity activity, androidx.fragment.app.Fragment fragment) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f319058a = activity;
        this.f319059b = fragment;
        this.f319060c = jz5.h.b(new lk5.o0(this));
    }

    @Override // android.view.Window
    public void addContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
    }

    @Override // android.view.Window
    public void closeAllPanels() {
    }

    @Override // android.view.Window
    public void closePanel(int i17) {
    }

    @Override // android.view.Window
    public android.view.View getCurrentFocus() {
        return this.f319058a.getWindow().getCurrentFocus();
    }

    @Override // android.view.Window
    public android.view.View getDecorView() {
        android.view.View view = this.f319059b.getView();
        return view == null ? (android.view.View) ((jz5.n) this.f319060c).getValue() : view;
    }

    @Override // android.view.Window
    public android.view.WindowInsetsController getInsetsController() {
        return android.os.Build.VERSION.SDK_INT >= 30 ? new lk5.n0(this) : super.getInsetsController();
    }

    @Override // android.view.Window
    public android.view.LayoutInflater getLayoutInflater() {
        android.view.LayoutInflater layoutInflater = this.f319058a.getWindow().getLayoutInflater();
        kotlin.jvm.internal.o.f(layoutInflater, "getLayoutInflater(...)");
        return layoutInflater;
    }

    @Override // android.view.Window
    public int getNavigationBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public int getStatusBarColor() {
        return 0;
    }

    @Override // android.view.Window
    public int getVolumeControlStream() {
        return 0;
    }

    @Override // android.view.Window
    public android.view.WindowManager getWindowManager() {
        android.view.WindowManager windowManager = this.f319058a.getWindowManager();
        kotlin.jvm.internal.o.f(windowManager, "getWindowManager(...)");
        return windowManager;
    }

    @Override // android.view.Window
    public void invalidatePanelMenu(int i17) {
    }

    @Override // android.view.Window
    public boolean isFloating() {
        return false;
    }

    @Override // android.view.Window
    public boolean isShortcutKey(int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window
    public void onActive() {
    }

    @Override // android.view.Window
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
    }

    @Override // android.view.Window
    public void openPanel(int i17, android.view.KeyEvent keyEvent) {
    }

    @Override // android.view.Window
    public android.view.View peekDecorView() {
        return (android.view.View) ((jz5.n) this.f319060c).getValue();
    }

    @Override // android.view.Window
    public boolean performContextMenuIdentifierAction(int i17, int i18) {
        return false;
    }

    @Override // android.view.Window
    public boolean performPanelIdentifierAction(int i17, int i18, int i19) {
        return false;
    }

    @Override // android.view.Window
    public boolean performPanelShortcut(int i17, int i18, android.view.KeyEvent keyEvent, int i19) {
        return false;
    }

    @Override // android.view.Window
    public void restoreHierarchyState(android.os.Bundle bundle) {
    }

    @Override // android.view.Window
    public android.os.Bundle saveHierarchyState() {
        return new android.os.Bundle();
    }

    @Override // android.view.Window
    public void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // android.view.Window
    public void setChildDrawable(int i17, android.graphics.drawable.Drawable drawable) {
    }

    @Override // android.view.Window
    public void setChildInt(int i17, int i18) {
    }

    @Override // android.view.Window
    public void setContentView(int i17) {
    }

    @Override // android.view.Window
    public void setDecorCaptionShade(int i17) {
    }

    @Override // android.view.Window
    public void setFeatureDrawable(int i17, android.graphics.drawable.Drawable drawable) {
    }

    @Override // android.view.Window
    public void setFeatureDrawableAlpha(int i17, int i18) {
    }

    @Override // android.view.Window
    public void setFeatureDrawableResource(int i17, int i18) {
    }

    @Override // android.view.Window
    public void setFeatureDrawableUri(int i17, android.net.Uri uri) {
    }

    @Override // android.view.Window
    public void setFeatureInt(int i17, int i18) {
    }

    @Override // android.view.Window
    public void setNavigationBarColor(int i17) {
    }

    @Override // android.view.Window
    public void setResizingCaptionDrawable(android.graphics.drawable.Drawable drawable) {
    }

    @Override // android.view.Window
    public void setStatusBarColor(int i17) {
    }

    @Override // android.view.Window
    public void setTitle(java.lang.CharSequence charSequence) {
    }

    @Override // android.view.Window
    public void setTitleColor(int i17) {
    }

    @Override // android.view.Window
    public void setVolumeControlStream(int i17) {
    }

    @Override // android.view.Window
    public boolean superDispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window
    public boolean superDispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window
    public boolean superDispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window
    public boolean superDispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window
    public boolean superDispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window
    public void takeInputQueue(android.view.InputQueue.Callback callback) {
    }

    @Override // android.view.Window
    public void takeKeyEvents(boolean z17) {
    }

    @Override // android.view.Window
    public void takeSurface(android.view.SurfaceHolder.Callback2 callback2) {
    }

    @Override // android.view.Window
    public void togglePanel(int i17, android.view.KeyEvent keyEvent) {
    }

    @Override // android.view.Window
    public void setContentView(android.view.View view) {
    }

    @Override // android.view.Window
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
    }
}
