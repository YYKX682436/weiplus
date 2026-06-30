package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class d2 implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.j2 f173802a;

    public d2(com.tencent.mm.plugin.textstatus.ui.j2 j2Var) {
        this.f173802a = j2Var;
    }

    @Override // bi4.m0
    public final void a(int i17, java.lang.Object obj) {
        java.util.Objects.toString(obj);
        if (i17 != 1) {
            return;
        }
        com.tencent.mm.plugin.textstatus.ui.j2 j2Var = this.f173802a;
        j2Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissByCloseBtn: ");
        j2Var.dismiss();
        bi4.n0 f17 = j2Var.f();
        if (f17 != null) {
            ((com.tencent.mm.plugin.textstatus.ui.q3) f17).S5(102L);
        }
    }
}
