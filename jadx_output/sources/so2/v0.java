package so2;

/* loaded from: classes10.dex */
public final class v0 {

    /* renamed from: a */
    public static final so2.v0 f410644a = new so2.v0();

    public static void a(so2.v0 v0Var, r45.vx0 vx0Var, r45.ev2 finderShareCollection, android.app.Activity context, java.lang.String str, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 8) != 0) {
            str = null;
        }
        if ((i17 & 16) != 0) {
            lVar = null;
        }
        v0Var.getClass();
        kotlin.jvm.internal.o.g(finderShareCollection, "finderShareCollection");
        kotlin.jvm.internal.o.g(context, "context");
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        if (vx0Var == null) {
            com.tencent.mars.xlog.Log.i("doCollectionFav", "but collectionInfo is null");
            return;
        }
        if (vx0Var.getLong(0) == 0 || finderShareCollection.getLong(0) == 0 || finderShareCollection.getLong(0) != vx0Var.getLong(0)) {
            com.tencent.mars.xlog.Log.i("doCollectionFav", "but collectionInfo=" + vx0Var.toJSON() + " \t finderShareCollection=" + finderShareCollection.toJSON());
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.d("" + vx0Var.getLong(0));
        jq0Var.c((long) vx0Var.getInteger(7));
        jq0Var.i(pm0.v.u(vx0Var.getLong(0)));
        jq0Var.g(38);
        bq0Var.o(jq0Var);
        bq0Var.Q = finderShareCollection;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = "";
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 34;
        if (lVar != null) {
            lVar.invoke(doFavoriteEvent);
        }
        com.tencent.mars.xlog.Log.i("doCollectionFav", "finderShareCollection=" + finderShareCollection.toJSON());
        c4Var.f6332r = str;
        c4Var.f6323i = context;
        com.tencent.mars.xlog.Log.i("Finder.FinderFavLogic", "publish fav collection event, id:".concat(pm0.v.u(vx0Var.getLong(0))));
        doFavoriteEvent.e();
    }

    public static void b(so2.v0 v0Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, android.app.Activity context, java.lang.String str, yz5.l lVar, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            lVar = null;
        }
        v0Var.getClass();
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(context, "context");
        if (hz2.d.f286313a.a(ya.a.SHARE)) {
            return;
        }
        com.tencent.mm.plugin.finder.assist.n7 n7Var = com.tencent.mm.plugin.finder.assist.n7.f102406a;
        com.tencent.mm.plugin.finder.storage.FinderItem feed2 = feed.getFeedObject();
        kotlin.jvm.internal.o.g(feed2, "feed");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(c01.z1.r());
        jq0Var.d("" + feed2.getId());
        jq0Var.c(feed2.m132getCreateTime());
        jq0Var.i("FavSourceId" + feed2.getId());
        jq0Var.g(31);
        bq0Var.o(jq0Var);
        bq0Var.i(com.tencent.mm.plugin.finder.assist.n7.j(n7Var, feed2, false, null, 6, null));
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = "";
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 20;
        if (lVar != null) {
            lVar.invoke(doFavoriteEvent);
        }
        c4Var.f6332r = str;
        c4Var.f6323i = context;
        com.tencent.mars.xlog.Log.i("Finder.FinderFavLogic", "publish fav event, id:" + feed.getItemId());
        doFavoriteEvent.e();
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        com.tencent.mm.plugin.finder.report.l0.f125109a.c(V6, feed.getFeedObject(), 42, "", V6 != null ? V6.getInteger(5) : 0);
    }

    public static /* synthetic */ void d(so2.v0 v0Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, boolean z17, int i17, int i18, java.lang.String str, r45.bc1 bc1Var, int i19, java.lang.Object obj) {
        v0Var.c(appCompatActivity, finderItem, z17, i17, (i19 & 16) != 0 ? 0 : i18, (i19 & 32) != 0 ? null : str, (i19 & 64) != 0 ? null : bc1Var);
    }

    public final void c(androidx.appcompat.app.AppCompatActivity context, com.tencent.mm.plugin.finder.storage.FinderItem finderObject, boolean z17, int i17, int i18, java.lang.String str, r45.bc1 bc1Var) {
        int i19;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        com.tencent.mars.xlog.Log.i("Finder.FinderFavLogic", "favFeed, id:" + finderObject.getId() + ", pf:" + finderObject.getFeedObject().getPermissionFlag());
        pf5.z zVar = pf5.z.f353948a;
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        if (z17) {
            java.lang.Object a17 = zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ec2.d e27 = zy2.ra.e2((zy2.ra) a17, 0, 1, null);
            if (e27 != null) {
                e27.a(new ec2.a(10, finderObject.getId(), finderObject.getDupFlag()));
            }
        } else {
            java.lang.Object a18 = zVar.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            ec2.d e28 = zy2.ra.e2((zy2.ra) a18, 0, 1, null);
            if (e28 != null) {
                e28.a(new ec2.a(11, finderObject.getId(), finderObject.getDupFlag()));
            }
        }
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        long id6 = finderObject.getId();
        java.lang.String dupFlag = finderObject.getDupFlag();
        int i27 = z17 ? 2 : 1;
        o3Var.getClass();
        com.tencent.mm.plugin.finder.storage.FinderItem dk6 = o3Var.dk(id6);
        if (dk6 != null) {
            com.tencent.mm.autogen.mmdata.rpt.FinderClickStruct finderClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderClickStruct();
            finderClickStruct.f56649d = finderClickStruct.b("SessionId", V6.getString(0), true);
            finderClickStruct.f56650e = finderClickStruct.b("ClickUI", "", true);
            finderClickStruct.f56651f = finderClickStruct.b("FeedId", o3Var.Ui(id6), true);
            finderClickStruct.f56652g = finderClickStruct.b("FeedUsr", dk6.getUserName(), true);
            finderClickStruct.f56653h = 5L;
            finderClickStruct.f56654i = i27;
            finderClickStruct.f56655j = 0L;
            finderClickStruct.f56656k = finderClickStruct.b("ReplyUsr", "", true);
            finderClickStruct.f56657l = 2L;
            finderClickStruct.f56658m = dk6.getLikeCount();
            finderClickStruct.f56659n = dk6.getCommentCount();
            finderClickStruct.f56660o = dk6.getFriendLikeCount();
            finderClickStruct.f56661p = dk6.getMediaType();
            finderClickStruct.f56662q = finderClickStruct.b("Tag", r26.i0.t(com.tencent.mm.plugin.finder.report.o3.f125207s.a(dk6), ",", ";", false), true);
            finderClickStruct.f56663r = finderClickStruct.b("TagId", "", true);
            finderClickStruct.f56664s = V6.getInteger(5);
            finderClickStruct.f56665t = kotlin.jvm.internal.o.b(dk6.getUserName(), xy2.c.f(V6)) ? 1L : 0L;
            java.lang.String string = V6.getString(1);
            if (string == null) {
                string = "";
            }
            finderClickStruct.f56667v = finderClickStruct.b("ContextId", string, true);
            i19 = 2;
            java.lang.String string2 = V6.getString(2);
            if (string2 == null) {
                string2 = "";
            }
            finderClickStruct.f56668w = finderClickStruct.b("ClickTabContextId", string2, true);
            finderClickStruct.f56669x = finderClickStruct.b("SessionBuffer", o3Var.ek(id6, dupFlag, V6.getInteger(5)), true);
            java.lang.String string3 = V6.getString(11);
            finderClickStruct.f56671z = finderClickStruct.b("ExtraInfo", string3 != null ? r26.i0.t(string3, ",", ";", false) : "", true);
            java.lang.String string4 = V6.getString(12);
            finderClickStruct.A = finderClickStruct.b("enterSourceInfo", string4 != null ? r26.i0.t(string4, ",", ";", false) : "", true);
            finderClickStruct.k();
            o3Var.Zk(finderClickStruct);
        } else {
            i19 = 2;
        }
        if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.d2().r()).booleanValue()) {
            nv2.d1.a(nv2.d1.f340475b, finderObject, z17, i17, V6, i18, str, null, bc1Var, 64, null);
            return;
        }
        nv2.o.a(nv2.o.f340558e, finderObject, z17, i17, null, V6, i18, str, null, bc1Var, 136, null);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        long id7 = finderObject.getId();
        am.ia iaVar = feedUpdateEvent.f54252g;
        iaVar.f6918a = id7;
        iaVar.f6920c = z17 ? 1 : i19;
        iaVar.f6919b = 5;
        feedUpdateEvent.e();
    }
}
