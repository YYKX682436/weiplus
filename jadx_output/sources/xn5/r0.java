package xn5;

/* loaded from: classes13.dex */
public final class r0 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn5.t0 f455719d;

    public r0(xn5.t0 t0Var) {
        this.f455719d = t0Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        yn5.l lVar;
        com.tencent.mm.sdk.platformtools.x2.n();
        if (com.tencent.mars.xlog.Log.isDebug()) {
            java.lang.ref.WeakReference j17 = com.tencent.mm.app.w.INSTANCE.j();
            android.content.Context context = j17 != null ? (android.app.Activity) j17.get() : null;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) context : null;
            if (mMFragmentActivity != null && (lVar = mMFragmentActivity.inflateXMLInfo) != null) {
                lVar.b();
            }
        }
        xn5.t0.wi(this.f455719d);
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
