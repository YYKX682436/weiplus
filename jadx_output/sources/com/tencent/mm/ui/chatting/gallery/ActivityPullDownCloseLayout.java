package com.tencent.mm.ui.chatting.gallery;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001+B\u001d\b\u0007\u0012\u0006\u0010&\u001a\u00020%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u000eR0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006,"}, d2 = {"Lcom/tencent/mm/ui/chatting/gallery/ActivityPullDownCloseLayout;", "Landroid/widget/FrameLayout;", "", "factor", "Ljz5/f0;", "setSlideFactor", "Lkotlin/Function1;", "Landroid/view/MotionEvent;", "", "d", "Lyz5/l;", "getDragEnableBlock", "()Lyz5/l;", "setDragEnableBlock", "(Lyz5/l;)V", "dragEnableBlock", "Landroid/view/View;", "m", "getDragTranslationListener", "setDragTranslationListener", "dragTranslationListener", "n", "getDragFullScreenListener", "setDragFullScreenListener", "dragFullScreenListener", "Lkotlin/Function0;", "p", "Lyz5/a;", "getDragFinishInterceptor", "()Lyz5/a;", "setDragFinishInterceptor", "(Lyz5/a;)V", "dragFinishInterceptor", "", "getMDialogHeight", "()I", "mDialogHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "com/tencent/mm/ui/chatting/gallery/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class ActivityPullDownCloseLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.l dragEnableBlock;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f200530e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f200531f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f200532g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.customview.widget.l f200533h;

    /* renamed from: i, reason: collision with root package name */
    public float f200534i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public yz5.l dragTranslationListener;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.l dragFullScreenListener;

    /* renamed from: o, reason: collision with root package name */
    public boolean f200537o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public yz5.a dragFinishInterceptor;

    /* renamed from: q, reason: collision with root package name */
    public int f200539q;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityPullDownCloseLayout(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMDialogHeight() {
        return getHeight();
    }

    @Override // android.view.View
    public void computeScroll() {
        androidx.customview.widget.l lVar = this.f200533h;
        boolean z17 = false;
        if (lVar != null && lVar.h(true)) {
            z17 = true;
        }
        if (z17) {
            invalidate();
        }
    }

    public final yz5.l getDragEnableBlock() {
        return this.dragEnableBlock;
    }

    public final yz5.a getDragFinishInterceptor() {
        return this.dragFinishInterceptor;
    }

    public final yz5.l getDragFullScreenListener() {
        return this.dragFullScreenListener;
    }

    public final yz5.l getDragTranslationListener() {
        return this.dragTranslationListener;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (((java.lang.Boolean) r0.invoke(r4)).booleanValue() == true) goto L8;
     */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r4, r0)
            yz5.l r0 = r3.dragEnableBlock
            r1 = 0
            if (r0 == 0) goto L18
            java.lang.Object r0 = r0.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 != r2) goto L18
            goto L19
        L18:
            r2 = r1
        L19:
            if (r2 == 0) goto L24
            androidx.customview.widget.l r0 = r3.f200533h
            if (r0 == 0) goto L24
            boolean r4 = r0.t(r4)
            r1 = r4
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ActivityPullDownCloseLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, getLeft(), getTop(), getRight(), getBottom());
        android.view.View view = this.f200531f;
        if (view != null) {
            view.offsetTopAndBottom(this.f200539q);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        androidx.customview.widget.l lVar = this.f200533h;
        if (lVar == null) {
            return true;
        }
        lVar.m(event);
        return true;
    }

    public final void setDragEnableBlock(yz5.l lVar) {
        this.dragEnableBlock = lVar;
    }

    public final void setDragFinishInterceptor(yz5.a aVar) {
        this.dragFinishInterceptor = aVar;
    }

    public final void setDragFullScreenListener(yz5.l lVar) {
        this.dragFullScreenListener = lVar;
    }

    public final void setDragTranslationListener(yz5.l lVar) {
        this.dragTranslationListener = lVar;
    }

    public final void setSlideFactor(float f17) {
        this.f200534i = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActivityPullDownCloseLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f200534i = 0.3f;
        this.f200532g = (android.app.Activity) context;
        this.f200533h = new androidx.customview.widget.l(getContext(), this, new com.tencent.mm.ui.chatting.gallery.c(this));
    }
}
