package yv0;

/* loaded from: classes5.dex */
public class h extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final ex0.a0 f465965d;

    /* renamed from: e, reason: collision with root package name */
    public final bx0.h f465966e;

    /* renamed from: f, reason: collision with root package name */
    public final dx0.n f465967f;

    /* renamed from: g, reason: collision with root package name */
    public final int f465968g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f465969h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f465970i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f465971m;

    /* renamed from: n, reason: collision with root package name */
    public yv0.a f465972n;

    public h(ex0.a0 timelineVM, bx0.h timelineCalc, dx0.n thumbnailProviderManager, int i17, boolean z17, kotlinx.coroutines.y0 mainScope, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 16) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(timelineVM, "timelineVM");
        kotlin.jvm.internal.o.g(timelineCalc, "timelineCalc");
        kotlin.jvm.internal.o.g(thumbnailProviderManager, "thumbnailProviderManager");
        kotlin.jvm.internal.o.g(mainScope, "mainScope");
        this.f465965d = timelineVM;
        this.f465966e = timelineCalc;
        this.f465967f = thumbnailProviderManager;
        this.f465968g = i17;
        this.f465969h = z17;
        this.f465970i = mainScope;
        timelineCalc.f36277d.b();
        this.f465971m = y();
    }

    public final boolean B(ex0.r rVar, java.util.List list) {
        java.lang.Object obj;
        java.lang.Object obj2;
        android.graphics.Rect rect;
        android.graphics.Rect rect2;
        java.util.List list2 = this.f465971m;
        java.lang.Integer num = null;
        if (list2 == null) {
            kotlin.jvm.internal.o.o("storylineSegmentInfos");
            throw null;
        }
        java.util.Iterator it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (kotlin.jvm.internal.o.b(((yv0.p) obj).f465985a, rVar.f257168b)) {
                break;
            }
        }
        yv0.p pVar = (yv0.p) obj;
        java.lang.Integer valueOf = (pVar == null || (rect2 = pVar.f465989e) == null) ? null : java.lang.Integer.valueOf(rect2.width());
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it6.next();
            if (kotlin.jvm.internal.o.b(((yv0.p) obj2).f465985a, rVar.f257168b)) {
                break;
            }
        }
        yv0.p pVar2 = (yv0.p) obj2;
        if (pVar2 != null && (rect = pVar2.f465989e) != null) {
            num = java.lang.Integer.valueOf(rect.width());
        }
        if (valueOf == null || num == null) {
            return false;
        }
        double intValue = this.f465966e.f36279f + (num.intValue() - valueOf.intValue());
        if (intValue < 0.0d) {
            intValue = 0.0d;
        }
        yv0.a aVar = this.f465972n;
        if (aVar != null) {
            aVar.b(intValue, false);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.List list = this.f465971m;
        if (list != null) {
            return list.size();
        }
        kotlin.jvm.internal.o.o("storylineSegmentInfos");
        throw null;
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dfh, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new yv0.f(this, inflate);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewRecycled(androidx.recyclerview.widget.k3 k3Var) {
        yv0.f holder = (yv0.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewRecycled(holder);
        com.tencent.maas.base.MJID mjid = holder.f465962e;
        if (mjid != null) {
            holder.f465963f.f465967f.a(mjid);
        }
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer i17 = holder.i();
        if (i17.f69292h) {
            i17.f69292h = false;
        }
    }

    public final void x(cx0.c cVar) {
        int i17;
        java.lang.Object obj;
        android.graphics.Rect rect;
        int i18;
        java.lang.Object obj2;
        android.graphics.Rect rect2;
        boolean z17;
        boolean z18 = false;
        if (cVar != null) {
            java.util.List list = this.f465971m;
            if (list == null) {
                kotlin.jvm.internal.o.o("storylineSegmentInfos");
                throw null;
            }
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    com.tencent.maas.base.MJID mjid = ((yv0.p) it.next()).f465985a;
                    if (mjid != null && cVar.a() && (cVar.f224505f.contains(mjid) || cVar.f224506g.contains(mjid) || cVar.f224507h.contains(mjid))) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            boolean z19 = !cVar.f224500a.isEmpty();
            if (!z17 && !z19) {
                return;
            }
        }
        java.util.List y17 = y();
        ex0.a0 a0Var = this.f465965d;
        ex0.r n17 = a0Var.n();
        if (n17 == null) {
            return;
        }
        cx0.e eVar = cVar != null ? cVar.f224504e : null;
        int i19 = eVar == null ? -1 : yv0.g.f465964a[eVar.ordinal()];
        bx0.h hVar = this.f465966e;
        ug.m mVar = ug.m.MovieClip;
        ug.m mVar2 = ug.m.VideoClip;
        ug.m mVar3 = ug.m.ImageClip;
        if (i19 == 1) {
            if (kz5.z.G(new ug.m[]{mVar3, mVar2, mVar}, n17.f257169c) && (i17 = hVar.f36285l) != 0) {
                java.util.Iterator it6 = ((java.util.ArrayList) y17).iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it6.next();
                        if (kotlin.jvm.internal.o.b(((yv0.p) obj).f465985a, n17.f257168b)) {
                            break;
                        }
                    }
                }
                yv0.p pVar = (yv0.p) obj;
                hVar.f36284k = i17 - ((pVar == null || (rect = pVar.f465989e) == null) ? i17 : rect.width());
            }
            if (n17 instanceof ex0.f) {
                if (a0Var.r() == ax0.e.f14978g && ((ex0.f) n17).f257134j == ax0.a.f14961e) {
                    z18 = true;
                }
                if (z18) {
                    B(n17, y17);
                } else {
                    yv0.a aVar = this.f465972n;
                    if (aVar != null) {
                        aVar.b(hVar.f36279f, true);
                    }
                }
            }
        } else if (i19 == 2) {
            ex0.r n18 = a0Var.n();
            if (n18 != null) {
                if (kz5.z.G(new ug.m[]{mVar3, mVar2, mVar}, n18.f257169c) && (i18 = hVar.f36285l) != 0) {
                    java.util.Iterator it7 = ((java.util.ArrayList) y17).iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            obj2 = null;
                            break;
                        } else {
                            obj2 = it7.next();
                            if (kotlin.jvm.internal.o.b(((yv0.p) obj2).f465985a, n18.f257168b)) {
                                break;
                            }
                        }
                    }
                    yv0.p pVar2 = (yv0.p) obj2;
                    hVar.f36284k = i18 - ((pVar2 == null || (rect2 = pVar2.f465989e) == null) ? i18 : rect2.width());
                }
                if (n18 instanceof ex0.f) {
                    if (a0Var.r() == ax0.e.f14978g && ((ex0.f) n18).f257134j == ax0.a.f14962f) {
                        z18 = true;
                    }
                    if (z18) {
                        B(n18, y17);
                    } else {
                        yv0.a aVar2 = this.f465972n;
                        if (aVar2 != null) {
                            aVar2.b(hVar.f36279f, true);
                        }
                    }
                }
            }
        } else if (i19 == 3) {
            ex0.r n19 = a0Var.n();
            com.tencent.maas.model.time.MJTime k17 = n19 != null ? n19.k() : com.tencent.maas.model.time.MJTime.InvalidTime;
            yv0.a aVar3 = this.f465972n;
            if (aVar3 != null) {
                kotlin.jvm.internal.o.d(k17);
                aVar3.a(k17);
            }
        }
        java.util.List list2 = this.f465971m;
        if (list2 == null) {
            kotlin.jvm.internal.o.o("storylineSegmentInfos");
            throw null;
        }
        androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new yv0.n(list2, y17), true);
        this.f465971m = y17;
        a17.b(this);
    }

    public final java.util.List y() {
        bx0.h hVar = this.f465966e;
        hVar.f36277d.b();
        ex0.a0 a0Var = this.f465965d;
        java.util.List list = a0Var.f257097g.f257177e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ex0.r segmentViewModel = (ex0.r) next;
            kotlin.jvm.internal.o.g(segmentViewModel, "segmentViewModel");
            ug.m mVar = segmentViewModel.f257169c;
            com.tencent.maas.base.MJID mjid = segmentViewModel.f257168b;
            arrayList.add(new yv0.p(mjid, mVar, hVar.b(mjid, false), i17 == 0, i17 == ((java.util.ArrayList) a0Var.f257097g.f257177e).size() - 1));
            i17 = i18;
        }
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.f2
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(yv0.f holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.List list = this.f465971m;
        if (list == null) {
            kotlin.jvm.internal.o.o("storylineSegmentInfos");
            throw null;
        }
        yv0.p data = (yv0.p) list.get(i17);
        kotlin.jvm.internal.o.g(data, "data");
        holder.l(data.f465989e);
        ug.m mVar = data.f465986b;
        java.util.Objects.toString(mVar);
        com.tencent.maas.base.MJID mjid = data.f465985a;
        java.util.Objects.toString(mjid);
        if (mVar == ug.m.Transition) {
            return;
        }
        holder.f465962e = mjid;
        yv0.h hVar = holder.f465963f;
        if (!hVar.f465969h) {
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer i18 = holder.i();
            i18.f69289e = data.f465987c;
            i18.f69290f = data.f465988d;
        }
        kotlinx.coroutines.l.d(hVar.f465970i, kotlinx.coroutines.q1.f310570c, null, new yv0.b(hVar, data, null), 2, null);
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.clip.timeline.TimelineAdapterInnerContainer i19 = holder.i();
        com.tencent.maas.base.MJID mjid2 = data.f465985a;
        ex0.a0 a0Var = hVar.f465965d;
        bx0.h hVar2 = hVar.f465966e;
        dx0.n nVar = hVar.f465967f;
        i19.a(nVar, mjid2, a0Var, hVar2, nVar.b(), mVar == ug.m.ImageClip);
        holder.i().setGapWidth(hVar.f465968g);
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List payloads) {
        yv0.f holder = (yv0.f) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, i17);
            return;
        }
        java.lang.Object obj = payloads.get(0);
        if (obj == yv0.o.f465982d || obj == yv0.o.f465983e) {
            java.util.List list = this.f465971m;
            if (list != null) {
                holder.l(((yv0.p) list.get(i17)).f465989e);
            } else {
                kotlin.jvm.internal.o.o("storylineSegmentInfos");
                throw null;
            }
        }
    }
}
