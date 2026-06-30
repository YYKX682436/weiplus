package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes12.dex */
public class a3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f159503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI f159504e;

    public a3(com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI scanTranslationCaptureUI, com.tencent.mm.plugin.scanner.ui.ScanTranslationCaptureUI.AnonymousClass1 anonymousClass1) {
        this.f159504e = scanTranslationCaptureUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView;
        if (view == null) {
            multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(this.f159504e, 0, 0);
            multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        } else {
            multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) view;
        }
        android.graphics.Bitmap bitmap = this.f159503d;
        if (bitmap != null) {
            multiTouchImageView.setImageBitmap(bitmap);
            int width = this.f159503d.getWidth();
            int height = this.f159503d.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.i();
        }
        return multiTouchImageView;
    }
}
