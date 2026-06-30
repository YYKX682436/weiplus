package jz0;

/* loaded from: classes3.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC f302614d;

    public p(com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC) {
        this.f302614d = maasFakeVideoPlayUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.mj_template.sns.backgroundwork.ui.MaasFakeVideoPlayUIC maasFakeVideoPlayUIC = this.f302614d;
        if (maasFakeVideoPlayUIC.getActivity().isFinishing() || maasFakeVideoPlayUIC.getActivity().isDestroyed()) {
            return;
        }
        maasFakeVideoPlayUIC.getActivity().finish();
    }
}
