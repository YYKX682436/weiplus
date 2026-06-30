package io.flutter.plugin.platform;

/* loaded from: classes7.dex */
class SingleViewPresentation extends android.app.Presentation {
    private static final java.lang.String TAG = "PlatformViewsController";
    private final io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate;
    private android.widget.FrameLayout container;
    private final android.view.View.OnFocusChangeListener focusChangeListener;
    private final android.content.Context outerContext;
    private io.flutter.plugin.platform.SingleViewPresentation.AccessibilityDelegatingFrameLayout rootView;
    private boolean startFocused;
    private final io.flutter.plugin.platform.SingleViewPresentation.PresentationState state;
    private int viewId;

    /* loaded from: classes7.dex */
    public static class AccessibilityDelegatingFrameLayout extends android.widget.FrameLayout {
        private final io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate;
        private final android.view.View embeddedView;

        public AccessibilityDelegatingFrameLayout(android.content.Context context, io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate, android.view.View view) {
            super(context);
            this.accessibilityEventsDelegate = accessibilityEventsDelegate;
            this.embeddedView = view;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public boolean requestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
            return this.accessibilityEventsDelegate.requestSendAccessibilityEvent(this.embeddedView, view, accessibilityEvent);
        }
    }

    /* loaded from: classes7.dex */
    public static class ImmContext extends android.content.ContextWrapper {
        private final android.view.inputmethod.InputMethodManager inputMethodManager;

        public ImmContext(android.content.Context context) {
            this(context, null);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public android.content.Context createDisplayContext(android.view.Display display) {
            return new io.flutter.plugin.platform.SingleViewPresentation.ImmContext(super.createDisplayContext(display), this.inputMethodManager);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String str) {
            return "input_method".equals(str) ? this.inputMethodManager : super.getSystemService(str);
        }

        private ImmContext(android.content.Context context, android.view.inputmethod.InputMethodManager inputMethodManager) {
            super(context);
            this.inputMethodManager = inputMethodManager == null ? (android.view.inputmethod.InputMethodManager) context.getSystemService("input_method") : inputMethodManager;
        }
    }

    /* loaded from: classes7.dex */
    public static class PresentationContext extends android.content.ContextWrapper {
        private final android.content.Context flutterAppWindowContext;
        private android.view.WindowManager windowManager;
        private final io.flutter.plugin.platform.WindowManagerHandler windowManagerHandler;

        public PresentationContext(android.content.Context context, io.flutter.plugin.platform.WindowManagerHandler windowManagerHandler, android.content.Context context2) {
            super(context);
            this.windowManagerHandler = windowManagerHandler;
            this.flutterAppWindowContext = context2;
        }

        private android.view.WindowManager getWindowManager() {
            if (this.windowManager == null) {
                this.windowManager = this.windowManagerHandler;
            }
            return this.windowManager;
        }

        private boolean isCalledFromAlertDialog() {
            java.lang.StackTraceElement[] stackTrace = java.lang.Thread.currentThread().getStackTrace();
            for (int i17 = 0; i17 < stackTrace.length && i17 < 11; i17++) {
                if (stackTrace[i17].getClassName().equals(android.app.AlertDialog.class.getCanonicalName()) && stackTrace[i17].getMethodName().equals("<init>")) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public java.lang.Object getSystemService(java.lang.String str) {
            return "window".equals(str) ? isCalledFromAlertDialog() ? this.flutterAppWindowContext.getSystemService(str) : getWindowManager() : super.getSystemService(str);
        }
    }

    /* loaded from: classes7.dex */
    public static class PresentationState {
        private io.flutter.plugin.platform.SingleViewFakeWindowViewGroup fakeWindowViewGroup;
        private io.flutter.plugin.platform.PlatformView platformView;
        private io.flutter.plugin.platform.WindowManagerHandler windowManagerHandler;
    }

    public SingleViewPresentation(android.content.Context context, android.view.Display display, io.flutter.plugin.platform.PlatformView platformView, io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate, int i17, android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super(new io.flutter.plugin.platform.SingleViewPresentation.ImmContext(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewId = i17;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        io.flutter.plugin.platform.SingleViewPresentation.PresentationState presentationState = new io.flutter.plugin.platform.SingleViewPresentation.PresentationState();
        this.state = presentationState;
        presentationState.platformView = platformView;
        getWindow().setFlags(8, 8);
        getWindow().setType(2030);
    }

    public io.flutter.plugin.platform.SingleViewPresentation.PresentationState detachState() {
        android.widget.FrameLayout frameLayout = this.container;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        io.flutter.plugin.platform.SingleViewPresentation.AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = this.rootView;
        if (accessibilityDelegatingFrameLayout != null) {
            accessibilityDelegatingFrameLayout.removeAllViews();
        }
        return this.state;
    }

    public io.flutter.plugin.platform.PlatformView getView() {
        return this.state.platformView;
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        if (this.state.fakeWindowViewGroup == null) {
            this.state.fakeWindowViewGroup = new io.flutter.plugin.platform.SingleViewFakeWindowViewGroup(getContext());
        }
        if (this.state.windowManagerHandler == null) {
            android.view.WindowManager windowManager = (android.view.WindowManager) getContext().getSystemService("window");
            io.flutter.plugin.platform.SingleViewPresentation.PresentationState presentationState = this.state;
            presentationState.windowManagerHandler = new io.flutter.plugin.platform.WindowManagerHandler(windowManager, presentationState.fakeWindowViewGroup);
        }
        this.container = new android.widget.FrameLayout(getContext());
        io.flutter.plugin.platform.SingleViewPresentation.PresentationContext presentationContext = new io.flutter.plugin.platform.SingleViewPresentation.PresentationContext(getContext(), this.state.windowManagerHandler, this.outerContext);
        android.view.View view = this.state.platformView.getView();
        if (view.getContext() instanceof android.content.MutableContextWrapper) {
            ((android.content.MutableContextWrapper) view.getContext()).setBaseContext(presentationContext);
        } else {
            io.flutter.Log.w(TAG, "Unexpected platform view context for view ID " + this.viewId + "; some functionality may not work correctly. When constructing a platform view in the factory, ensure that the view returned from PlatformViewFactory#create returns the provided context from getContext(). If you are unable to associate the view with that context, consider using Hybrid Composition instead.");
        }
        this.container.addView(view);
        io.flutter.plugin.platform.SingleViewPresentation.AccessibilityDelegatingFrameLayout accessibilityDelegatingFrameLayout = new io.flutter.plugin.platform.SingleViewPresentation.AccessibilityDelegatingFrameLayout(getContext(), this.accessibilityEventsDelegate, view);
        this.rootView = accessibilityDelegatingFrameLayout;
        accessibilityDelegatingFrameLayout.addView(this.container);
        this.rootView.addView(this.state.fakeWindowViewGroup);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        setContentView(this.rootView);
    }

    public SingleViewPresentation(android.content.Context context, android.view.Display display, io.flutter.plugin.platform.AccessibilityEventsDelegate accessibilityEventsDelegate, io.flutter.plugin.platform.SingleViewPresentation.PresentationState presentationState, android.view.View.OnFocusChangeListener onFocusChangeListener, boolean z17) {
        super(new io.flutter.plugin.platform.SingleViewPresentation.ImmContext(context), display);
        this.startFocused = false;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.state = presentationState;
        this.focusChangeListener = onFocusChangeListener;
        this.outerContext = context;
        getWindow().setFlags(8, 8);
        this.startFocused = z17;
    }
}
