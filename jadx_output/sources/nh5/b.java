package nh5;

/* loaded from: classes11.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nh5.c f337126e;

    public b(nh5.c cVar, java.lang.String str) {
        this.f337126e = cVar;
        this.f337125d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        nh5.c cVar = this.f337126e;
        cVar.f337128d.dismiss();
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI = cVar.f337129e;
        int i17 = com.tencent.mm.ui.matrix.ManualDumpActivity.f209102s;
        matrixBaseLeakResultUI.getClass();
        java.lang.String str = this.f337125d;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "dealWithFile fail, filePath is empty");
            dp.a.makeText((android.content.Context) matrixBaseLeakResultUI, com.tencent.mm.R.string.j4_, 1).show();
            matrixBaseLeakResultUI.finish();
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.E0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "dealWithFile fail, filePath is refer to private file.");
            dp.a.makeText((android.content.Context) matrixBaseLeakResultUI, com.tencent.mm.R.string.j4_, 1).show();
            matrixBaseLeakResultUI.finish();
            return;
        }
        long k17 = com.tencent.mm.vfs.w6.k(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ManualDumpActivity", "filelength: [%d]", java.lang.Long.valueOf(k17));
        if (k17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ManualDumpActivity", "dealWithFile fail, fileLength is 0");
            dp.a.makeText((android.content.Context) matrixBaseLeakResultUI, com.tencent.mm.R.string.j4_, 1).show();
            matrixBaseLeakResultUI.finish();
            return;
        }
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(new com.tencent.mm.opensdk.modelmsg.WXFileObject(str));
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        java.lang.String str3 = a17.f213279f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        wXMediaMessage.title = str3;
        wXMediaMessage.description = com.tencent.mm.sdk.platformtools.t8.f0(k17);
        com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req req = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req();
        req.transaction = null;
        req.message = wXMediaMessage;
        android.os.Bundle bundle = new android.os.Bundle();
        req.toBundle(bundle);
        bundle.putInt(com.tencent.mm.opensdk.constants.ConstantsAPI.SDK_VERSION, com.tencent.mm.opensdk.constants.Build.SDK_INT);
        bundle.putString(com.tencent.mm.opensdk.constants.ConstantsAPI.APP_PACKAGE, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        android.content.Intent className = new android.content.Intent().setClassName((android.content.Context) matrixBaseLeakResultUI, "com.tencent.mm.ui.transmit.SelectConversationUI");
        className.putExtra("Select_Conv_NextStep", new android.content.Intent().setClassName((android.content.Context) matrixBaseLeakResultUI, "com.tencent.mm.ui.transmit.SendAppMessageWrapperUI").putExtras(bundle).putExtra("animation_pop_in", true));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(className);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(matrixBaseLeakResultUI, arrayList.toArray(), "com/tencent/mm/ui/matrix/ManualDumpActivity", "sendHprofFile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        matrixBaseLeakResultUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(matrixBaseLeakResultUI, "com/tencent/mm/ui/matrix/ManualDumpActivity", "sendHprofFile", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
