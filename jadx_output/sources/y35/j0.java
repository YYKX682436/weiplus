package y35;

/* loaded from: classes11.dex */
public final class j0 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView f459225d;

    public j0(com.tencent.mm.pluginsdk.ui.preference.VerifyRecordListView verifyRecordListView) {
        this.f459225d = verifyRecordListView;
    }

    @Override // l75.q0
    public final void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (this.f459225d.f191078h) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VerifyRecordListView", "cloudListener onNotifyChange, event = %s", str);
        ((ku5.t0) ku5.t0.f312615d).B(new y35.i0(this.f459225d));
    }
}
