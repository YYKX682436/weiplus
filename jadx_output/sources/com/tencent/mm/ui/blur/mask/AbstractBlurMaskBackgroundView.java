package com.tencent.mm.ui.blur.mask;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003J\b\u0010\u0005\u001a\u00020\u0004H\u0016R$\u0010\f\u001a\u0004\u0018\u00018\u00008\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/ui/blur/mask/AbstractBlurMaskBackgroundView;", "CACHE", "Landroid/widget/FrameLayout;", "Ljb5/e;", "Ljb5/h;", "getViewPosition", "d", "Ljava/lang/Object;", "getRenderCache", "()Ljava/lang/Object;", "setRenderCache", "(Ljava/lang/Object;)V", "renderCache", "", "value", "e", "Z", "isCacheEnabled", "()Z", "setCacheEnabled", "(Z)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public abstract class AbstractBlurMaskBackgroundView<CACHE> extends android.widget.FrameLayout implements jb5.e {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public java.lang.Object renderCache;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isCacheEnabled;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractBlurMaskBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public abstract void b();

    public abstract void c();

    public abstract void d(android.graphics.Canvas canvas, yz5.l lVar);

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (this.isCacheEnabled) {
            d(canvas, new jb5.a(this));
        } else {
            super.dispatchDraw(canvas);
        }
    }

    @Override // jb5.e
    public CACHE getRenderCache() {
        return (CACHE) this.renderCache;
    }

    @Override // jb5.e
    public jb5.h getViewPosition() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return new jb5.h(iArr[0], iArr[1], getWidth(), getHeight());
    }

    public void setCacheEnabled(boolean z17) {
        this.isCacheEnabled = z17;
        if (z17) {
            b();
        } else {
            c();
        }
    }

    public void setRenderCache(CACHE cache) {
        this.renderCache = cache;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractBlurMaskBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        this(context, attributeSet, i17, 0, 8, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractBlurMaskBackgroundView(android.content.Context r2, android.util.AttributeSet r3, int r4, int r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            if (r7 == 0) goto L5
            r3 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "context"
            kotlin.jvm.internal.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.blur.mask.AbstractBlurMaskBackgroundView.<init>(android.content.Context, android.util.AttributeSet, int, int, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractBlurMaskBackgroundView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(context, attributeSet, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
