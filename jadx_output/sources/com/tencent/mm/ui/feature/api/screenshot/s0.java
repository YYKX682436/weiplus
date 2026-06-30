package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes15.dex */
public final class s0 implements android.view.Window.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.Window.Callback f208549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.Window.Callback f208550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208551f;

    public s0(android.view.Window.Callback callback, com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208550e = callback;
        this.f208551f = j1Var;
        this.f208549d = callback;
    }

    @Override // android.view.Window.Callback
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent motionEvent) {
        return this.f208549d.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return this.f208549d.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent keyEvent) {
        return this.f208549d.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.f208549d.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "user cancelled, hideShareTongue");
            com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = this.f208551f;
            j1Var.Ai();
            java.lang.ref.WeakReference weakReference = j1Var.f208502h;
            j1Var.Di(weakReference != null ? (android.app.Activity) weakReference.get() : null);
        }
        return this.f208550e.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public boolean dispatchTrackballEvent(android.view.MotionEvent motionEvent) {
        return this.f208549d.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public void onActionModeFinished(android.view.ActionMode actionMode) {
        this.f208549d.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onActionModeStarted(android.view.ActionMode actionMode) {
        this.f208549d.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public void onAttachedToWindow() {
        this.f208549d.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public void onContentChanged() {
        this.f208549d.onContentChanged();
    }

    @Override // android.view.Window.Callback
    public boolean onCreatePanelMenu(int i17, android.view.Menu p17) {
        kotlin.jvm.internal.o.g(p17, "p1");
        return this.f208549d.onCreatePanelMenu(i17, p17);
    }

    @Override // android.view.Window.Callback
    public android.view.View onCreatePanelView(int i17) {
        return this.f208549d.onCreatePanelView(i17);
    }

    @Override // android.view.Window.Callback
    public void onDetachedFromWindow() {
        this.f208549d.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public boolean onMenuItemSelected(int i17, android.view.MenuItem p17) {
        kotlin.jvm.internal.o.g(p17, "p1");
        return this.f208549d.onMenuItemSelected(i17, p17);
    }

    @Override // android.view.Window.Callback
    public boolean onMenuOpened(int i17, android.view.Menu p17) {
        kotlin.jvm.internal.o.g(p17, "p1");
        return this.f208549d.onMenuOpened(i17, p17);
    }

    @Override // android.view.Window.Callback
    public void onPanelClosed(int i17, android.view.Menu p17) {
        kotlin.jvm.internal.o.g(p17, "p1");
        this.f208549d.onPanelClosed(i17, p17);
    }

    @Override // android.view.Window.Callback
    public boolean onPreparePanel(int i17, android.view.View view, android.view.Menu p27) {
        kotlin.jvm.internal.o.g(p27, "p2");
        return this.f208549d.onPreparePanel(i17, view, p27);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested() {
        return this.f208549d.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams layoutParams) {
        this.f208549d.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public void onWindowFocusChanged(boolean z17) {
        this.f208549d.onWindowFocusChanged(z17);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback) {
        return this.f208549d.onWindowStartingActionMode(callback);
    }

    @Override // android.view.Window.Callback
    public boolean onSearchRequested(android.view.SearchEvent searchEvent) {
        return this.f208549d.onSearchRequested(searchEvent);
    }

    @Override // android.view.Window.Callback
    public android.view.ActionMode onWindowStartingActionMode(android.view.ActionMode.Callback callback, int i17) {
        return this.f208549d.onWindowStartingActionMode(callback, i17);
    }
}
