package com.tencent.mm.ui.chatting;

/* loaded from: classes15.dex */
public class s9 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f21.e f202667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.n9 f202668e;

    public s9(com.tencent.mm.ui.chatting.n9 n9Var, f21.e eVar) {
        this.f202668e = n9Var;
        this.f202667d = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        java.lang.String str = (java.lang.String) obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.EggMgr", "show %s, %s", bool, str);
        if (!bool.booleanValue() || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
        d12.b bVar = new d12.b(null, null, null, false, 0, null, 63, null);
        bVar.f225720f = str;
        f21.e eVar = this.f202667d;
        if (eVar.f258883s.f258912e == null) {
            return null;
        }
        this.f202668e.f(eVar, bVar);
        return null;
    }
}
