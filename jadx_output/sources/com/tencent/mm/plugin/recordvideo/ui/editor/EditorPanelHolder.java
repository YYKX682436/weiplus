package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b \u0010\"J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001e\u0010\t\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0016R\"\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR*\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00038\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000f¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder;", "Lcom/tencent/mm/ui/widget/InsectFrameLayout;", "", "", "show", "Ljz5/f0;", "setShow", "Lkotlin/Function1;", "callback", "setOnVisibleChangeCallback", "n", "Z", "getCoverByKeyboard", "()Z", "setCoverByKeyboard", "(Z)V", "coverByKeyboard", "o", "getCloseTouchOutside", "setCloseTouchOutside", "closeTouchOutside", "value", "p", "getOutsideTouchable", "setOutsideTouchable", "outsideTouchable", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "video-recorder-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class EditorPanelHolder extends com.tencent.mm.ui.widget.InsectFrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f156012h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f156013i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f156014m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean coverByKeyboard;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean closeTouchOutside;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean outsideTouchable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorPanelHolder(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.closeTouchOutside = true;
        setOnClickListener(new wu3.g1(this));
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public static void k(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder editorPanelHolder, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            layoutParams = null;
        }
        editorPanelHolder.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        editorPanelHolder.f156012h = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams != null ? new android.widget.FrameLayout.LayoutParams(layoutParams) : view.getLayoutParams() != null ? new android.widget.FrameLayout.LayoutParams(view.getLayoutParams()) : new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        editorPanelHolder.addView(view, layoutParams2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent event) {
        android.view.KeyEvent.DispatcherState keyDispatcherState;
        kotlin.jvm.internal.o.g(event, "event");
        if (event.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                android.view.KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() != 1 || (keyDispatcherState = getKeyDispatcherState()) == null || !keyDispatcherState.isTracking(event) || event.isCanceled()) {
                return super.dispatchKeyEvent(event);
            }
            setShow(false);
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // com.tencent.mm.ui.widget.InsectFrameLayout
    public boolean g(int i17) {
        android.view.View view;
        if ((!this.coverByKeyboard || (i17 <= 200 && i17 >= 0)) && (view = this.f156012h) != null && view.getPaddingBottom() != i17) {
            view.post(new wu3.h1(view, i17));
        }
        return true;
    }

    public final boolean getCloseTouchOutside() {
        return this.closeTouchOutside;
    }

    public final boolean getCoverByKeyboard() {
        return this.coverByKeyboard;
    }

    public final boolean getOutsideTouchable() {
        return this.outsideTouchable;
    }

    public boolean h() {
        return getVisibility() == 0 && !this.f156014m;
    }

    public final void setCloseTouchOutside(boolean z17) {
        this.closeTouchOutside = z17;
    }

    public final void setCoverByKeyboard(boolean z17) {
        this.coverByKeyboard = z17;
    }

    public void setOnVisibleChangeCallback(yz5.l lVar) {
        this.f156013i = lVar;
    }

    public final void setOutsideTouchable(boolean z17) {
        this.outsideTouchable = z17;
        if (!z17) {
            setOnClickListener(new wu3.i1(this));
        } else {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    public void setShow(boolean z17) {
        if (!z17) {
            this.f156014m = true;
            yz5.l lVar = this.f156013i;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
            android.view.View view = this.f156012h;
            if (view != null) {
                view.animate().cancel();
                view.animate().translationY(view.getHeight()).withEndAction(new wu3.k1(this)).start();
                return;
            }
            return;
        }
        setVisibility(0);
        yz5.l lVar2 = this.f156013i;
        if (lVar2 != null) {
            lVar2.invoke(java.lang.Boolean.TRUE);
        }
        android.view.View view2 = this.f156012h;
        if (view2 != null) {
            view2.animate().cancel();
            if (view2.getHeight() != 0) {
                view2.animate().translationY(0.0f).start();
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder", "setShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorPanelHolder", "setShow", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.post(new wu3.j1(view2));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorPanelHolder(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EditorPanelHolder(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
