package com.tencent.mm.plugin.finder.webview.ad;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.B#\b\u0016\u0012\u0006\u0010*\u001a\u00020)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010/\u001a\u00020\u0002¢\u0006\u0004\b-\u00100R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010%\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u00061"}, d2 = {"Lcom/tencent/mm/plugin/finder/webview/ad/ExpandableScrollFrameLayout;", "Lcom/tencent/mm/plugin/finder/webview/ad/ScrollFrameLayout;", "", "z", "I", "getPeekHeight", "()I", "setPeekHeight", "(I)V", "peekHeight", "Loy2/o;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Loy2/o;", "getScrollToTopListener", "()Loy2/o;", "setScrollToTopListener", "(Loy2/o;)V", "scrollToTopListener", "Loy2/n;", "B", "Loy2/n;", "getCurScrollHeightListener", "()Loy2/n;", "setCurScrollHeightListener", "(Loy2/n;)V", "curScrollHeightListener", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "C", "Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "getDrawerListener", "()Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;", "setDrawerListener", "(Lcom/tencent/mm/view/drawer/RecyclerViewDrawerSquares$a;)V", "drawerListener", "", "D", "Z", "isContentAtTop", "()Z", "setContentAtTop", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ExpandableScrollFrameLayout extends com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout {

    /* renamed from: A, reason: from kotlin metadata */
    public oy2.o scrollToTopListener;

    /* renamed from: B, reason: from kotlin metadata */
    public oy2.n curScrollHeightListener;

    /* renamed from: C, reason: from kotlin metadata */
    public com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a drawerListener;

    /* renamed from: D, reason: from kotlin metadata */
    public boolean isContentAtTop;

    /* renamed from: y, reason: collision with root package name */
    public boolean f136827y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public int peekHeight;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpandableScrollFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void e() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar;
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", "peekHeight + translationY:" + (this.peekHeight - getTranslationY()));
        oy2.n nVar = this.curScrollHeightListener;
        if (nVar != null) {
            float translationY = this.peekHeight - getTranslationY();
            float f17 = this.peekHeight;
            com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$onDialogHeightChange(((com.tencent.mm.plugin.finder.webview.c0) nVar).f136853a, translationY, f17, getScrollUpLimit() + f17);
        }
        float translationY2 = (this.peekHeight - getTranslationY()) / this.peekHeight;
        if (translationY2 == 1.0f) {
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar2 = this.drawerListener;
            if (aVar2 != null) {
                aVar2.c(true, false, 0);
                return;
            }
            return;
        }
        if (!(translationY2 == 0.0f) || (aVar = this.drawerListener) == null) {
            return;
        }
        aVar.c(false, false, 0);
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void f() {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar;
        float translationY = (this.peekHeight - getTranslationY()) / this.peekHeight;
        if (translationY == 1.0f) {
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar2 = this.drawerListener;
            if (aVar2 != null) {
                aVar2.c(false, true, 0);
                return;
            }
            return;
        }
        if (!(translationY == 0.0f) || (aVar = this.drawerListener) == null) {
            return;
        }
        aVar.c(true, true, 0);
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void g(float f17) {
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar;
        float translationY = (this.peekHeight - getTranslationY()) / this.peekHeight;
        if (translationY > 1.0f || (aVar = this.drawerListener) == null) {
            return;
        }
        aVar.a(1 - translationY);
    }

    public final oy2.n getCurScrollHeightListener() {
        return this.curScrollHeightListener;
    }

    public final com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a getDrawerListener() {
        return this.drawerListener;
    }

    public final int getPeekHeight() {
        return this.peekHeight;
    }

    public final oy2.o getScrollToTopListener() {
        return this.scrollToTopListener;
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void h() {
        super.h();
        if (!this.f136827y) {
            setAllowVerticalIntercept(true);
        }
        setMPointerTranslateY(0.0f);
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public boolean i(float f17, float f18, int i17, int i18) {
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", "distanceY:" + f18 + " velocityY:" + i18 + " isContentAtTop:" + this.isContentAtTop);
        if (java.lang.Math.abs(f18) >= 10.0f && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && java.lang.Math.abs(f18) > java.lang.Math.abs(f17)) {
            return f18 <= 0.0f || this.isContentAtTop;
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void j() {
        n();
        h();
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void k() {
        n();
        h();
    }

    @Override // com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout
    public void l(float f17) {
        float mPointerTranslateY;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar;
        if (this.f136827y) {
            if (getMPointerTranslateY() + f17 < 0.0f) {
                setMPointerTranslateY(0.0f);
            } else {
                setMPointerTranslateY(getMPointerTranslateY() + f17);
            }
            mPointerTranslateY = (-getScrollUpLimit()) + getMPointerTranslateY();
        } else {
            if (getMPointerTranslateY() + f17 <= (-getScrollUpLimit())) {
                setMPointerTranslateY(-getScrollUpLimit());
            } else {
                setMPointerTranslateY(getMPointerTranslateY() + f17);
            }
            mPointerTranslateY = getMPointerTranslateY();
        }
        setTranslationY(mPointerTranslateY);
        float translationY = this.peekHeight - getTranslationY();
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f17 + " curHeight:" + translationY);
        oy2.n nVar = this.curScrollHeightListener;
        if (nVar != null) {
            float f18 = this.peekHeight;
            com.tencent.mm.plugin.finder.webview.FinderWebViewHelper.access$onDialogHeightChange(((com.tencent.mm.plugin.finder.webview.c0) nVar).f136853a, translationY, f18, getScrollUpLimit() + f18);
        }
        float translationY2 = (this.peekHeight - getTranslationY()) / this.peekHeight;
        if (translationY2 <= 1.0f && (aVar = this.drawerListener) != null) {
            aVar.a(1 - translationY2);
        }
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", "translationY :" + getTranslationY() + " offsetY:" + f17 + " ratio:" + translationY2);
    }

    public final void m() {
        if (this.f136827y) {
            c(this.peekHeight, false, 300, new oy2.c(this));
        } else {
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, this.peekHeight, false, 0, new oy2.d(this), 4, null);
        }
    }

    public final void n() {
        boolean z17 = this.f136827y;
        if (z17) {
            if (!z17 || getMPointerTranslateY() <= 0.0f) {
                return;
            }
            if (getMPointerTranslateY() < getScrollDownLimit()) {
                com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, -getScrollUpLimit(), false, 0, null, 14, null);
                return;
            } else {
                com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, this.peekHeight, false, 0, new oy2.f(this), 6, null);
                return;
            }
        }
        if (getMPointerTranslateY() >= 0.0f) {
            if (getMPointerTranslateY() > getScrollDownLimit()) {
                com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, this.peekHeight, false, 0, new oy2.e(this), 6, null);
                return;
            } else {
                com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, 0.0f, false, 0, null, 15, null);
                return;
            }
        }
        float f17 = 2;
        if (getMPointerTranslateY() > (-getScrollUpLimit()) / f17) {
            com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, 0.0f, false, 0, null, 15, null);
            return;
        }
        if (getMPointerTranslateY() > (-getScrollUpLimit()) / f17 || getMPointerTranslateY() < (-getScrollUpLimit())) {
            return;
        }
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, -getScrollUpLimit(), false, 0, null, 14, null);
        this.f136827y = true;
        oy2.o oVar = this.scrollToTopListener;
        if (oVar != null) {
            com.tencent.mm.plugin.finder.viewmodel.component.bi biVar = (com.tencent.mm.plugin.finder.viewmodel.component.bi) oVar;
            xc2.n nVar = xc2.n.f453212a;
            android.content.Context context = biVar.f133886a;
            kotlin.jvm.internal.o.g(context, "context");
            xc2.p0 infoEx = biVar.f133887b;
            kotlin.jvm.internal.o.g(infoEx, "infoEx");
            xc2.n.d(nVar, context, null, "feed_jumpicon_halfscreenslideup", 1, infoEx, 0, 0, null, null, null, 992, null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setTranslationY(this.peekHeight);
        com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout.d(this, 0.0f, false, 300, null, 8, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("Finder.WebViewFrameLayout", "onDetachedFromWindow");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar = this.drawerListener;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void setContentAtTop(boolean z17) {
        this.isContentAtTop = z17;
    }

    public final void setCurScrollHeightListener(oy2.n nVar) {
        this.curScrollHeightListener = nVar;
    }

    public final void setDrawerListener(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a aVar) {
        this.drawerListener = aVar;
    }

    public final void setPeekHeight(int i17) {
        this.peekHeight = i17;
    }

    public final void setScrollToTopListener(oy2.o oVar) {
        this.scrollToTopListener = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableScrollFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.isContentAtTop = true;
        setAllowVerticalIntercept(true);
    }
}
