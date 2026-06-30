package t00;

/* loaded from: classes9.dex */
public final class e2 implements t00.r0 {
    public static final boolean h(t00.e2 e2Var, android.content.Context context, int i17, int i18, android.content.Intent intent, int i19, java.lang.String str, c00.n3 n3Var) {
        e2Var.getClass();
        if (i17 != i19) {
            n3Var.a();
            return false;
        }
        if (i18 == -1) {
            java.lang.String stringExtra = intent != null ? intent.getStringExtra("Select_Contact") : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, select username nil");
                n3Var.a();
            } else {
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.w9.f193053a;
                kotlin.jvm.internal.o.d(stringExtra);
                com.tencent.mm.ipcinvoker.extension.l.a(str2, new com.tencent.mm.feature.ecs.jsapi.SelectContactEcsActionHandler$IPCUserTicket(stringExtra, str), t00.o1.class, new t00.d2(context, n3Var));
            }
        } else {
            n3Var.onCancel();
        }
        return true;
    }

    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414329j;
    }

    @Override // t00.r0
    public boolean b() {
        return true;
    }

    @Override // t00.r0
    public void c(int i17, android.content.Context context, org.json.JSONObject data, c00.n3 callback, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(callback, "callback");
        int optInt = data.optInt("selectType", 0);
        int i18 = h20.g.f278267a;
        if (optInt == 1) {
            i(i17, context, data, callback, jSONObject);
            return;
        }
        if (optInt != 2) {
            i(i17, context, data, callback, jSONObject);
            return;
        }
        java.lang.String optString = data.optString("ticket");
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, ticket:" + optString);
        if (context == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, ticket:" + optString + ", context is null");
            callback.a();
            return;
        }
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(optString), t00.n1.class)).f68406d;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, ticket:" + optString + ", get chatroomName is null");
            callback.a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, chatroomName:" + str);
        int a17 = cf.b.a(this);
        rd0.d1 d1Var = (rd0.d1) i95.n0.c(rd0.d1.class);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) context;
        java.lang.String string = appCompatActivity.getString(com.tencent.mm.R.string.nei);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        kotlin.jvm.internal.o.d(str);
        kz5.p0 p0Var = kz5.p0.f313996d;
        ((qd0.o0) d1Var).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MvvmSelectContactEcsFeatureService", "createSelectGroupMembersIntent title:" + string + " chatroomName:" + str + " selectedMemberList:" + p0Var + " allUserNameList:" + p0Var);
        android.content.Intent intent = new android.content.Intent(appCompatActivity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        intent.putExtra("titile", string);
        intent.putExtra("chatroomName", str);
        intent.putExtra("chatroommemberlist", kz5.n0.g0(p0Var, ",", null, null, 0, null, null, 62, null));
        intent.putExtra("block_contact", c01.z1.r());
        pf5.j0.a(intent, cj5.q4.class);
        pf5.j0.a(intent, dj5.b0.class);
        pf5.j0.a(intent, dj5.m.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        intent.putExtra("block_contact", c01.z1.r());
        if (appCompatActivity instanceof com.tencent.mm.ui.MMActivity) {
            j45.l.w((com.tencent.mm.ui.MMActivity) context, ".ui.mvvm.MvvmContactListUI", intent, a17, new t00.y1(this, context, a17, optString, callback));
        } else if (appCompatActivity instanceof nf.m) {
            nf.g.a(context).f(new t00.z1(this, context, a17, optString, callback));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.SelectContactEcsActionHandler", "handleSelectGroupMember, context unsupported type");
            callback.a();
        }
    }

    @Override // t00.r0
    public boolean g() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r16, android.content.Context r17, org.json.JSONObject r18, c00.n3 r19, org.json.JSONObject r20) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.e2.i(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }
}
