package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class d3 implements com.tencent.mm.plugin.multitalk.ilinkservice.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149546a;

    public d3(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var) {
        this.f149546a = i4Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "steve: accept success, tryTriggerAcceptSucc %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "steve: accept failed errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        } else {
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149546a;
            i4Var.Y.b(i4Var.f149623f);
        }
    }
}
