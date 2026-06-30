package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class i2 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.CropImageNewUI f210477a;

    public i2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI) {
        this.f210477a = cropImageNewUI;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI = this.f210477a;
        if (i17 != 0) {
            if (i17 != 1) {
                return;
            }
            int i18 = com.tencent.mm.ui.tools.CropImageNewUI.f209997t;
            java.lang.String stringExtra = cropImageNewUI.getIntent().getStringExtra("CropImage_ImgPath");
            ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.a(stringExtra, cropImageNewUI, null);
            return;
        }
        int i19 = com.tencent.mm.ui.tools.CropImageNewUI.f209997t;
        java.lang.String stringExtra2 = cropImageNewUI.getIntent().getStringExtra("CropImage_ImgPath");
        int intExtra = cropImageNewUI.getIntent().getIntExtra("CropImage_CompressType", 0);
        int intExtra2 = cropImageNewUI.getIntent().getIntExtra("CropImage_Msg_Id", -1);
        android.content.Intent intent = new android.content.Intent(cropImageNewUI, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_File_Name", stringExtra2);
        intent.putExtra("Retr_Msg_Id", intExtra2);
        intent.putExtra("Retr_Msg_Type", 0);
        intent.putExtra("Retr_Compress_Type", intExtra);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(cropImageNewUI, arrayList.toArray(), "com/tencent/mm/ui/tools/CropImageNewUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        cropImageNewUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(cropImageNewUI, "com/tencent/mm/ui/tools/CropImageNewUI", "doRestransmitMsg", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
