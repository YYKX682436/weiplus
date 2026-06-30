package com.tencent.mm.ui.tools;

/* loaded from: classes15.dex */
public class x2 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageView f210898a;

    public x2(com.tencent.mm.ui.tools.CropImageView cropImageView) {
        this.f210898a = cropImageView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 4653) {
            return;
        }
        int i17 = com.tencent.mm.ui.tools.CropImageView.F;
        com.tencent.mm.ui.tools.CropImageView cropImageView = this.f210898a;
        cropImageView.getClass();
        cropImageView.setImageBitmap(cropImageView.f210012e);
        cropImageView.invalidate();
    }
}
