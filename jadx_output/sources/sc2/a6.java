package sc2;

/* loaded from: classes2.dex */
public final class a6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f405757a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f405758b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405759c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f405760d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f405761e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f405762f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f405763g;

    public a6(xc2.p0 p0Var, sc2.d6 d6Var, in5.s0 s0Var, android.view.View view, r45.wf6 wf6Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        this.f405757a = p0Var;
        this.f405758b = d6Var;
        this.f405759c = s0Var;
        this.f405760d = view;
        this.f405761e = wf6Var;
        this.f405762f = baseFinderFeed;
        this.f405763g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [java.lang.Object] */
    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Object obj2;
        r45.tt0 tt0Var;
        java.util.LinkedList list;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.util.List list2;
        java.lang.Object obj5;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.wf6 wf6Var;
        java.util.LinkedList list3;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        xc2.p0 p0Var = this.f405757a;
        p0Var.f453236b = elapsedRealtime;
        int i17 = fVar.f70615a;
        android.view.View view = this.f405760d;
        in5.s0 s0Var = this.f405759c;
        sc2.d6 d6Var = this.f405758b;
        if (i17 == 0 && fVar.f70616b == 0) {
            java.util.LinkedList list4 = ((r45.ov0) fVar.f70618d).getList(1);
            if (list4 != null) {
                java.util.Iterator it = list4.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    r45.tt0 tt0Var2 = (r45.tt0) ((r45.dl2) obj2).getCustom(18);
                    if ((tt0Var2 == null || (list3 = tt0Var2.getList(0)) == null || !(list3.isEmpty() ^ true)) ? false : true) {
                        break;
                    }
                }
                r45.dl2 dl2Var = (r45.dl2) obj2;
                if (dl2Var != null && (tt0Var = (r45.tt0) dl2Var.getCustom(18)) != null && (list = tt0Var.getList(0)) != null) {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj3 = null;
                            break;
                        }
                        obj3 = it6.next();
                        if (((r45.wf6) obj3).getInteger(2) == this.f405761e.getInteger(2)) {
                            break;
                        }
                    }
                    r45.wf6 wf6Var2 = (r45.wf6) obj3;
                    if (wf6Var2 != null) {
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f405762f;
                        android.content.Context context = view.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        java.lang.Object obj6 = sc2.d6.A;
                        r45.wf6 wf6Var3 = d6Var.f3149m;
                        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = p0Var.f453234a;
                        if (wf6Var3 == null) {
                            java.util.LinkedList<r45.wf6> style = finderJumpInfo2.getStyle();
                            kotlin.jvm.internal.o.f(style, "getStyle(...)");
                            java.util.Iterator it7 = style.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    wf6Var = 0;
                                    break;
                                }
                                wf6Var = it7.next();
                                if (((r45.wf6) wf6Var).getInteger(2) == 24) {
                                    break;
                                }
                            }
                            wf6Var3 = wf6Var;
                        }
                        java.util.LinkedList<r45.wf6> style2 = finderJumpInfo2.getStyle();
                        kotlin.jvm.internal.o.f(style2, "getStyle(...)");
                        boolean d07 = pm0.v.d0(style2, new sc2.w5(wf6Var3));
                        if (d07) {
                            finderJumpInfo2.getStyle().add(wf6Var2);
                        }
                        pf5.u uVar = pf5.u.f353936a;
                        xc2.k0 k0Var = (xc2.k0) uVar.e(zy2.b6.class).a(xc2.k0.class);
                        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                        }
                        java.util.Set set = (java.util.Set) k0Var.W6(d6Var.f3145f, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) uVar.b(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, d6Var.f3146g).getValue();
                        if (set != null) {
                            java.util.Iterator it8 = set.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    obj4 = null;
                                    break;
                                }
                                obj4 = it8.next();
                                xc2.t tVar = (xc2.t) obj4;
                                r45.wf6 wf6Var4 = d6Var.f3149m;
                                if (wf6Var4 != null && tVar.f453301c == wf6Var4.getInteger(1)) {
                                    break;
                                }
                            }
                            xc2.t tVar2 = (xc2.t) obj4;
                            if (tVar2 != null && (list2 = tVar2.f453302d) != null) {
                                java.util.Iterator it9 = list2.iterator();
                                while (true) {
                                    if (!it9.hasNext()) {
                                        obj5 = null;
                                        break;
                                    }
                                    obj5 = it9.next();
                                    java.lang.String jump_id = ((com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj5).getJump_id();
                                    xc2.p0 p0Var2 = d6Var.f3147h;
                                    if (kotlin.jvm.internal.o.b(jump_id, (p0Var2 == null || (finderJumpInfo = p0Var2.f453234a) == null) ? null : finderJumpInfo.getJump_id())) {
                                        break;
                                    }
                                }
                                com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo3 = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj5;
                                if (finderJumpInfo3 != null) {
                                    java.util.LinkedList<r45.wf6> style3 = finderJumpInfo3.getStyle();
                                    kotlin.jvm.internal.o.f(style3, "getStyle(...)");
                                    if (pm0.v.d0(style3, new sc2.v5(wf6Var3))) {
                                        finderJumpInfo3.getStyle().add(wf6Var2);
                                    } else {
                                        d07 = false;
                                    }
                                }
                            }
                        }
                        d6Var.f3149m = wf6Var2;
                        java.lang.Object obj7 = s0Var.f293125i;
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = obj7 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj7 : null;
                        boolean z17 = baseFinderFeed2 != null && baseFinderFeed.getItemId() == baseFinderFeed2.getItemId();
                        com.tencent.mars.xlog.Log.i(((sc2.k2) d6Var).C, "startAsyncLodPolling: source=" + this.f405763g + ", replace style, ret=" + d07 + ", isSameFeed=" + z17);
                        if (z17) {
                            sc2.q8 q8Var = p0Var.f453233J;
                            if ((q8Var != null ? q8Var.f406179c : 1) == 2) {
                                d6Var.I(baseFinderFeed, s0Var, view, p0Var, "asyncLoadPolling", d6Var.M(p0Var), false);
                                d6Var.Y(s0Var, view, "startAsyncLodPolling");
                            } else {
                                d6Var.J(baseFinderFeed, s0Var, view, p0Var, d6Var.P(p0Var), "asyncLoadPolling");
                            }
                        }
                        return jz5.f0.f302826a;
                    }
                }
            }
        }
        if (d6Var.f405839z) {
            d6Var.X(s0Var, view, "polling");
        }
        return jz5.f0.f302826a;
    }
}
