package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public class r2 extends com.tencent.mm.plugin.finder.report.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f125332u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.HashMap f125333v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f125289p = false;
        this.f125332u = new java.util.HashMap();
        this.f125333v = new java.util.HashMap();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof fc2.y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void G0(fc2.a event) {
        ?? r76;
        java.util.List<fc2.r> list;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem2;
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof fc2.y) {
            fc2.y yVar = (fc2.y) event;
            if (yVar.f261007e == yVar.f261009g && yVar.f261010h == yVar.f261008f) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet.addAll(this.f125333v.keySet());
            java.util.List<fc2.r> list2 = yVar.f261012j;
            if (list2 != null) {
                for (fc2.r rVar : list2) {
                    hashSet.add(java.lang.Long.valueOf(rVar.f260977a.getItemId()));
                    hashSet2.add(java.lang.Long.valueOf(rVar.f260977a.getItemId()));
                }
            }
            java.util.List list3 = yVar.f261011i;
            if (list3 != null) {
                java.util.ArrayList<fc2.r> arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list3) {
                    if (!hashSet.contains(java.lang.Long.valueOf(((fc2.r) obj).f260977a.getItemId()))) {
                        arrayList.add(obj);
                    }
                }
                for (fc2.r rVar2 : arrayList) {
                    long itemId = rVar2.f260977a.getItemId();
                    long j17 = event.f260935b;
                    so2.j5 j5Var = rVar2.f260977a;
                    if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                        kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                        finderItem2 = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
                    } else {
                        finderItem2 = null;
                    }
                    com.tencent.mm.plugin.finder.report.f5 f5Var = new com.tencent.mm.plugin.finder.report.f5(itemId, j17, finderItem2);
                    f5Var.f125028f = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject().getProfileTabIndex() : rVar2.f260978b;
                    f5Var.f125029g = rVar2.f260979c;
                    S0(f5Var, true);
                }
            }
            java.util.Iterator it = this.f125333v.entrySet().iterator();
            while (true) {
                r76 = 0;
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (!hashSet2.contains(entry.getKey())) {
                    S0((com.tencent.mm.plugin.finder.report.f5) entry.getValue(), false);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (this.f125289p && (list = yVar.f261012j) != null) {
                for (fc2.r rVar3 : list) {
                    com.tencent.mm.plugin.finder.report.f5 f5Var2 = (com.tencent.mm.plugin.finder.report.f5) this.f125333v.get(java.lang.Long.valueOf(rVar3.f260977a.getItemId()));
                    so2.j5 j5Var2 = rVar3.f260977a;
                    if (f5Var2 != null) {
                        hashMap.put(java.lang.Long.valueOf(j5Var2.getItemId()), f5Var2);
                    } else {
                        long itemId2 = j5Var2.getItemId();
                        long j18 = event.f260935b;
                        if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            kotlin.jvm.internal.o.e(j5Var2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                            finderItem = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject();
                        } else {
                            finderItem = null;
                        }
                        com.tencent.mm.plugin.finder.report.f5 f5Var3 = new com.tencent.mm.plugin.finder.report.f5(itemId2, j18, finderItem);
                        boolean z17 = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
                        int profileTabIndex = z17 ? ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).getFeedObject().getProfileTabIndex() : rVar3.f260978b;
                        if (z17) {
                            com.tencent.mm.ui.MMFragmentActivity activity = this.f125283g;
                            kotlin.jvm.internal.o.g(activity, "activity");
                            int i17 = (activity.getIntent().getIntExtra("key_click_avatar_type", r76) == 1 || activity.getIntent().getIntExtra("key_enter_profile_type", r76) == 11) ? 1 : activity.getIntent().getBooleanExtra("key_is_from_slide", r76) ? 2 : 3;
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                            org.json.JSONObject e27 = baseFinderFeed.e2();
                            com.tencent.mm.plugin.finder.profile.uic.p0 p0Var = com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.f123413t;
                            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context, "getContext(...)");
                            e27.put("tab_seat", p0Var.a(context, baseFinderFeed.getFeedObject().getProfileTabScene()));
                            e27.put("enter_profile_method", i17);
                            f5Var3.f125030h = e27;
                        }
                        f5Var3.f125028f = profileTabIndex;
                        f5Var3.f125029g = rVar3.f260979c;
                        hashMap.put(java.lang.Long.valueOf(j5Var2.getItemId()), f5Var3);
                        com.tencent.mm.plugin.finder.report.r0.f125279q.d(this.f125284h, f5Var3, f5Var3.f125030h, true);
                    }
                    r76 = 0;
                }
            }
            this.f125333v = hashMap;
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.q2(this, "onRelease"));
        super.H0();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileAllFeedFlowReporter", "onInvisible visible=" + this.f125289p);
        if (this.f125289p) {
            this.f125289p = false;
            this.f125332u.putAll(this.f125333v);
            pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.q2(this, "onInvisible"));
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void Q0() {
        com.tencent.mars.xlog.Log.i("Finder.FinderProfileAllFeedFlowReporter", "onVisible visible=" + this.f125289p);
        if (this.f125289p) {
            return;
        }
        this.f125289p = true;
    }

    public final r45.vd6 S0(com.tencent.mm.plugin.finder.report.f5 f5Var, boolean z17) {
        if (f5Var.f125031i == 0) {
            f5Var.f125031i = c01.id.c();
        }
        r45.vd6 a17 = com.tencent.mm.plugin.finder.report.f5.f125022j.a(f5Var, z17);
        com.tencent.mm.plugin.finder.report.r0.f125279q.d(this.f125284h, f5Var, f5Var.f125030h, false);
        return a17;
    }
}
