package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes3.dex */
public class k4 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f159580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.TranslationResultUI f159581e;

    public k4(com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI, com.tencent.mm.plugin.scanner.ui.c4 c4Var) {
        this.f159581e = translationResultUI;
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
        com.tencent.mm.plugin.scanner.ui.TranslationResultUI translationResultUI = this.f159581e;
        if (translationResultUI.f159478q == null) {
            translationResultUI.f159478q = new com.tencent.mm.ui.base.MultiTouchImageView(translationResultUI, 0, 0);
            translationResultUI.f159478q.setLayoutParams(new android.widget.Gallery.LayoutParams(-1, -1));
            translationResultUI.f159478q.i();
        }
        android.graphics.Bitmap bitmap = this.f159580d;
        if (bitmap != null) {
            translationResultUI.f159478q.setImageBitmap(bitmap);
            com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = translationResultUI.f159478q;
            int width = this.f159580d.getWidth();
            int height = this.f159580d.getHeight();
            multiTouchImageView.f197651o = width;
            multiTouchImageView.f197652p = height;
        }
        return translationResultUI.f159478q;
    }
}
