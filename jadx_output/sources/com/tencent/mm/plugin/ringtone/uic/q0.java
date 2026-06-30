package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v0 f158462d;

    public q0(com.tencent.mm.plugin.ringtone.uic.v0 v0Var) {
        this.f158462d = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.List<ox3.a> data;
        com.tencent.mm.plugin.ringtone.uic.v0 v0Var = this.f158462d;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = v0Var.f158518m;
        if (wxRecyclerAdapter == null || (data = wxRecyclerAdapter.getData()) == null) {
            return;
        }
        for (ox3.a aVar : data) {
            aVar.f349722e = false;
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter2 = v0Var.f158518m;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.d0(aVar.getItemId(), java.lang.Boolean.FALSE);
            }
        }
    }
}
