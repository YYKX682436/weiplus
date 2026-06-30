package com.tencent.mm.ui.mvvm.uic.conversation.recent;

/* loaded from: classes.dex */
public final class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 f209350d;

    public o0(com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 r0Var) {
        this.f209350d = r0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f stateCenter;
        j75.f stateCenter2;
        com.tencent.mm.ui.mvvm.uic.conversation.recent.r0 r0Var = this.f209350d;
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = r0Var.P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.B3(new wi5.b());
        }
        int e17 = com.tencent.mm.ui.zk.e(r0Var.getActivity(), com.tencent.mm.R.dimen.f479727dj);
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = r0Var.P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.B3(new wi5.t(e17));
    }
}
