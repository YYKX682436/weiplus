package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes2.dex */
public final class b extends dw2.o {

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.megavideo.topstory.flow.f f120902v;

    public b(com.tencent.mm.plugin.finder.megavideo.topstory.flow.f contract) {
        kotlin.jvm.internal.o.g(contract, "contract");
        this.f120902v = contract;
    }

    @Override // dw2.o
    public void e(java.util.Set otherCareType, boolean z17, java.lang.String invokeSource) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.assist.p0 p0Var;
        jz5.f0 f0Var2;
        jz5.f0 f0Var3;
        java.util.LinkedList<r45.mb4> mediaList;
        r45.mb4 mb4Var;
        kotlin.jvm.internal.o.g(otherCareType, "otherCareType");
        kotlin.jvm.internal.o.g(invokeSource, "invokeSource");
        ((xn2.x) this.f120902v).getClass();
        if (!(!vn2.u0.f438387a.g() || kd2.p1.N.a().F0() == 0)) {
            com.tencent.mars.xlog.Log.w(this.f244136a, "checkSelectedInternal(megaVideo) but disable select.");
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f244138c;
        if (recyclerView != null) {
            androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager)) {
                com.tencent.mars.xlog.Log.w(this.f244136a, "checkSelectedInternal(megaVideo) return for layoutManager must be LinearLayoutManager.");
                return;
            }
            androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = (androidx.recyclerview.widget.LinearLayoutManager) layoutManager;
            int t17 = linearLayoutManager.t();
            int x17 = linearLayoutManager.x();
            if (t17 < 0 || x17 < 0) {
                com.tencent.mars.xlog.Log.e(this.f244136a, "checkSelectedInternal(megaVideo) firstCompleteVisiblePosition=" + t17 + ",lastCompleteVisiblePosition=" + x17 + '.');
                super.e(otherCareType, z17, invokeSource);
                return;
            }
            jz5.f0 f0Var4 = jz5.f0.f302826a;
            if (t17 <= x17) {
                int i17 = t17;
                while (true) {
                    androidx.recyclerview.widget.k3 q07 = recyclerView.q0(i17, false);
                    in5.s0 s0Var = q07 instanceof in5.s0 ? (in5.s0) q07 : null;
                    if (s0Var != null) {
                        java.lang.Object obj = s0Var.f293125i;
                        zn2.a aVar = obj instanceof zn2.a ? (zn2.a) obj : null;
                        if (aVar != null) {
                            com.tencent.mm.plugin.finder.storage.FeedData o17 = o(aVar);
                            com.tencent.mm.plugin.finder.assist.p0 p0Var2 = new com.tencent.mm.plugin.finder.assist.p0(false, 0L, null, null, null, 0, 0, null, null, 511, null);
                            p0Var2.f102443f = 4;
                            p0Var2.f102444g = i17;
                            p0Var2.f102445h = s0Var;
                            p0Var2.f102439b = aVar.getItemId();
                            p0Var2.f102440c = aVar.w();
                            p0Var2.f102442e = o17;
                            p0Var2.f102446i = aVar;
                            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.f484869fs3);
                            java.util.LinkedList<r45.mb4> mediaList2 = o17 != null ? o17.getMediaList() : null;
                            if (p17 == null || mediaList2 == null) {
                                f0Var3 = null;
                            } else {
                                com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner finderBaseMediaBanner = (com.tencent.mm.plugin.finder.view.FinderBaseMediaBanner) p17;
                                if (finderBaseMediaBanner.getFocusPosition() >= 0 && finderBaseMediaBanner.getFocusPosition() < mediaList2.size()) {
                                    r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.a0(mediaList2, finderBaseMediaBanner.getFocusPosition());
                                    java.lang.String string = mb4Var2 != null ? mb4Var2.getString(9) : null;
                                    if (string == null) {
                                        string = "";
                                    }
                                    p0Var2.f102441d = string;
                                }
                                f0Var3 = f0Var4;
                            }
                            if (f0Var3 == null) {
                                java.lang.String string2 = (o17 == null || (mediaList = o17.getMediaList()) == null || (mb4Var = (r45.mb4) kz5.n0.a0(mediaList, 0)) == null) ? null : mb4Var.getString(9);
                                p0Var2.f102441d = string2 != null ? string2 : "";
                            }
                            p0Var = p0Var2;
                        }
                    }
                    if (i17 == x17) {
                        break;
                    } else {
                        i17++;
                    }
                }
            }
            p0Var = null;
            if (p0Var != null) {
                kz2.c cVar = this.f244145j;
                cVar.a("begin(megaVideo)");
                com.tencent.mars.xlog.Log.i(this.f244136a, "checkSelectedInternal(megaVideo) forceCheckSame:" + z17 + " [" + t17 + '~' + x17 + "] centerFeed=" + p0Var + " from invoke:" + invokeSource);
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(com.tencent.mm.plugin.finder.assist.p0.a(p0Var, false, 0L, null, null, null, 0, 0, null, null, 511, null));
                cVar.c("findSelectedFeed end");
                p0Var.f102447j.addAll(linkedList);
                if (m(p0Var, "checkPublishFocusView(megaVideo)")) {
                    androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f244138c;
                    if (recyclerView2 != null) {
                        n(recyclerView2, p0Var.f102439b);
                    }
                    android.content.Context context = recyclerView.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    pf5.z zVar = pf5.z.f353948a;
                    if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                        throw new java.lang.IllegalStateException("Check failed.".toString());
                    }
                    fc2.o Z6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Z6(this.f244139d);
                    if (Z6 != null) {
                        fc2.v vVar = new fc2.v(1);
                        vVar.f260998e = p0Var.f102444g;
                        vVar.f260999f = p0Var.f102439b;
                        recyclerView.post(new com.tencent.mm.plugin.finder.megavideo.topstory.flow.a(Z6, vVar));
                    }
                }
                g(p0Var);
                if (z17 && m(p0Var, "checkSame") && this.f244142g.f102439b == p0Var.f102439b) {
                    com.tencent.mars.xlog.Log.w(this.f244136a, "checkSelectedInternal(megaVideo) return for selected same feed:" + this.f244142g);
                    return;
                }
                androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
                kotlin.jvm.internal.o.e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
                java.util.List data = ((com.tencent.mm.view.recyclerview.WxRecyclerAdapter) adapter).getData();
                i(data, this.f244142g);
                h(data, p0Var);
                cVar.b("end(megaVideo)");
                f0Var2 = f0Var4;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                com.tencent.mars.xlog.Log.w(this.f244136a, "checkSelectedInternal(megaVideo) fail,otherCareType=" + otherCareType + " forceCheckSame:" + z17 + " [" + t17 + '~' + x17 + "] from invoke:" + invokeSource);
                super.e(otherCareType, z17, invokeSource);
                return;
            }
            f0Var = f0Var4;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f244136a, "checkSelectedInternal(megaVideo) return for recyclerView:" + this.f244138c);
        }
    }
}
