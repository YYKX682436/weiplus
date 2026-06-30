package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/MultiEditCropLayout;", "Lcom/tencent/mm/ui/widget/cropview/CropLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public class MultiEditCropLayout extends com.tencent.mm.ui.widget.cropview.CropLayout {

    /* renamed from: p1, reason: collision with root package name */
    public boolean f176117p1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiEditCropLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout, com.tencent.mm.ui.widget.cropview.BaseCropLayout, com.tencent.mm.ui.widget.cropview.TouchEventLayout
    public void c(android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(e17, "e1");
        if (!this.f176117p1) {
            super.c(e17);
            return;
        }
        ml5.h onChangeListener = getOnChangeListener();
        ml5.i iVar = onChangeListener instanceof ml5.i ? (ml5.i) onChangeListener : null;
        if (iVar != null) {
            iVar.b();
        }
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout
    public void q(boolean z17, int i17, int i18, int i19, int i27) {
        if (!this.f176117p1) {
            super.q(z17, i17, i18, i19, i27);
            return;
        }
        android.view.View contentView = getContentView();
        if (contentView == null || !this.isShouldLayout) {
            return;
        }
        setShouldLayout(false);
        getContentBaseRect().set(contentView.getLeft(), contentView.getTop(), contentView.getRight(), contentView.getBottom());
        contentView.setPivotX(getContentBaseRect().exactCenterX());
        contentView.setPivotY(getContentBaseRect().exactCenterY());
        getTmpRectF().set(getContentBaseRect());
        getMainMatrix().mapRect(getTmpRectF());
        getTmpRectF().round(getContentRect());
        getContentRectF().set(getTmpRectF());
        if (((java.lang.Boolean) getInitFinish().invoke(getMainMatrix())).booleanValue()) {
            y();
            getContentRectF().round(getContentCenterRect());
        }
    }

    @Override // com.tencent.mm.ui.widget.cropview.CropLayout
    public void z(android.graphics.RectF rectF, boolean z17) {
        kotlin.jvm.internal.o.g(rectF, "rectF");
        if (this.f176117p1) {
            getVisibilityRect().set(rectF);
        } else {
            super.z(rectF, z17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiEditCropLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
