package gp2;

/* loaded from: classes10.dex */
public class l0 implements c50.m0 {
    public static boolean N;
    public final java.util.HashSet A;
    public boolean B;
    public java.lang.Integer C;
    public final com.tencent.mm.sdk.platformtools.n3 D;
    public java.lang.Runnable E;
    public final gp2.d0 F;
    public c50.n0 G;
    public yz5.l H;
    public yz5.l I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$lifeObserver$1 f274241J;
    public final com.tencent.mm.sdk.event.IListener K;
    public final com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1 L;
    public boolean M;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f274242a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f274243b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f274244c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f274245d;

    /* renamed from: e, reason: collision with root package name */
    public final int f274246e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f274247f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f274248g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f274249h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f274250i;

    /* renamed from: j, reason: collision with root package name */
    public mn0.d0 f274251j;

    /* renamed from: k, reason: collision with root package name */
    public int f274252k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f274253l;

    /* renamed from: m, reason: collision with root package name */
    public final int f274254m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f274255n;

    /* renamed from: o, reason: collision with root package name */
    public final yz5.p f274256o;

    /* renamed from: p, reason: collision with root package name */
    public final yz5.p f274257p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f274258q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f274259r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f274260s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f274261t;

    /* renamed from: u, reason: collision with root package name */
    public hp2.a f274262u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver f274263v;

    /* renamed from: w, reason: collision with root package name */
    public final bp2.i f274264w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f274265x;

    /* renamed from: y, reason: collision with root package name */
    public final gp2.q0 f274266y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashSet f274267z;

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0178, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$finderSquareLiveViewLayoutEvent$1] */
    /* JADX WARN: Type inference failed for: r3v17, types: [com.tencent.mm.plugin.finder.nearby.live.play.NearbyLiveAutoPlayManager$lifeObserver$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l0(android.content.Context r18, androidx.recyclerview.widget.RecyclerView r19, java.util.List r20, boolean r21, int r22, boolean r23, boolean r24, boolean r25, com.tencent.mm.view.recyclerview.WxRecyclerAdapter r26, mn0.d0 r27, int r28, java.lang.String r29, int r30, boolean r31, yz5.p r32, yz5.p r33, int r34, kotlin.jvm.internal.i r35) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.l0.<init>(android.content.Context, androidx.recyclerview.widget.RecyclerView, java.util.List, boolean, int, boolean, boolean, boolean, com.tencent.mm.view.recyclerview.WxRecyclerAdapter, mn0.d0, int, java.lang.String, int, boolean, yz5.p, yz5.p, int, kotlin.jvm.internal.i):void");
    }

    public static final void d(gp2.l0 l0Var, so2.j5 j5Var, int i17, android.view.View view, ws5.f fVar) {
        l0Var.getClass();
        view.setTag(com.tencent.mm.R.id.k67, java.lang.Boolean.valueOf(!fVar.getF121533q()));
        view.setTag(com.tencent.mm.R.id.f486100k62, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
        if (baseFinderFeed != null) {
            sp2.i iVar = sp2.i.f411047a;
            long j17 = i17;
            ml2.x1 x1Var = ml2.x1.f328215v;
            java.lang.String str = l0Var.f274253l;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            c50.n0 n0Var = l0Var.G;
            if (n0Var != null) {
                n0Var.a(baseFinderFeed, jSONObject, i17);
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            iVar.a(baseFinderFeed, j17, x1Var, str, jSONObject2);
        }
    }

    public static /* synthetic */ void w(gp2.l0 l0Var, java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAutoPlayError");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        l0Var.v(str, baseFinderFeed, z17);
    }

    public final boolean A(int i17) {
        int i18 = i17;
        int i19 = 0;
        int i27 = 0;
        while (true) {
            if (i19 >= i17) {
                break;
            }
            boolean z17 = (i19 - i27) % 2 == 0 && !(r(i19 + 1) instanceof so2.h1);
            if (!(r(i19) instanceof so2.h1) || (r(i19) instanceof vp2.d) || z17) {
                i18--;
                i27++;
            }
            i19++;
        }
        return i18 % 2 == 0;
    }

    public final boolean B() {
        android.content.Context context = this.f274242a;
        return context instanceof com.tencent.mm.ui.MMActivity ? ((com.tencent.mm.ui.MMActivity) context).isPaused() : ((context instanceof androidx.appcompat.app.AppCompatActivity) && ((androidx.appcompat.app.AppCompatActivity) context).mo133getLifecycle().b().a(androidx.lifecycle.n.RESUMED)) ? false : true;
    }

    public boolean C(java.lang.String tag, long j17) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(tag, "tag");
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i(this.f274258q, tag.concat(" isPlaying, liveId 0 invalid!"));
            return false;
        }
        java.util.Iterator it = this.f274267z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.nw1 liveInfo = ((gp2.f) obj).f274217d.getFeedObject().getLiveInfo();
            if (liveInfo != null && liveInfo.getLong(0) == j17) {
                break;
            }
        }
        gp2.f fVar = (gp2.f) obj;
        if (fVar != null) {
            ws5.f fVar2 = fVar.f274215b;
            if (fVar2 != null) {
                return fVar2.isPlaying();
            }
            zy2.g5 g5Var = fVar.f274216c;
            if (g5Var != null) {
                return g5Var.isPlaying();
            }
            return false;
        }
        com.tencent.mars.xlog.Log.i(this.f274258q, tag + " isPlaying,liveId:" + j17 + " not found!");
        return false;
    }

    public final boolean D(int i17) {
        if (r(i17) instanceof vp2.d) {
            return true;
        }
        return A(i17) && ((r(i17 + 1) instanceof so2.h1) ^ true);
    }

    public void E() {
        m();
        java.lang.String t17 = t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pausePlayer set:");
        java.util.HashSet hashSet = this.f274267z;
        sb6.append(hashSet.size());
        sb6.append(" set: ");
        sb6.append(hashSet);
        com.tencent.mars.xlog.Log.i(t17, sb6.toString());
        java.lang.Runnable runnable = this.E;
        if (runnable != null) {
            this.D.removeCallbacks(runnable);
            this.E = null;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pm0.v.V(0L, new gp2.g0((gp2.f) it.next()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v59 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r24v0, types: [gp2.l0] */
    public void F(com.tencent.mm.protocal.protobuf.FinderObject live, android.view.View view, yz5.a aVar, yz5.a aVar2, yz5.p pVar, boolean z17) {
        java.lang.String string;
        r45.o52 o52Var;
        r45.o52 o52Var2;
        r45.o52 o52Var3;
        kotlin.jvm.internal.o.g(live, "live");
        kotlin.jvm.internal.o.g(view, "view");
        boolean z18 = false;
        so2.h1 h1Var = new so2.h1(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(live, 0));
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).wi();
        if (B()) {
            com.tencent.mars.xlog.Log.e(t(), "checkAutoPlayByOutside: isPagePause");
            return;
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.icp);
        if (frameLayout == null) {
            com.tencent.mars.xlog.Log.w(t(), "checkAutoPlayByOutside: return for view:" + view);
            return;
        }
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView u17 = u(frameLayout, h1Var.getItemId());
        r45.nw1 liveInfo = h1Var.getFeedObject().getFeedObject().getLiveInfo();
        if ((liveInfo != null && liveInfo.getInteger(2) == 1) != true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoPlayByOutside: return for liveStatus:");
            r45.nw1 liveInfo2 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
            sb6.append(liveInfo2 != null ? java.lang.Integer.valueOf(liveInfo2.getInteger(2)) : null);
            w(this, sb6.toString(), h1Var, false, 4, null);
            return;
        }
        if (!z17) {
            int i17 = qs5.g.f366432a;
            r45.nw1 liveInfo3 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
            int integer = (liveInfo3 == null || (o52Var3 = (r45.o52) liveInfo3.getCustom(28)) == null) ? 0 : o52Var3.getInteger(0);
            if ((integer == 2 || integer == 8 || integer == 16) != false) {
                w(this, "checkAutoPlayByOutside: return for charge live!", h1Var, false, 4, null);
                return;
            }
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        if (z17) {
            int i18 = qs5.g.f366432a;
            r45.nw1 liveInfo4 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
            int integer2 = (liveInfo4 == null || (o52Var2 = (r45.o52) liveInfo4.getCustom(28)) == null) ? 0 : o52Var2.getInteger(0);
            if ((integer2 == 2 || integer2 == 8 || integer2 == 16) != false) {
                r45.nw1 liveInfo5 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
                if (((liveInfo5 == null || (o52Var = (r45.o52) liveInfo5.getCustom(28)) == null || !o52Var.getBoolean(1)) ? false : true) == false) {
                    r45.nw1 liveInfo6 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
                    long j17 = liveInfo6 != null ? liveInfo6.getLong(0) : 0L;
                    ne2.l lVar = ne2.l.f336545a;
                    r45.nw1 liveInfo7 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
                    r45.q84 a17 = lVar.a(j17, liveInfo7 != null ? (r45.td2) liveInfo7.getCustom(27) : null);
                    com.tencent.mars.xlog.Log.i(t(), "checkAutoPlayByOutside: liveId=" + j17 + " you are charge_live," + cm2.a.f43328a.r(a17));
                    if (a17.getInteger(1) <= 1) {
                        w(this, "checkAutoPlayByOutside: return for charge_live residueTime=" + a17.getInteger(1), h1Var, false, 4, null);
                        return;
                    } else {
                        r45.nw1 liveInfo8 = h1Var.getFeedObject().getLiveInfo();
                        ne2.k kVar = new ne2.k(1, liveInfo8 != null ? liveInfo8.getLong(0) : 0L, 0, 1, 4, null);
                        kVar.f336537d = new gp2.o(this, j17);
                        h0Var.f310123d = kVar;
                    }
                }
            }
        }
        r45.nw1 liveInfo9 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
        if (liveInfo9 == null || (string = liveInfo9.getString(3)) == null) {
            return;
        }
        if ((string.length() == 0) == true) {
            w(this, "checkAutoPlay: return for empty liveUrl", h1Var, false, 4, null);
            return;
        }
        boolean y17 = y(u17);
        java.util.HashSet hashSet = this.f274267z;
        if (y17) {
            v("checkAutoPlayByOutside: return for same feed:" + h1Var + " same view:" + u17 + " set:" + hashSet.size(), h1Var, true);
            return;
        }
        r45.nw1 liveInfo10 = h1Var.getFeedObject().getFeedObject().getLiveInfo();
        if (liveInfo10 != null && liveInfo10.getInteger(42) == 1) {
            z18 = true;
        }
        if (z18) {
            w(this, "checkAutoPlayByOutside: return for vr live", h1Var, false, 4, null);
            return;
        }
        l();
        hashSet.add(new gp2.f((int) h1Var.getItemId(), u17, null, h1Var, (ne2.k) h0Var.f310123d));
        com.tencent.mars.xlog.Log.w(t(), "checkAutoPlayByOutside: feed:" + h1Var + " view:" + u17);
        pm0.v.V(0L, new gp2.s(string, h1Var, u17, this, h0Var, aVar, view, aVar2, pVar));
    }

    public void G() {
        java.lang.String t17 = t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("resumePlayer set:");
        java.util.HashSet hashSet = this.f274267z;
        sb6.append(hashSet.size());
        sb6.append(" set: ");
        sb6.append(hashSet);
        com.tencent.mars.xlog.Log.i(t17, sb6.toString());
        java.lang.Runnable runnable = this.E;
        if (runnable != null) {
            this.D.removeCallbacks(runnable);
            this.E = null;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            pm0.v.V(0L, new gp2.h0((gp2.f) it.next()));
        }
    }

    public final void H(int i17) {
        this.f274262u.a(i17);
    }

    public final void I(boolean z17) {
        this.M = z17;
        if (z17) {
            g();
        } else {
            m();
            c50.m0.c(this, null, 1, null);
        }
    }

    public final void J(boolean z17) {
        this.f274261t = z17;
        com.tencent.mars.xlog.Log.i(this.f274258q, "setIsOnUserVisibleFocused: " + z17);
    }

    public final boolean K(int i17, boolean z17) {
        this.C = java.lang.Integer.valueOf(i17);
        boolean b17 = this.f274262u.b(i17, z17);
        com.tencent.mars.xlog.Log.i(t(), "setPlayOrder: playOrder=" + i17 + ", shouldPlay=" + b17 + ", isYAxisFullyVisible=" + z17);
        return b17;
    }

    public final void L(int i17) {
        java.lang.Runnable runnable = this.E;
        if (runnable != null) {
            this.D.removeCallbacks(runnable);
            this.E = null;
        }
        java.util.HashSet hashSet = this.f274267z;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : hashSet) {
            if (((gp2.f) obj).f274214a == i17) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            N((gp2.f) it.next());
        }
        kz5.h0.A(hashSet, new gp2.k0(i17));
    }

    public void M(yz5.q qVar) {
        android.view.View videoView;
        java.lang.Object tag;
        java.lang.String t17 = t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopCurrentView set:");
        java.util.HashSet<gp2.f> hashSet = this.f274267z;
        sb6.append(hashSet.size());
        sb6.append(" set: ");
        sb6.append(hashSet);
        com.tencent.mars.xlog.Log.i(t17, sb6.toString());
        java.lang.Runnable runnable = this.E;
        if (runnable != null) {
            this.D.removeCallbacks(runnable);
            this.E = null;
        }
        for (gp2.f fVar : hashSet) {
            if (qVar != null) {
                ws5.f fVar2 = fVar.f274215b;
                if (fVar2 == null || (videoView = fVar2.H()) == null) {
                    zy2.g5 g5Var = fVar.f274216c;
                    videoView = g5Var != null ? g5Var.getVideoView() : null;
                }
                if (videoView != null) {
                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = fVar.f274217d.getFeedObject().getFeedObject();
                    android.view.View q17 = q(videoView);
                    int i17 = 0;
                    if (q17 != null && (tag = q17.getTag(com.tencent.mm.R.id.f486100k62)) != null) {
                        java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
                        long longValue = l17 != null ? l17.longValue() : 0L;
                        if (longValue != 0) {
                            i17 = (int) (android.os.SystemClock.elapsedRealtime() - longValue);
                        }
                    }
                    qVar.invoke(feedObject, java.lang.Integer.valueOf(i17), videoView);
                }
            }
            pm0.v.V(0L, new gp2.j0(this, fVar));
        }
        hashSet.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0198, code lost:
    
        if (r10 == null) goto L52;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(gp2.f r21) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.l0.N(gp2.f):void");
    }

    public final void e(hp2.a aVar) {
        androidx.lifecycle.o mo133getLifecycle;
        if (aVar != null) {
            this.f274262u = aVar;
        }
        this.K.alive();
        alive();
        gp2.h hVar = new gp2.h(this);
        com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver headsetReceiver = this.f274263v;
        android.content.Context context = this.f274242a;
        headsetReceiver.b(context, hVar);
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity == null || (mo133getLifecycle = mMActivity.mo133getLifecycle()) == null) {
            return;
        }
        mo133getLifecycle.a(this.f274241J);
    }

    public void f(c50.a scene, int i17) {
        kotlin.jvm.internal.o.g(scene, "scene");
        int ordinal = scene.ordinal();
        this.f274251j = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? mn0.d0.f329709e : mn0.d0.f329724w : mn0.d0.f329726y : mn0.d0.f329723v : mn0.d0.f329719r : mn0.d0.f329717p;
        this.f274252k = i17;
    }

    public void g() {
        java.lang.String t17 = t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkAutoPlay isPagePause: ");
        sb6.append(B());
        sb6.append(" enableNearbyLiveAutoPlay:");
        boolean z17 = this.f274259r;
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(t17, sb6.toString());
        if (!z17) {
            com.tencent.mars.xlog.Log.w(t(), "checkAutoPlay return for enableNearbyLiveAutoPlay:" + z17);
            return;
        }
        if (B()) {
            return;
        }
        this.f274260s = false;
        ig2.m mVar = ig2.m.f291393a;
        java.util.HashMap hashMap = ig2.m.f291401i;
        boolean z18 = hashMap == null || hashMap.size() <= 0;
        com.tencent.mars.xlog.Log.i("FinderFluentSwitchManager", "ifDelayCheckAutoPlay:" + z18 + " size:" + hashMap.size());
        if (!z18) {
            i();
            return;
        }
        java.lang.Runnable runnable = this.E;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.D;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
            this.E = null;
        }
        gp2.t tVar = new gp2.t(this);
        this.E = tVar;
        n3Var.postDelayed(tVar, 100L);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0079 A[EDGE_INSN: B:22:0x0079->B:23:0x0079 BREAK  A[LOOP:0: B:7:0x002a->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:7:0x002a->B:28:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r62, android.view.View r63) {
        /*
            Method dump skipped, instructions count: 2412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.l0.h(int, android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gp2.l0.i():void");
    }

    public final void j() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f274243b;
        if (recyclerView == null) {
            return;
        }
        boolean z17 = this.f274259r;
        if (!z17) {
            com.tencent.mars.xlog.Log.w(t(), "checkAutoStopInternal return for enableNearbyLiveAutoPlay:" + z17);
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
        int i17 = this.f274254m;
        int[] iArr = new int[i17];
        int[] iArr2 = new int[i17];
        finderStaggeredGridLayoutManager.u(iArr);
        finderStaggeredGridLayoutManager.v(iArr2);
        if (finderStaggeredGridLayoutManager.f11924h != 0) {
            for (int i18 = 0; i18 < i17; i18++) {
                k(iArr[i18]);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                k(iArr2[i19]);
            }
            return;
        }
        int i27 = iArr[0];
        int i28 = iArr2[0];
        if (i27 > i28) {
            return;
        }
        while (true) {
            k(i27);
            if (i27 == i28) {
                return;
            } else {
                i27++;
            }
        }
    }

    public final void k(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f274243b;
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = (com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager;
        android.view.View findViewByPosition = finderStaggeredGridLayoutManager.findViewByPosition(i17);
        if (findViewByPosition != null) {
            p(i17);
            boolean b17 = dp2.a.f242183a.b(finderStaggeredGridLayoutManager.f11924h, findViewByPosition, this.f274262u.c() == 2 ? 1.0f : 0.5f);
            boolean y17 = y(findViewByPosition);
            if (finderStaggeredGridLayoutManager.f11924h == 0) {
                com.tencent.mars.xlog.Log.i("ZehongDetach", "scroll checkAutoStopInternal ori: " + finderStaggeredGridLayoutManager.f11924h + " ThanXPercent: " + b17 + " isCurPlayerView: " + y17 + " pos: " + i17 + " hashCode: " + hashCode());
            }
            if (b17 && y17) {
                L(i17);
                com.tencent.mars.xlog.Log.i(t(), "checkAutoStopInternal stop pos:" + i17 + " view:" + findViewByPosition);
            }
        }
    }

    public final void l() {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f274243b;
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        java.util.Iterator it = this.f274262u.d((com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager, new java.util.HashSet(this.f274267z)).iterator();
        while (it.hasNext()) {
            L(((gp2.f) it.next()).f274214a);
        }
    }

    public final void m() {
        this.A.clear();
    }

    public hp2.g n() {
        return new hp2.g(this.f274244c, this.f274250i, this.f274254m);
    }

    public void o() {
        androidx.lifecycle.o mo133getLifecycle;
        this.K.dead();
        dead();
        c50.m0.c(this, null, 1, null);
        this.A.clear();
        com.tencent.mm.plugin.findersdk.receiver.HeadsetReceiver headsetReceiver = this.f274263v;
        android.content.Context context = this.f274242a;
        headsetReceiver.c(context);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f274243b;
        if (recyclerView != null) {
            recyclerView.V0(this.F);
        }
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (mo133getLifecycle = mMActivity.mo133getLifecycle()) != null) {
            mo133getLifecycle.c(this.f274241J);
        }
        this.D.postDelayed(new gp2.b0(this), 1000L);
    }

    public final void p(int i17) {
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f274243b;
        if (recyclerView == null) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager");
        android.view.View findViewByPosition = ((com.tencent.mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager) layoutManager).findViewByPosition(i17);
        if (findViewByPosition != null) {
            A(i17);
            android.view.View findViewById = findViewByPosition.findViewById(com.tencent.mm.R.id.a7s);
            findViewByPosition.findViewById(com.tencent.mm.R.id.f485532i02);
            findViewByPosition.findViewById(com.tencent.mm.R.id.f485533i03);
            findViewByPosition.findViewById(com.tencent.mm.R.id.f485534i04);
            findViewByPosition.findViewById(com.tencent.mm.R.id.m3f);
            findViewByPosition.findViewById(com.tencent.mm.R.id.m3g);
            findViewByPosition.findViewById(com.tencent.mm.R.id.m3h);
            if (findViewById == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "dismissAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/nearby/live/play/PlayAudioTipsViewAdapter", "dismissAudioTips", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final android.view.View q(android.view.View view) {
        if (view == null) {
            return null;
        }
        if (view.getTag(com.tencent.mm.R.id.f486100k62) != null) {
            return view;
        }
        java.lang.Object parent = view.getParent();
        return q(parent instanceof android.view.View ? (android.view.View) parent : null);
    }

    public final so2.j5 r(int i17) {
        java.util.List list = this.f274244c;
        if (list == null) {
            com.tencent.mars.xlog.Log.w(t(), "getFeedByPos return for feedList:" + list);
            return null;
        }
        int s17 = i17 - s();
        if (s17 >= 0 && s17 < list.size()) {
            java.lang.Object obj = list.get(s17);
            if (obj instanceof so2.j5) {
                return (so2.j5) obj;
            }
            return null;
        }
        com.tencent.mars.xlog.Log.w(t(), "getFeedByPos return for invalid pos:" + i17 + ", headerCount=" + s());
        return null;
    }

    public final int s() {
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f274250i;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter.a0();
        }
        return 0;
    }

    public final java.lang.String t() {
        return this.f274258q + '.' + hashCode();
    }

    public final com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView u(android.widget.FrameLayout frameLayout, long j17) {
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) frameLayout.findViewWithTag("nearby-live-preview-view-tag");
        ig2.h a17 = ig2.m.f291393a.a(j17);
        if ((nearbyLivePreviewView != null ? nearbyLivePreviewView.getPlayer() : null) == null) {
            boolean z17 = false;
            if (nearbyLivePreviewView != null && nearbyLivePreviewView.isPauseToRemovePlayer) {
                z17 = true;
            }
            if (!z17 || !a17.f291381b) {
                android.view.View view = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) frameLayout.findViewWithTag("nearby-live-preview-view-tag");
                if (view != null) {
                    frameLayout.removeView(view);
                }
                gp2.v0 v0Var = (gp2.v0) pf5.u.f353936a.e(wo2.k.class).a(gp2.v0.class);
                java.util.HashSet hashSet = v0Var.f274328d;
                com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView2 = (com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView) pm0.v.a0(hashSet, gp2.s0.f274320d);
                if (nearbyLivePreviewView2 != null) {
                    com.tencent.mars.xlog.Log.i("NearbyLivePlayerViewRecycler", "getOrCreate: get view success, view.hashcode = " + nearbyLivePreviewView2.hashCode() + " recycledViews.size = " + hashSet.size());
                } else {
                    nearbyLivePreviewView2 = v0Var.O6();
                }
                nearbyLivePreviewView2.setTag("nearby-live-preview-view-tag");
                frameLayout.addView(nearbyLivePreviewView2);
                com.tencent.mars.xlog.Log.i(t(), "getOrCreateLiveView create view:" + nearbyLivePreviewView2);
                return nearbyLivePreviewView2;
            }
        }
        com.tencent.mars.xlog.Log.i(t(), "getOrCreateLiveView get view:" + nearbyLivePreviewView);
        kotlin.jvm.internal.o.d(nearbyLivePreviewView);
        return nearbyLivePreviewView;
    }

    public final void v(java.lang.String str, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, boolean z17) {
        mn0.b0 b0Var;
        com.tencent.mars.xlog.Log.i(t(), "handleAutoPlayError: " + str);
        ig2.m mVar = ig2.m.f291393a;
        ig2.h a17 = mVar.a(baseFinderFeed.getItemId());
        java.lang.String t17 = t();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleAutoPlayError isSameFeed: ");
        sb6.append(z17);
        sb6.append(" canReusePlayer: ");
        boolean z18 = a17.f291381b;
        sb6.append(z18);
        sb6.append(" feedId: ");
        sb6.append(baseFinderFeed.getItemId());
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i(t17, sb6.toString());
        if (!z18 || z17) {
            return;
        }
        ig2.j jVar = a17.f291382c;
        if (jVar != null && (b0Var = jVar.f291409h) != null) {
            mn0.b0.C(b0Var, true, false, false, 6, null);
        }
        mVar.d();
    }

    public final boolean x(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f274267z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((gp2.f) obj).f274214a == i17) {
                break;
            }
        }
        return obj != null;
    }

    public final boolean y(android.view.View view) {
        android.view.View findViewWithTag = view.findViewWithTag("nearby-live-preview-view-tag");
        if (findViewWithTag == null) {
            findViewWithTag = view.findViewWithTag("nearby-video-preview-view-tag");
        }
        if (findViewWithTag != null) {
            return z(findViewWithTag);
        }
        return false;
    }

    public final boolean z(android.view.View view) {
        java.lang.Object obj;
        java.util.Iterator it = this.f274267z.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            gp2.f fVar = (gp2.f) obj;
            if (kotlin.jvm.internal.o.b(fVar.f274215b, view) || kotlin.jvm.internal.o.b(fVar.f274216c, view)) {
                break;
            }
        }
        return obj != null;
    }
}
