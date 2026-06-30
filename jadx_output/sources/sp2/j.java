package sp2;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final sp2.j f411054a = new sp2.j();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f411055b;

    public static /* synthetic */ void e(sp2.j jVar, android.content.Context context, in5.j jVar2, org.json.JSONObject jSONObject, java.lang.Integer num, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            jSONObject = null;
        }
        if ((i17 & 8) != 0) {
            num = null;
        }
        jVar.d(context, jVar2, jSONObject, num);
    }

    public final void a(r45.ni4 ni4Var, so2.j5 j5Var) {
        if (j5Var instanceof wp2.b) {
            ni4Var.set(14, java.lang.Long.valueOf(((wp2.b) j5Var).f448384p.f374125d));
            return;
        }
        if (j5Var instanceof vp2.e) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.e) j5Var).f438914d.f374125d));
            return;
        }
        if (j5Var instanceof vp2.l) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.l) j5Var).f438936e.f374125d));
            return;
        }
        if (j5Var instanceof vp2.n) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.n) j5Var).f438944d.f374125d));
        } else if (j5Var instanceof vp2.c) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.c) j5Var).f438911e.f374125d));
        } else if (j5Var instanceof vp2.p) {
            ni4Var.set(14, java.lang.Long.valueOf(((vp2.p) j5Var).f438949d.f374125d));
        }
    }

    public final int b(android.content.Context context) {
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        return ((com.tencent.mm.plugin.finder.ui.MMFinderUI) context).getD();
    }

    public final void c(android.content.Context context, java.util.Set recordsSet, java.lang.Integer num) {
        int intValue;
        java.lang.String num2;
        java.lang.Object tag;
        java.lang.Object tag2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        if (f411055b) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            if (jVar.f293070a instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                r45.ni4 ni4Var = new r45.ni4();
                in5.c cVar = jVar.f293070a;
                kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar;
                sp2.j jVar2 = f411054a;
                jVar2.a(ni4Var, baseFinderFeed);
                boolean z17 = false;
                ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
                so2.h3.f410392d.f(ni4Var, num != null ? num.intValue() : jVar2.b(context), -1);
                ni4Var.set(5, java.lang.Integer.valueOf((int) jVar.f293073d));
                ni4Var.set(6, java.lang.Integer.valueOf(jVar.f293074e));
                ni4Var.set(4, baseFinderFeed.g0());
                android.view.View view = jVar.f293075f;
                if (view == null || (tag2 = view.getTag(com.tencent.mm.R.id.f486100k62)) == null) {
                    java.lang.Integer num3 = 0;
                    intValue = num3.intValue();
                } else {
                    long longValue = tag2 instanceof java.lang.Long ? ((java.lang.Number) tag2).longValue() : 0L;
                    intValue = java.lang.Integer.valueOf(longValue != 0 ? (int) (android.os.SystemClock.elapsedRealtime() - longValue) : 0).intValue();
                }
                ni4Var.set(7, java.lang.Integer.valueOf(intValue));
                android.view.View view2 = jVar.f293075f;
                if (view2 != null) {
                    view2.setTag(com.tencent.mm.R.id.f486100k62, 0L);
                }
                android.view.View view3 = jVar.f293075f;
                if (view3 != null && (tag = view3.getTag(com.tencent.mm.R.id.k67)) != null) {
                    z17 = java.lang.Boolean.valueOf(((java.lang.Boolean) tag).booleanValue()).booleanValue();
                }
                ni4Var.set(8, java.lang.Boolean.valueOf(z17));
                linkedList.add(ni4Var);
                ni4Var.set(9, java.lang.Long.valueOf(jVar.f293071b));
                ni4Var.set(13, java.lang.Long.valueOf(jVar.f293071b));
                ni4Var.set(12, java.lang.Integer.valueOf(ni4Var.getInteger(5)));
                org.json.JSONObject jSONObject = cVar instanceof so2.h1 ? ((so2.h1) cVar).f410378e : cVar instanceof vp2.n ? ((vp2.n) cVar).f438945e : cVar instanceof vp2.l ? ((vp2.l) cVar).f438938g : null;
                java.lang.String commentScene = (num == null || (num2 = num.toString()) == null) ? java.lang.String.valueOf(jVar2.b(context)) : num2;
                kotlin.jvm.internal.o.g(commentScene, "commentScene");
                if (jSONObject == null) {
                    jSONObject = new org.json.JSONObject();
                }
                sp2.i iVar = sp2.i.f411047a;
                long j17 = jVar.f293074e;
                ml2.x1 x1Var = ml2.x1.f328218y;
                jSONObject.put("exp_time", (int) jVar.f293073d);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                iVar.a(baseFinderFeed, j17, x1Var, commentScene, jSONObject2);
                com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadUtils", "onExposeTimeRecorded pos:" + jVar.f293074e + "  start_expose_time_ms: " + jVar.f293071b + " feedId: " + baseFinderFeed.getFeedObject().getFeedObject().getId() + " auto_play_time_ms:" + ni4Var.getInteger(7) + " auto_play_with_sound:" + ni4Var.getBoolean(8) + "  areaId:" + ni4Var.getLong(14) + " exposeTime:" + jVar.f293073d + " nick:" + baseFinderFeed.getFeedObject().getFeedObject().getNickname());
            }
        }
        rq2.v.f398891a.g(num != null ? num.intValue() : b(context), linkedList);
        so2.h3.f410392d.d(linkedList);
    }

    public final void d(android.content.Context context, in5.j record, org.json.JSONObject jSONObject, java.lang.Integer num) {
        java.lang.String str;
        java.lang.String jSONObject2;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(record, "record");
        if (f411055b) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        in5.c cVar = record.f293070a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = cVar instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) cVar : null;
        if (baseFinderFeed != null) {
            sp2.i iVar = sp2.i.f411047a;
            long j17 = record.f293074e;
            ml2.x1 x1Var = ml2.x1.f328217x;
            if (num == null || (str = num.toString()) == null) {
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                if (nyVar == null || (str = java.lang.Integer.valueOf(nyVar.f135380n).toString()) == null) {
                    str = "";
                }
            }
            iVar.a(baseFinderFeed, j17, x1Var, str, (jSONObject == null || (jSONObject2 = jSONObject.toString()) == null) ? "" : jSONObject2);
            r45.ni4 ni4Var = new r45.ni4();
            sp2.j jVar = f411054a;
            jVar.a(ni4Var, baseFinderFeed);
            ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            so2.h3.f410392d.f(ni4Var, num != null ? num.intValue() : jVar.b(context), -1);
            ni4Var.set(9, java.lang.Long.valueOf(record.f293071b));
            ni4Var.set(6, java.lang.Integer.valueOf(record.f293074e));
            ni4Var.set(4, baseFinderFeed.g0());
            ni4Var.set(11, 2);
            com.tencent.mars.xlog.Log.i("Finder.FinderMarkReadUtils", "handleOnItemExposeStart pos:" + record.f293074e + " feedId: " + baseFinderFeed.getFeedObject().getFeedObject().getId() + " start_expose_time_ms:" + ni4Var.getLong(9) + " feed_index:" + ni4Var.getInteger(6) + "  areaId:" + ni4Var.getLong(14) + "  nick:" + baseFinderFeed.getFeedObject().getFeedObject().getNickname());
            linkedList.add(ni4Var);
        }
        rq2.v.f398891a.g(num != null ? num.intValue() : b(context), linkedList);
        so2.h3.f410392d.d(linkedList);
    }
}
