package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class MailMMWebView extends com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi implements com.tencent.mm.plugin.webview.ui.tools.widget.e2 {
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f187052J;
    public android.view.View K;
    public boolean L;
    public boolean M;
    public float N;
    public float P;

    public MailMMWebView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getViewHeightWithTitleBar() {
        int height = getHeight();
        return (!isHorizontalScrollBarEnabled() || F()) ? height : height - getHorizontalScrollbarHeight();
    }

    private void setEmbeddedTitleBarSinceJellyBean(android.view.View view) {
        if (view != null) {
            android.view.View view2 = this.f187052J;
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            this.f187052J = new com.tencent.mm.plugin.webview.ui.tools.widget.a6(this, getContext());
            ((com.tencent.mm.plugin.webview.ui.tools.widget.a6) this.f187052J).addView(view, new android.widget.FrameLayout.LayoutParams(-1, -2));
            this.f187052J.setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478553an));
            addView(this.f187052J, layoutParams);
        }
    }

    @Override // com.tencent.mm.ui.widget.MMWebView, com.tencent.xweb.WebView
    public void A0(int i17, int i18, int i19, int i27) {
        int contentHeight = (int) (getContentHeight() * getScale());
        int height = getHeight() + i18;
        super.A0(i17, i18, i19, i27);
        invalidate();
        int i28 = contentHeight - height;
        if (i28 < getBottomHeight()) {
            if (java.lang.Math.abs(i28) > 20) {
                J0();
                I0(false);
            } else {
                I0(true);
            }
        }
        if (getVisibleTitleHeight() == 0) {
            K0();
        }
    }

    public void I0(boolean z17) {
        android.view.View view = this.K;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "showBottomBar", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public void J0() {
        evaluateJavascript("javascript:_updateBottomBarHeight(" + ((int) (getBottomHeight() / getScale())) + ");", null);
    }

    public void K0() {
        evaluateJavascript("javascript:_updateTitleBarHeight(" + ((int) (getTitleHeight() / getScale())) + ");", null);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return getViewHeightWithTitleBar() - getVisibleTitleBarHeight();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return java.lang.Math.max(getWebScrollY() - getTitleHeight(), 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        int webScrollY = getWebScrollY();
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.N = x17;
            this.P = y17;
            if (this.f187052J == null || ((int) y17) >= getVisibleTitleBarHeight()) {
                android.view.View view = this.K;
                if (view != null && view.getVisibility() == 0 && this.P + getBottomHeight() > getHeight()) {
                    this.M = true;
                }
            } else {
                this.L = true;
            }
        } else if (action == 2 && java.lang.Math.abs(y17 - this.P) > 50.0f && this.L) {
            motionEvent.setAction(3);
            motionEvent.setLocation(this.N, this.P + webScrollY);
            this.f187052J.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(0);
            motionEvent.setLocation(this.N, this.P);
            super.dispatchTouchEvent(motionEvent);
            motionEvent.setAction(2);
            motionEvent.setLocation(x17, y17);
        }
        if (this.L && this.f187052J != null) {
            motionEvent.setLocation(x17, y17 + webScrollY);
            return this.f187052J.dispatchTouchEvent(motionEvent);
        }
        if (!this.M || this.K == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        motionEvent.setLocation(x17, (y17 + getBottomHeight()) - getHeight());
        return this.K.dispatchTouchEvent(motionEvent);
    }

    @Override // com.tencent.xweb.WebView, android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        if (view != this.f187052J) {
            return super.drawChild(canvas, view, j17);
        }
        int webScrollY = getWebScrollY();
        canvas.save();
        canvas.translate(0.0f, -webScrollY);
        boolean drawChild = super.drawChild(canvas, view, j17);
        canvas.restore();
        return drawChild;
    }

    public int getBottomHeight() {
        android.view.View view = this.K;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public int getTitleHeight() {
        android.view.View view = this.f187052J;
        if (view != null) {
            return view.getHeight();
        }
        return 0;
    }

    public int getVisibleTitleBarHeight() {
        return java.lang.Math.max(getTitleHeight() - getWebScrollY(), 0);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.MMWebViewWithJsApi, com.tencent.xweb.WebView, tx5.f
    public void loadDataWithBaseURL(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.I = true;
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.e2
    public void setEmbeddedBottomBar(android.view.View view) {
        if (view != null) {
            android.view.View view2 = this.K;
            if (view2 != null) {
                removeView(view2);
            }
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2, 80);
            this.K = new com.tencent.mm.plugin.webview.ui.tools.widget.a6(this, getContext());
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
            ((com.tencent.mm.plugin.webview.ui.tools.widget.a6) this.K).addView(view, layoutParams3);
            addView(this.K, layoutParams);
            android.view.View view3 = this.K;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "setEmbeddedBottomBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/webview/ui/tools/widget/MailMMWebView", "setEmbeddedBottomBar", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.webview.ui.tools.widget.e2
    public void setEmbeddedTitleBarCompat(android.view.View view) {
        setEmbeddedTitleBarSinceJellyBean(view);
    }

    public MailMMWebView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
