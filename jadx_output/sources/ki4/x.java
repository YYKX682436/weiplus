package ki4;

@j95.b
/* loaded from: classes9.dex */
public final class x extends i95.w implements bi4.w0 {
    public static com.tencent.mm.modelbase.m1 wi(ki4.x xVar, jz5.l params, bi4.v0 v0Var, androidx.lifecycle.y yVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            v0Var = null;
        }
        if ((i17 & 4) != 0) {
            yVar = null;
        }
        if ((i17 & 8) != 0) {
            z17 = true;
        }
        xVar.getClass();
        kotlin.jvm.internal.o.g(params, "params");
        fi4.a aVar = new fi4.a(kz5.b0.c(params), z17);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        kotlin.jvm.internal.o.f(d17, "getNetSceneQueue(...)");
        ii4.a.a(d17, aVar, yVar, new ki4.t(aVar, v0Var));
        return aVar;
    }

    public final mj4.w Ai(java.lang.String str) {
        mj4.x n17 = ni4.x.f337776d.n();
        n17.getClass();
        if (str == null || r26.n0.N(str)) {
            return null;
        }
        p75.n0 TABLE = rj4.h.f396351u;
        kotlin.jvm.internal.o.f(TABLE, "TABLE");
        p75.d SESSIONID = rj4.h.f396352v;
        kotlin.jvm.internal.o.f(SESSIONID, "SESSIONID");
        p75.i0 i17 = TABLE.i();
        com.tencent.mm.sdk.platformtools.t8.n(str);
        kotlin.jvm.internal.o.f(str, "escapeSqlValue(...)");
        i17.f352657d = SESSIONID.j(str);
        return (mj4.w) i17.a().o(n17.f327085d, mj4.w.class);
    }

    public final void Bi(java.lang.String str, android.content.Context context) {
        ni4.x.f337776d.h().y0(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Chat_Self", en1.a.a());
        intent.putExtra("Chat_User", str);
        intent.putExtra("finish_direct", true);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
    }

    public final void Di(java.lang.String str, java.lang.String str2, android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null || r26.n0.N(str)) {
            return;
        }
        if (str2 == null || r26.n0.N(str2)) {
            return;
        }
        ni4.x xVar = ni4.x.f337776d;
        java.lang.String str3 = xVar.m().y0(str).field_sessionId;
        if (str3 == null) {
            str3 = "";
        }
        if (r26.n0.N(str3)) {
            xVar.m().z0(str, str2, 0, 0, 0, 0, "");
        }
        mj4.w Ai = Ai(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpChatting() called with: contact == null ");
        sb6.append(Ai == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusContactService", sb6.toString());
        if (Ai == null) {
            wi(this, new jz5.l(str, str2), new ki4.u(this, str, context), null, false, 12, null);
        } else {
            Bi(str, context);
        }
    }

    public final void Ni(android.content.Context context, java.lang.String changeUserName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(changeUserName, "changeUserName");
        android.content.Intent intent = new android.content.Intent();
        intent.addFlags(67108864);
        intent.addFlags(268435456);
        intent.putExtra("Chat_User", changeUserName);
        intent.putExtra("Chat_Mode", 1);
        intent.setClassName(context, "com.tencent.mm.ui.chatting.ChattingUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/conversation/service/TextStatusContactService", "jumpFriendChatting", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/textstatus/conversation/service/TextStatusContactService", "jumpFriendChatting", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Ri(java.lang.String str, int i17) {
        hi4.k kVar = hi4.m.f281555f;
        if (str == null) {
            str = "";
        }
        kVar.d(str, i17);
    }
}
