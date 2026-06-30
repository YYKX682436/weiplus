package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes3.dex */
public class IPCallRoundUrlHeadImage extends com.tencent.mm.pluginsdk.ui.applet.CdnImageView {
    public IPCallRoundUrlHeadImage(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.applet.CdnImageView
    public void setImageBitmapCompleted(android.graphics.Bitmap bitmap) {
        if (bitmap != null) {
            setImageBitmap(com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() * 0.5f));
        }
    }

    public IPCallRoundUrlHeadImage(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
