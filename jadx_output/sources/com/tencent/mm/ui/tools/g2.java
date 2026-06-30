package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210436d;

    public g2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210436d = cropImageNewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.tools.CropImageNewUI.f209997t;
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210436d;
        long longExtra = cropImageNewUI.getIntent().getLongExtra("CropImage_Msg_Id", 0L);
        long longExtra2 = cropImageNewUI.getIntent().getLongExtra("CropImage_Msg_Svr_Id", 0L);
        java.lang.String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_Username");
        android.content.Intent intent = new android.content.Intent(cropImageNewUI, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ImageDownloadUI.class);
        intent.putExtra("img_msg_id", longExtra);
        intent.putExtra("img_server_id", longExtra2);
        intent.putExtra("img_download_compress_type", 1);
        intent.putExtra("img_download_username", stringExtra);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(cropImageNewUI, arrayList2.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "viewHdImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        cropImageNewUI.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(cropImageNewUI, "com/tencent/mm/ui/tools/CropImageNewUI", "viewHdImg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/ui/tools/CropImageNewUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
