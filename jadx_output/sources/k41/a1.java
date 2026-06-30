package k41;

/* loaded from: classes9.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final k41.a1 f303968a = new k41.a1();

    public static final boolean a(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(username);
        if (p17 != null) {
            java.lang.String h17 = p17.h1();
            if (!(h17 == null || h17.length() == 0) && p17.h1().equals(username)) {
                return true;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConversationLogic", "isKefuConversationExist conv invalid username: %s", username);
        return false;
    }

    public final void b(java.lang.String str, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.l4 l4Var) {
        java.util.Map d17;
        if (l4Var == null) {
            return;
        }
        l4Var.h2(f9Var);
        l4Var.S1(java.lang.String.valueOf(f9Var.getType()));
        l4Var.l1(f9Var.Q0() + ':' + f9Var.j());
        f9Var.j();
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().w() != null) {
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
            java.lang.String Q0 = f9Var.Q0();
            f9Var.u1(str);
            f9Var.d1(l4Var.j());
            qm.a0.d(f9Var, pString, pString2, pInt, true);
            java.lang.String str2 = pString2.value;
            if (str2 == null || str2.length() == 0) {
                pString2.value = Q0;
            }
            int type = f9Var.getType();
            java.lang.String j17 = f9Var.j();
            kotlin.jvm.internal.o.f(j17, "getContent(...)");
            java.lang.String str3 = null;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(j17) && type == 49 && (d17 = com.tencent.mm.sdk.platformtools.aa.d(j17, "msg", null)) != null) {
                str3 = (java.lang.String) d17.get(".msg.appmsg.title");
            }
            if (str3 == null) {
                str3 = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str4 = pString.value;
            if (str4 == null) {
                str4 = "";
            }
            sb6.append(str4);
            sb6.append(str3.length() == 0 ? "" : " ".concat(str3));
            l4Var.o1(sb6.toString());
            l4Var.p1(pString2.value);
            l4Var.K1(pInt.value);
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMKefuConversationLogic", "doFillParentConversationInfo talker: %s, msgType: %s, digest: %s, digestUser: %s, parenConv: %s, lastOfMsgTalker: %s", str, java.lang.Integer.valueOf(f9Var.getType()), l4Var.y0(), l4Var.z0(), l4Var.h1(), Q0);
        }
    }

    public final void c(com.tencent.mm.storage.l4 l4Var, com.tencent.mm.storage.l4 l4Var2) {
        com.tencent.mm.storage.f9 f9Var;
        java.lang.String str;
        com.tencent.mm.storage.l4 d17 = d();
        if (d17 != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConversationLogic", "fillParentConversationInfo the lastest openim kefu conversation username is %s", d17.h1());
            f9Var = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(d17.h1());
            str = d17.W0();
            kotlin.jvm.internal.o.f(str, "getParentRef(...)");
        } else if (l4Var != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConversationLogic", "fillParentConversationInfo the lastest openim kefu conversation is null");
            com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(l4Var.h1());
            java.lang.String W0 = l4Var.W0();
            kotlin.jvm.internal.o.f(W0, "getParentRef(...)");
            str = W0;
            f9Var = q57;
        } else {
            f9Var = null;
            str = "";
        }
        boolean z17 = false;
        if (f9Var != null) {
            if (f9Var.getMsgId() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            b(str, f9Var, l4Var2);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMKefuConversationLogic", "the last of msg is invalid");
            l4Var2.f2();
        }
    }

    public final com.tencent.mm.storage.l4 d() {
        com.tencent.mm.storage.l4 l4Var = null;
        android.database.Cursor s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(6, null, "opencustomerservicemsg", -1);
        if (s17 != null) {
            if (s17.getCount() > 0 && s17.moveToFirst()) {
                com.tencent.mm.storage.l4 l4Var2 = new com.tencent.mm.storage.l4();
                l4Var2.convertFrom(s17);
                l4Var = l4Var2;
            }
            s17.close();
        }
        return l4Var;
    }
}
