package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class n1 implements qk.i6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149372d;

    public n1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149372d = a2Var;
    }

    @Override // qk.i6
    public void m5() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor onExit");
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149372d;
        a2Var.e();
        if (a2Var.f149280p != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.mmsight.ui.a1(this));
        }
    }

    @Override // qk.i6
    public void onFinish() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightVideoEditor", "photoEditor onFinish");
        this.f149372d.f149275k.g(new com.tencent.mm.plugin.mmsight.ui.z0(this), true);
    }
}
