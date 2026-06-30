package hy2;

/* loaded from: classes.dex */
public final class l implements uh4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hy2.m f286065a;

    public l(hy2.m mVar) {
        this.f286065a = mVar;
    }

    @Override // uh4.a0
    public final void onResult(int i17, java.lang.String str, boolean z17) {
        hy2.m mVar = this.f286065a;
        pm0.v.X(new hy2.k(z17, mVar));
        mVar.f286066d = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "jumpToAuthorization isChecking " + mVar.f286066d + " finish " + mVar.getActivity().isFinishing() + " activity:" + mVar.getActivity());
    }
}
