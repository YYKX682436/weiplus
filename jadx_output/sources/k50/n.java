package k50;

/* loaded from: classes9.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.storage.f9 msgInfo, java.lang.String toUser, p15.n nVar, java.lang.String str) {
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (msgInfo.j() == null) {
            return;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(msgInfo);
        j15.d dVar = new j15.d();
        java.lang.String j17 = msgInfo.j();
        kotlin.jvm.internal.o.f(j17, "getContent(...)");
        dVar.fromXml(j17);
        c01.h7 h7Var = new c01.h7();
        h7Var.f37227b = msgInfo.getMsgId();
        h7Var.f37229d = msgInfo.Q0();
        h7Var.f37226a = S1.f322633a;
        msgInfo.getCreateTime();
        int i17 = S1.j() ? 1 : 0;
        k70.i0 i0Var = new k70.i0();
        i0Var.f304642a = 4;
        i0Var.f304655n = 2;
        i0Var.f304656o = h7Var;
        i0Var.f304661t = new r15.b();
        if (!(str == null || r26.n0.N(str))) {
            r15.b bVar = i0Var.f304661t;
            if (bVar != null) {
                r15.b l17 = dVar.l();
                bVar.o(l17 != null ? l17.j() : null);
            }
            r15.b bVar2 = i0Var.f304661t;
            r15.d j18 = bVar2 != null ? bVar2.j() : null;
            if (j18 != null) {
                j18.k(str);
            }
        }
        i0Var.f304651j = nVar != null ? nVar.k() : null;
        i0Var.f304652k = nVar != null ? nVar.l() : null;
        i0Var.f304653l = nVar != null ? nVar.j() : null;
        java.lang.String r17 = c01.z1.r();
        if (r17 == null) {
            r17 = "";
        }
        r70.g gVar = new r70.g("", i17, r17, toUser, i0Var);
        gVar.f393108j = "forward_single_img";
        gm0.b bVar3 = gm0.j1.b().f273245h;
        if (bVar3 == null || (lifecycleScope = bVar3.f273145e) == null) {
            return;
        }
        v65.i.b(lifecycleScope, null, new k50.m(gVar, null), 1, null);
    }
}
