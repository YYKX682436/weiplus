package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f158426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f158427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.k1 f158428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, com.tencent.mm.plugin.ringtone.uic.k1 k1Var) {
        super(0);
        this.f158426d = u3Var;
        this.f158427e = z17;
        this.f158428f = k1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f158426d;
        if (u3Var != null) {
            u3Var.hide();
        }
        boolean z17 = this.f158427e;
        com.tencent.mm.plugin.ringtone.uic.k1 k1Var = this.f158428f;
        if (z17) {
            db5.t7.h(k1Var.getActivity(), k1Var.getActivity().getResources().getString(com.tencent.mm.R.string.f492842i34));
            k1Var.f158440d.setValue(mx3.i0.f());
        } else {
            db5.t7.g(k1Var.getActivity(), k1Var.getActivity().getResources().getString(com.tencent.mm.R.string.i2o));
        }
        return jz5.f0.f302826a;
    }
}
