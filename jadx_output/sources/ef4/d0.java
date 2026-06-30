package ef4;

/* loaded from: classes4.dex */
public final class d0 {
    public d0(kotlin.jvm.internal.i iVar) {
    }

    public final void a(int i17) {
        java.util.LinkedList linkedList;
        r45.xe6 xe6Var;
        java.util.LinkedList linkedList2;
        r45.xe6 xe6Var2;
        java.util.LinkedList linkedList3;
        r45.xe6 xe6Var3;
        ef4.v vVar = ef4.w.f252468t;
        nf4.j J0 = vVar.i().J0(i17);
        java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date(((J0 != null ? java.lang.Integer.valueOf(J0.field_createTime) : null) != null ? r4.intValue() : 0L) * 1000));
        kotlin.jvm.internal.o.f(format, "format(...)");
        nf4.l i18 = vVar.i();
        i18.f336872h.delete("MMStoryInfo", nf4.j.N + "=?", new java.lang.String[]{"" + i17});
        nf4.j b17 = ef4.e0.f252441a.b(vVar.e());
        r45.lf6 y07 = b17.y0();
        r45.oe6 oe6Var = y07.f379432h;
        java.lang.String str = (oe6Var == null || (linkedList3 = oe6Var.f382205e) == null || (xe6Var3 = (r45.xe6) kz5.n0.a0(linkedList3, 0)) == null) ? null : xe6Var3.f390025h;
        r45.oe6 oe6Var2 = y07.f379432h;
        java.lang.String str2 = (oe6Var2 == null || (linkedList2 = oe6Var2.f382205e) == null || (xe6Var2 = (r45.xe6) kz5.n0.a0(linkedList2, 0)) == null) ? null : xe6Var2.f390023f;
        r45.oe6 oe6Var3 = y07.f379432h;
        ef4.a0.f252435a.a(vVar.e(), b17.field_storyID, b17.field_createTime, str, str2, ((oe6Var3 == null || (linkedList = oe6Var3.f382205e) == null || (xe6Var = (r45.xe6) kz5.n0.a0(linkedList, 0)) == null) ? 0.0f : xe6Var.f390040z) * 1000);
        nf4.h y08 = vVar.h().y0(format);
        if (y08 != null) {
            int i19 = y08.field_count - 1;
            y08.field_count = i19;
            if (i19 <= 0) {
                vVar.h().f336857d.delete("MMStoryHistoryItem", "date=?", new java.lang.String[]{format});
                return;
            }
            java.lang.String str3 = J0 != null ? J0.field_userName : null;
            if (str3 != null) {
                java.util.ArrayList arrayList = (java.util.ArrayList) vVar.i().d1(str3, (int) (new java.text.SimpleDateFormat("yyyy-MM-dd").parse(format).getTime() / 1000));
                if (!arrayList.isEmpty()) {
                    ((nf4.j) arrayList.get(0)).field_sourceType |= 16;
                    vVar.i().i1((int) ((nf4.j) arrayList.get(0)).systemRowid, (nf4.j) arrayList.get(0));
                    long j17 = ((nf4.j) arrayList.get(0)).systemRowid;
                    int i27 = ((nf4.j) arrayList.get(0)).field_sourceType;
                }
            }
            vVar.h().z0(y08);
        }
    }

    public final nf4.j b(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        ef4.v vVar = ef4.w.f252468t;
        nf4.l i17 = vVar.i();
        boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), username);
        nf4.j jVar = new nf4.j();
        java.lang.String str = "select *,rowid from MMStoryInfo " + i17.y0(username, D0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        java.lang.String str2 = nf4.l.f336859n;
        if (!D0) {
            str2 = " AND " + nf4.l.f336860o + str2;
        }
        sb6.append(str2);
        android.database.Cursor f17 = i17.f336872h.f(sb6.toString() + " limit 1", null, 2);
        if (f17.moveToFirst()) {
            jVar.convertFrom(f17);
        }
        f17.close();
        return jVar;
    }

    public final long c(nf4.j storyInfo, r45.df6 storyObj, int i17) {
        com.tencent.mm.protobuf.g gVar;
        kotlin.jvm.internal.o.g(storyInfo, "storyInfo");
        kotlin.jvm.internal.o.g(storyObj, "storyObj");
        r45.cu5 cu5Var = storyObj.f372388i;
        if (cu5Var == null || (gVar = cu5Var.f371841f) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.StoryInfoStorageLogic", "object desc is null");
            return storyObj.f372383d;
        }
        java.lang.String str = new java.lang.String(gVar.g(), r26.c.f368865a);
        r45.lf6 a17 = ef4.h0.f252445a.a(str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || a17 == null) {
            return storyObj.f372383d;
        }
        if (!storyInfo.D0(a17)) {
            return storyObj.f372383d;
        }
        storyObj.f372388i.d(new byte[0]);
        storyInfo.field_userName = storyObj.f372384e;
        storyInfo.field_createTime = storyObj.f372386g;
        storyInfo.field_storyID = storyObj.f372383d;
        storyInfo.field_attrBuf = storyObj.toByteArray();
        if (storyObj.f372394r == 1) {
            storyInfo.t0(4);
        } else {
            storyInfo.A0(4);
        }
        if (storyObj.f372395s == 1) {
            storyInfo.t0(8);
        } else {
            storyInfo.A0(8);
        }
        storyInfo.field_favoriteTime = storyObj.f372396t;
        storyInfo.field_sourceType = i17 | storyInfo.field_sourceType;
        r45.lf6 y07 = storyInfo.y0();
        y07.f379429e = storyObj.f372384e;
        storyInfo.G0(y07);
        ef4.w.f252468t.i().update(storyObj.f372383d, storyInfo);
        return storyObj.f372383d;
    }

    public final void d(java.util.List idList, java.util.List localIdList, boolean z17) {
        kotlin.jvm.internal.o.g(idList, "idList");
        kotlin.jvm.internal.o.g(localIdList, "localIdList");
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryInfoStorageLogic", "setStoryFavRemote story count: " + idList.size() + " to " + z17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(localIdList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = idList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ff4.o(((java.lang.Number) it.next()).longValue(), 5, z17 ? 1 : 0));
        }
        gm0.j1.n().f273288b.g(new ff4.e(arrayList2, arrayList));
    }

    public final nf4.j e(java.lang.String username, long j17, int i17, r45.df6 df6Var, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        if (z17) {
            nf4.l i18 = ef4.w.f252468t.i();
            i18.f336872h.delete("MMStoryInfo", "storyID=?", new java.lang.String[]{"" + j17});
            nf4.j jVar = new nf4.j();
            jVar.field_userName = username;
            jVar.field_storyID = j17;
            i18.doNotify("notify_story_info_delete", 1, jVar);
            return null;
        }
        ef4.v vVar = ef4.w.f252468t;
        nf4.j D0 = vVar.i().D0(j17);
        if (D0 == null) {
            D0 = new nf4.j();
        }
        D0.field_storyID = j17;
        D0.field_createTime = i17;
        D0.field_userName = username;
        int i19 = (com.tencent.mm.sdk.platformtools.t8.D0(username, vVar.e()) ? 4 : 8) | D0.field_sourceType;
        D0.field_sourceType = i19;
        if (df6Var != null) {
            c(D0, df6Var, i19);
        } else {
            vVar.i().f336872h.l("MMStoryInfo", "", D0.convertTo());
        }
        return D0;
    }
}
