package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class j9 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.n9 f190434a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(com.tencent.mm.pluginsdk.ui.chat.n9 n9Var, android.os.Looper looper) {
        super(looper);
        this.f190434a = n9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        android.graphics.Bitmap bitmap;
        android.view.View view;
        android.view.View view2;
        com.tencent.mm.pluginsdk.ui.chat.n9 n9Var = this.f190434a;
        if (!((com.tencent.mm.pluginsdk.ui.chat.ChatFooter) n9Var.f190523l).O0()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RecentImageBubble", "[checkIfShow] is not support.");
            return;
        }
        android.widget.ImageView imageView = n9Var.f190517f;
        if (imageView == null || n9Var.f190514c == null || (bitmap = n9Var.f190518g) == null || n9Var.f190519h == null || (view = n9Var.f190520i) == null || (view2 = n9Var.f190521j) == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
        boolean z17 = n9Var.f190522k;
        int i17 = z17 ? 83 : 85;
        int i18 = z17 ? 0 : 10;
        com.tencent.mm.pluginsdk.ui.chat.i8 i8Var = n9Var.f190523l;
        int yFromBottom = i8Var != null ? i8Var.getYFromBottom() : view2.getHeight();
        android.graphics.Rect rect = com.tencent.mm.ui.bk.f197978a;
        int i19 = n9Var.f190522k ? 0 : i18 + rect.right;
        int i27 = yFromBottom + rect.bottom;
        com.tencent.mars.xlog.Log.i("MicroMsg.RecentImageBubble", "recent bubble navbar height %s %s", java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom));
        android.content.Context context = n9Var.f190512a;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                try {
                    n9Var.f190519h.showAtLocation(view, i17, i19, i27);
                } catch (java.lang.NullPointerException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RecentImageBubble", e17, "", new java.lang.Object[0]);
                }
            }
        }
        new com.tencent.mm.sdk.platformtools.b4(new com.tencent.mm.pluginsdk.ui.chat.l9(n9Var), false).c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }
}
