package ec3;

/* loaded from: classes9.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec3.l f251004d;

    public f(ec3.l lVar) {
        this.f251004d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec3.l lVar = this.f251004d;
        db5.t7.m(lVar.getActivity(), lVar.getActivity().getResources().getString(com.tencent.mm.R.string.lha));
    }
}
