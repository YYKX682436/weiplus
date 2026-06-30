package com.tencent.mm.ui.chatting.component;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=B#\b\u0016\u0012\u0006\u00109\u001a\u000208\u0012\b\u0010;\u001a\u0004\u0018\u00010:\u0012\u0006\u0010>\u001a\u00020\u0002¢\u0006\u0004\b<\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u000bJ\"\u0010\u0012\u001a\u00020\u00042\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\rR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R*\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016\"\u0004\b#\u0010\u0018R\"\u0010+\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u00101\u001a\u00020,8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/tencent/mm/ui/chatting/component/LoadableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "maxLines", "Ljz5/f0;", "setMaxLines", "maxPixels", "setMaxHeight", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setOriginText", "", "getOriginText", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/view/MotionEvent;", "", "callback", "setOnDoubleClickListener", "h", "I", "getExpectWidth", "()I", "setExpectWidth", "(I)V", "expectWidth", "value", "m", "Z", "isLoading", "()Z", "setLoading", "(Z)V", "o", "getDotCounter", "setDotCounter", "dotCounter", "p", "Ljava/lang/String;", "getDotStr", "()Ljava/lang/String;", "setDotStr", "(Ljava/lang/String;)V", "dotStr", "Lcom/tencent/mm/sdk/platformtools/a4;", "q", "Lcom/tencent/mm/sdk/platformtools/a4;", "getUpdateDotCallback", "()Lcom/tencent/mm/sdk/platformtools/a4;", "updateDotCallback", "Lcom/tencent/mm/sdk/platformtools/b4;", "r", "Lcom/tencent/mm/sdk/platformtools/b4;", "getUpdateDotTimer", "()Lcom/tencent/mm/sdk/platformtools/b4;", "updateDotTimer", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class LoadableTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public final android.view.GestureDetector f198555g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int expectWidth;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f198557i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isLoading;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f198559n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int dotCounter;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.lang.String dotStr;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.sdk.platformtools.a4 updateDotCallback;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final com.tencent.mm.sdk.platformtools.b4 updateDotTimer;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoadableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getDotCounter() {
        return this.dotCounter;
    }

    public final java.lang.String getDotStr() {
        return this.dotStr;
    }

    public final int getExpectWidth() {
        return this.expectWidth;
    }

    /* renamed from: getOriginText, reason: from getter */
    public final java.lang.String getF198559n() {
        return this.f198559n;
    }

    public final com.tencent.mm.sdk.platformtools.a4 getUpdateDotCallback() {
        return this.updateDotCallback;
    }

    public final com.tencent.mm.sdk.platformtools.b4 getUpdateDotTimer() {
        return this.updateDotTimer;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.expectWidth;
        if (i19 != 0) {
            super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824), i18);
        } else {
            super.onMeasure(i17, i18);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f198555g;
        kotlin.jvm.internal.o.d(motionEvent);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/LoadableTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/ui/chatting/component/LoadableTextView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (onTouchEvent) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setDotCounter(int i17) {
        this.dotCounter = i17;
    }

    public final void setDotStr(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.dotStr = str;
    }

    public final void setExpectWidth(int i17) {
        this.expectWidth = i17;
    }

    public final void setLoading(boolean z17) {
        this.isLoading = z17;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.updateDotTimer;
        if (z17) {
            b4Var.f192478e = this.updateDotCallback;
            b4Var.c(0L, 500L);
        } else {
            b4Var.d();
            b4Var.f192478e = null;
        }
    }

    @Override // android.widget.TextView
    public void setMaxHeight(int i17) {
        if (i17 != -1) {
            setSingleLine(false);
            setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
            setVerticalScrollBarEnabled(true);
            setScrollbarFadingEnabled(true);
        }
        super.setMaxHeight(i17);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i17) {
        super.setMaxLines(i17);
        if (i17 == 1) {
            setMovementMethod(null);
            setVerticalScrollBarEnabled(false);
            setScrollbarFadingEnabled(false);
        } else {
            setMovementMethod(android.text.method.ScrollingMovementMethod.getInstance());
            setVerticalScrollBarEnabled(true);
            setScrollbarFadingEnabled(true);
        }
    }

    public final void setOnDoubleClickListener(yz5.p pVar) {
        this.f198557i = pVar;
    }

    public final void setOriginText(java.lang.CharSequence text) {
        kotlin.jvm.internal.o.g(text, "text");
        java.lang.String obj = text.toString();
        this.f198559n = obj;
        setText(obj);
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (getMaxLines() == 1) {
            if (getText() != null) {
                java.lang.CharSequence text = getText();
                kotlin.jvm.internal.o.f(text, "getText(...)");
                if (!(text.length() == 0)) {
                    float measureText = getPaint().measureText(getText().toString());
                    if (measureText > getWidth()) {
                        scrollBy(((int) (measureText - getWidth())) - getScrollX(), 0);
                        return;
                    } else {
                        scrollTo(0, getScrollY());
                        return;
                    }
                }
            }
            scrollTo(0, getScrollY());
            return;
        }
        if (getMaxLines() > 1) {
            if (getText() != null) {
                java.lang.CharSequence text2 = getText();
                kotlin.jvm.internal.o.f(text2, "getText(...)");
                if (!(text2.length() == 0) && getLineCount() > getMaxLines()) {
                    scrollBy(0, ((getLineCount() - getMaxLines()) * getLineHeight()) - getScrollY());
                    return;
                }
            }
            scrollTo(0, 0);
            return;
        }
        if (getMaxLines() == -1 && getMaxHeight() > 0) {
            post(new com.tencent.mm.ui.chatting.component.sg(this));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.LoadableTextView", "LoadableTextView auto scroll error? maxLines=" + getMaxLines() + " maxHeight=" + getMaxHeight());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new com.tencent.mm.ui.chatting.component.qg());
        gestureDetector.setOnDoubleTapListener(new com.tencent.mm.ui.chatting.component.rg(this));
        this.f198555g = gestureDetector;
        this.f198559n = "";
        this.dotStr = "";
        com.tencent.mm.ui.chatting.component.tg tgVar = new com.tencent.mm.ui.chatting.component.tg(this);
        this.updateDotCallback = tgVar;
        this.updateDotTimer = new com.tencent.mm.sdk.platformtools.b4(tgVar, true);
        setSingleLine();
    }
}
