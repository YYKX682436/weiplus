package u20;

/* loaded from: classes9.dex */
public final class h implements com.tencent.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f423879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u20.i f423880e;

    public h(int i17, u20.i iVar) {
        this.f423879d = i17;
        this.f423880e = iVar;
    }

    @Override // com.tencent.mm.ui.xc
    public void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        int i19 = this.f423879d;
        u20.i iVar = this.f423880e;
        if (i19 != i17) {
            com.tencent.mars.xlog.Log.i("EcsShareToContactLogicImage", "handleNormalImage, requestCode: " + i17 + " is not match");
            iVar.a();
            return;
        }
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.i("EcsShareToContactLogicImage", "handleNormalImage, resultCode is not RESULT_OK: " + i18);
            iVar.a();
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null;
        boolean z17 = true;
        if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
            com.tencent.mars.xlog.Log.w("EcsShareToContactLogicImage", "handleNormalImage, toUsers is empty");
            iVar.b("toUsers is empty");
            return;
        }
        if (!(stringArrayListExtra instanceof java.util.Collection) || !stringArrayListExtra.isEmpty()) {
            java.util.Iterator<T> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.storage.z3.R4((java.lang.String) it.next())) {
                    break;
                }
            }
        }
        z17 = false;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fw6);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        com.tencent.mars.xlog.Log.i("EcsShareToContactLogicImage", "handleNormalImage, toUser: " + stringArrayListExtra);
        iVar.d(z17);
    }
}
