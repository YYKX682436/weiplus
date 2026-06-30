package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public final class b3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f159509d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI f159510e;

    public b3(com.tencent.mm.plugin.scanner.ui.ScanTranslationResultUI scanTranslationResultUI) {
        this.f159510e = scanTranslationResultUI;
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
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        if (view == null) {
            multiTouchImageView = new com.tencent.mm.ui.base.MultiTouchImageView(this.f159510e.getContext(), 0, 0);
            multiTouchImageView.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
        } else {
            multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) view;
        }
        android.graphics.Bitmap bitmap = this.f159509d;
        if (bitmap != null) {
            multiTouchImageView.setImageBitmap(bitmap);
            android.graphics.Bitmap bitmap2 = this.f159509d;
            kotlin.jvm.internal.o.d(bitmap2);
            int width = bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = this.f159509d;
            kotlin.jvm.internal.o.d(bitmap3);
            int height = bitmap3.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
            multiTouchImageView.i();
        }
        return multiTouchImageView;
    }
}
