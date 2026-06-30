package nv2;

/* loaded from: classes2.dex */
public final class m0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f340541d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f340542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f340543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f340544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f340545h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nv2.d1 f340546i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, int i17, int i18, boolean z17, r45.qt2 qt2Var, nv2.d1 d1Var) {
        super(1);
        this.f340541d = finderItem;
        this.f340542e = i17;
        this.f340543f = i18;
        this.f340544g = z17;
        this.f340545h = qt2Var;
        this.f340546i = d1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.yz3 yz3Var;
        r45.yz3 yz3Var2;
        r45.yz3 yz3Var3;
        r45.zu0 zu0Var;
        com.tencent.mm.modelbase.f cgiBack = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        int i17 = cgiBack.f70615a;
        boolean z17 = this.f340544g;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f340541d;
        if (i17 == 0 && cgiBack.f70616b == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modFavStatus success with id ");
            sb6.append((java.lang.Object) jz5.x.a(finderItem.getId()));
            sb6.append(" favFlag:");
            sb6.append(finderItem.getFavFlag());
            sb6.append(" favCount ");
            sb6.append(finderItem.getFavCount());
            sb6.append(' ');
            sb6.append(this.f340542e);
            sb6.append(' ');
            int i18 = this.f340543f;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i("Finder.InteractActionMgr", sb6.toString());
            com.tencent.mm.protobuf.f fVar = cgiBack.f70618d;
            r45.x21 x21Var = fVar instanceof r45.x21 ? (r45.x21) fVar : null;
            if (x21Var != null && (yz3Var3 = (r45.yz3) x21Var.getCustom(1)) != null && (zu0Var = (r45.zu0) yz3Var3.getCustom(2)) != null) {
                i95.m c17 = i95.n0.c(cq.k.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((cq.k) c17).Vi(finderItem.getUserName(), zu0Var);
            }
            if (x21Var != null && (yz3Var2 = (r45.yz3) x21Var.getCustom(1)) != null) {
                com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
                long id6 = finderItem.getId();
                am.ia iaVar = feedUpdateEvent.f54252g;
                iaVar.f6918a = id6;
                iaVar.f6921d = 0;
                iaVar.f6919b = 5;
                iaVar.f6928k = yz3Var2.getInteger(0);
                java.lang.String string = yz3Var2.getString(1);
                if (string == null) {
                    string = "";
                }
                iaVar.f6929l = string;
                feedUpdateEvent.e();
            }
            if (x21Var != null && (yz3Var = (r45.yz3) x21Var.getCustom(1)) != null) {
                nv2.e1.a(yz3Var, z17, finderItem.getId(), true);
            }
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Map b17 = com.tencent.mm.plugin.finder.convert.qe.U.b(finderItem);
            if (b17 != null) {
                linkedHashMap.putAll(b17);
            }
            java.util.Map b18 = com.tencent.mm.plugin.finder.report.d2.f124994a.b(this.f340545h, null);
            if (b18 != null) {
                linkedHashMap.putAll(b18);
            }
            linkedHashMap.put("is_action_fav", z17 ? 1 : java.lang.Float.valueOf(0.0f));
            linkedHashMap.put("is_long_video", 0);
            linkedHashMap.put("old_fav_count", java.lang.Integer.valueOf(i18));
            linkedHashMap.put("cur_fav_count", java.lang.Integer.valueOf(finderItem.getFavCount()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_fav_real_click", null, linkedHashMap, 24617);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.InteractActionMgr", "modFavStatus cgi fail " + ((java.lang.Object) jz5.x.a(finderItem.getId())) + ' ' + cgiBack.f70615a + ' ' + cgiBack.f70616b + ' ' + cgiBack.f70617c);
            this.f340546i.d(finderItem, z17 ^ true);
        }
        return jz5.f0.f302826a;
    }
}
