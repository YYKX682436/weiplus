package com.tencent.mm.plugin.scanner.ui.scangoods.widget;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB#\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanAnimationDotsView;", "Landroid/view/View;", "Lc04/e;", "", "duration", "Ljz5/f0;", "setDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ScanAnimationDotsView extends android.view.View implements c04.e {

    /* renamed from: d, reason: collision with root package name */
    public c04.f f159632d;

    /* renamed from: e, reason: collision with root package name */
    public int f159633e;

    /* renamed from: f, reason: collision with root package name */
    public int f159634f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanAnimationDotsView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        c04.f fVar = this.f159632d;
        if (fVar != null) {
            java.util.Iterator it = ((c04.b) fVar).f37671d.iterator();
            while (it.hasNext()) {
                ((c04.g) ((c04.d) it.next())).getClass();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f159633e == getMeasuredWidth() && this.f159634f == getMeasuredHeight()) {
            return;
        }
        this.f159633e = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f159634f = measuredHeight;
        c04.f fVar = this.f159632d;
        if (fVar != null) {
            int i19 = this.f159633e;
            c04.b bVar = (c04.b) fVar;
            bVar.getClass();
            bVar.getClass();
            java.util.Iterator it = bVar.f37671d.iterator();
            while (it.hasNext()) {
                ((c04.g) ((c04.d) it.next())).a(i19, measuredHeight, false);
            }
        }
    }

    public void setDuration(long j17) {
        c04.f fVar = this.f159632d;
        if (fVar != null) {
            c04.b bVar = (c04.b) fVar;
            bVar.getClass();
            java.util.Iterator it = bVar.f37671d.iterator();
            while (it.hasNext()) {
                ((c04.g) ((c04.d) it.next())).getClass();
            }
        }
    }

    @Override // c04.e
    public void startAnimation() {
        c04.f fVar = this.f159632d;
        if (fVar != null) {
            fVar.startAnimation();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanAnimationDotsView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f159632d = new c04.c(context, this);
    }
}
