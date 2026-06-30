package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class t9 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f21.e f202708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.n9 f202709e;

    public t9(com.tencent.mm.ui.chatting.n9 n9Var, f21.e eVar) {
        this.f202709e = n9Var;
        this.f202708d = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "show %s, data:%s", bool, str);
        if (bool.booleanValue() && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            this.f202709e.f(this.f202708d, null);
        }
        return null;
    }
}
