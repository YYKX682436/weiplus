package com.tencent.mm.ui.widget;

/* loaded from: classes14.dex */
public class MMNeat7extView extends com.tencent.neattextview.textview.view.NeatTextView {
    public static boolean S;
    public static final java.lang.String T = "^[\\u0001-\\u00b7\\u4E00-\\u9FA5\\ue001-\\ue537\\u2005-\\u2027\\u3001-\\u3011\\uff01-\\uffe5\\u2100-\\u2900[\\ud83c\\udc00-\\ud83c\\udfff]|[\\ud83d\\udc00-\\ud83d\\udfff]]+$".substring(1, com.tencent.mm.plugin.appbrand.jsapi.pay.a2.CTRL_INDEX);
    public static boolean U = true;
    public android.view.GestureDetector M;
    public android.view.View.OnLongClickListener N;
    public al5.v1 P;
    public al5.w1 Q;
    public final android.view.View.AccessibilityDelegate R;

    public MMNeat7extView(android.content.Context context) {
        super(context);
        this.R = new al5.u1(this);
        n();
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView
    public void b(java.lang.CharSequence charSequence) {
        al5.w1 w1Var;
        try {
            super.b(charSequence);
            if (this.f215178e && (w1Var = this.Q) != null) {
                charSequence.toString();
                w1Var.getClass();
            }
            setContentDescription(charSequence);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.tencent.mars.xlog.Log.e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", replaceAll, e17);
            al5.w1 w1Var2 = this.Q;
            if (w1Var2 == null) {
                throw e17;
            }
            ((com.tencent.mm.ui.chatting.viewitems.vn) w1Var2).a(e17, replaceAll, "_setText");
        }
        al5.v1 v1Var = this.P;
        if (v1Var != null) {
            v1Var.a(charSequence, charSequence instanceof android.text.Spannable ? android.widget.TextView.BufferType.SPANNABLE : android.widget.TextView.BufferType.NORMAL);
        }
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView
    public void c(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType, java.lang.Boolean bool) {
        al5.w1 w1Var;
        try {
            super.c(charSequence, bufferType, bool);
            if (this.f215178e && (w1Var = this.Q) != null) {
                charSequence.toString();
                w1Var.getClass();
            }
            setContentDescription(charSequence);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.tencent.mars.xlog.Log.e("MicroMsg.MMNeat7extView", "[_setText] replaceContent:%s exception:%s", replaceAll, e17);
            al5.w1 w1Var2 = this.Q;
            if (w1Var2 == null) {
                throw e17;
            }
            ((com.tencent.mm.ui.chatting.viewitems.vn) w1Var2).a(e17, replaceAll, "_setText");
        }
        al5.v1 v1Var = this.P;
        if (v1Var != null) {
            v1Var.a(charSequence, bufferType);
        }
    }

    @Override // android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return android.widget.TextView.class.getName();
    }

    @Override // android.view.View
    public java.lang.CharSequence getContentDescription() {
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        return ((accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) || z65.c.a()) ? a() : "";
    }

    public int getSelectionEnd() {
        return android.text.Selection.getSelectionEnd(a());
    }

    public int getSelectionStart() {
        return android.text.Selection.getSelectionStart(a());
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView, com.tencent.neattextview.textview.view.a
    public float getVerticalOffset() {
        if (!S) {
            return super.getVerticalOffset();
        }
        float verticalOffset = super.getVerticalOffset();
        getMeasuredHeight();
        return verticalOffset;
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView
    public boolean h() {
        return U;
    }

    public final void n() {
        this.M = new android.view.GestureDetector(getContext(), new al5.s1(this), new android.os.Handler(android.os.Looper.getMainLooper()));
        setAccessibilityDelegate(this.R);
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.tencent.mars.xlog.Log.e("MicroMsg.MMNeat7extView", "[onDraw] replaceContent:%s exception:%s", replaceAll, e17);
            if (this.Q == null) {
                throw e17;
            }
            ((com.tencent.mm.ui.chatting.viewitems.vn) this.Q).a(e17, replaceAll, "onDraw");
        }
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView, android.view.View
    public void onMeasure(int i17, int i18) {
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Exception e17) {
            java.lang.String replaceAll = a().toString().replaceAll(T, "*");
            com.tencent.mars.xlog.Log.e("MicroMsg.MMNeat7extView", "[onMeasure] replaceContent:%s exception:%s", replaceAll, e17);
            if (this.Q == null) {
                throw e17;
            }
            ((com.tencent.mm.ui.chatting.viewitems.vn) this.Q).a(e17, replaceAll, "onMeasure");
        }
    }

    @Override // com.tencent.neattextview.textview.view.NeatTextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (!U || (this.f215178e && this.M != null)) {
            android.view.GestureDetector gestureDetector = this.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(motionEvent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/widget/MMNeat7extView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/ui/widget/MMNeat7extView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable drawable) {
        super.setBackground(drawable);
        if (getWrappedTextView() != null) {
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        super.setBackgroundResource(i17);
        if (getWrappedTextView() != null) {
            getWrappedTextView().setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void setIsOpen(boolean z17) {
        U = z17;
    }

    @Override // android.view.View
    public void setOnLongClickListener(android.view.View.OnLongClickListener onLongClickListener) {
        this.N = onLongClickListener;
        super.setOnLongClickListener(new al5.t1(this));
    }

    public void setTextCrashListener(al5.w1 w1Var) {
        this.Q = w1Var;
    }

    public void setTextListener(al5.v1 v1Var) {
        this.P = v1Var;
    }

    public MMNeat7extView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.R = new al5.u1(this);
        n();
    }
}
