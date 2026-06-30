package com.tencent.mm.plugin.game.luggage.ui.circle;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00103\u001a\u00020\u0016¢\u0006\u0004\b4\u00105B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b4\u00106R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\bR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010.\u001a\u0004\u0018\u00010'8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00067"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/ui/circle/GameEmojiPanelRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "h2", "F", "getTouchX", "()F", "setTouchX", "(F)V", "touchX", "i2", "getTouchY", "setTouchY", "touchY", "", "l2", "Z", "getEnableLongPress", "()Z", "setEnableLongPress", "(Z)V", "enableLongPress", "", "m2", "I", "getScene", "()I", "setScene", "(I)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "Lim5/b;", "Lim5/a;", "p2", "Lim5/b;", "getPanelLifeCycle", "()Lim5/b;", "setPanelLifeCycle", "(Lim5/b;)V", "panelLifeCycle", "Llr/o0;", "q2", "Llr/o0;", "getSizeResolver", "()Llr/o0;", "setSizeResolver", "(Llr/o0;)V", "sizeResolver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class GameEmojiPanelRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name */
    public boolean f139985b2;

    /* renamed from: c2, reason: collision with root package name */
    public boolean f139986c2;

    /* renamed from: d2, reason: collision with root package name */
    public boolean f139987d2;

    /* renamed from: e2, reason: collision with root package name */
    public boolean f139988e2;

    /* renamed from: f2, reason: collision with root package name */
    public float f139989f2;

    /* renamed from: g2, reason: collision with root package name */
    public float f139990g2;

    /* renamed from: h2, reason: collision with root package name and from kotlin metadata */
    public float touchX;

    /* renamed from: i2, reason: collision with root package name and from kotlin metadata */
    public float touchY;

    /* renamed from: j2, reason: collision with root package name */
    public final int f139993j2;

    /* renamed from: k2, reason: collision with root package name */
    public final long f139994k2;

    /* renamed from: l2, reason: collision with root package name and from kotlin metadata */
    public boolean enableLongPress;

    /* renamed from: m2, reason: collision with root package name and from kotlin metadata */
    public int scene;

    /* renamed from: n2, reason: collision with root package name */
    public final java.lang.Runnable f139997n2;

    /* renamed from: o2, reason: collision with root package name */
    public final gn5.b f139998o2;

    /* renamed from: p2, reason: collision with root package name and from kotlin metadata */
    public im5.b panelLifeCycle;

    /* renamed from: q2, reason: collision with root package name and from kotlin metadata */
    public lr.o0 sizeResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameEmojiPanelRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.enableLongPress = true;
        this.f139997n2 = new f53.q(this);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f139994k2 = android.view.ViewConfiguration.getLongPressTimeout();
        this.f139993j2 = viewConfiguration.getScaledTouchSlop();
        this.f139998o2 = new gn5.p(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.luggage.ui.circle.GameEmojiPanelRecyclerView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean getEnableLongPress() {
        return this.enableLongPress;
    }

    public final im5.b getPanelLifeCycle() {
        return this.panelLifeCycle;
    }

    public final int getScene() {
        return this.scene;
    }

    public final lr.o0 getSizeResolver() {
        return this.sizeResolver;
    }

    public final float getTouchX() {
        return this.touchX;
    }

    public final float getTouchY() {
        return this.touchY;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (this.f139987d2) {
            return true;
        }
        return super.onInterceptTouchEvent(event);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        lr.o0 o0Var = this.sizeResolver;
        if (o0Var != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.c0(o0Var.f320561b);
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        lr.o0 o0Var = this.sizeResolver;
        if (o0Var != null) {
            o0Var.d(i17);
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = getLayoutManager();
            androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? (androidx.recyclerview.widget.GridLayoutManager) layoutManager : null;
            if (gridLayoutManager != null) {
                gridLayoutManager.c0(o0Var.f320561b);
            }
            setPadding(o0Var.f320563d, getPaddingTop(), o0Var.f320563d, getPaddingBottom());
        }
    }

    public final void setEnableLongPress(boolean z17) {
        this.enableLongPress = z17;
    }

    public final void setPanelLifeCycle(im5.b bVar) {
        this.panelLifeCycle = bVar;
    }

    public final void setScene(int i17) {
        this.scene = i17;
    }

    public final void setSizeResolver(lr.o0 o0Var) {
        this.sizeResolver = o0Var;
    }

    public final void setTouchX(float f17) {
        this.touchX = f17;
    }

    public final void setTouchY(float f17) {
        this.touchY = f17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GameEmojiPanelRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
