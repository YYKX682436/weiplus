package com.tencent.mm.plugin.finder.megavideo.topstory;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/topstory/DoubleLayerView;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "e", "Ljz5/g;", "getDefaultMatrix", "()Landroid/graphics/Matrix;", "defaultMatrix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class DoubleLayerView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f120877d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g defaultMatrix;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.Bitmap f120879f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Matrix f120880g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap f120881h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Matrix f120882i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleLayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        this.f120877d = "DoubleLayerView";
        this.defaultMatrix = jz5.h.b(vn2.a.f438235d);
    }

    private final android.graphics.Matrix getDefaultMatrix() {
        return (android.graphics.Matrix) ((jz5.n) this.defaultMatrix).getValue();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.graphics.Bitmap bitmap = this.f120879f;
        if (bitmap != null) {
            android.graphics.Matrix matrix = this.f120880g;
            if (matrix == null) {
                matrix = getDefaultMatrix();
            }
            canvas.drawBitmap(bitmap, matrix, null);
        }
        android.graphics.Bitmap bitmap2 = this.f120881h;
        if (bitmap2 != null) {
            android.graphics.Matrix matrix2 = this.f120882i;
            if (matrix2 == null) {
                matrix2 = getDefaultMatrix();
            }
            canvas.drawBitmap(bitmap2, matrix2, null);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
    }
}
