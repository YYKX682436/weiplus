package com.tencent.mm.plugin.multitask.ui.base;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001cJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\nH\u0016R$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapViewWrapper;", "Landroid/widget/FrameLayout;", "Lrk3/a;", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setBitmap", "", "isFullScreen", "setFullScreen", "Landroid/view/View;", "getView", "Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "d", "Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "getSnapView", "()Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;", "setSnapView", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskSnapView;)V", "snapView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class MultiTaskSnapViewWrapper extends android.widget.FrameLayout implements rk3.a {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView snapView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTaskSnapViewWrapper(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }

    public final void a() {
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView = new com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView(getContext());
        this.snapView = multiTaskSnapView;
        addView(multiTaskSnapView);
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView2 = this.snapView;
        if (multiTaskSnapView2 == null) {
            return;
        }
        multiTaskSnapView2.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public final com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView getSnapView() {
        return this.snapView;
    }

    @Override // rk3.a
    public android.view.View getView() {
        return this;
    }

    @Override // rk3.a
    public void setBitmap(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(1.0f, 1.0f);
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView = this.snapView;
        if (multiTaskSnapView != null) {
            multiTaskSnapView.setImageMatrix(matrix);
        }
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView2 = this.snapView;
        if (multiTaskSnapView2 != null) {
            multiTaskSnapView2.setImageBitmap(bitmap);
        }
    }

    public final void setFullScreen(boolean z17) {
        if (z17) {
            return;
        }
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView = this.snapView;
        android.view.ViewGroup.LayoutParams layoutParams = multiTaskSnapView != null ? multiTaskSnapView.getLayoutParams() : null;
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = com.tencent.mm.ui.bl.i(getContext(), -1);
        }
        com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView2 = this.snapView;
        if (multiTaskSnapView2 == null) {
            return;
        }
        multiTaskSnapView2.setLayoutParams(layoutParams2);
    }

    public final void setSnapView(com.tencent.mm.plugin.multitask.ui.base.MultiTaskSnapView multiTaskSnapView) {
        this.snapView = multiTaskSnapView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTaskSnapViewWrapper(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTaskSnapViewWrapper(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        a();
    }
}
