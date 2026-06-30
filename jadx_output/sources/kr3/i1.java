package kr3;

/* loaded from: classes8.dex */
public final class i1 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kr3.q1 f311388a;

    public i1(kr3.q1 q1Var) {
        this.f311388a = q1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        kr3.q1 q1Var = this.f311388a;
        if (z17) {
            kr3.q1.O6(q1Var);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ModProfile.ContactAssembleManagerUIC", "onCancelClick(): changed but do not save");
        q1Var.W6(java.lang.Boolean.FALSE);
        q1Var.getActivity().finish();
    }
}
