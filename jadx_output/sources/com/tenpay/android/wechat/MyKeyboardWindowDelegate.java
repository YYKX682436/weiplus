package com.tenpay.android.wechat;

@kotlin.Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0007*\u00010\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b3\u00104J\b\u0010\u0003\u001a\u00020\u0002H\u0002Jj\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010J\u0006\u0010\u0017\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0010J\u0010\u0010\u001e\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cJ\u000e\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u001fJ\u0006\u0010\"\u001a\u00020\u0015R\u0016\u0010#\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010)R\u0016\u0010+\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u0010,\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/tenpay/android/wechat/MyKeyboardWindowDelegate;", "", "Landroid/view/WindowManager$LayoutParams;", "getWindowLayoutParams", "Landroid/content/Context;", "mContext", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "keyList", "Landroid/view/View$OnTouchListener;", "keyOnTouchListener", "Landroid/view/View$OnClickListener;", "keyOnClickListener", "Lcom/tenpay/android/wechat/MyKeyboardWindow$OnTouchListener;", "keyBoardOnClickListener", "", "width", "height", "x", "y", "Ljz5/f0;", "initWindowDelegateView", "show", "hide", "release", "mode", "setXMode", "Landroid/view/View$AccessibilityDelegate;", "delegate", "setSecureAccessibility", "", "disabled", "setKeyboardDisabled", "resetSecureAccessibility", "showing", "Z", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "windowHeight", "I", "windowWidth", "windowX", "windowY", "Lcom/tenpay/android/wechat/MyKeyboardWindowDelegateView;", "floatWindowKeyBoard", "Lcom/tenpay/android/wechat/MyKeyboardWindowDelegateView;", "com/tenpay/android/wechat/MyKeyboardWindowDelegate$foregroundCallback$1", "foregroundCallback", "Lcom/tenpay/android/wechat/MyKeyboardWindowDelegate$foregroundCallback$1;", "<init>", "()V", "Companion", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class MyKeyboardWindowDelegate {
    private static final java.lang.String TAG = "MicroMsg.MyKeyboardWindowDelegate";
    private com.tenpay.android.wechat.MyKeyboardWindowDelegateView floatWindowKeyBoard;
    private final com.tenpay.android.wechat.MyKeyboardWindowDelegate$foregroundCallback$1 foregroundCallback = new com.tencent.matrix.lifecycle.h() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegate$foregroundCallback$1
        @Override // com.tencent.matrix.lifecycle.h
        public void onEnterForeground() {
            com.tencent.mars.xlog.Log.i("MicroMsg.MyKeyboardWindowDelegate", "onEnterForeground");
            ku5.u0 u0Var = ku5.t0.f312615d;
            final com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = com.tenpay.android.wechat.MyKeyboardWindowDelegate.this;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegate$foregroundCallback$1$onEnterForeground$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView;
                    myKeyboardWindowDelegateView = com.tenpay.android.wechat.MyKeyboardWindowDelegate.this.floatWindowKeyBoard;
                    if (myKeyboardWindowDelegateView != null) {
                        com.tenpay.android.wechat.MyKeyboardWindowDelegate.this.show();
                    }
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 150L, false);
        }

        @Override // com.tencent.matrix.lifecycle.h
        public void onExitForeground() {
            com.tencent.mars.xlog.Log.i("MicroMsg.MyKeyboardWindowDelegate", "onExitForeground");
            ku5.u0 u0Var = ku5.t0.f312615d;
            final com.tenpay.android.wechat.MyKeyboardWindowDelegate myKeyboardWindowDelegate = com.tenpay.android.wechat.MyKeyboardWindowDelegate.this;
            ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tenpay.android.wechat.MyKeyboardWindowDelegate$foregroundCallback$1$onExitForeground$1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView;
                    myKeyboardWindowDelegateView = com.tenpay.android.wechat.MyKeyboardWindowDelegate.this.floatWindowKeyBoard;
                    if (myKeyboardWindowDelegateView != null) {
                        com.tenpay.android.wechat.MyKeyboardWindowDelegate.this.hide();
                    }
                }
            });
        }
    };
    private boolean showing;
    private int windowHeight;
    private android.view.WindowManager windowManager;
    private int windowWidth;
    private int windowX;
    private int windowY;

    private final android.view.WindowManager.LayoutParams getWindowLayoutParams() {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.gravity = 85;
        layoutParams.type = android.os.Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        layoutParams.flags = 8;
        layoutParams.format = 1;
        layoutParams.width = this.windowWidth;
        layoutParams.height = this.windowHeight;
        return layoutParams;
    }

    public final void hide() {
        if (!this.showing || this.floatWindowKeyBoard == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "[hide]");
        try {
            android.view.WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.removeView(this.floatWindowKeyBoard);
            }
            this.showing = false;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "[hide] ，error: " + th6.getMessage());
        }
    }

    public final void initWindowDelegateView(android.content.Context context, java.util.ArrayList<android.view.View> arrayList, android.view.View.OnTouchListener onTouchListener, android.view.View.OnClickListener onClickListener, com.tenpay.android.wechat.MyKeyboardWindow.OnTouchListener onTouchListener2, int i17, int i18, int i19, int i27) {
        this.windowX = i19;
        this.windowY = i27;
        this.windowWidth = i17;
        this.windowHeight = i18;
        java.lang.Object systemService = context != null ? context.getSystemService("window") : null;
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.windowManager = (android.view.WindowManager) systemService;
        this.floatWindowKeyBoard = new com.tenpay.android.wechat.MyKeyboardWindowDelegateView(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initWindowDelegateView] keyList size：");
        sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
        sb6.append(", windowX : ");
        sb6.append(this.windowX);
        sb6.append(", windowY: ");
        sb6.append(this.windowY);
        sb6.append(",windowWidth : ");
        sb6.append(this.windowWidth);
        sb6.append(", windowHeight: ");
        sb6.append(this.windowHeight);
        com.tencent.mars.xlog.Log.i(TAG, sb6.toString());
        com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView = this.floatWindowKeyBoard;
        if (myKeyboardWindowDelegateView != null) {
            myKeyboardWindowDelegateView.initRealKeyBoard(arrayList, onTouchListener, onClickListener, onTouchListener2);
        }
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.addLifecycleCallback(this.foregroundCallback);
    }

    public final void release() {
        com.tencent.mars.xlog.Log.i(TAG, "[release]");
        if (this.showing && this.floatWindowKeyBoard != null) {
            com.tencent.mars.xlog.Log.i(TAG, "[release] do remove keyboard");
            try {
                android.view.WindowManager windowManager = this.windowManager;
                if (windowManager != null) {
                    windowManager.removeView(this.floatWindowKeyBoard);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e(TAG, "[release] remove error : " + th6.getMessage());
            }
        }
        this.showing = false;
        this.floatWindowKeyBoard = null;
        com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.removeLifecycleCallback(this.foregroundCallback);
    }

    public final void resetSecureAccessibility() {
        com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView = this.floatWindowKeyBoard;
        if (myKeyboardWindowDelegateView != null) {
            myKeyboardWindowDelegateView.resetSecureAccessibility();
        }
    }

    public final void setKeyboardDisabled(boolean z17) {
        com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView = this.floatWindowKeyBoard;
        if (myKeyboardWindowDelegateView != null) {
            myKeyboardWindowDelegateView.setKeyboardDisabled(z17);
        }
    }

    public final void setSecureAccessibility(android.view.View.AccessibilityDelegate accessibilityDelegate) {
        com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView = this.floatWindowKeyBoard;
        if (myKeyboardWindowDelegateView != null) {
            myKeyboardWindowDelegateView.setSecureAccessibility(accessibilityDelegate);
        }
    }

    public final void setXMode(int i17) {
        com.tenpay.android.wechat.MyKeyboardWindowDelegateView myKeyboardWindowDelegateView = this.floatWindowKeyBoard;
        if (myKeyboardWindowDelegateView != null) {
            myKeyboardWindowDelegateView.setXMode(i17);
        }
    }

    public final void show() {
        if (this.showing || this.floatWindowKeyBoard == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "[show]");
        try {
            android.view.WindowManager windowManager = this.windowManager;
            if (windowManager != null) {
                windowManager.addView(this.floatWindowKeyBoard, getWindowLayoutParams());
            }
            this.showing = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e(TAG, "[show] ，error: " + th6.getMessage());
        }
    }
}
