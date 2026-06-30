package com.tencent.mm.view.popview;

/* loaded from: classes14.dex */
public abstract class AbstractPopView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public gn5.a f213671d;

    /* renamed from: e, reason: collision with root package name */
    public int f213672e;

    public AbstractPopView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213672e = 0;
    }

    private android.app.Activity b(android.content.Context context) {
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        if (context instanceof android.view.ContextThemeWrapper) {
            return b(((android.view.ContextThemeWrapper) context).getBaseContext());
        }
        return null;
    }

    public void a() {
        gn5.a aVar = this.f213671d;
        if (aVar != null) {
            aVar.onDismiss();
        }
    }

    public void c(android.content.Context context) {
        android.app.Activity b17 = b(context);
        this.f213672e = 0;
        if (b17 != null) {
            android.view.View findViewById = b17.findViewById(android.R.id.content);
            int[] iArr = new int[2];
            int[] iArr2 = new int[2];
            findViewById.getLocationOnScreen(iArr);
            findViewById.getLocationInWindow(iArr2);
            this.f213672e = iArr[1] - iArr2[1];
        }
    }

    public abstract void d(android.view.View view);

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(keyEvent) || keyEvent.isCanceled()) {
                return super.dispatchKeyEvent(keyEvent);
            }
            a();
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public abstract android.view.WindowManager.LayoutParams getWindowLayoutParams();

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        if (motionEvent.getAction() == 0 && (x17 < 0 || x17 >= getWidth() || y17 < 0 || y17 >= getHeight())) {
            a();
            return true;
        }
        if (motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        a();
        return true;
    }

    public void setOnDismissCallback(gn5.a aVar) {
        this.f213671d = aVar;
    }

    public AbstractPopView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213672e = 0;
    }
}
