package kr3;

/* loaded from: classes11.dex */
public final class i0 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kr3.q0 f311387a;

    public i0(kr3.q0 q0Var) {
        this.f311387a = q0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        kr3.q0 q0Var = this.f311387a;
        if (z17) {
            kr3.q0.O6(q0Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onCancelClick(): changed but do not save");
        q0Var.W6(java.lang.Boolean.FALSE);
        q0Var.getActivity().finish();
    }
}
