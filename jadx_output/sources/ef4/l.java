package ef4;

/* loaded from: classes4.dex */
public final class l implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] args, java.lang.String username) {
        android.content.SharedPreferences.Editor edit;
        android.content.SharedPreferences.Editor putInt;
        android.content.SharedPreferences.Editor putInt2;
        android.content.SharedPreferences.Editor putInt3;
        android.content.SharedPreferences.Editor putInt4;
        android.content.SharedPreferences.Editor edit2;
        android.content.SharedPreferences.Editor putInt5;
        android.content.SharedPreferences.Editor putInt6;
        android.content.SharedPreferences.Editor putInt7;
        android.content.SharedPreferences.Editor putInt8;
        kotlin.jvm.internal.o.g(args, "args");
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", kz5.z.d0(args, null, null, null, 0, null, null, 63, null));
        if (args.length <= 1) {
            return false;
        }
        java.lang.String str = args[1];
        int hashCode = str.hashCode();
        ef4.c0 c0Var = ef4.c0.f252438a;
        java.lang.String str2 = "";
        switch (hashCode) {
            case -2127268982:
                if (!str.equals("strangerDump")) {
                    return false;
                }
                java.util.Iterator it = ((java.util.ArrayList) ef4.w.f252468t.g().z0()).iterator();
                while (it.hasNext()) {
                    nf4.f fVar = (nf4.f) it.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "strangerDump " + fVar.getUserName() + ' ' + fVar.field_syncId + ' ' + fVar.field_readId + ' ' + fVar.field_storyPostTime + ' ' + fVar.field_updateTime);
                }
                return true;
            case -2126867668:
                if (!str.equals("strangerRead")) {
                    return false;
                }
                java.util.Iterator it6 = ((java.util.ArrayList) ef4.w.f252468t.g().z0()).iterator();
                while (it6.hasNext()) {
                    nf4.f fVar2 = (nf4.f) it6.next();
                    fVar2.field_readId = fVar2.field_syncId;
                    ef4.w.f252468t.g().b1(fVar2);
                }
                return true;
            case -2122675824:
                if (!str.equals("dumpFile")) {
                    return false;
                }
                c0Var.c();
                return true;
            case -2113815067:
                if (!str.equals("testcopyDb")) {
                    return false;
                }
                java.lang.String str3 = gm0.j1.u().h() + "StoryMicroMsg.db";
                java.lang.String concat = ef4.w.f252468t.b().concat("StoryMicroMsg.db");
                com.tencent.mm.vfs.w6.c(str3, concat);
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "copydb " + concat);
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "copydb done", 1).show();
                return true;
            case -1699823967:
                if (!str.equals("resetFirst")) {
                    return false;
                }
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_STORY_BUBBLE_COUNT_INT, 0);
                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_STORY_GALLERY_FIRST_BOOLEAN_SYNC;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                c17.x(u3Var, bool);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_STORY_CAPTURE_FIRST_BOOLEAN_SYNC, bool);
                return true;
            case -1522028681:
                if (!str.equals("strangerClear")) {
                    return false;
                }
                java.util.Iterator it7 = ((java.util.ArrayList) ef4.w.f252468t.g().D0()).iterator();
                while (it7.hasNext()) {
                    ef4.w.f252468t.g().delete((nf4.f) it7.next(), new java.lang.String[0]);
                }
                return true;
            case -1408241804:
                if (!str.equals("testDumpInfo")) {
                    return false;
                }
                ef4.v vVar = ef4.w.f252468t;
                android.database.Cursor B = vVar.k().f336880d.B("select count(*) from StoryVideoCacheInfo", null);
                int count = B.getCount();
                B.close();
                java.lang.String str4 = "StoryVideoCacheInfo resultData " + count;
                android.database.Cursor B2 = vVar.i().f336872h.B("select count(*) from MMStoryInfo", null);
                int count2 = B2.getCount();
                B2.close();
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "info1 " + str4 + " info2 " + ("MMStoryInfo resultData " + count2));
                return true;
            case -534114059:
                if (!str.equals("allmockData")) {
                    return false;
                }
                java.lang.String str5 = args[2];
                ef4.v vVar2 = ef4.w.f252468t;
                nf4.f y07 = vVar2.g().y0("foreverzeus");
                nf4.l i17 = vVar2.i();
                boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(vVar2.e(), "foreverzeus");
                int e17 = c01.id.e();
                ef4.n.f252460a.a();
                nf4.k kVar = nf4.l.f336858m;
                java.util.List P0 = i17.P0("foreverzeus", D0, e17 - 86400, false);
                if (P0.isEmpty()) {
                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "allmockData error1", 1).show();
                } else {
                    ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
                    java.util.List<java.lang.String> m17 = c01.v1.m(str5);
                    if (m17 != null) {
                        for (java.lang.String str6 : m17) {
                            ef4.v vVar3 = ef4.w.f252468t;
                            nf4.g g17 = vVar3.g();
                            kotlin.jvm.internal.o.d(str6);
                            nf4.f y08 = g17.y0(str6);
                            int i18 = (int) y08.systemRowid;
                            if (!y08.isValid()) {
                                y07.field_userName = str6;
                                y07.field_storyPostTime = (int) android.os.SystemClock.elapsedRealtime();
                                y07.systemRowid = -1L;
                                if (i18 < 0) {
                                    vVar3.g().insert(y07);
                                } else {
                                    vVar3.g().d1(i18 * 1, y07);
                                }
                            }
                            nf4.j jVar = (nf4.j) P0.get(0);
                            jVar.field_userName = str6;
                            jVar.field_createTime = c01.id.e();
                            r45.lf6 y09 = jVar.y0();
                            y09.f379429e = str6;
                            jVar.G0(y09);
                            vVar3.i().insert(jVar);
                        }
                    }
                    db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "allmockData done", 1).show();
                }
                return true;
            case -505421199:
                if (!str.equals("copyfile")) {
                    return false;
                }
                java.lang.String path = args[2];
                c0Var.c();
                kotlin.jvm.internal.o.g(path, "path");
                ef4.v vVar4 = ef4.w.f252468t;
                c0Var.b(vVar4.b().concat("cpfiles/"), true);
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(path);
                java.lang.String str7 = a17.f213279f;
                if (str7 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str7, false, false);
                    if (!str7.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                if (!m18.a() ? false : m18.f213266a.F(m18.f213267b)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(vVar4.b());
                    sb6.append("cpfiles/");
                    java.lang.String str8 = a17.f213279f;
                    int lastIndexOf = str8.lastIndexOf("/");
                    if (lastIndexOf >= 0) {
                        str8 = str8.substring(lastIndexOf + 1);
                    }
                    sb6.append(str8);
                    str2 = sb6.toString();
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryFileNameUtil", "copy file path " + path + " newPath " + str2);
                    com.tencent.mm.vfs.w6.c(path, str2);
                }
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "copyFile done " + str2, 1).show();
                return true;
            case -350339842:
                if (!str.equals("reseti2v")) {
                    return false;
                }
                android.content.SharedPreferences sharedPreferences = context != null ? context.getSharedPreferences("storyi2v", 0) : null;
                if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null && (putInt = edit.putInt("storyi2v_bitRate", 3500000)) != null && (putInt2 = putInt.putInt("storyi2v_frameRate", 15)) != null && (putInt3 = putInt2.putInt("storyi2v_iFrameInterval", 10)) != null && (putInt4 = putInt3.putInt("storyi2v_MaxSize", com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH)) != null) {
                    putInt4.commit();
                }
                return true;
            case 102573:
                if (!str.equals("i2v")) {
                    return false;
                }
                int D1 = com.tencent.mm.sdk.platformtools.t8.D1(args[2], 0);
                int D12 = com.tencent.mm.sdk.platformtools.t8.D1(args[3], 0);
                int D13 = com.tencent.mm.sdk.platformtools.t8.D1(args[4], 0);
                int D14 = com.tencent.mm.sdk.platformtools.t8.D1(args[5], 0);
                android.content.SharedPreferences sharedPreferences2 = context != null ? context.getSharedPreferences("storyi2v", 0) : null;
                if (sharedPreferences2 != null && (edit2 = sharedPreferences2.edit()) != null && (putInt5 = edit2.putInt("storyi2v_bitRate", D1)) != null && (putInt6 = putInt5.putInt("storyi2v_frameRate", D12)) != null && (putInt7 = putInt6.putInt("storyi2v_iFrameInterval", D13)) != null && (putInt8 = putInt7.putInt("storyi2v_MaxSize", D14)) != null) {
                    putInt8.commit();
                }
                return true;
            case 149228377:
                if (!str.equals("allmakeData")) {
                    return false;
                }
                int D15 = com.tencent.mm.sdk.platformtools.t8.D1(args[2], 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "testMakeData datacount " + D15);
                ef4.v vVar5 = ef4.w.f252468t;
                nf4.l i19 = vVar5.i();
                boolean D02 = com.tencent.mm.sdk.platformtools.t8.D0(vVar5.e(), "ychengo");
                int e18 = c01.id.e();
                ef4.n.f252460a.a();
                nf4.k kVar2 = nf4.l.f336858m;
                int i27 = 0;
                java.util.List P02 = i19.P0("ychengo", D02, e18 - 86400, false);
                int i28 = 0;
                while (i28 < D15) {
                    nf4.j jVar2 = (nf4.j) P02.get(i27);
                    jVar2.field_userName = "ychengo";
                    jVar2.field_createTime = c01.id.e();
                    r45.lf6 y010 = jVar2.y0();
                    y010.f379429e = "ychengo";
                    jVar2.G0(y010);
                    ef4.w.f252468t.i().insert(jVar2);
                    i28++;
                    i27 = 0;
                }
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "testMakeData done " + D15, 1).show();
                return true;
            case 536375440:
                if (!str.equals("allunread")) {
                    return false;
                }
                ef4.v vVar6 = ef4.w.f252468t;
                vVar6.i().z0();
                vVar6.k().y0();
                com.tencent.mm.vfs.w6.f(vVar6.a());
                java.util.Iterator it8 = ((java.util.ArrayList) vVar6.g().D0()).iterator();
                while (it8.hasNext()) {
                    nf4.f fVar3 = (nf4.f) it8.next();
                    fVar3.field_readId = 0L;
                    fVar3.field_md5 = "";
                    fVar3.field_preLoadResource = 0L;
                    fVar3.field_preloadMediaId = "";
                    fVar3.field_preloadStoryId = 0L;
                    ef4.w.f252468t.g().d1(fVar3.systemRowid, fVar3);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "allUnRead done");
                db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "allUnRead Done", 1).show();
                return true;
            case 769522478:
                if (!str.equals("commentClear")) {
                    return false;
                }
                java.util.Iterator it9 = ((java.util.ArrayList) ef4.w.f252468t.f().y0()).iterator();
                while (it9.hasNext()) {
                    ef4.w.f252468t.f().delete((nf4.b) it9.next(), new java.lang.String[0]);
                }
                return true;
            case 856773767:
                if (!str.equals("cleandb")) {
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "cleanDb");
                ef4.v vVar7 = ef4.w.f252468t;
                vVar7.k().y0();
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryExtInfoStorage", "dropTable " + vVar7.g().f336852h.delete("StoryExtItem", null, null));
                gm0.j1.b().c();
                if (vVar7.c().f252475h == null) {
                    vVar7.c().f252475h = new nf4.n(vVar7.d());
                }
                nf4.n nVar = vVar7.c().f252475h;
                kotlin.jvm.internal.o.d(nVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryRoomInfoStorage", "dropTable " + nVar.f336876d.delete("StoryRoomInfo", null, null));
                vVar7.i().z0();
                com.tencent.mm.vfs.w6.f(vVar7.a());
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoEditDataStorage", "dropTable " + ((pc0.s2) ((qc0.k1) i95.n0.c(qc0.k1.class))).Ai().f321243d.delete(lt3.h.f321242f, null, null));
                return true;
            case 1233668806:
                if (!str.equals("videoCacheClear")) {
                    return false;
                }
                nf4.p k17 = ef4.w.f252468t.k();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.database.Cursor B3 = k17.f336880d.B("select * from StoryVideoCacheInfo", null);
                if (B3 != null) {
                    while (B3.moveToNext()) {
                        nf4.o oVar = new nf4.o();
                        oVar.convertFrom(B3);
                        arrayList.add(oVar);
                    }
                    B3.close();
                }
                java.util.Iterator it10 = arrayList.iterator();
                while (it10.hasNext()) {
                    ef4.w.f252468t.k().delete((nf4.o) it10.next(), new java.lang.String[0]);
                }
                return true;
            case 1368796312:
                if (!str.equals("createFile")) {
                    return false;
                }
                java.lang.String a18 = ef4.w.f252468t.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryFileNameUtil", "dumpCacheDir cache ".concat(a18));
                java.lang.Iterable s17 = com.tencent.mm.vfs.w6.s(a18, true);
                for (int i29 = 0; i29 < 100; i29++) {
                    if (s17 != null) {
                        int i37 = 0;
                        for (java.lang.Object obj : s17) {
                            int i38 = i37 + 1;
                            if (i37 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            com.tencent.mm.vfs.x1 x1Var = (com.tencent.mm.vfs.x1) obj;
                            java.lang.String name = x1Var.f213232b;
                            kotlin.jvm.internal.o.f(name, "name");
                            if (!kotlin.jvm.internal.o.b(".nomedia", name)) {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                                java.lang.String str9 = x1Var.f213231a;
                                sb7.append(str9);
                                sb7.append(java.lang.System.currentTimeMillis());
                                com.tencent.mm.vfs.w6.c(str9, sb7.toString());
                                if (i37 <= 2) {
                                }
                            }
                            i37 = i38;
                        }
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.StoryFileNameUtil", "testCreateFiles done cache ".concat(a18));
                return true;
            case 1550482439:
                if (!str.equals("delfile")) {
                    return false;
                }
                com.tencent.mm.vfs.w6.f(ef4.w.f252468t.a());
                return true;
            case 2103071987:
                if (!str.equals("commentDump")) {
                    return false;
                }
                java.util.Iterator it11 = ((java.util.ArrayList) ef4.w.f252468t.f().y0()).iterator();
                while (it11.hasNext()) {
                    nf4.b bVar = (nf4.b) it11.next();
                    com.tencent.mars.xlog.Log.i("MicroMsg.StoryCommand", "commentDump " + bVar.field_storyId + ' ' + bVar.field_readCommentId + ' ' + bVar.field_syncCommentId);
                }
                return true;
            default:
                return false;
        }
    }
}
