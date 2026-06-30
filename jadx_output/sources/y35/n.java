package y35;

/* loaded from: classes11.dex */
public class n implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.FMessageListView f459228d;

    public n(com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView) {
        this.f459228d = fMessageListView;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        long j17;
        com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView = this.f459228d;
        if (fMessageListView.f191069o) {
            return;
        }
        fMessageListView.getClass();
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateShake, id is null");
            return;
        }
        try {
            j17 = com.tencent.mm.sdk.platformtools.t8.V(str, 0L);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateShake, id = " + str + ", ex = " + e17.getMessage());
            j17 = 0L;
        }
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateShake fail, sysRowId is invalid");
            return;
        }
        com.tencent.mm.storage.pa paVar = new com.tencent.mm.storage.pa();
        if (!r21.w.Di().get(j17, paVar)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateShake, get fail, id = " + j17);
            return;
        }
        y35.j jVar = fMessageListView.f191065h;
        if (jVar == null || !jVar.f459219a.equals(paVar.field_sayhiuser)) {
            return;
        }
        java.lang.String str2 = fMessageListView.f191065h.f459221c;
        if (str2 != null && str2.length() > 0) {
            fMessageListView.setVisibility(0);
        }
        fMessageListView.a(y35.r.d(fMessageListView.f191064g, paVar));
    }
}
