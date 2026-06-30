package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.m0 f187504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f187505e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.r0 f187506f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(hy4.m0 m0Var, yz5.l lVar, com.tencent.mm.plugin.webview.core.r0 r0Var) {
        super(1);
        this.f187504d = m0Var;
        this.f187505e = lVar;
        this.f187506f = r0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        hy4.m0 m0Var = this.f187504d;
        m0Var.f286174b = 3;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("sourUserName", username);
        m0Var.f286173a = username;
        yz5.l lVar = this.f187505e;
        if (lVar != null) {
            lVar.invoke(username);
        } else {
            nw4.n g07 = this.f187506f.g0();
            if (g07 != null) {
                g07.j("sendAppMessage", true);
                g07.j0(hashMap, 2);
            }
        }
        return jz5.f0.f302826a;
    }
}
