package y35;

/* loaded from: classes11.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView f459218d;

    public i0(com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView verifyRecordListView) {
        this.f459218d = verifyRecordListView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView verifyRecordListView = this.f459218d;
        y35.j jVar = verifyRecordListView.f191074d;
        if (jVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VerifyRecordListView", "refreshFromCloud skip, args is null");
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f459224f)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.VerifyRecordListView", "refreshFromCloud skip, encryptUsername is empty");
            return;
        }
        boolean z17 = true;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(jVar.f459219a, true);
        com.tencent.mm.plugin.profile.s2 s2Var = com.tencent.mm.plugin.profile.s2.f153615a;
        android.content.Context context = verifyRecordListView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.d(n17);
        y35.r[] a17 = s2Var.a(context, n17, jVar.f459220b, jVar.f459224f, jVar.f459221c);
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = a17 != null ? java.lang.Integer.valueOf(a17.length) : "null";
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyRecordListView", "refreshFromCloud, providers = %s", objArr);
        if (a17 != null) {
            if (!(a17.length == 0)) {
                z17 = false;
            }
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VerifyRecordListView", "refreshFromCloud, no providers, hide all");
            verifyRecordListView.c();
            verifyRecordListView.setVisibility(8);
        } else {
            verifyRecordListView.a(a17);
            if (com.tencent.mm.sdk.platformtools.t8.K0(jVar.f459221c)) {
                return;
            }
            verifyRecordListView.setVisibility(0);
        }
    }
}
