package ho1;

/* loaded from: classes5.dex */
public final class d0 implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f282649a;

    public d0(yz5.l lVar) {
        this.f282649a = lVar;
    }

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.l lVar = this.f282649a;
        if (i17 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectConversationByName resultCode=");
            sb6.append(i17);
            sb6.append(", dataIsNull=");
            sb6.append(intent == null);
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
            return;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
        if (stringArrayExtra == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationByName selectedUser is null");
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(null)));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(com.tencent.mm.sdk.platformtools.h2.b(stringArrayExtra))));
        }
    }
}
