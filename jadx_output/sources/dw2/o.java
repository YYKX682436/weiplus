package dw2;

/* loaded from: classes2.dex */
public class o implements dw2.b0 {

    /* renamed from: t, reason: collision with root package name */
    public static final dw2.c f244134t = new dw2.c(null);

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.Set f244135u = kz5.o1.c(2003);

    /* renamed from: c, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f244138c;

    /* renamed from: e, reason: collision with root package name */
    public dw2.a0 f244140e;

    /* renamed from: o, reason: collision with root package name */
    public int f244150o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f244151p;

    /* renamed from: r, reason: collision with root package name */
    public int f244153r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f244154s;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f244136a = "FinderFeedSelectorAdapter" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final int f244137b = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().heightPixels;

    /* renamed from: d, reason: collision with root package name */
    public int f244139d = -1;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f244141f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.p0 f244142g = new com.tencent.mm.plugin.finder.assist.p0(false, 0, null, null, null, 0, 0, null, null, 511, null);

    /* renamed from: h, reason: collision with root package name */
    public int f244143h = 1;

    /* renamed from: i, reason: collision with root package name */
    public long f244144i = -1;

    /* renamed from: j, reason: collision with root package name */
    public final kz2.c f244145j = new kz2.c(this.f244136a);

    /* renamed from: k, reason: collision with root package name */
    public boolean f244146k = true;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f244147l = jz5.h.b(dw2.j.f244127d);

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f244148m = jz5.h.b(dw2.k.f244128d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f244149n = jz5.h.b(dw2.l.f244129d);

    /* renamed from: q, reason: collision with root package name */
    public int f244152q = -1;

    public o() {
        ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
        zl2.r4 r4Var = zl2.r4.f473950a;
        this.f244154s = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3918x3).getValue()).r()).intValue() == 0;
    }

    public static void f(dw2.o oVar, java.util.Set set, boolean z17, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: checkSelectedInternal");
        }
        if ((i17 & 1) != 0) {
            so2.h3 h3Var = so2.h3.f410392d;
            set = so2.h3.f410394f;
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            str = "";
        }
        oVar.e(set, z17, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i17, boolean z17) {
        java.lang.Object obj;
        uc2.d f131220o;
        uc2.d f131220o2;
        com.tencent.mm.plugin.finder.assist.p0 j17 = j(i17, null);
        if (j17 == null || j17.f102443f != 9) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f244136a, "lxltest111 autoPlayOrPauseDragFeed:" + i17 + " play:" + z17);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed k17 = k(f244134t.a(j17.f102444g, this.f244143h));
        in5.s0 s0Var = j17.f102445h;
        if (s0Var != null) {
            java.util.Iterator it = kz5.c0.i(s0Var.itemView.findViewById(com.tencent.mm.R.id.e_k), s0Var.itemView.findViewById(com.tencent.mm.R.id.tbm)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((cw2.v9) obj) != null) {
                        break;
                    }
                }
            }
            cw2.v9 v9Var = (cw2.v9) obj;
            if (v9Var != null) {
                if (!z17) {
                    cw2.v9.j(v9Var, false, 1, null);
                    return;
                } else {
                    v9Var.setMute(true);
                    v9Var.m(s0Var.getAdapterPosition(), null, k17);
                    return;
                }
            }
            if (((android.view.ViewGroup) s0Var.itemView.findViewById(com.tencent.mm.R.id.f484854fq1)) != null) {
                java.lang.Object obj2 = s0Var.f293125i;
                so2.h1 h1Var = obj2 instanceof so2.h1 ? (so2.h1) obj2 : null;
                if (h1Var == null) {
                    return;
                }
                if (!z17) {
                    com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner finderLiveRoomBanner = (com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner) s0Var.itemView.findViewById(com.tencent.mm.R.id.f484869fs3);
                    if (finderLiveRoomBanner == null || (f131220o = finderLiveRoomBanner.getF131220o()) == null) {
                        return;
                    }
                    uc2.d.K2(f131220o, s0Var, false, false, 4, null);
                    return;
                }
                com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner finderLiveRoomBanner2 = (com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner) s0Var.itemView.findViewById(com.tencent.mm.R.id.f484869fs3);
                com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner finderLiveRoomBanner3 = (com.tencent.mm.plugin.finder.view.FinderLiveRoomBanner) s0Var.itemView.findViewById(com.tencent.mm.R.id.f484869fs3);
                if (finderLiveRoomBanner3 == null || (f131220o2 = finderLiveRoomBanner3.getF131220o()) == null) {
                    return;
                }
                uc2.d.E5(f131220o2, s0Var, finderLiveRoomBanner2 != null ? finderLiveRoomBanner2.getMediaView() : null, h1Var, false, false, 24, null);
            }
        }
    }

    public final dw2.d b(dw2.d feedList, so2.j5 feed, in5.s0 holder) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (this.f244154s) {
            if (f244135u.contains(java.lang.Integer.valueOf(feed.h()))) {
                feedList.f244116c.add(new dw2.d(feed, holder));
            }
        }
        return feedList;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r23, int r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1160
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.o.c(java.lang.String, int, boolean):void");
    }

    public void d(boolean z17) {
        f(this, null, z17, "checkSelected", 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0399 A[LOOP:2: B:44:0x014c->B:53:0x0399, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03b6 A[EDGE_INSN: B:54:0x03b6->B:55:0x03b6 BREAK  A[LOOP:2: B:44:0x014c->B:53:0x0399], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.util.Set r39, boolean r40, java.lang.String r41) {
        /*
            Method dump skipped, instructions count: 1202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.o.e(java.util.Set, boolean, java.lang.String):void");
    }

    public final void g(com.tencent.mm.plugin.finder.assist.p0 feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        int i17 = feed.f102444g;
        int i18 = this.f244152q;
        if (i17 == i18 || i18 < 0) {
            return;
        }
        a(i18, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x01cb, code lost:
    
        if (r7.d(java.lang.Integer.valueOf(r5.f255561c)) == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0645, code lost:
    
        if (r2 == false) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06a6  */
    /* JADX WARN: Type inference failed for: r10v10, types: [r45.qt2] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v2, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [com.tencent.mm.plugin.finder.viewmodel.component.ny] */
    /* JADX WARN: Type inference failed for: r2v69, types: [c61.l7] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r5v33, types: [ml2.d, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.util.List r28, com.tencent.mm.plugin.finder.assist.p0 r29) {
        /*
            Method dump skipped, instructions count: 1778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw2.o.h(java.util.List, com.tencent.mm.plugin.finder.assist.p0):void");
    }

    public final void i(java.util.List source, com.tencent.mm.plugin.finder.assist.p0 feed) {
        dw2.a0 a0Var;
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(feed, "feed");
        kz2.c cVar = this.f244145j;
        cVar.c("onFeedUnSelected begin");
        if (m(feed, "dispatchOnFeedUnSelected") && (a0Var = this.f244140e) != null) {
            in5.s0 s0Var = feed.f102445h;
            kotlin.jvm.internal.o.d(s0Var);
            com.tencent.mars.xlog.Log.i("Finder.VideoAutoPlayManager", "onFeedUnSelected position:" + feed.f102444g);
            cw2.v9 L0 = ((com.tencent.mm.plugin.finder.video.autoplay.FinderVideoAutoPlayManager) a0Var).L0(s0Var);
            if (L0 != null) {
                L0.setSelectedToPlay(false);
            }
        }
        cVar.c("onFeedUnSelected end");
    }

    public com.tencent.mm.plugin.finder.assist.p0 j(int i17, in5.s0 s0Var) {
        in5.s0 s0Var2;
        jz5.f0 f0Var;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        if (s0Var == null) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f244138c;
            androidx.recyclerview.widget.k3 q07 = recyclerView != null ? recyclerView.q0(i17, false) : null;
            s0Var2 = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
        } else {
            s0Var2 = s0Var;
        }
        if (s0Var2 == null) {
            com.tencent.mars.xlog.Log.w(this.f244136a, "handleOnPageSelected return for holder:" + s0Var2 + " position:" + i17);
            return null;
        }
        java.lang.Object obj = s0Var2.f293125i;
        so2.j5 j5Var = obj instanceof so2.j5 ? (so2.j5) obj : null;
        if (j5Var == null) {
            com.tencent.mars.xlog.Log.w(this.f244136a, "handleOnPageSelected return for item:" + j5Var + " position:" + i17);
            return null;
        }
        com.tencent.mm.plugin.finder.storage.FeedData o17 = o(j5Var);
        com.tencent.mm.plugin.finder.assist.p0 p0Var = new com.tencent.mm.plugin.finder.assist.p0(false, 0L, null, null, null, 0, 0, null, null, 511, null);
        p0Var.f102443f = j5Var.h();
        p0Var.f102444g = i17;
        p0Var.f102445h = s0Var2;
        p0Var.f102439b = j5Var.getItemId();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        p0Var.f102440c = baseFinderFeed != null ? baseFinderFeed.w() : null;
        p0Var.f102442e = o17;
        p0Var.f102446i = j5Var;
        android.view.View p17 = s0Var2.p(com.tencent.mm.R.id.f484869fs3);
        java.util.LinkedList<r45.mb4> mediaList2 = o17 != null ? o17.getMediaList() : null;
        if (p17 == null || mediaList2 == null) {
            f0Var = null;
        } else {
            com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) p17;
            if (finderBaseMediaBanner.getFocusPosition() >= 0 && finderBaseMediaBanner.getFocusPosition() < mediaList2.size()) {
                r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.a0(mediaList2, finderBaseMediaBanner.getFocusPosition());
                java.lang.String string = mb4Var2 != null ? mb4Var2.getString(9) : null;
                if (string == null) {
                    string = "";
                }
                p0Var.f102441d = string;
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            java.lang.String string2 = (o17 == null || (mediaList = o17.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.a0(mediaList, 0)) == null) ? null : mb4Var.getString(9);
            p0Var.f102441d = string2 != null ? string2 : "";
        }
        return p0Var;
    }

    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed k(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f244138c;
        kotlin.jvm.internal.o.d(recyclerView);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        java.lang.Object a07 = kz5.n0.a0(((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).getData(), i17);
        if (a07 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return (com.tencent.mm.plugin.finder.model.BaseFinderFeed) a07;
        }
        return null;
    }

    public boolean l(long j17) {
        java.lang.Object obj;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f244138c;
        kotlin.jvm.internal.o.d(recyclerView);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
        java.util.Iterator it = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).getData().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((in5.c) obj).getItemId() == j17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean m(com.tencent.mm.plugin.finder.assist.p0 p0Var, java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        if (p0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f244136a, invokeSource + " checkFeedValid return for feed:" + p0Var);
            return false;
        }
        boolean z17 = p0Var.f102438a;
        if (!z17) {
            com.tencent.mars.xlog.Log.w(this.f244136a, invokeSource + " checkFeedValid return for isValid:" + z17);
            return false;
        }
        if (p0Var.f102444g < 0) {
            com.tencent.mars.xlog.Log.w(this.f244136a, invokeSource + " checkFeedValid return for position:" + p0Var.f102444g);
            return false;
        }
        if (p0Var.f102439b == 0) {
            com.tencent.mars.xlog.Log.w(this.f244136a, invokeSource + " checkFeedValid return for feedId:" + p0Var.f102439b);
            return false;
        }
        if (p0Var.f102445h != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.w(this.f244136a, invokeSource + " checkFeedValid return for holder:" + p0Var.f102445h);
        return false;
    }

    public final void n(androidx.recyclerview.widget.RecyclerView recyclerView, long j17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (this.f244144i == j17) {
            return;
        }
        android.content.Context context = recyclerView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Z6(this.f244139d);
        if (Z6 != null) {
            com.tencent.mars.xlog.Log.i(this.f244136a, "publishFocusView: targetFeedId = " + j17 + ", lastFocusFeedId = " + this.f244144i);
            fc2.a c17 = Z6.c(recyclerView, 6);
            kotlin.jvm.internal.o.e(c17, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.event.base.ScrollEvent");
            this.f244144i = ((fc2.t) c17).f260992k;
            recyclerView.post(new dw2.n(Z6, c17));
        }
    }

    public final com.tencent.mm.plugin.finder.storage.FeedData o(so2.j5 feed) {
        kotlin.jvm.internal.o.g(feed, "feed");
        if (feed instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            return com.tencent.mm.plugin.finder.storage.FeedData.Companion.a((com.tencent.mm.plugin.finder.model.BaseFinderFeed) feed);
        }
        if (!(feed instanceof com.tencent.mm.plugin.finder.feed.ys)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.ys ysVar = (com.tencent.mm.plugin.finder.feed.ys) feed;
        com.tencent.mm.plugin.finder.storage.FeedData feedData = new com.tencent.mm.plugin.finder.storage.FeedData();
        feedData.setFeedId(ysVar.getItemId());
        feedData.setMediaType(ysVar.h());
        feedData.setRvFeedList(ysVar.f111194f);
        return feedData;
    }
}
