package com.tencent.mm.ui.base;

/* loaded from: classes10.dex */
public class DrawedCallBackFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public db5.m f197243d;

    public DrawedCallBackFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (java.lang.Throwable unused) {
        }
        db5.m mVar = this.f197243d;
        if (mVar != null) {
            e33.m0 m0Var = (e33.m0) mVar;
            m0Var.getClass();
            java.lang.String[] strArr = j33.d0.f297428a;
            com.tencent.mm.plugin.report.service.f0.b(19);
            com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI albumPreviewUI = m0Var.f247353a;
            if (albumPreviewUI.R) {
                albumPreviewUI.R = false;
            }
            this.f197243d = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    public void setListener(db5.m mVar) {
        this.f197243d = mVar;
    }
}
