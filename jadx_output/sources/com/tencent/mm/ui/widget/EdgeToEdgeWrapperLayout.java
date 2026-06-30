package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0013\u000bB'\b\u0007\u0012\u0006\u0010,\u001a\u00020+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\b\b\u0002\u0010/\u001a\u00020\u0003¢\u0006\u0004\b0\u00101R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0013\u0010*\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b)\u0010\u0017¨\u00062"}, d2 = {"Lcom/tencent/mm/ui/widget/EdgeToEdgeWrapperLayout;", "Lvj5/h;", "Lvj5/l;", "", "C", "I", "getNavigationBarBackgroundColor", "()I", "setNavigationBarBackgroundColor", "(I)V", "navigationBarBackgroundColor", "Lal5/r;", "D", "Lal5/r;", "getStatusBarStrategy", "()Lal5/r;", "setStatusBarStrategy", "(Lal5/r;)V", "statusBarStrategy", "Lal5/q;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lal5/q;", "getNavigationBarStrategy", "()Lal5/q;", "setNavigationBarStrategy", "(Lal5/q;)V", "navigationBarStrategy", "", "F", "Z", "getDisableNavigationBarContrastEnforced", "()Z", "setDisableNavigationBarContrastEnforced", "(Z)V", "disableNavigationBarContrastEnforced", "Lal5/l4;", "K", "Ljz5/g;", "getHierarchyAnalyzer", "()Lal5/l4;", "hierarchyAnalyzer", "getEffectiveStrategy", "effectiveStrategy", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class EdgeToEdgeWrapperLayout extends vj5.h implements vj5.l {
    public volatile int A;
    public volatile e3.d B;

    /* renamed from: C, reason: from kotlin metadata */
    public int navigationBarBackgroundColor;

    /* renamed from: D, reason: from kotlin metadata */
    public al5.r statusBarStrategy;

    /* renamed from: E, reason: from kotlin metadata */
    public al5.q navigationBarStrategy;

    /* renamed from: F, reason: from kotlin metadata */
    public boolean disableNavigationBarContrastEnforced;
    public final java.util.WeakHashMap G;
    public final java.util.WeakHashMap H;
    public java.lang.Runnable I;

    /* renamed from: J, reason: collision with root package name */
    public al5.q f211250J;

    /* renamed from: K, reason: from kotlin metadata */
    public final jz5.g hierarchyAnalyzer;
    public java.lang.Runnable L;
    public boolean M;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f211251w;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f211252x;

    /* renamed from: y, reason: collision with root package name */
    public volatile int f211253y;

    /* renamed from: z, reason: collision with root package name */
    public volatile int f211254z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EdgeToEdgeWrapperLayout(android.content.Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final al5.l4 getHierarchyAnalyzer() {
        return (al5.l4) ((jz5.n) this.hierarchyAnalyzer).getValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:15|(1:17)(1:86)|18|(1:20)|21|(8:(2:24|(2:26|(2:30|31))(1:32))(1:84)|33|34|35|36|(1:38)|39|(4:41|(1:43)|44|(5:46|(1:48)|(1:50)|51|52)(1:53))(5:54|(1:56)|57|(1:80)|(2:62|(2:63|(3:65|(3:70|71|72)|73)(3:76|77|78)))(1:79)))|85|33|34|35|36|(0)|39|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0110, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.EdgeToEdgeWrapperLayout", "applyStatusBarHeight setPadding e=" + r11.getMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(int r11, int r12, int r13, e3.d r14) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.widget.EdgeToEdgeWrapperLayout.I(int, int, int, e3.d):void");
    }

    public final int K(al5.q qVar, e3.d dVar, boolean z17) {
        int ordinal = qVar.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal != 1 && ordinal != 2 && ordinal != 3 && ordinal != 4) {
            throw new jz5.j();
        }
        if (z17) {
            if (dVar != null) {
                return dVar.f247044a;
            }
            return 0;
        }
        if (dVar != null) {
            return dVar.f247046c;
        }
        return 0;
    }

    public final void L() {
        if (this.navigationBarStrategy != al5.q.f5992h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EdgeToEdgeWrapperLayout", "postHierarchyDetection not AUTO_DETECT");
            return;
        }
        if (getWidth() <= 0 || getHeight() <= 0 || this.f211251w <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EdgeToEdgeWrapperLayout", "postHierarchyDetection View invalid");
            return;
        }
        if (this.M) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EdgeToEdgeWrapperLayout", "postHierarchyDetection hierarchyDetectionScheduled");
            return;
        }
        this.M = true;
        java.lang.Runnable runnable = this.L;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        al5.u uVar = new al5.u(this);
        this.L = uVar;
        post(uVar);
    }

    public final void M() {
        I(this.f437705h, this.f211251w, this.f211252x, this.B);
    }

    @Override // vj5.h, android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f211253y <= 0) {
            this.f211253y = 0;
        }
        if (this.f437704g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.EdgeToEdgeWrapperLayout", "drawNavigationBarBackground NULL paint");
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.EdgeToEdgeWrapperLayout", "drawNavigationBarBackground navigationBarBackgroundColor=" + this.navigationBarBackgroundColor);
        this.f437704g.setColor(this.navigationBarBackgroundColor);
        canvas.drawRect(this.B.f247044a > this.B.f247046c ? new android.graphics.Rect(0, 0, this.f211254z, getMeasuredHeight()) : this.B.f247046c > this.B.f247044a ? new android.graphics.Rect(getMeasuredWidth() - this.A, 0, getMeasuredWidth(), getMeasuredHeight()) : new android.graphics.Rect(0, getMeasuredHeight() - this.f211253y, getMeasuredWidth(), getMeasuredHeight()), this.f437704g);
    }

    @Override // vj5.l
    public void f4(int i17, int i18, int i19, e3.d dVar, android.view.WindowInsets windowInsets) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EdgeToEdgeWrapperLayout", "onSystemBarHeightChange top: " + i17 + ", bottom: " + i18 + ", tpBottom: " + i19 + " systemInsets=" + dVar);
        I(i17, i18, i19, dVar);
    }

    public final boolean getDisableNavigationBarContrastEnforced() {
        return this.disableNavigationBarContrastEnforced;
    }

    public final al5.q getEffectiveStrategy() {
        al5.q qVar = this.navigationBarStrategy;
        return qVar == al5.q.f5992h ? this.f211250J : qVar;
    }

    public final int getNavigationBarBackgroundColor() {
        return this.navigationBarBackgroundColor;
    }

    public final al5.q getNavigationBarStrategy() {
        return this.navigationBarStrategy;
    }

    public final al5.r getStatusBarStrategy() {
        return this.statusBarStrategy;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        java.lang.Runnable runnable = this.L;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.L = null;
        this.M = false;
        super.onDetachedFromWindow();
    }

    @Override // vj5.h, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        L();
    }

    @Override // vj5.h
    public void q(int i17) {
        I(this.f437705h, this.f211251w, this.f211252x, this.B);
    }

    public final void setDisableNavigationBarContrastEnforced(boolean z17) {
        this.disableNavigationBarContrastEnforced = z17;
    }

    public final void setNavigationBarBackgroundColor(int i17) {
        this.navigationBarBackgroundColor = i17;
    }

    public final void setNavigationBarStrategy(al5.q qVar) {
        kotlin.jvm.internal.o.g(qVar, "<set-?>");
        this.navigationBarStrategy = qVar;
    }

    public final void setStatusBarStrategy(al5.r rVar) {
        kotlin.jvm.internal.o.g(rVar, "<set-?>");
        this.statusBarStrategy = rVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EdgeToEdgeWrapperLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public /* synthetic */ EdgeToEdgeWrapperLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EdgeToEdgeWrapperLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.B = e3.d.f247043e;
        this.statusBarStrategy = al5.r.f6005e;
        this.navigationBarStrategy = al5.q.f5989e;
        this.G = new java.util.WeakHashMap();
        this.H = new java.util.WeakHashMap();
        this.f211250J = al5.q.f5990f;
        this.hierarchyAnalyzer = jz5.h.b(new al5.t(this));
    }
}
