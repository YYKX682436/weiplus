package hy2;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f286063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy2.m f286064e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, hy2.m mVar) {
        super(0);
        this.f286063d = z17;
        this.f286064e = mVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (!this.f286063d) {
            hy2.m mVar = this.f286064e;
            mVar.getActivity().finish();
            mVar.getActivity().overridePendingTransition(0, com.tencent.mm.R.anim.f477889ed);
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderTeenModeTempAuthMgr", "jumpToAuthorization finish " + mVar.getActivity().isFinishing() + " activity:" + mVar.getActivity());
            mVar.f286067e = true;
        }
        return jz5.f0.f302826a;
    }
}
