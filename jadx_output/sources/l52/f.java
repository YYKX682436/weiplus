package l52;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public final int f316582b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316583c;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f316585e;

    /* renamed from: g, reason: collision with root package name */
    public r45.va6 f316587g;

    /* renamed from: k, reason: collision with root package name */
    public l52.m f316591k;

    /* renamed from: l, reason: collision with root package name */
    public l52.l f316592l;

    /* renamed from: m, reason: collision with root package name */
    public final m52.a f316593m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f316594n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f316595o;

    /* renamed from: p, reason: collision with root package name */
    public int f316596p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f316597q;

    /* renamed from: a, reason: collision with root package name */
    public int f316581a = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f316584d = false;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f316586f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public long f316588h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Set f316589i = new java.util.HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.Map f316590j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r, reason: collision with root package name */
    public boolean f316598r = false;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f316599s = "";

    /* renamed from: t, reason: collision with root package name */
    public boolean f316600t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f316601u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f316602v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f316603w = false;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.ref.WeakReference f316604x = null;

    /* renamed from: y, reason: collision with root package name */
    public int f316605y = -1;

    /* renamed from: z, reason: collision with root package name */
    public int f316606z = 0;
    public int A = 0;
    public java.lang.ref.WeakReference B = null;
    public boolean C = true;
    public int D = -1;
    public long E = 0;
    public long F = -1;
    public java.lang.String G = "";
    public int H = -1;
    public int I = -1;

    /* renamed from: J, reason: collision with root package name */
    public int f316580J = 0;
    public int K = 0;
    public android.view.WindowManager L = null;

    public f(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f316597q = "";
        this.f316593m = i17 == 0 ? new m52.b() : null;
        this.f316582b = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        this.f316585e = new java.util.concurrent.ConcurrentHashMap();
        this.f316583c = i17;
        this.f316594n = str;
        this.f316595o = str2;
        this.f316596p = -1;
        this.f316597q = str3;
    }

    public static void f(l52.f fVar) {
        l52.g gVar;
        r45.va6 va6Var;
        if (fVar.f316587g == null) {
            return;
        }
        java.util.Map map = fVar.f316585e;
        boolean z17 = map != null && ((java.util.concurrent.ConcurrentHashMap) map).isEmpty();
        fVar.e();
        if (z17) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            fVar.j();
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "getSnsFeedParams: cost=%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) fVar.f316585e;
        if (!concurrentHashMap.isEmpty()) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "_moveMonitoringFeed2ReadyReport");
            for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                if (entry != null && (gVar = (l52.g) entry.getValue()) != null && (va6Var = fVar.f316587g) != null) {
                    va6Var.f388047h.add(gVar.f316607a);
                }
            }
            concurrentHashMap.clear();
        }
        r45.va6 va6Var2 = fVar.f316587g;
        fVar.f316587g = null;
        ((ku5.t0) ku5.t0.f312615d).h(new l52.c(fVar, va6Var2), "_reportTimeline");
    }

    public final void a(android.view.ViewGroup viewGroup, int i17, int i18) {
        if (this.f316591k == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l52.m mVar = this.f316591k;
        if (mVar.f316636c <= 0) {
            mVar.f316636c = currentTimeMillis;
        }
        if ((this.E <= ((long) (this.K / 2))) || this.f316581a == 0) {
            b(viewGroup, i17, i18, currentTimeMillis);
            return;
        }
        if (this.f316583c == 0 && this.f316596p != -1) {
            b(viewGroup, i17, i18, currentTimeMillis);
            return;
        }
        long j17 = mVar.f316634a;
        if (j17 > 0) {
            r45.va6 va6Var = this.f316587g;
            if (va6Var != null) {
                va6Var.f388045f += currentTimeMillis - j17;
            }
            mVar.f316634a = 0L;
            g(viewGroup, i17, i18, currentTimeMillis, false);
        }
        l52.m mVar2 = this.f316591k;
        if (mVar2.f316635b <= 0) {
            mVar2.f316635b = currentTimeMillis;
        }
    }

    public final void b(android.view.ViewGroup viewGroup, int i17, int i18, long j17) {
        l52.m mVar = this.f316591k;
        if (mVar.f316634a <= 0) {
            mVar.f316634a = j17;
            l52.l lVar = this.f316592l;
            if (lVar != null) {
                lVar.f316633a = j17;
                if (this.f316583c != 0 || this.f316602v || !this.f316603w) {
                    g(viewGroup, i17, i18, j17, true);
                }
            }
        } else {
            g(viewGroup, i17, i18, j17, true);
        }
        l52.m mVar2 = this.f316591k;
        long j18 = mVar2.f316635b;
        if (j18 > 0) {
            r45.va6 va6Var = this.f316587g;
            if (va6Var != null) {
                va6Var.f388046g += j17 - j18;
            }
            mVar2.f316635b = 0L;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final nm5.b c(android.view.View r18, int r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l52.f.c(android.view.View, int):nm5.b");
    }

    public final void d(android.view.ViewGroup viewGroup, int i17, int i18) {
        android.view.View view;
        java.lang.String a17;
        r45.p86 p86Var;
        boolean z17 = true;
        if (this.f316581a == 0) {
            this.E = 0L;
        } else {
            if (viewGroup instanceof android.widget.AbsListView) {
                view = viewGroup.getChildAt(i18 - 1);
                if (view == null) {
                    view = viewGroup.getChildAt(((android.widget.AbsListView) viewGroup).getLastVisiblePosition());
                }
            } else if (viewGroup instanceof androidx.recyclerview.widget.RecyclerView) {
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((androidx.recyclerview.widget.RecyclerView) viewGroup).getLayoutManager();
                if (linearLayoutManager != null) {
                    android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.y());
                    if (findViewByPosition == null) {
                        view = viewGroup.getChildAt(linearLayoutManager.y());
                        if (view == null) {
                            view = viewGroup.getChildAt(i18 - 1);
                        }
                    } else {
                        view = findViewByPosition;
                    }
                } else {
                    view = viewGroup.getChildAt(i18 - 1);
                }
            } else {
                view = null;
            }
            if (view != null) {
                if (this.C) {
                    a17 = (java.lang.String) ((java.util.concurrent.ConcurrentHashMap) this.f316590j).get(java.lang.Integer.valueOf(view.hashCode()));
                    if (a17 == null && (p86Var = i(view).f316607a) != null) {
                        a17 = p86Var.f382838d;
                    }
                } else {
                    a17 = ((m52.b) this.f316593m).a(view, i18 - 1);
                }
                if (a17 != null) {
                    if (a17.equals(this.G)) {
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int i19 = iArr[1];
                        int abs = java.lang.Math.abs(i19 - this.D);
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long j17 = currentTimeMillis - this.F;
                        if (j17 <= 0 || abs <= this.f316582b) {
                            z17 = false;
                        } else {
                            this.E = (abs * 1000) / j17;
                            this.D = i19;
                            this.F = currentTimeMillis;
                        }
                    } else {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        this.D = iArr2[1];
                        this.F = java.lang.System.currentTimeMillis();
                        this.G = a17;
                    }
                }
            }
        }
        if (z17) {
            a(viewGroup, i17, i18);
        }
    }

    public final void e() {
        android.view.ViewGroup viewGroup;
        if (this.f316591k == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        l52.m mVar = this.f316591k;
        long j17 = mVar.f316634a;
        if (j17 > 0) {
            r45.va6 va6Var = this.f316587g;
            if (va6Var != null) {
                va6Var.f388045f += currentTimeMillis - j17;
            }
            mVar.f316634a = 0L;
            java.lang.ref.WeakReference weakReference = this.f316604x;
            if (weakReference != null && (viewGroup = (android.view.ViewGroup) weakReference.get()) != null) {
                g(viewGroup, this.f316605y, this.f316606z, currentTimeMillis, false);
            }
        }
        long j18 = this.f316591k.f316635b;
        if (j18 > 0) {
            r45.va6 va6Var2 = this.f316587g;
            if (va6Var2 != null) {
                va6Var2.f388046g += currentTimeMillis - j18;
            } else {
                com.tencent.mars.xlog.Log.e("HABBYGE-MALI.FeedMonitor", "_stopComputeTimelineSliceTime mSnsTimeline is NULL 2");
            }
            this.f316591k.f316635b = 0L;
        }
        l52.m mVar2 = this.f316591k;
        long j19 = mVar2.f316636c;
        if (j19 > 0) {
            r45.va6 va6Var3 = this.f316587g;
            if (va6Var3 != null && this.f316583c != 0) {
                va6Var3.f388044e += currentTimeMillis - j19;
            }
            mVar2.f316636c = 0L;
        }
    }

    public final void g(android.view.ViewGroup viewGroup, int i17, int i18, long j17, boolean z17) {
        l52.l lVar;
        nm5.b h17;
        long j18;
        boolean z18;
        java.lang.String str;
        l52.g gVar;
        nm5.b c17;
        if (viewGroup == null || (lVar = this.f316592l) == null) {
            return;
        }
        this.f316601u = false;
        long j19 = lVar.f316633a;
        if (j19 > 0) {
            long j27 = j17 - j19;
            if (j27 <= 0) {
                if (!this.f316600t && !this.f316602v) {
                    return;
                }
                this.f316600t = false;
                this.f316602v = false;
            }
            if (this.f316583c != 0) {
                h17 = h(viewGroup, i17, i18, false);
            } else if (this.C) {
                h17 = h(viewGroup, i17, i18, true);
            } else {
                java.util.HashMap hashMap = new java.util.HashMap();
                int i19 = 0;
                for (int i27 = i18 - 1; i27 >= 0; i27--) {
                    android.view.View childAt = viewGroup.getChildAt(i27);
                    if (childAt != null && (c17 = c(childAt, i27)) != null) {
                        boolean booleanValue = ((java.lang.Boolean) c17.a(1)).booleanValue();
                        hashMap.put((l52.g) c17.a(0), java.lang.Boolean.valueOf(booleanValue));
                        if (booleanValue) {
                            i19++;
                        }
                    }
                }
                h17 = nm5.j.c(hashMap, java.lang.Integer.valueOf(i19));
            }
            java.util.Map map = (java.util.Map) h17.a(0);
            int intValue = ((java.lang.Integer) h17.a(1)).intValue();
            if (intValue <= 0) {
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f316586f;
            concurrentHashMap.clear();
            double d17 = j27;
            double d18 = d17 / intValue;
            java.util.HashSet hashSet = new java.util.HashSet(map.size());
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                l52.g gVar2 = (l52.g) entry.getKey();
                java.lang.Boolean bool = (java.lang.Boolean) entry.getValue();
                r45.p86 p86Var = gVar2.f316607a;
                java.util.Iterator it6 = it;
                int i28 = p86Var.f382843i + p86Var.f382844m + ((int) (((p86Var.f382841g - p86Var.f382842h) - r12) * 0.4f));
                int i29 = p86Var.f382839e;
                java.lang.Boolean valueOf = java.lang.Boolean.valueOf(i29 < i28 && p86Var.f382840f + i29 > i28);
                r45.p86 p86Var2 = gVar2.f316607a;
                if (p86Var2 == null || (str = p86Var2.f382838d) == null) {
                    j18 = j27;
                    z18 = true;
                } else {
                    boolean booleanValue2 = bool.booleanValue();
                    java.util.Map map2 = this.f316585e;
                    if (booleanValue2) {
                        concurrentHashMap.put(str, java.lang.Boolean.valueOf(gVar2.f316607a.f382857z));
                        hashSet.add(str);
                        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) map2;
                        if (concurrentHashMap2.containsKey(str)) {
                            l52.g gVar3 = (l52.g) concurrentHashMap2.get(str);
                            if (gVar3 != null) {
                                r45.p86 p86Var3 = gVar3.f316607a;
                                j18 = j27;
                                p86Var3.f382852u += d18;
                                p86Var3.f382853v += d17;
                                r45.p86 p86Var4 = gVar2.f316607a;
                                p86Var3.f382839e = p86Var4.f382839e;
                                p86Var3.f382840f = p86Var4.f382840f;
                                p86Var3.f382845n = p86Var4.f382845n;
                                p86Var3.f382846o = p86Var4.f382846o;
                                p86Var3.f382841g = p86Var4.f382841g;
                                p86Var3.f382842h = p86Var4.f382842h;
                                concurrentHashMap2.put(str, gVar3);
                                r45.p86 p86Var5 = gVar3.f316607a;
                                r45.p86 p86Var6 = gVar2.f316607a;
                                p86Var5.f382855x = p86Var6.f382855x;
                                p86Var5.f382854w = p86Var6.f382854w;
                                p86Var5.f382856y = p86Var6.f382856y;
                                p86Var5.A = p86Var6.A;
                                p86Var5.f382857z = p86Var6.f382857z;
                                if (!((java.util.HashSet) this.f316589i).contains(str)) {
                                    z18 = true;
                                    gVar3.f316607a.H++;
                                }
                                z18 = true;
                            }
                        } else {
                            j18 = j27;
                            z18 = true;
                            r45.p86 p86Var7 = gVar2.f316607a;
                            p86Var7.f382852u = d18;
                            p86Var7.f382853v = d17;
                            concurrentHashMap2.put(str, gVar2);
                        }
                        if (valueOf.booleanValue() && (gVar = (l52.g) ((java.util.concurrent.ConcurrentHashMap) map2).get(str)) != null) {
                            gVar.f316607a.f382851t += j18;
                        }
                    }
                    j18 = j27;
                    z18 = true;
                    if (valueOf.booleanValue()) {
                        gVar.f316607a.f382851t += j18;
                    }
                }
                it = it6;
                j27 = j18;
            }
            this.f316589i = hashSet;
            if (z17) {
                this.f316592l.f316633a = j17;
            } else {
                this.f316592l.f316633a = 0L;
            }
        }
    }

    public final nm5.b h(android.view.ViewGroup viewGroup, int i17, int i18, boolean z17) {
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
        int i19;
        android.view.View view;
        nm5.b c17;
        java.lang.String str;
        java.util.HashMap hashMap = new java.util.HashMap();
        androidx.recyclerview.widget.RecyclerView recyclerView = viewGroup instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) viewGroup : null;
        int i27 = 0;
        boolean z18 = false;
        for (int i28 = i18 - 1; i28 >= 0; i28--) {
            if (recyclerView == null) {
                view = viewGroup.getChildAt(i28);
                i19 = i28;
            } else {
                java.lang.ref.WeakReference weakReference = this.B;
                if (weakReference == null || (linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) weakReference.get()) == null) {
                    linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) ((androidx.recyclerview.widget.RecyclerView) viewGroup).getLayoutManager();
                    if (linearLayoutManager == null) {
                        z18 = true;
                    } else {
                        this.B = new java.lang.ref.WeakReference(linearLayoutManager);
                    }
                }
                int i29 = i17 + i28;
                android.view.View findViewByPosition = linearLayoutManager.findViewByPosition(i29);
                if (findViewByPosition == null && (findViewByPosition = viewGroup.getChildAt(i28)) == null) {
                    findViewByPosition = viewGroup.getChildAt(i29);
                }
                i19 = i29;
                view = findViewByPosition;
                z18 = true;
            }
            if (view != null) {
                if (z17) {
                    java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z18);
                    l52.g i37 = i(view);
                    if (!valueOf.booleanValue()) {
                        int height = view.getHeight();
                        int[] iArr = new int[2];
                        view.getLocationOnScreen(iArr);
                        int min = java.lang.Math.min(iArr[1], (int) view.getY());
                        r45.p86 p86Var = i37.f316607a;
                        p86Var.f382839e = min;
                        p86Var.f382840f = height;
                    } else if (i37.f316607a != null) {
                        int[] iArr2 = new int[2];
                        view.getLocationOnScreen(iArr2);
                        i37.f316607a.f382839e = iArr2[1];
                    }
                    r45.p86 p86Var2 = i37.f316607a;
                    if (p86Var2 != null && (str = p86Var2.f382838d) != null && !str.isEmpty()) {
                        ((java.util.concurrent.ConcurrentHashMap) this.f316590j).put(java.lang.Integer.valueOf(view.hashCode()), i37.f316607a.f382838d);
                    }
                    c17 = nm5.j.c(i37, java.lang.Boolean.valueOf(i37.a(this.f316583c)));
                } else {
                    c17 = c(view, i19);
                }
                if (c17 != null) {
                    boolean booleanValue = ((java.lang.Boolean) c17.a(1)).booleanValue();
                    hashMap.put((l52.g) c17.a(0), java.lang.Boolean.valueOf(booleanValue));
                    if (booleanValue) {
                        i27++;
                    }
                }
            }
        }
        return nm5.j.c(hashMap, java.lang.Integer.valueOf(i27));
    }

    public final l52.g i(android.view.View view) {
        l52.g gVar = new l52.g();
        gVar.f316607a = new r45.p86();
        if (view == null) {
            return gVar;
        }
        java.util.Map bj6 = ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bj(view);
        try {
            if (bj6 instanceof java.util.Map) {
                java.lang.String str = (java.lang.String) bj6.get("sns_feed_id");
                if (android.text.TextUtils.isEmpty(str)) {
                    return gVar;
                }
                r45.p86 p86Var = gVar.f316607a;
                p86Var.f382838d = str;
                p86Var.f382856y = bj6.containsKey("sns_feed_username") ? (java.lang.String) bj6.get("sns_feed_username") : "";
                gVar.f316616j = bj6.containsKey("sns_feed_share_name") ? (java.lang.String) bj6.get("sns_feed_share_name") : "";
                gVar.f316607a.A = bj6.containsKey("sns_nick_name") ? (java.lang.String) bj6.get("sns_nick_name") : "";
                gVar.f316607a.f382857z = (bj6.containsKey("sns_feed_is_ad") ? ((java.lang.Integer) bj6.get("sns_feed_is_ad")).intValue() : 0) == 1;
                gVar.f316607a.f382842h = bj6.containsKey("sns_feed_virtual_key_height") ? ((java.lang.Integer) bj6.get("sns_feed_virtual_key_height")).intValue() : 0;
                gVar.f316607a.f382843i = bj6.containsKey("sns_feed_status_bar_height") ? ((java.lang.Integer) bj6.get("sns_feed_status_bar_height")).intValue() : this.I;
                gVar.f316607a.f382844m = bj6.containsKey("sns_feed_action_bar_height") ? ((java.lang.Integer) bj6.get("sns_feed_action_bar_height")).intValue() : this.H;
                gVar.f316608b = bj6.containsKey("sns_feed_position") ? ((java.lang.Integer) bj6.get("sns_feed_position")).intValue() : 0;
                gVar.f316607a.f382855x = bj6.containsKey("sns_feed_like_count") ? ((java.lang.Integer) bj6.get("sns_feed_like_count")).intValue() : 0;
                gVar.f316607a.f382854w = bj6.containsKey("sns_feed_comment_count") ? ((java.lang.Integer) bj6.get("sns_feed_comment_count")).intValue() : 0;
                gVar.f316607a.f382841g = bj6.containsKey("sns_feed_screen_height") ? ((java.lang.Integer) bj6.get("sns_feed_screen_height")).intValue() : this.K;
                gVar.f316607a.f382840f = java.lang.Math.max(view.getMeasuredHeight(), view.getHeight());
                r45.p86 p86Var2 = gVar.f316607a;
                p86Var2.f382845n = this.f316581a;
                p86Var2.f382846o = this.A;
                p86Var2.B = gVar.f316608b + 1;
                p86Var2.C = bj6.containsKey("sns_feed_type") ? ((java.lang.Integer) bj6.get("sns_feed_type")).intValue() : 0;
                gVar.f316607a.D = bj6.containsKey("sns_is_live") ? ((java.lang.Integer) bj6.get("sns_is_live")).intValue() : 0;
                gVar.f316607a.f382837J = bj6.containsKey("sns_is_ws") ? ((java.lang.Integer) bj6.get("sns_is_ws")).intValue() : 0;
                gVar.f316607a.K = bj6.containsKey("sns_is_ws_block") ? ((java.lang.Integer) bj6.get("sns_is_ws_block")).intValue() : 0;
                gVar.f316607a.L = ((java.lang.Integer) bj6.get("sns_feed_tail_type")).intValue();
                gVar.f316607a.M = bj6.containsKey("sns_emo_cmt_cnt") ? ((java.lang.Integer) bj6.get("sns_emo_cmt_cnt")).intValue() : 0;
                gVar.f316607a.N = bj6.containsKey("sns_img_cmt_cnt") ? ((java.lang.Integer) bj6.get("sns_img_cmt_cnt")).intValue() : 0;
                gVar.f316607a.P = bj6.containsKey("sns_yb_retouch") ? (java.lang.String) bj6.get("sns_yb_retouch") : "";
            }
            return gVar;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("HABBYGE-MALI.FeedMonitor", "new snsUI get amoeba sdk  params err");
            return gVar;
        }
    }

    public final void j() {
        if (this.f316583c != 0 || this.f316587g == null) {
            return;
        }
        com.tencent.mm.autogen.events.GetSnsTimelineReportParamsEvent getSnsTimelineReportParamsEvent = new com.tencent.mm.autogen.events.GetSnsTimelineReportParamsEvent();
        java.util.Map map = this.f316585e;
        if (map != null) {
            boolean z17 = this.f316584d;
            am.rg rgVar = getSnsTimelineReportParamsEvent.f54416g;
            rgVar.f7810a = z17;
            rgVar.f7812c = this.f316597q;
            rgVar.f7813d = new java.util.LinkedList(((java.util.concurrent.ConcurrentHashMap) map).keySet());
            rgVar.f7811b = this.f316587g.f388043d;
        }
        getSnsTimelineReportParamsEvent.e();
    }

    public final void k(android.app.Activity activity) {
        android.view.Display defaultDisplay;
        try {
            if (this.L == null) {
                this.L = (android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window");
            }
            defaultDisplay = this.L.getDefaultDisplay();
        } catch (java.lang.Exception unused) {
            if (activity == null) {
                return;
            } else {
                defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getSize(point);
        android.graphics.Point point2 = new android.graphics.Point();
        defaultDisplay.getRealSize(point2);
        this.f316580J = point.y;
        this.K = point2.y;
    }

    public final void l(android.app.Activity activity) {
        if (this.I <= 0 && activity != null) {
            android.content.res.Resources resources = activity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", com.eclipsesource.mmv8.Platform.ANDROID));
            this.I = dimensionPixelSize;
            if (dimensionPixelSize <= 0) {
                this.I = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480394wp);
            }
        }
    }

    public final void m(java.lang.String str, java.lang.String str2) {
        r45.va6 va6Var = new r45.va6();
        this.f316587g = va6Var;
        va6Var.f388044e = 0L;
        va6Var.f388049m = this.f316594n;
        va6Var.f388050n = this.f316595o;
        if (str == null) {
            str = "";
        }
        va6Var.f388043d = str;
        va6Var.f388048i = str2;
        p52.h.f352027l = str;
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "initTimelineParams: %s, %s", str, str2);
        r45.va6 va6Var2 = this.f316587g;
        va6Var2.f388045f = 0L;
        va6Var2.f388046g = 0L;
        ((java.util.concurrent.ConcurrentHashMap) this.f316585e).clear();
        this.f316591k = new l52.m();
        this.f316592l = new l52.l();
        if (this.f316583c == 0) {
            java.lang.String str3 = this.f316597q;
            if ("com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3".equals(str3) || "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI".equals(str3)) {
                this.f316584d = true;
                this.f316587g.f388053q = e62.q.a().f249810h;
                this.f316587g.f388043d = "1230_" + java.lang.System.currentTimeMillis();
            } else {
                this.f316587g.f388043d = e62.q.a().f249810h;
                if ("com.tencent.mm.plugin.sns.ui.SnsTimeLineUI".equals(str3)) {
                    this.C = false;
                }
                this.f316587g.f388055s = this.f316599s;
                this.f316599s = "";
            }
            java.lang.String str4 = this.f316587g.f388043d;
            java.lang.String str5 = str4 != null ? str4 : "";
            if (str5.isEmpty()) {
                return;
            }
            com.tencent.mm.autogen.events.SnsSessionChangeEvent snsSessionChangeEvent = new com.tencent.mm.autogen.events.SnsSessionChangeEvent();
            am.vw vwVar = snsSessionChangeEvent.f54839g;
            vwVar.f8225b = str5;
            vwVar.f8224a = str3;
            snsSessionChangeEvent.e();
        }
    }

    public void n(int i17, android.app.Activity activity) {
        android.view.ViewGroup viewGroup;
        android.view.ViewGroup viewGroup2;
        android.view.ViewGroup viewGroup3;
        if (i17 != 0) {
            if (i17 == 1) {
                int a17 = g52.a.a();
                com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "stopMonitor, activityMethod: %s", java.lang.Integer.valueOf(a17));
                if (a17 == 0) {
                    e();
                    return;
                }
                if (a17 == 1) {
                    q();
                    return;
                } else {
                    if (a17 != 8) {
                        return;
                    }
                    e();
                    this.f316588h = java.lang.System.currentTimeMillis();
                    return;
                }
            }
            if (i17 == 2) {
                com.tencent.mm.sdk.platformtools.u3.h(new l52.e(this));
                return;
            }
            if (i17 == 3) {
                q();
                return;
            }
            if (i17 != 4) {
                if (i17 != 5) {
                    return;
                }
                this.f316601u = false;
                q();
                return;
            }
            this.f316581a = 0;
            l(activity);
            k(activity);
            m(v52.c.g().d(), w52.j.b());
            this.f316600t = true;
            this.f316601u = true;
            java.lang.ref.WeakReference weakReference = this.f316604x;
            if (weakReference == null || (viewGroup3 = (android.view.ViewGroup) weakReference.get()) == null) {
                return;
            }
            d(viewGroup3, java.lang.Math.max(this.f316605y, 0), java.lang.Math.max(this.f316606z, 1));
            return;
        }
        this.f316581a = 0;
        l(activity);
        k(activity);
        int a18 = g52.a.a();
        com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "startMonitor activityMethod: %d", java.lang.Integer.valueOf(a18));
        if (a18 == 0) {
            m(v52.c.g().d(), w52.j.b());
            this.f316600t = true;
            this.f316598r = true;
            return;
        }
        if (a18 == 1) {
            this.f316600t = true;
            if (!this.f316598r) {
                this.f316598r = true;
                m(v52.c.g().d(), w52.j.b());
            }
            java.lang.ref.WeakReference weakReference2 = this.f316604x;
            if (weakReference2 == null || (viewGroup = (android.view.ViewGroup) weakReference2.get()) == null) {
                return;
            }
            d(viewGroup, this.f316605y, this.f316606z);
            return;
        }
        if (a18 != 7) {
            return;
        }
        if (java.lang.System.currentTimeMillis() - this.f316588h > 30000) {
            com.tencent.mars.xlog.Log.i("HABBYGE-MALI.FeedMonitor", "_handleActivityMethod.BACK_2_FRONT: New Session");
            this.f316602v = true;
            java.lang.String d17 = v52.c.g().d();
            java.lang.String b17 = w52.j.b();
            j();
            com.tencent.mm.sdk.platformtools.u3.h(new l52.b(this, this.f316598r, d17, b17));
            return;
        }
        this.f316600t = true;
        java.lang.ref.WeakReference weakReference3 = this.f316604x;
        if (weakReference3 == null || (viewGroup2 = (android.view.ViewGroup) weakReference3.get()) == null) {
            return;
        }
        d(viewGroup2, this.f316605y, this.f316606z);
    }

    public void o(android.app.Activity activity, android.view.ViewGroup viewGroup, int i17, int i18, int i19) {
        androidx.appcompat.app.b supportActionBar;
        if (viewGroup instanceof androidx.recyclerview.widget.RecyclerView) {
            this.f316593m.getClass();
        }
        java.lang.ref.WeakReference weakReference = this.f316604x;
        if (weakReference == null || weakReference.get() == null) {
            this.f316604x = new java.lang.ref.WeakReference(viewGroup);
        }
        this.f316605y = i17;
        this.f316606z = i18;
        int i27 = this.f316581a;
        if (i27 == 1) {
            try {
                if (java.lang.Math.abs(i19) > this.f316582b) {
                    if (i19 > 0) {
                        this.A = -1;
                    } else if (i19 < 0) {
                        this.A = 1;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FeedMonitor", e17, "scrollingState, crash: %s", e17.getMessage());
            }
        } else if (i27 == 0 && this.H <= 0 && activity != null) {
            try {
                if ((activity instanceof androidx.appcompat.app.AppCompatActivity) && (supportActionBar = ((androidx.appcompat.app.AppCompatActivity) activity).getSupportActionBar()) != null) {
                    this.H = supportActionBar.j().getHeight();
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("HABBYGE-MALI.FeedMonitor", e18, "initBarHeight", new java.lang.Object[0]);
            }
        }
        d(viewGroup, i17, i18);
        this.f316603w = true;
    }

    public void p(android.view.ViewGroup viewGroup, int i17) {
        this.f316581a = i17;
        java.lang.ref.WeakReference weakReference = this.f316604x;
        if (weakReference == null || weakReference.get() == null) {
            this.f316604x = new java.lang.ref.WeakReference(viewGroup);
        }
        if (viewGroup instanceof androidx.recyclerview.widget.RecyclerView) {
            this.f316593m.getClass();
        }
        if (i17 == 0) {
            this.A = 0;
        }
        if (this.f316583c == 0 && i17 != 2) {
            this.f316596p = -1;
        }
        if (this.f316601u) {
            this.f316601u = false;
            g(viewGroup, java.lang.Math.max(this.f316605y, 0), java.lang.Math.max(this.f316606z, 1), java.lang.System.currentTimeMillis(), true);
        }
    }

    public final void q() {
        java.util.Map map = this.f316585e;
        if (map != null && !((java.util.concurrent.ConcurrentHashMap) map).isEmpty()) {
            j();
        }
        com.tencent.mm.sdk.platformtools.u3.h(new l52.a(this));
    }
}
