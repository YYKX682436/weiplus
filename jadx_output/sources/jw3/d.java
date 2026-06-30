package jw3;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f302319d;

    public d(com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f302319d = weImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Rect rect = new android.graphics.Rect();
        int dimensionPixelOffset = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f302319d;
        weImageView.getHitRect(rect);
        int i17 = -dimensionPixelOffset;
        rect.inset(i17, i17);
        java.lang.Object parent = weImageView.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null) {
            return;
        }
        view.setTouchDelegate(new android.view.TouchDelegate(rect, weImageView));
    }
}
