package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class v9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f210847d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f210848e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.u9 f210849f;

    public v9(com.tencent.mm.ui.tools.u9 u9Var, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, android.graphics.Bitmap bitmap) {
        this.f210849f = u9Var;
        this.f210847d = wXMediaMessage;
        this.f210848e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "load image from url success");
        android.graphics.Bitmap bitmap = this.f210848e;
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.f210847d;
        wXMediaMessage.setThumbImage(bitmap);
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.transaction = null;
        req.message = wXMediaMessage;
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        com.tencent.mm.ui.tools.u9 u9Var = this.f210849f;
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = u9Var.f210818b;
        androidx.appcompat.app.AppCompatActivity context = shareImgUI.getContext();
        int i17 = com.tencent.mm.ui.tools.ShareImgUI.f210151w;
        android.content.Intent o76 = shareImgUI.o7(context, com.tencent.mm.ui.transmit.SelectConversationUI.class);
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI2 = u9Var.f210818b;
        o76.putExtra("Select_Conv_NextStep", shareImgUI2.o7(shareImgUI2.getContext(), com.tencent.mm.ui.transmit.SendAppMessageWrapperUI.class).putExtras(bundle).putExtra("animation_pop_in", true));
        o76.addFlags(268435456).addFlags(32768);
        u9Var.f210818b.d7(o76);
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI3 = u9Var.f210818b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(o76);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(shareImgUI3, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareImgUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        shareImgUI3.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(shareImgUI3, "com/tencent/mm/ui/tools/ShareImgUI$8$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        u9Var.f210818b.finish();
    }
}
