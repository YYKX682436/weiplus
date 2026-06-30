package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class ChattingImageBGView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f198220d;

    /* renamed from: e, reason: collision with root package name */
    public int f198221e;

    public ChattingImageBGView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f198221e = 0;
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }

    @Override // android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        super.onLayout(z17, i17, i18, i19, i27);
        if (!z17 || this.f198221e == (i28 = i19 - i17)) {
            return;
        }
        this.f198221e = i28;
        post(new com.tencent.mm.ui.chatting.e5(this));
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        this.f198220d = bitmap;
        super.setImageBitmap(bitmap);
        post(new com.tencent.mm.ui.chatting.e5(this));
    }

    public ChattingImageBGView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f198221e = 0;
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
    }
}
