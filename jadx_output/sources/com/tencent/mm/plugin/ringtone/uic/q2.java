package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class q2 implements cy3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158465a;

    public q2(com.tencent.mm.plugin.ringtone.uic.b3 b3Var) {
        this.f158465a = b3Var;
    }

    @Override // cy3.v
    public void onPageSelected(int i17) {
        com.tencent.mm.plugin.ringtone.uic.b3 b3Var = this.f158465a;
        int i18 = b3Var.f158363s;
        if (i18 != i17) {
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = b3Var.f158357m;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyItemChanged(i18, java.lang.Boolean.FALSE);
            }
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = b3Var.f158357m;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyItemChanged(i17, java.lang.Boolean.TRUE);
            }
        }
        b3Var.f158363s = i17;
    }
}
