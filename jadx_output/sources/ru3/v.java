package ru3;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f399774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f399775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout f399776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f399777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f399778h;

    public v(int i17, android.view.View view, com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout, float f17, android.view.View view2) {
        this.f399774d = i17;
        this.f399775e = view;
        this.f399776f = wxCropOperationLayout;
        this.f399777g = f17;
        this.f399778h = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ru3.m[] mVarArr = ru3.m.f399762d;
        float f17 = this.f399777g;
        com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout wxCropOperationLayout = this.f399776f;
        android.view.View view = this.f399775e;
        int i17 = this.f399774d;
        if (i17 == 0) {
            view.setTranslationY(wxCropOperationLayout.getBoxRect().top + f17);
            view.setTranslationX(wxCropOperationLayout.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr2 = ru3.m.f399762d;
        if (i17 == 1) {
            view.setTranslationY(wxCropOperationLayout.getBoxRect().top + f17);
            view.setTranslationX((wxCropOperationLayout.getBoxRect().right - f17) - view.getWidth());
            return;
        }
        ru3.m[] mVarArr3 = ru3.m.f399762d;
        android.view.View view2 = this.f399778h;
        if (i17 == 2) {
            view.setTranslationY((wxCropOperationLayout.getBoxRect().bottom - f17) - view2.getHeight());
            view.setTranslationX(wxCropOperationLayout.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr4 = ru3.m.f399762d;
        if (i17 == 3) {
            view.setTranslationY((wxCropOperationLayout.getBoxRect().bottom - f17) - view2.getHeight());
            view.setTranslationX((wxCropOperationLayout.getBoxRect().right - f17) - view.getWidth());
            return;
        }
        ru3.m[] mVarArr5 = ru3.m.f399762d;
        if (i17 == 4) {
            view.setTranslationY((wxCropOperationLayout.getBoxRect().top - f17) - view2.getHeight());
            view.setTranslationX(wxCropOperationLayout.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr6 = ru3.m.f399762d;
        if (i17 == 5) {
            view.setTranslationY((wxCropOperationLayout.getBoxRect().top - f17) - view2.getHeight());
            view.setTranslationX((wxCropOperationLayout.getBoxRect().right - f17) - view.getWidth());
            return;
        }
        ru3.m[] mVarArr7 = ru3.m.f399762d;
        if (i17 == 6) {
            view.setTranslationY(wxCropOperationLayout.getBoxRect().bottom + f17);
            view.setTranslationX(wxCropOperationLayout.getBoxRect().left + f17);
            return;
        }
        ru3.m[] mVarArr8 = ru3.m.f399762d;
        if (i17 == 7) {
            view.setTranslationY(wxCropOperationLayout.getBoxRect().bottom + f17);
            view.setTranslationX((wxCropOperationLayout.getBoxRect().right - f17) - view.getWidth());
        }
    }
}
