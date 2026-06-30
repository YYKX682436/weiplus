package com.tencent.mm.ui.base;

/* loaded from: classes15.dex */
public class CustomViewPager extends com.tencent.mm.ui.mogic.WxViewPager {
    private static final java.lang.String TAG = "MicroMsg.CustomViewPager";
    private boolean mCanSlide;
    private boolean mCanSlideBySide;
    private al5.g3 mSwipeBackListener;

    public CustomViewPager(android.content.Context context) {
        super(context);
        this.mCanSlide = true;
        this.mCanSlideBySide = true;
        this.mSwipeBackListener = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        al5.g3 g3Var = this.mSwipeBackListener;
        if (g3Var != null && g3Var.enableSwipeBack()) {
            if (!this.mSwipeBackListener.d0()) {
                this.mSwipeBackListener.a(motionEvent);
            } else {
                if (this.mSwipeBackListener.e() == 1) {
                    this.mSwipeBackListener.a(motionEvent);
                    return true;
                }
                if (this.mSwipeBackListener.d(motionEvent)) {
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean isCanSlide() {
        return this.mCanSlide;
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager
    public boolean isGutterDrag(float f17, float f18) {
        if (this.mCanSlideBySide) {
            return super.isGutterDrag(f17, f18);
        }
        return false;
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "get a Exception", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.tencent.mm.ui.mogic.WxViewPager, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!this.mCanSlide) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "get a Exception", new java.lang.Object[0]);
            return false;
        }
    }

    public void setCanSlide(boolean z17) {
        this.mCanSlide = z17;
    }

    public void setCanSlideBySide(boolean z17) {
        this.mCanSlideBySide = z17;
    }

    public void setSwipeBackListener(al5.g3 g3Var) {
        this.mSwipeBackListener = g3Var;
    }

    public CustomViewPager(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCanSlide = true;
        this.mCanSlideBySide = true;
        this.mSwipeBackListener = null;
    }
}
