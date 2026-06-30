package lf4;

/* loaded from: classes4.dex */
public final class k {
    public k(kotlin.jvm.internal.i iVar) {
    }

    public final java.util.ArrayList a(java.lang.String username, boolean z17) {
        java.util.List<nf4.j> P0;
        kotlin.jvm.internal.o.g(username, "username");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (z17) {
            ef4.v vVar = ef4.w.f252468t;
            nf4.l i17 = vVar.i();
            boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(vVar.e(), username);
            int e17 = c01.id.e();
            ef4.n.f252460a.a();
            P0 = i17.W0(username, D0, e17 - 86400);
        } else {
            ef4.v vVar2 = ef4.w.f252468t;
            nf4.l i18 = vVar2.i();
            boolean D02 = com.tencent.mm.sdk.platformtools.t8.D0(vVar2.e(), username);
            int e18 = c01.id.e();
            ef4.n.f252460a.a();
            P0 = i18.P0(username, D02, e18 - 86400, true);
        }
        for (nf4.j jVar : P0) {
            r45.lf6 y07 = jVar.y0();
            r45.oe6 oe6Var = y07.f379432h;
            if (oe6Var != null && oe6Var.f382205e.size() != 0) {
                if4.g storyItemScene = (2 & 2) != 0 ? if4.g.f291250d : null;
                kotlin.jvm.internal.o.g(storyItemScene, "storyItemScene");
                arrayList.add(new if4.f(jVar, jVar.y0(), storyItemScene));
                com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDb story username " + username + ' ' + arrayList.size() + " content " + ((r45.xe6) y07.f379432h.f382205e.get(0)).f390025h + " and " + ((r45.xe6) y07.f379432h.f382205e.get(0)).f390023f + " id:" + jVar.field_storyID + " storyUsername: " + jVar.field_userName + " tryCount:" + jVar.v0().f391018e + " flag:" + jVar.field_localFlag);
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList b(java.lang.String username, java.lang.String date) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(date, "date");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) ef4.w.f252468t.i().d1(username, (int) (new java.text.SimpleDateFormat("yyyy-MM-dd").parse(date).getTime() / 1000))).iterator();
        while (it.hasNext()) {
            nf4.j jVar = (nf4.j) it.next();
            r45.lf6 y07 = jVar.y0();
            r45.oe6 oe6Var = y07.f379432h;
            if (oe6Var != null && oe6Var.f382205e.size() != 0) {
                arrayList.add(new if4.f(jVar, jVar.y0(), if4.g.f291250d));
                com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.GalleryController", "getGalleryItemsFromDbByDate story username " + username + ' ' + arrayList.size() + " content " + ((r45.xe6) y07.f379432h.f382205e.get(0)).f390025h + " and " + ((r45.xe6) y07.f379432h.f382205e.get(0)).f390023f + " id:" + jVar.field_storyID + " storyUsername: " + jVar.field_userName);
            }
        }
        return arrayList;
    }

    public final if4.f c(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mars.xlog.Log.i("MicroMsg.Gallery.GalleryController", "LogStory: loadSyncData ".concat(username));
        ef4.v vVar = ef4.w.f252468t;
        nf4.f y07 = vVar.g().y0(username);
        if (y07.field_syncId == 0) {
            return null;
        }
        if (z17) {
            nf4.j L0 = vVar.i().L0(y07.field_syncId);
            nf4.j jVar = new nf4.j();
            jVar.field_storyID = y07.field_syncId;
            jVar.field_createTime = y07.field_storyPostTime;
            jVar.field_userName = y07.getUserName();
            r45.lf6 lf6Var = new r45.lf6();
            r45.oe6 oe6Var = new r45.oe6();
            r45.tl5 tl5Var = new r45.tl5();
            tl5Var.f386553e = 0.0f;
            tl5Var.f386552d = 0.0f;
            lf6Var.f379431g = tl5Var;
            lf6Var.f379432h = oe6Var;
            lf6Var.f379428d = "";
            lf6Var.f379430f = 0;
            lf6Var.f379429e = y07.getUserName();
            lf6Var.f379430f = y07.field_storyPostTime;
            r45.xe6 xe6Var = new r45.xe6();
            xe6Var.f390021d = "empty_" + c01.id.c();
            if (L0 != null && L0.y0().f379435n == 0) {
                java.lang.String str = y07.field_newThumbUrl;
                if (str == null) {
                    str = "";
                }
                xe6Var.f390025h = str;
                java.lang.String str2 = y07.field_newVideoUrl;
                xe6Var.f390023f = str2 != null ? str2 : "";
            }
            lf6Var.f379432h.f382205e.add(xe6Var);
            jVar.D0(lf6Var);
            return new if4.f(jVar, lf6Var, null, 4, null);
        }
        nf4.j jVar2 = new nf4.j();
        jVar2.field_storyID = y07.field_syncId;
        jVar2.field_createTime = y07.field_storyPostTime;
        jVar2.field_userName = y07.getUserName();
        r45.lf6 lf6Var2 = new r45.lf6();
        r45.oe6 oe6Var2 = new r45.oe6();
        r45.tl5 tl5Var2 = new r45.tl5();
        tl5Var2.f386553e = 0.0f;
        tl5Var2.f386552d = 0.0f;
        lf6Var2.f379431g = tl5Var2;
        lf6Var2.f379432h = oe6Var2;
        lf6Var2.f379428d = "";
        lf6Var2.f379430f = 0;
        lf6Var2.f379429e = y07.getUserName();
        lf6Var2.f379430f = y07.field_storyPostTime;
        r45.xe6 xe6Var2 = new r45.xe6();
        xe6Var2.f390021d = "empty_" + c01.id.c();
        java.lang.String str3 = y07.field_newThumbUrl;
        if (str3 == null) {
            str3 = "";
        }
        xe6Var2.f390025h = str3;
        java.lang.String str4 = y07.field_newVideoUrl;
        xe6Var2.f390023f = str4 != null ? str4 : "";
        long j17 = y07.field_duration;
        xe6Var2.f390040z = j17 > 0 ? (float) (j17 / 1000.0d) : 0.0f;
        lf6Var2.f379432h.f382205e.add(xe6Var2);
        jVar2.D0(lf6Var2);
        return new if4.f(jVar2, lf6Var2, null, 4, null);
    }
}
