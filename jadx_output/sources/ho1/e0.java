package ho1;

/* loaded from: classes.dex */
public final class e0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282660a;

    public e0(yz5.l lVar) {
        this.f282660a = lVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.l lVar = this.f282660a;
        if (i17 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectConversationlabels resultCode=");
            sb6.append(i17);
            sb6.append(", dataIsNull=");
            sb6.append(intent == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        if (stringArrayListExtra != null) {
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(stringArrayListExtra)));
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationlabels label is null");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        }
    }
}
