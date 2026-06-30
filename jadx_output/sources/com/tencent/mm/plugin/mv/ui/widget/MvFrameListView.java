package com.tencent.mm.plugin.mv.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014R*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/widget/MvFrameListView;", "Landroid/view/View;", "", "value", "i", "I", "getDrawStart", "()I", "setDrawStart", "(I)V", "drawStart", "m", "getDrawEnd", "setDrawEnd", "drawEnd", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MvFrameListView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f152004d;

    /* renamed from: e, reason: collision with root package name */
    public kp4.a f152005e;

    /* renamed from: f, reason: collision with root package name */
    public qm3.i f152006f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f152007g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f152008h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int drawStart;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int drawEnd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MvFrameListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f152004d = paint;
        this.f152008h = new android.graphics.Rect();
        this.drawStart = -1;
        this.drawEnd = -1;
        paint.setAntiAlias(true);
        setBackgroundColor(385875967);
    }

    public final int getDrawEnd() {
        return this.drawEnd;
    }

    public final int getDrawStart() {
        return this.drawStart;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        if (r11.a() == true) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.widget.MvFrameListView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int width = this.f152008h.width();
        kp4.a aVar = this.f152005e;
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(width * (aVar != null ? aVar.f311071a : 0), 1073741824), i18);
    }

    public final void setDrawEnd(int i17) {
        this.drawEnd = i17;
        invalidate();
    }

    public final void setDrawStart(int i17) {
        this.drawStart = i17;
        invalidate();
    }
}
