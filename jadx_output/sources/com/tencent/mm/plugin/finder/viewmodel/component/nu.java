package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nu extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: r, reason: collision with root package name */
    public static final java.lang.Integer[] f135352r = {4, 1, 3};

    /* renamed from: d, reason: collision with root package name */
    public android.util.SparseArray f135353d;

    /* renamed from: e, reason: collision with root package name */
    public int f135354e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.a f135355f;

    /* renamed from: g, reason: collision with root package name */
    public long f135356g;

    /* renamed from: h, reason: collision with root package name */
    public td2.c f135357h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.ka f135358i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f135359m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f135360n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f135361o;

    /* renamed from: p, reason: collision with root package name */
    public int f135362p;

    /* renamed from: q, reason: collision with root package name */
    public long f135363q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135359m = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.iu.f134767d);
        this.f135360n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.gu.f134553d);
        R6();
        this.f135362p = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
    
        if ((r10.f131647d > 0) == true) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.nu r17, java.lang.StringBuilder r18) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.nu.O6(com.tencent.mm.plugin.finder.viewmodel.component.nu, java.lang.StringBuilder):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0361  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Q6(com.tencent.mm.plugin.finder.viewmodel.component.nu r26, int r27, java.lang.StringBuilder r28, so2.o4 r29, so2.j5 r30) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.nu.Q6(com.tencent.mm.plugin.finder.viewmodel.component.nu, int, java.lang.StringBuilder, so2.o4, so2.j5):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P6(java.lang.String source, int i17) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.xs2 xs2Var;
        r45.f03 f03Var;
        r45.hp2 hp2Var;
        r45.fp2 fp2Var;
        com.tencent.mm.plugin.finder.storage.FinderItem h17;
        so2.a2 a2Var;
        so2.s4 s4Var;
        kotlin.jvm.internal.o.g(source, "source");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(source + " checkFinderPopup tabType:" + i17 + ", ");
        android.util.SparseArray sparseArray = this.f135353d;
        jz5.f0 f0Var = null;
        so2.o4 o4Var = sparseArray != null ? (so2.o4) sparseArray.get(i17) : null;
        if (((o4Var == null || (a2Var = o4Var.f410524a) == null || (s4Var = a2Var.f410251h) == null) ? null : s4Var.f410592a) == so2.r4.f410574d) {
            sb6.append("finder popup tips is show!");
            com.tencent.mars.xlog.Log.w("Finder.FinderPopupUIC", sb6.toString());
            return;
        }
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = this.f135355f;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = aVar != null ? aVar.f105329c : null;
        boolean z17 = false;
        if (((jbVar2 == null || (h17 = bu2.j.f24534a.h(jbVar2.N.getLong(3))) == null || !h17.isUrlValid()) ? false : true) != false) {
            com.tencent.mm.plugin.finder.extension.reddot.a aVar2 = this.f135355f;
            if (!T6(aVar2 != null ? aVar2.f105329c : null, i17)) {
                com.tencent.mm.plugin.finder.extension.reddot.a aVar3 = this.f135355f;
                int i18 = (aVar3 == null || (f03Var = aVar3.f105328b) == null || (hp2Var = f03Var.E) == null || (fp2Var = hp2Var.f376377g) == null) ? 0 : fp2Var.f374506g;
                sb6.append("beforeFinWatchInterval=" + i18 + ',');
                if (i18 > 0) {
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    kotlin.jvm.internal.o.g(activity, "activity");
                    com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(i17);
                    if (U6 != null) {
                        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
                        if (!((com.tencent.mm.plugin.finder.viewmodel.component.t80) a17).V6()) {
                            a17 = null;
                        }
                        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) a17;
                        if (t80Var != null) {
                            so2.j5 W0 = ((com.tencent.mm.plugin.finder.feed.pz) t80Var.R6()).W0();
                            if (W0 != null && W0.h() == 4) {
                                z17 = true;
                            }
                            if (z17) {
                                kotlinx.coroutines.r2 r2Var = this.f135361o;
                                if (r2Var != null) {
                                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                                }
                                com.tencent.mm.plugin.finder.feed.bt R6 = t80Var.R6();
                                long itemId = W0.getItemId();
                                in5.n0 T0 = ((com.tencent.mm.plugin.finder.feed.pz) R6).T0();
                                in5.s0 s0Var = T0 != null ? (in5.s0) in5.n0.Y(T0, itemId, false, 2, null) : null;
                                if (s0Var != null) {
                                    kotlinx.coroutines.y0 y0Var = s0Var.f293120d;
                                    kotlinx.coroutines.r2 d17 = y0Var != null ? kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.fu(this, t80Var, i18, sb6, o4Var, W0, i17, null), 3, null) : null;
                                    this.f135361o = d17;
                                    if (d17 == null) {
                                        sb6.append("waitBeforeFinWatchInterval but launch job fail");
                                        com.tencent.mars.xlog.Log.e("Finder.FinderPopupUIC", sb6.toString());
                                    }
                                    f0Var = jz5.f0.f302826a;
                                }
                                if (f0Var == null) {
                                    sb6.append("waitBeforeFinWatchInterval but get " + pm0.v.u(W0.getItemId()) + " view holder fail");
                                    com.tencent.mars.xlog.Log.e("Finder.FinderPopupUIC", sb6.toString());
                                }
                            } else {
                                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("waitBeforeFinWatchInterval but cur itemType=");
                                sb7.append(W0 != null ? java.lang.Integer.valueOf(W0.h()) : null);
                                sb7.append(" was not video,");
                                sb6.append(sb7.toString());
                                Q6(this, i17, sb6, o4Var, W0);
                            }
                        }
                    }
                } else {
                    Q6(this, i17, sb6, o4Var, null);
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb6.toString());
            }
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("show popup fail,feed ");
        com.tencent.mm.plugin.finder.extension.reddot.a aVar4 = this.f135355f;
        sb8.append(pm0.v.u((aVar4 == null || (jbVar = aVar4.f105329c) == null || (xs2Var = jbVar.N) == null) ? 0L : xs2Var.getLong(3)));
        sb8.append(" invalid!!");
        sb6.append(sb8.toString());
        com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb6.toString());
    }

    public final void R6() {
        com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
        androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.finder.extension.reddot.aa.T;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        pm0.v.y(j0Var, (com.tencent.mm.ui.MMActivity) context, new com.tencent.mm.plugin.finder.viewmodel.component.hu(this));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        final com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        if (mMFragmentActivity != null) {
            td2.c cVar = this.f135357h;
            if (cVar != null) {
                mMFragmentActivity.mo133getLifecycle().c(cVar);
            }
            td2.c cVar2 = this.f135357h;
            if (cVar2 == null) {
                cVar2 = new td2.c() { // from class: com.tencent.mm.plugin.finder.viewmodel.component.FinderPopupUIC$bindLifeCycle$2
                    @Override // td2.c
                    public void onCreate(androidx.lifecycle.y var1) {
                        kotlin.jvm.internal.o.g(var1, "var1");
                    }

                    @Override // td2.c
                    public void onDestroy(androidx.lifecycle.y var1) {
                        androidx.recyclerview.widget.RecyclerView recyclerView;
                        kotlin.jvm.internal.o.g(var1, "var1");
                        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = com.tencent.mm.plugin.finder.viewmodel.component.nu.this;
                        android.util.SparseArray sparseArray = nuVar.f135353d;
                        if (sparseArray != null) {
                            int size = sparseArray.size();
                            for (int i17 = 0; i17 < size; i17++) {
                                int keyAt = sparseArray.keyAt(i17);
                                so2.o4 o4Var = (so2.o4) sparseArray.valueAt(i17);
                                androidx.recyclerview.widget.w2 w2Var = o4Var.f410526c;
                                if (w2Var != null && (recyclerView = o4Var.f410525b) != null) {
                                    recyclerView.V0(w2Var);
                                }
                                com.tencent.mars.xlog.Log.w("Finder.FinderPopupUIC", hashCode() + " tabType" + keyAt + " onDestroy,remove " + o4Var + '!');
                            }
                        }
                        android.util.SparseArray sparseArray2 = nuVar.f135353d;
                        if (sparseArray2 != null) {
                            sparseArray2.clear();
                        }
                        nuVar.f135355f = null;
                        com.tencent.mm.plugin.finder.view.ka kaVar = nuVar.f135358i;
                        if (kaVar != null) {
                            com.tencent.mm.ui.MMFragmentActivity activity2 = mMFragmentActivity;
                            kotlin.jvm.internal.o.g(activity2, "activity");
                            ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).f133575o.remove(kaVar);
                        }
                    }

                    @Override // td2.c
                    public void onPause(androidx.lifecycle.y var1) {
                        kotlin.jvm.internal.o.g(var1, "var1");
                    }

                    @Override // td2.c
                    public void onResume(androidx.lifecycle.y var1) {
                        kotlin.jvm.internal.o.g(var1, "var1");
                    }

                    @Override // td2.c
                    public void onStart(androidx.lifecycle.y var1) {
                        kotlin.jvm.internal.o.g(var1, "var1");
                    }

                    @Override // td2.c
                    public void onStop(androidx.lifecycle.y var1) {
                        so2.s4 s4Var;
                        r45.gp2 gp2Var;
                        r45.gz2 gz2Var;
                        r45.vs2 vs2Var;
                        so2.s4 s4Var2;
                        kotlin.jvm.internal.o.g(var1, "var1");
                        com.tencent.mm.plugin.finder.viewmodel.component.nu nuVar = com.tencent.mm.plugin.finder.viewmodel.component.nu.this;
                        android.util.SparseArray sparseArray = nuVar.f135353d;
                        boolean z17 = false;
                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = null;
                        if (sparseArray != null) {
                            int size = sparseArray.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size) {
                                    break;
                                }
                                sparseArray.keyAt(i17);
                                so2.a2 a2Var = ((so2.o4) sparseArray.valueAt(i17)).f410524a;
                                if (((a2Var == null || (s4Var2 = a2Var.f410251h) == null) ? null : s4Var2.f410592a) == so2.r4.f410574d) {
                                    if (a2Var != null && (s4Var = a2Var.f410251h) != null && (gp2Var = s4Var.f410593b) != null && (gz2Var = (r45.gz2) gp2Var.getCustom(0)) != null && (vs2Var = (r45.vs2) gz2Var.getCustom(0)) != null) {
                                        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = new com.tencent.mm.plugin.finder.extension.reddot.jb();
                                        jbVar2.t0(vs2Var);
                                        jbVar = jbVar2;
                                    }
                                    z17 = true;
                                } else {
                                    i17++;
                                }
                            }
                        }
                        if (z17) {
                            nuVar.U6(com.tencent.mm.plugin.finder.view.ag.f131641i, jbVar);
                        }
                    }
                };
            }
            this.f135357h = cVar2;
            mMFragmentActivity.mo133getLifecycle().a(cVar2);
        }
    }

    public final void S6(java.lang.String source, int i17, boolean z17) {
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar;
        r45.xs2 xs2Var;
        int i18;
        java.lang.StringBuilder sb6;
        com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer<T> dataListJustForAdapter;
        java.util.ArrayList dataListJustForAdapter2;
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.finder.extension.reddot.a aVar = this.f135355f;
        if (aVar == null || (jbVar = aVar.f105329c) == null || (xs2Var = jbVar.N) == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderPopupUIC", source.concat(" insertFeed fail,objectId is null!"));
            return;
        }
        long j17 = xs2Var.getLong(3);
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j17);
        if (!(h17 != null && h17.isUrlValid())) {
            com.tencent.mars.xlog.Log.e("Finder.FinderPopupUIC", source + " insertFeed " + pm0.v.u(j17) + " fail,feed is invalid!");
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(i17);
        if (U6 != null) {
            androidx.lifecycle.c1 a17 = zVar.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
            if (!((com.tencent.mm.plugin.finder.viewmodel.component.t80) a17).V6()) {
                a17 = null;
            }
            com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) a17;
            if (t80Var != null) {
                androidx.recyclerview.widget.RecyclerView S6 = t80Var.S6();
                com.tencent.mm.plugin.finder.feed.ct ctVar = t80Var.f135995e;
                com.tencent.mm.view.RefreshLoadMoreLayout l17 = ctVar != null ? ((com.tencent.mm.plugin.finder.feed.v00) ctVar).l() : null;
                java.lang.Object layoutManager = S6 != null ? S6.getLayoutManager() : null;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                int y17 = linearLayoutManager != null ? linearLayoutManager.y() : 0;
                com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader Q6 = t80Var.Q6();
                if (Q6 != null && (dataListJustForAdapter2 = Q6.getDataListJustForAdapter()) != null) {
                    java.util.Iterator it = dataListJustForAdapter2.iterator();
                    i18 = 0;
                    while (it.hasNext()) {
                        if (((so2.j5) it.next()).getItemId() == j17) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                i18 = -1;
                if (i18 >= 0 && i18 == y17 - 1) {
                    com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", source + " insertFeed " + pm0.v.u(j17) + " to tabType " + i17 + " success,feedExistPos=" + i18 + ",lastVisiblePos=" + y17);
                    if (!z17 || S6 == null) {
                        return;
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(S6, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPopupUIC", "insertFeed", "(Ljava/lang/String;IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    S6.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(S6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPopupUIC", "insertFeed", "(Ljava/lang/String;IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    return;
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(source + " insertFeed " + pm0.v.u(j17) + " to tabType " + i17 + ",feedExistPos=" + i18 + ",lastVisiblePos=" + y17 + ' ');
                if (Q6 != null && (dataListJustForAdapter = Q6.getDataListJustForAdapter()) != 0) {
                    synchronized (dataListJustForAdapter) {
                        if (i18 >= 0) {
                            if (y17 > i18) {
                                y17--;
                                sb7.append("modify lastVisiblePos to " + y17 + ' ');
                            }
                            dataListJustForAdapter.add(y17, dataListJustForAdapter.remove(i18));
                            if (l17 != null) {
                                l17.onItemRangeMoved(i18, y17, 1);
                            }
                        } else {
                            dataListJustForAdapter.add(y17, cu2.u.f222441a.p(h17));
                            if (l17 != null) {
                                l17.onItemRangeInserted(y17, 1);
                            }
                            this.f135362p = i17;
                            V6(j17);
                            sb7.append("insert feed to pos:" + y17);
                        }
                    }
                }
                if (!z17 || S6 == null) {
                    sb6 = sb7;
                } else {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(y17));
                    java.util.Collections.reverse(arrayList2);
                    sb6 = sb7;
                    yj0.a.d(S6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderPopupUIC", "insertFeed", "(Ljava/lang/String;IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                    S6.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(S6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderPopupUIC", "insertFeed", "(Ljava/lang/String;IZ)V", "Undefined", "smoothScrollToPosition", "(I)V");
                }
                sb6.append(" scrollToInsertFeed=" + z17 + '!');
                com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", sb6.toString());
            }
        }
    }

    public final boolean T6(com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, int i17) {
        r45.xs2 xs2Var;
        r45.xs2 xs2Var2;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment U6 = ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).U6(i17);
        if (U6 == null || !(U6.getActivity() instanceof androidx.appcompat.app.AppCompatActivity)) {
            return false;
        }
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.b(U6).a(com.tencent.mm.plugin.finder.viewmodel.component.t80.class);
        java.lang.Object obj = null;
        if (!((com.tencent.mm.plugin.finder.viewmodel.component.t80) a17).V6()) {
            a17 = null;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.t80 t80Var = (com.tencent.mm.plugin.finder.viewmodel.component.t80) a17;
        if (t80Var != null) {
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader Q6 = t80Var.Q6();
            java.lang.Iterable dataListJustForAdapter = Q6 != null ? Q6.getDataListJustForAdapter() : null;
            if (dataListJustForAdapter != null) {
                java.util.Iterator it = dataListJustForAdapter.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if ((jbVar == null || (xs2Var2 = jbVar.N) == null || ((so2.j5) next).getItemId() != xs2Var2.getLong(3)) ? false : true) {
                        obj = next;
                        break;
                    }
                }
                obj = (so2.j5) obj;
            }
            if (obj != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feed:");
                sb6.append(pm0.v.u((jbVar == null || (xs2Var = jbVar.N) == null) ? 0L : xs2Var.getLong(3)));
                sb6.append(" exist!");
                com.tencent.mars.xlog.Log.w("Finder.FinderPopupUIC", sb6.toString());
                return true;
            }
        }
        return false;
    }

    public final void U6(com.tencent.mm.plugin.finder.view.ag source, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("Finder.FinderPopupUIC", source + " revokeFinderPopup," + jbVar + '!');
        android.util.SparseArray sparseArray = this.f135353d;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i17 = 0; i17 < size; i17++) {
                sparseArray.keyAt(i17);
                so2.a2 a2Var = ((so2.o4) sparseArray.valueAt(i17)).f410524a;
                so2.s4 s4Var = a2Var != null ? a2Var.f410251h : null;
                if (s4Var != null) {
                    s4Var.f410594c = source;
                }
            }
        }
        if (jbVar != null) {
            zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
            java.lang.String obj = source.toString();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.at5 at5Var = new r45.at5();
            at5Var.set(0, jbVar.field_revokeId);
            linkedList.add(at5Var);
            nk6.J(obj, linkedList);
        }
    }

    public final void V6(long j17) {
        boolean z17;
        if (j17 != this.f135363q) {
            boolean z18 = false;
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.o0().r()).booleanValue()) {
                z17 = true;
            } else {
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                z17 = false;
            }
            if (z17 || z65.c.a()) {
                z18 = true;
            } else {
                kb2.b bVar = kb2.b.f306225a;
            }
            if (z18) {
                com.tencent.mars.xlog.Log.w("Finder.FinderPopupUIC", "insertFeedId from " + pm0.v.u(this.f135363q) + " to " + pm0.v.u(j17) + '!');
            }
        }
        this.f135363q = j17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135359m = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.iu.f134767d);
        this.f135360n = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.gu.f134553d);
        R6();
        this.f135362p = -1;
    }
}
