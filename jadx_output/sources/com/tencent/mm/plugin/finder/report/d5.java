package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public class d5 extends com.tencent.mm.plugin.finder.report.r0 {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.HashMap f124997u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.HashMap f124998v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.tencent.mm.ui.MMFragmentActivity activity, r45.qt2 contextObj) {
        super(activity, contextObj);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f124997u = new java.util.HashMap();
        this.f124998v = new java.util.HashMap();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(event, "event");
        return event instanceof fc2.y;
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void G0(fc2.a event) {
        java.util.List<fc2.r> list;
        kotlin.jvm.internal.o.g(event, "event");
        if (event instanceof fc2.y) {
            fc2.y yVar = (fc2.y) event;
            if (yVar.f261007e == yVar.f261009g && yVar.f261010h == yVar.f261008f) {
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet.addAll(this.f124998v.keySet());
            java.util.List<fc2.r> list2 = yVar.f261012j;
            if (list2 != null) {
                for (fc2.r rVar : list2) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderTwoFeedFlowReporter", "visibleItemToInvisible visibleFeedList commentScene:" + this.f125284h.getInteger(5) + " feedId:" + pm0.v.u(rVar.f260977a.getItemId()));
                    so2.j5 j5Var = rVar.f260977a;
                    hashSet.add(java.lang.Long.valueOf(j5Var.getItemId()));
                    hashSet2.add(java.lang.Long.valueOf(j5Var.getItemId()));
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
                    com.tencent.mm.plugin.finder.report.f5 S0 = S0(yVar, rVar2);
                    S0.f125028f = rVar2.f260978b;
                    S0.f125029g = rVar2.f260979c;
                    V0(S0, true);
                }
            }
            for (java.util.Map.Entry entry : this.f124998v.entrySet()) {
                if (!hashSet2.contains(entry.getKey())) {
                    V0((com.tencent.mm.plugin.finder.report.f5) entry.getValue(), false);
                }
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (this.f125289p && (list = yVar.f261012j) != null) {
                for (fc2.r rVar3 : list) {
                    com.tencent.mm.plugin.finder.report.f5 f5Var = (com.tencent.mm.plugin.finder.report.f5) this.f124998v.get(java.lang.Long.valueOf(rVar3.f260977a.getItemId()));
                    so2.j5 j5Var2 = rVar3.f260977a;
                    if (f5Var != null) {
                        hashMap.put(java.lang.Long.valueOf(j5Var2.getItemId()), f5Var);
                    } else {
                        com.tencent.mm.plugin.finder.report.f5 S02 = S0(yVar, rVar3);
                        if (j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2;
                            if (baseFinderFeed.getUdfKv().length() > 0) {
                                S02.f125030h = baseFinderFeed.getUdfKv();
                            }
                        }
                        S02.f125028f = rVar3.f260978b;
                        S02.f125029g = rVar3.f260979c;
                        hashMap.put(java.lang.Long.valueOf(j5Var2.getItemId()), S02);
                        if (S02.f125025c != null || S02.f125027e != null) {
                            com.tencent.mm.plugin.finder.report.r0.f125279q.d(this.f125284h, S02, T0(S02), true);
                        }
                    }
                }
            }
            this.f124998v = hashMap;
        }
    }

    @Override // com.tencent.mm.plugin.finder.report.r0, fc2.d
    public void H0() {
        U0("onRelease");
        super.H0();
    }

    @Override // com.tencent.mm.plugin.finder.report.r0
    public void O0() {
        this.f125289p = false;
        this.f124997u.putAll(this.f124998v);
        U0("onInvisible");
    }

    public com.tencent.mm.plugin.finder.report.f5 S0(fc2.y event, fc2.r data) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(data, "data");
        so2.j5 j5Var = data.f260977a;
        long itemId = j5Var.getItemId();
        long j17 = event.f260935b;
        if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
            kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
            finderItem = ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var).getFeedObject();
        } else {
            finderItem = null;
        }
        com.tencent.mm.plugin.finder.report.f5 f5Var = new com.tencent.mm.plugin.finder.report.f5(itemId, j17, finderItem);
        if (j5Var instanceof com.tencent.mm.plugin.finder.feed.model.d5) {
            kotlin.jvm.internal.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderNativeDramaRecommendFeed");
            f5Var.f125027e = (com.tencent.mm.plugin.finder.feed.model.d5) j5Var;
        }
        return f5Var;
    }

    public org.json.JSONObject T0(com.tencent.mm.plugin.finder.report.f5 record) {
        kotlin.jvm.internal.o.g(record, "record");
        return record.f125030h;
    }

    public void U0(java.lang.String invokeSource) {
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        pm0.v.O("FinderReporterThread", new com.tencent.mm.plugin.finder.report.c5(this, invokeSource));
    }

    public final r45.vd6 V0(com.tencent.mm.plugin.finder.report.f5 f5Var, boolean z17) {
        if (f5Var.f125031i == 0) {
            f5Var.f125031i = c01.id.c();
        }
        r45.vd6 a17 = com.tencent.mm.plugin.finder.report.f5.f125022j.a(f5Var, z17);
        if (f5Var.f125025c != null || f5Var.f125027e != null) {
            com.tencent.mm.plugin.finder.report.r0.f125279q.d(this.f125284h, f5Var, T0(f5Var), false);
        }
        return a17;
    }
}
