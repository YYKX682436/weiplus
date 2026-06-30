package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.z0 f149442d;

    public x0(com.tencent.mm.plugin.mmsight.ui.z0 z0Var) {
        this.f149442d = z0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mmsight.ui.z0 z0Var = this.f149442d;
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = z0Var.f149453a.f149372d;
        com.tencent.mm.ui.MMActivity mMActivity = a2Var.f149274j;
        a2Var.f149279o = db5.e1.Q(mMActivity, null, mMActivity.getString(com.tencent.mm.R.string.gw_), true, false, null);
        z0Var.f149453a.f149372d.f149272h.pause();
        com.tencent.mm.plugin.mmsight.ui.a2.b(z0Var.f149453a.f149372d, null);
    }
}
