package g95;

/* loaded from: classes11.dex */
public final class w {
    public w(kotlin.jvm.internal.i iVar) {
    }

    public final p75.m a(p75.m condition) {
        kotlin.jvm.internal.o.g(condition, "condition");
        java.lang.String[] FILTER_ARRAY_MAIN = c01.e2.f37120d;
        kotlin.jvm.internal.o.f(FILTER_ARRAY_MAIN, "FILTER_ARRAY_MAIN");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int length = FILTER_ARRAY_MAIN.length;
        int i17 = 0;
        while (true) {
            p75.m mVar = null;
            if (i17 >= length) {
                if (!arrayList.isEmpty()) {
                    p75.m mVar2 = (p75.m) arrayList.get(0);
                    int size = arrayList.size();
                    mVar = mVar2;
                    for (int i18 = 1; i18 < size; i18++) {
                        mVar = mVar.d((p75.m) arrayList.get(i18));
                    }
                }
                return mVar != null ? condition.c(mVar) : condition;
            }
            java.lang.String str = FILTER_ARRAY_MAIN[i17];
            if (str != null) {
                switch (str.hashCode()) {
                    case -322617401:
                        if (str.equals("@talkroom")) {
                            mVar = dm.i2.L.p("'%@talkroom'");
                            break;
                        }
                        break;
                    case -75338371:
                        if (str.equals("@im.chatroom")) {
                            mVar = dm.i2.L.p("'%@im.chatroom'");
                            break;
                        }
                        break;
                    case -44918482:
                        if (str.equals("@openim")) {
                            mVar = dm.i2.L.p("'%@openim'");
                            break;
                        }
                        break;
                    case 2003425:
                        if (str.equals("@app")) {
                            mVar = dm.i2.L.p("'%@app'");
                            break;
                        }
                        break;
                    case 62583684:
                        if (str.equals("@qqim")) {
                            mVar = dm.i2.L.p("'%@qqim'");
                            break;
                        }
                        break;
                    case 173894253:
                        if (str.equals("@weclaw")) {
                            mVar = dm.i2.L.p("'%@weclaw'");
                            break;
                        }
                        break;
                    case 712601042:
                        if (str.equals("@chatroom_exclusive")) {
                            mVar = dm.i2.L.t("'%@chatroom'");
                            break;
                        }
                        break;
                    case 904475972:
                        if (str.equals("@micromsg.qq.com")) {
                            mVar = dm.i2.L.t("'%@%'");
                            break;
                        }
                        break;
                    case 1531566739:
                        if (str.equals("@kefu.openim")) {
                            mVar = dm.i2.L.p("'%@kefu.openim'");
                            break;
                        }
                        break;
                    case 1725327475:
                        if (str.equals("@chatroom")) {
                            mVar = dm.i2.L.p("'%@chatroom'");
                            break;
                        }
                        break;
                    case 1779033826:
                        str.equals("@all.android");
                        break;
                    case 1805984685:
                        if (str.equals("@t.qq.com")) {
                            mVar = dm.i2.L.p("'%@t.qq.com'");
                            break;
                        }
                        break;
                }
            }
            if (mVar != null) {
                arrayList.add(mVar);
            }
            i17++;
        }
    }

    public final java.util.List b() {
        android.database.Cursor B;
        p75.i0 g17 = dm.i2.K.g(kz5.b0.c(dm.i2.L));
        g17.f352657d = dm.i2.W.j("message_fold");
        p75.l0 a17 = g17.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l75.k0 k0Var = gm0.j1.u().f273153f;
        if (k0Var != null && (B = k0Var.B(a17.f352636a, a17.f352637b)) != null) {
            while (B.moveToNext()) {
                try {
                    arrayList.add(B.getString(0));
                } finally {
                }
            }
            vz5.b.a(B, null);
        }
        return arrayList;
    }

    public final int c() {
        android.database.Cursor B;
        p75.n0 n0Var = dm.i2.K;
        p75.i0 g17 = n0Var.g(kz5.b0.c(new p75.j(dm.i4.COL_USERNAME, "string", n0Var.f352676a, "", "count")));
        g17.f352657d = dm.i2.W.j("message_fold");
        p75.l0 a17 = g17.a();
        l75.k0 k0Var = gm0.j1.u().f273153f;
        if (k0Var != null && (B = k0Var.B(a17.f352636a, a17.f352637b)) != null) {
            try {
                if (B.moveToNext()) {
                    int i17 = B.getInt(0);
                    vz5.b.a(B, null);
                    return i17;
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return 0;
    }

    public final java.util.List d(java.util.List columns, java.util.List usernameList) {
        kotlin.jvm.internal.o.g(columns, "columns");
        kotlin.jvm.internal.o.g(usernameList, "usernameList");
        p75.i0 g17 = dm.i2.K.g(columns);
        g17.f352657d = dm.i2.L.l(usernameList);
        p75.l0 a17 = g17.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.l4 l4Var : a17.k(gm0.j1.u().f273153f, com.tencent.mm.storage.l4.class)) {
            java.lang.String h17 = l4Var.h1();
            kotlin.jvm.internal.o.f(h17, "getUsername(...)");
            hashMap.put(h17, l4Var);
        }
        java.util.Iterator it = usernameList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.l4 l4Var2 = (com.tencent.mm.storage.l4) hashMap.get((java.lang.String) it.next());
            if (l4Var2 != null) {
                arrayList.add(l4Var2);
            }
        }
        return arrayList;
    }

    public final int e(java.lang.String username, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        p75.n0 n0Var = dm.i2.K;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(dm.i2.W.f352625a, str);
        contentValues.put(dm.i2.X.f352625a, java.lang.Integer.valueOf(i17));
        p75.h1 j17 = n0Var.j(contentValues);
        j17.f352651c = dm.i2.L.j(username);
        int f17 = j17.a().f(gm0.j1.u().f273153f);
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if ((Di instanceof l75.a1) && f17 > 0) {
            Di.b(3, Di, username);
        }
        return f17;
    }

    public final int f(java.util.List userNames, java.lang.String parentRef) {
        kotlin.jvm.internal.o.g(userNames, "userNames");
        kotlin.jvm.internal.o.g(parentRef, "parentRef");
        p75.n0 n0Var = dm.i2.K;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(dm.i2.W.f352625a, parentRef);
        p75.h1 j17 = n0Var.j(contentValues);
        j17.f352651c = dm.i2.L.l(userNames);
        int f17 = j17.a().f(gm0.j1.u().f273153f);
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if ((Di instanceof l75.a1) && f17 > 0) {
            Di.b(8, Di, kz5.n0.g0(userNames, ";", null, null, 0, null, null, 62, null));
        }
        return f17;
    }
}
