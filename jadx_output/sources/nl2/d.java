package nl2;

/* loaded from: classes3.dex */
public final class d implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl2.g f338174d;

    public d(nl2.g gVar) {
        this.f338174d = gVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        nl2.g gVar = this.f338174d;
        int i17 = ((mm2.u0) gVar.business(mm2.u0.class)).f329447m;
        if (num != null && i17 == num.intValue()) {
            com.tencent.mars.xlog.Log.i("FinderLiveOuterShortcutWordingController", "updateQuickReplyInfo, version:" + num);
            gVar.Z6();
        }
    }
}
