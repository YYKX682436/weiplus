package y35;

/* loaded from: classes11.dex */
public class l implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.FMessageListView f459226d;

    public l(com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView) {
        this.f459226d = fMessageListView;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        long j17;
        com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView = this.f459226d;
        if (fMessageListView.f191069o) {
            return;
        }
        fMessageListView.getClass();
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateLbs, id is null");
            return;
        }
        try {
            j17 = com.tencent.mm.sdk.platformtools.t8.V(str, 0L);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateLbs, id = " + str + ", ex = " + e17.getMessage());
            j17 = 0L;
        }
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateLbs fail, sysRowId is invalid");
            return;
        }
        com.tencent.mm.storage.t8 t8Var = new com.tencent.mm.storage.t8();
        if (!r21.w.Bi().get(j17, t8Var)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FMessageListView", "updateLbs, get fail, id = " + j17);
            return;
        }
        y35.j jVar = fMessageListView.f191065h;
        if (jVar == null || !jVar.f459219a.equals(t8Var.field_sayhiuser)) {
            return;
        }
        java.lang.String str2 = fMessageListView.f191065h.f459221c;
        if (str2 != null && str2.length() > 0) {
            fMessageListView.setVisibility(0);
        }
        fMessageListView.a(y35.r.e(fMessageListView.f191064g, t8Var));
    }
}
