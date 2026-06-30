package zl2;

/* loaded from: classes2.dex */
public final class d2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f473715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f473716f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f473717g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f473718h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f473719i;

    public d2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, int i17, r45.qt2 qt2Var, android.content.Context context, kotlin.jvm.internal.h0 h0Var, yz5.a aVar) {
        this.f473714d = baseFinderFeed;
        this.f473715e = i17;
        this.f473716f = qt2Var;
        this.f473717g = context;
        this.f473718h = h0Var;
        this.f473719i = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        r45.qw1 qw1Var;
        java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
        int i18 = this.f473715e;
        r45.qt2 qt2Var = this.f473716f;
        android.content.Context context = this.f473717g;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473714d;
        if (valueOf != null && valueOf.intValue() == 99) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.t1 t1Var = ml2.t1.f327934a2;
            jz5.l[] lVarArr = new jz5.l[3];
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            lVarArr[0] = new jz5.l("liveId", java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null));
            lVarArr[1] = new jz5.l("feedId", java.lang.String.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()));
            lVarArr[2] = new jz5.l("panel_sence", i18 != 1005 ? "4" : "2");
            zy2.zb.T8(zbVar, t1Var, kz5.c1.l(lVarArr), qt2Var != null ? qt2Var.getString(1) : null, java.lang.String.valueOf(qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)) : null), null, null, false, 112, null);
            long id6 = baseFinderFeed.getFeedObject().getFeedObject().getId();
            java.lang.String objectNonceId = baseFinderFeed.getFeedObject().getObjectNonceId();
            r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            pq5.g l17 = new ek2.u0(id6, objectNonceId, object_extend != null ? object_extend.getString(62) : null, 1, 0, this.f473716f, 3).l();
            l17.H(new zl2.c2(context, this.f473719i));
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l17.f((com.tencent.mm.ui.MMActivity) context);
        } else if (valueOf != null && valueOf.intValue() == 101) {
            com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
            if (feedObject != null) {
                r45.qt2 qt2Var2 = this.f473716f;
                android.content.Context context2 = this.f473717g;
                i95.m c18 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.zb zbVar2 = (zy2.zb) c18;
                ml2.t1 t1Var2 = ml2.t1.f327936b2;
                jz5.l[] lVarArr2 = new jz5.l[3];
                r45.nw1 liveInfo2 = baseFinderFeed.getFeedObject().getLiveInfo();
                lVarArr2[0] = new jz5.l("liveid", java.lang.String.valueOf(liveInfo2 != null ? java.lang.Long.valueOf(liveInfo2.getLong(0)) : null));
                lVarArr2[1] = new jz5.l("feedid", pm0.v.u(baseFinderFeed.getFeedObject().getFeedObject().getId()));
                lVarArr2[2] = new jz5.l("panel_sence", i18 != 1005 ? "4" : "2");
                zy2.zb.T8(zbVar2, t1Var2, kz5.c1.l(lVarArr2), qt2Var2 != null ? qt2Var2.getString(1) : null, java.lang.String.valueOf(qt2Var2 != null ? java.lang.Integer.valueOf(qt2Var2.getInteger(5)) : null), null, null, false, 112, null);
                i95.m c19 = i95.n0.c(c61.yb.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                c61.yb ybVar = (c61.yb) c19;
                r45.nw1 liveInfo3 = feedObject.getLiveInfo();
                long j17 = liveInfo3 != null ? liveInfo3.getLong(0) : 0L;
                java.lang.String username = feedObject.getUsername();
                if (username == null) {
                    username = "";
                }
                ((c61.p2) ybVar).xj(context2, qt2Var2, j17, username, null, 62, feedObject);
            }
        } else if (valueOf != null && valueOf.intValue() == 403) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            r45.s02 s02Var = new r45.s02();
            s02Var.set(4, java.lang.Long.valueOf(c01.id.a()));
            s02Var.set(3, 8);
            ((b92.d1) zbVar3).uj(context, s02Var);
            i95.m c27 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            zy2.zb.T8((zy2.zb) c27, ml2.t1.W2, kz5.c1.i(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "8")), qt2Var != null ? qt2Var.getString(1) : null, qt2Var != null ? java.lang.Integer.valueOf(qt2Var.getInteger(5)).toString() : null, null, null, false, 112, null);
        } else if (valueOf != null && valueOf.intValue() == 211) {
            r45.dm2 object_extend2 = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
            java.lang.String string = (object_extend2 == null || (qw1Var = (r45.qw1) object_extend2.getCustom(14)) == null) ? null : qw1Var.getString(0);
            if (string == null || string.length() == 0) {
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "clickInnerData but innerUrl is null");
            } else {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", string);
                intent.putExtra("convertActivityFromTranslucent", true);
                j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            }
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = (com.tencent.mm.ui.widget.dialog.k0) this.f473718h.f310123d;
        if (k0Var != null) {
            k0Var.u();
        }
    }
}
