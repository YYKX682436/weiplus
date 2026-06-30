package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.ChattingImageBGView f200456d;

    public e5(com.tencent.mm.ui.chatting.ChattingImageBGView chattingImageBGView) {
        this.f200456d = chattingImageBGView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.ChattingImageBGView chattingImageBGView = this.f200456d;
        android.graphics.Bitmap bitmap = chattingImageBGView.f198220d;
        if (bitmap == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but bmp is null");
            return;
        }
        if (bitmap.getWidth() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingImageBGView", "want to reset matrix, but measured width error");
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float measuredWidth = chattingImageBGView.getMeasuredWidth() / chattingImageBGView.f198220d.getWidth();
        float measuredHeight = chattingImageBGView.getMeasuredHeight() / chattingImageBGView.f198220d.getHeight();
        chattingImageBGView.getMeasuredWidth();
        chattingImageBGView.getMeasuredHeight();
        if (measuredWidth > measuredHeight) {
            matrix.setScale(measuredWidth, measuredWidth);
        } else {
            matrix.setScale(measuredHeight, measuredHeight);
            matrix.postTranslate((chattingImageBGView.getMeasuredWidth() - (chattingImageBGView.f198220d.getWidth() * measuredHeight)) / 2.0f, 0.0f);
        }
        chattingImageBGView.setImageMatrix(matrix);
    }
}
