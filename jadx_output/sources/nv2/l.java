package nv2;

/* loaded from: classes2.dex */
public final class l extends nv2.r {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f340519d;

    /* renamed from: e, reason: collision with root package name */
    public final long f340520e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f340521f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340522g;

    /* renamed from: h, reason: collision with root package name */
    public final int f340523h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.qt2 f340524i;

    /* renamed from: j, reason: collision with root package name */
    public final int f340525j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f340526k;

    /* renamed from: l, reason: collision with root package name */
    public final r45.t21 f340527l;

    /* renamed from: m, reason: collision with root package name */
    public final r45.bc1 f340528m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.finder.storage.FinderItem finderObject, long j17, java.lang.String objectNonceId, boolean z17, int i17, nv2.i1 i1Var, r45.qt2 contextObj, int i18, java.lang.String str, r45.t21 newLifeReportInfo, r45.bc1 bc1Var) {
        super(i1Var);
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(newLifeReportInfo, "newLifeReportInfo");
        this.f340519d = finderObject;
        this.f340520e = j17;
        this.f340521f = objectNonceId;
        this.f340522g = z17;
        this.f340523h = i17;
        this.f340524i = contextObj;
        this.f340525j = i18;
        this.f340526k = str;
        this.f340527l = newLifeReportInfo;
        this.f340528m = bc1Var;
    }

    @Override // nv2.r
    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        super.a(callback);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f340519d;
        boolean isQAFeed = finderItem.isQAFeed();
        r45.qt2 qt2Var = this.f340524i;
        if (!isQAFeed) {
            new db2.h0(new db2.a5(this.f340520e, finderItem.getDupFlag(), this.f340521f, this.f340522g, this.f340523h, this.f340525j, this.f340526k, this.f340527l, this.f340528m), qt2Var).l().K(new nv2.k(this, callback));
            return;
        }
        int i17 = this.f340522g ? 3 : 103;
        java.lang.String f17 = xy2.c.f(qt2Var);
        java.lang.String str = this.f340526k;
        if (str == null) {
            str = "";
        }
        new ho2.h(i17, f17, str, this.f340519d, "FinderLocal_" + java.lang.System.nanoTime()).l().K(new nv2.j(this, callback));
    }

    @Override // nv2.r
    public java.lang.String c() {
        return "id_" + this.f340520e + '_' + this.f340522g;
    }

    public final void d(nv2.o1 callback, com.tencent.mm.modelbase.f cgiBack) {
        int favCount;
        int i17;
        java.lang.String str;
        r45.yz3 yz3Var;
        r45.yz3 yz3Var2;
        r45.yz3 yz3Var3;
        r45.yz3 yz3Var4;
        r45.zu0 zu0Var;
        r45.pm2 pm2Var;
        r45.ll2 ll2Var;
        r45.jn2 jn2Var;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.dm2 object_extend;
        r45.pm2 pm2Var2;
        r45.ll2 ll2Var2;
        r45.jn2 jn2Var2;
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        com.tencent.mars.xlog.Log.i("Finder.FavActionTask", "FavActionTask callback " + cgiBack.f70615a + ' ' + cgiBack.f70616b + ' ' + cgiBack.f70617c);
        int i18 = cgiBack.f70615a;
        long j17 = this.f340520e;
        if (i18 != 0 || cgiBack.f70616b != 0) {
            if (i18 != 4) {
                callback.a(fp0.u.f265291g, true);
                return;
            }
            nv2.o oVar = nv2.o.f340558e;
            nv2.o.f340558e.d(this);
            com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
            feedUpdateEvent.f54252g.f6918a = j17;
            feedUpdateEvent.e();
            callback.a(fp0.u.f265291g, false);
            return;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f340519d;
        int favCount2 = finderItem.getFavCount();
        int favFlag = finderItem.getFavFlag();
        boolean z17 = this.f340522g;
        if (z17) {
            favCount = finderItem.getFavCount();
            if (finderItem.getFavFlag() != 1) {
                i17 = 1;
            }
            i17 = 0;
        } else {
            favCount = finderItem.getFavCount();
            if (finderItem.getFavFlag() == 1) {
                i17 = -1;
            }
            i17 = 0;
        }
        int i19 = favCount + i17;
        e(finderItem, z17 ? 1 : 0, i19);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(finderItem.getExpectId());
        long j18 = -1;
        long j19 = (h17 == null || (feedObject = h17.getFeedObject()) == null || (object_extend = feedObject.getObject_extend()) == null || (pm2Var2 = (r45.pm2) object_extend.getCustom(12)) == null || (ll2Var2 = (r45.ll2) pm2Var2.getCustom(0)) == null || (jn2Var2 = (r45.jn2) ll2Var2.getCustom(4)) == null) ? -1L : jn2Var2.getLong(0);
        r45.dm2 object_extend2 = finderItem.getFeedObject().getObject_extend();
        if (object_extend2 != null && (pm2Var = (r45.pm2) object_extend2.getCustom(12)) != null && (ll2Var = (r45.ll2) pm2Var.getCustom(0)) != null && (jn2Var = (r45.jn2) ll2Var.getCustom(4)) != null) {
            j18 = jn2Var.getLong(0);
        }
        if (j19 == j18) {
            e(h17, z17 ? 1 : 0, i19);
        }
        com.tencent.mars.xlog.Log.i("Finder.FavAction", "CgiFinderFavFeed end favFlag:" + finderItem.getFavFlag() + " favCount " + finderItem.getFavCount() + ' ' + favFlag + ' ' + favCount2);
        nv2.o oVar2 = nv2.o.f340558e;
        nv2.o.f340558e.d(this);
        callback.a(fp0.u.f265290f, false);
        com.tencent.mm.protobuf.f fVar = cgiBack.f70618d;
        r45.x21 x21Var = fVar instanceof r45.x21 ? (r45.x21) fVar : null;
        if (x21Var != null && (yz3Var4 = (r45.yz3) x21Var.getCustom(1)) != null && (zu0Var = (r45.zu0) yz3Var4.getCustom(2)) != null) {
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((cq.k) c17).Vi(finderItem.getUserName(), zu0Var);
        }
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent2 = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        am.ia iaVar = feedUpdateEvent2.f54252g;
        iaVar.f6918a = j17;
        iaVar.f6920c = z17 ? 1 : 2;
        iaVar.f6921d = 1;
        iaVar.f6928k = (x21Var == null || (yz3Var3 = (r45.yz3) x21Var.getCustom(1)) == null) ? 0 : yz3Var3.getInteger(0);
        if (x21Var == null || (yz3Var2 = (r45.yz3) x21Var.getCustom(1)) == null || (str = yz3Var2.getString(1)) == null) {
            str = "";
        }
        iaVar.f6929l = str;
        iaVar.f6919b = 5;
        iaVar.f6934q = finderItem.getFavCount();
        feedUpdateEvent2.e();
        com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent onFinderFeedInfoUpdatedEvent = new com.tencent.mm.autogen.events.OnFinderFeedInfoUpdatedEvent();
        java.lang.String u17 = pm0.v.u(j17);
        am.qm qmVar = onFinderFeedInfoUpdatedEvent.f54571g;
        qmVar.f7718a = u17;
        qmVar.f7722e = finderItem.getFavCount();
        qmVar.f7721d = finderItem.getFavFlag() == 1;
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        qmVar.f7720c = n1Var.l(finderItem.getFeedObject());
        qmVar.f7719b = ((java.lang.Boolean) n1Var.k(finderItem.getFeedObject()).f302833d).booleanValue();
        onFinderFeedInfoUpdatedEvent.e();
        if (x21Var != null && (yz3Var = (r45.yz3) x21Var.getCustom(1)) != null) {
            nv2.e1.a(yz3Var, z17, j17, true);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Map b17 = com.tencent.mm.plugin.finder.convert.qe.U.b(finderItem);
        if (b17 != null) {
            linkedHashMap.putAll(b17);
        }
        java.util.Map b18 = com.tencent.mm.plugin.finder.report.d2.f124994a.b(this.f340524i, null);
        if (b18 != null) {
            linkedHashMap.putAll(b18);
        }
        linkedHashMap.put("is_action_fav", java.lang.Integer.valueOf(z17 ? 1 : 0));
        linkedHashMap.put("is_long_video", 0);
        linkedHashMap.put("old_fav_count", java.lang.Integer.valueOf(favCount2));
        linkedHashMap.put("cur_fav_count", java.lang.Integer.valueOf(finderItem.getFavCount()));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_fav_real_click", null, linkedHashMap, 24617);
    }

    public final void e(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, int i18) {
        if (finderItem == null) {
            return;
        }
        finderItem.setFavFlag(i17);
        finderItem.getFeedObject().setFavCount(i18);
        en3.d0.a(en3.d0.b(en3.d0.c(finderItem.getFeedObject()))).set(3, java.lang.Integer.valueOf(i18));
    }

    public java.lang.String toString() {
        return "action_" + this.f340520e + '_' + this.f340522g + '_' + this.f340523h + '_' + this.f340575c;
    }
}
