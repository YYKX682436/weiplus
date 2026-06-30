package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class y2 implements com.tencent.mm.plugin.multitalk.ilinkservice.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.z2 f149862a;

    public y2(com.tencent.mm.plugin.multitalk.ilinkservice.z2 z2Var) {
        this.f149862a = z2Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: accept success! tryTriggerAcceptSucc %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "steve: accept failed errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149862a.f149869e.f149508a;
            i4Var.Y.b(i4Var.f149623f);
        }
    }
}
