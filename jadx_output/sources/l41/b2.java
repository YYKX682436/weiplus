package l41;

@j95.b
/* loaded from: classes11.dex */
public final class b2 extends i95.w implements j41.y {
    public void Ai(java.lang.String str, j41.x xVar) {
        k41.h1 h1Var = k41.h1.f304007d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuGetContactService", "closeContact username: " + str);
        if (str == null) {
            str = "";
        }
        j41.j0 j0Var = new j41.j0(str);
        j0Var.f297648b = 2;
        j0Var.f297650d = xVar;
        k41.h1.f304007d.f(j0Var);
    }

    public k41.k0 Bi(java.lang.String str) {
        return k41.o0.b(str);
    }

    public dm.u8 Di(java.lang.String str) {
        k41.h1 h1Var = k41.h1.f304007d;
        return k41.o0.c(str);
    }

    public boolean Ni(java.lang.String str, java.lang.String toSendUsername) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuService", "sendOpenImkfCard toUsername: %s, cardSendingUsername: %s", str, toSendUsername);
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (toSendUsername != null && toSendUsername.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                l41.a2 a2Var = new l41.a2(str, this);
                kotlin.jvm.internal.o.g(toSendUsername, "toSendUsername");
                j41.h0 h0Var = new j41.h0(0, toSendUsername, null);
                h0Var.f297634d = false;
                com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
                j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
                k41.i0 i0Var = new k41.i0(pBool, a2Var, "<msg bigheadimgurl=\"%s\" smallheadimgurl=\"%s\" username=\"%s\" nickname=\"%s\" openimappid=\"%s\" openimdesc=\"%s\" openimdescicon=\"%s\"/>", toSendUsername);
                ((l41.b2) yVar).getClass();
                k41.h1.a(h0Var, i0Var);
                return pBool.value;
            }
        }
        return false;
    }

    public void Ri(java.lang.String str, java.lang.String str2) {
        if (str2 == null) {
            return;
        }
        java.lang.String decode = java.net.URLDecoder.decode(str2, com.tencent.mapsdk.internal.rv.f51270c);
        if (w11.t1.a(str == null ? "" : str)) {
            w11.r1 b17 = w11.s1.b(str, null, 2, null);
            b17.e(decode);
            b17.h(67);
            b17.f442131f = 1;
            w11.r1.d(b17, null, 1, null);
            return;
        }
        w11.r1 b18 = w11.s1.b(str, null, 2, null);
        b18.g(str);
        b18.e(decode);
        b18.h(67);
        b18.f442131f = 1;
        b18.f442134i = 5;
        b18.a().a();
    }

    public void Ui(com.tencent.mm.storage.l4 l4Var) {
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p("opencustomerservicemsg");
        k41.a1 a1Var = k41.a1.f303968a;
        if (p17 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConversationLogic", "openim kefu service conversation has created");
            p17.T1(null);
            a1Var.c(l4Var, p17);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, "opencustomerservicemsg");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConversationLogic", "create openim kefu service conversation");
        com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4("opencustomerservicemsg");
        l4Var2.f2();
        a1Var.c(l4Var, l4Var2);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().G(l4Var2);
    }

    public boolean wi() {
        android.database.Cursor s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(6, new java.util.ArrayList(), "opencustomerservicemsg", 1);
        return s17 != null && s17.getCount() > 0;
    }
}
