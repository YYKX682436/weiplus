package cr2;

/* loaded from: classes2.dex */
public final class x {
    public gp2.l0 A;
    public final cr2.b B;
    public final com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeFragmentViewCallback$feedUpdateEventListener$1 C;
    public boolean D;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f221895a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f221896b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment f221897c;

    /* renamed from: d, reason: collision with root package name */
    public final er2.a f221898d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f221899e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f221900f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f221901g;

    /* renamed from: h, reason: collision with root package name */
    public final int f221902h;

    /* renamed from: i, reason: collision with root package name */
    public final int f221903i;

    /* renamed from: j, reason: collision with root package name */
    public final cr2.z f221904j;

    /* renamed from: k, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f221905k;

    /* renamed from: l, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f221906l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerView f221907m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.view.refreshLayout.WxRefreshLayout f221908n;

    /* renamed from: o, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f221909o;

    /* renamed from: p, reason: collision with root package name */
    public final r45.qt2 f221910p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f221911q;

    /* renamed from: r, reason: collision with root package name */
    public cr2.a f221912r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory f221913s;

    /* renamed from: t, reason: collision with root package name */
    public r45.yz2 f221914t;

    /* renamed from: u, reason: collision with root package name */
    public final ml2.d f221915u;

    /* renamed from: v, reason: collision with root package name */
    public final gr2.o f221916v;

    /* renamed from: w, reason: collision with root package name */
    public final sp2.c4 f221917w;

    /* renamed from: x, reason: collision with root package name */
    public up2.m f221918x;

    /* renamed from: y, reason: collision with root package name */
    public final xq2.b f221919y;

    /* renamed from: z, reason: collision with root package name */
    public zo2.e f221920z;

    /* JADX WARN: Type inference failed for: r0v18, types: [com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeFragmentViewCallback$feedUpdateEventListener$1] */
    public x(final com.tencent.mm.ui.MMActivity context, android.view.View rootView, com.tencent.mm.plugin.finder.ui.fragment.MMFinderFragment fragment, er2.a params) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(fragment, "fragment");
        kotlin.jvm.internal.o.g(params, "params");
        this.f221895a = context;
        this.f221896b = rootView;
        this.f221897c = fragment;
        this.f221898d = params;
        java.lang.String str = params.f256009b;
        this.f221899e = str;
        java.lang.String str2 = params.f256010c;
        this.f221900f = str2;
        java.lang.String str3 = "LiveSpecialFragmentViewCallback_" + str + '_' + str2;
        this.f221901g = str3;
        this.f221902h = params.f256012e;
        this.f221903i = params.f256013f;
        cr2.z zVar = params.f256015h;
        this.f221904j = zVar;
        this.f221905k = kotlinx.coroutines.z0.b();
        this.f221906l = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c);
        this.f221911q = new java.util.ArrayList();
        this.f221915u = new ml2.d();
        this.f221916v = new gr2.o(context, 0, ((gr2.p0) zVar).f274806b);
        this.f221917w = new sp2.c4();
        pf5.u uVar = pf5.u.f353936a;
        androidx.lifecycle.c1 a17 = uVar.e(c61.l7.class).a(xq2.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        this.f221919y = (xq2.b) a17;
        this.B = new cr2.b(this);
        this.C = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedUpdateEvent>(context) { // from class: com.tencent.mm.plugin.finder.nearby.ui.special.fragment.LiveThemeFragmentViewCallback$feedUpdateEventListener$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                this.__eventId = 439877283;
            }

            public final so2.h1 c(long j17) {
                java.lang.Object obj;
                java.util.Iterator it = kz5.j0.I(cr2.x.this.f221911q, so2.h1.class).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    r45.nw1 liveInfo = ((so2.h1) obj).getFeedObject().getLiveInfo();
                    boolean z17 = false;
                    if (liveInfo != null && liveInfo.getLong(0) == j17) {
                        z17 = true;
                    }
                    if (z17) {
                        break;
                    }
                }
                return (so2.h1) obj;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent) {
                com.tencent.mm.autogen.events.FeedUpdateEvent event = feedUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ia iaVar = event.f54252g;
                int i17 = iaVar.f6919b;
                cr2.x xVar = cr2.x.this;
                if (i17 != 8) {
                    if (i17 == 28) {
                        com.tencent.mars.xlog.Log.i(xVar.f221901g, "TYPE_CHARGE_LIVE_PAY_SUCCESS charge_live id=" + iaVar.f6918a);
                        long j17 = iaVar.f6918a;
                        if (j17 != 0) {
                            try {
                                so2.h1 c17 = c(j17);
                                if (c17 != null) {
                                    r45.nw1 liveInfo = c17.getFeedObject().getLiveInfo();
                                    r45.o52 o52Var = liveInfo != null ? (r45.o52) liveInfo.getCustom(28) : null;
                                    if (o52Var != null) {
                                        o52Var.set(1, java.lang.Boolean.TRUE);
                                    }
                                }
                            } catch (java.lang.Exception e17) {
                                com.tencent.mars.xlog.Log.e(xVar.f221901g, e17.getMessage());
                            }
                        }
                    }
                } else if (dp2.a.f242184b) {
                    long j18 = iaVar.f6918a;
                    if (j18 != 0 && iaVar.f6921d == 1) {
                        try {
                            so2.h1 c18 = c(j18);
                            if (c18 != null) {
                                d("普通feed", c18);
                            }
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e(xVar.f221901g, e18.getMessage());
                        }
                    }
                }
                return true;
            }

            public final void d(java.lang.String prefixTag, so2.h1 feed) {
                kotlin.jvm.internal.o.g(prefixTag, "prefixTag");
                kotlin.jvm.internal.o.g(feed, "feed");
                cr2.x xVar = cr2.x.this;
                java.lang.String str4 = xVar.f221901g;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(prefixTag);
                sb6.append("-refreshLiveStatus ");
                sb6.append(feed.getFeedObject().getNickName());
                sb6.append('(');
                r45.nw1 liveInfo = feed.getFeedObject().getLiveInfo();
                sb6.append(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null);
                sb6.append(')');
                com.tencent.mars.xlog.Log.i(str4, sb6.toString());
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                r45.nw1 liveInfo2 = feed.getFeedObject().getLiveInfo();
                long j17 = liveInfo2 != null ? liveInfo2.getLong(0) : 0L;
                com.tencent.mm.ui.MMActivity mMActivity = xVar.f221895a;
                kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                cr2.c cVar = new cr2.c(feed, xVar);
                qs5.d dVar = qs5.d.f366426e;
                ((com.tencent.mm.feature.finder.live.v4) w0Var).Yj(j17, 2, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, mMActivity, cVar, 7);
            }
        };
        com.tencent.mars.xlog.Log.i(str3, "#init");
        androidx.lifecycle.c1 a18 = uVar.d(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny.l7((com.tencent.mm.plugin.finder.viewmodel.component.ny) a18, b(), 0, null, 6, null);
        this.f221910p = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.d(fragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
    }

    public static void d(cr2.x xVar, boolean z17, int i17, yz5.l lVar, yz5.l lVar2, int i18, java.lang.Object obj) {
        yz5.l lVar3 = (i18 & 4) != 0 ? null : lVar;
        yz5.l lVar4 = (i18 & 8) != 0 ? null : lVar2;
        xVar.getClass();
        com.tencent.mars.xlog.Log.i(xVar.f221901g, "#loadData fromHead=" + z17 + " containerId=" + xVar.f221903i + " pullType:" + i17 + " themeId: " + xVar.f221899e + " themeTag:" + xVar.f221900f);
        kotlinx.coroutines.l.d(xVar.f221906l, null, null, new cr2.r(xVar, i17, z17, lVar3, lVar4, null), 3, null);
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory themeLivingItemConvertFactory;
        com.tencent.mars.xlog.Log.i(this.f221901g, "adjustSquareStyle styleInfo: " + i17);
        if (i17 != 0) {
            if (i17 == 1 && (themeLivingItemConvertFactory = this.f221913s) != null) {
                themeLivingItemConvertFactory.setAspectRatio(1.3333334f);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.nearby.ui.special.factory.ThemeLivingItemConvertFactory themeLivingItemConvertFactory2 = this.f221913s;
        if (themeLivingItemConvertFactory2 == null) {
            return;
        }
        themeLivingItemConvertFactory2.setAspectRatio(1.7777778f);
    }

    public final int b() {
        if (this.f221898d.f256017j == 2) {
            return 329;
        }
        return this.f221902h == 11 ? 261 : 260;
    }

    public final java.util.List c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (so2.j5 j5Var : this.f221911q) {
            if ((j5Var instanceof wp2.a) && !(j5Var instanceof vp2.o)) {
                arrayList.addAll(((wp2.a) j5Var).g());
            }
        }
        return arrayList;
    }

    public final void e(boolean z17, java.lang.String str, boolean z18) {
        java.lang.String str2 = this.f221901g;
        com.tencent.mars.xlog.Log.i(str2, "#onRvRefreshOrLoadMoreCall isRefresh=" + z17 + " source=" + str);
        if (this.D) {
            com.tencent.mars.xlog.Log.i(str2, "#onRvRefreshOrLoadMoreCall isRefresh=" + z17 + " but is running! Get out.");
            return;
        }
        this.D = true;
        if (z18) {
            d(this, true, 1, null, new cr2.u(this), 4, null);
        } else if (z17) {
            d(this, true, 1, null, new cr2.w(this), 4, null);
        } else {
            d(this, false, 2, null, new cr2.v(this), 4, null);
        }
    }
}
