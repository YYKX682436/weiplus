package sc2;

/* loaded from: classes2.dex */
public class z3 extends ad2.h {

    /* renamed from: z, reason: collision with root package name */
    public static final java.util.HashMap f406412z = new java.util.HashMap();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f406413w = "Finder.FeedJumperCombinationLayoutObserver";

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Map f406414x = new java.util.LinkedHashMap();

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f406415y = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.myLooper());

    public final void G(long j17, int i17) {
        f406412z.put(java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17));
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f406413w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1, types: [int] */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    @Override // ad2.h
    public void q(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        boolean z17;
        java.lang.Object obj;
        r45.v50 v50Var;
        ad2.h hVar;
        ad2.h hVar2;
        ?? r202;
        r45.wf6 wf6Var;
        r45.wf6 wf6Var2;
        r45.wf6 wf6Var3;
        android.view.View view;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        if (!o(holder, finderJumpInfo)) {
            D(8);
            com.tencent.mars.xlog.Log.i(this.f406413w, "[onBindView] priority not ok");
            return;
        }
        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator it = style.iterator();
        while (true) {
            z17 = false;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).getInteger(2) == 15) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var4 = (r45.wf6) obj;
        if (wf6Var4 == null || (v50Var = (r45.v50) wf6Var4.getCustom(24)) == null) {
            return;
        }
        java.util.LinkedList list = v50Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getStyle(...)");
        java.util.Iterator it6 = list.iterator();
        ad2.h hVar3 = null;
        while (it6.hasNext()) {
            ad2.h hVar4 = (ad2.h) ((java.util.LinkedHashMap) this.f406414x).get(java.lang.Integer.valueOf(((r45.wf6) it6.next()).getInteger(2)));
            if (hVar3 != null) {
                hVar3.f3153q = hVar4;
            }
            if (hVar4 == null || (view = hVar4.f3143d) == null) {
                hVar = hVar4;
                hVar2 = hVar3;
                r202 = z17;
            } else {
                hVar = hVar4;
                hVar2 = hVar3;
                boolean z18 = z17;
                hVar4.q(feed, holder, view, infoEx, source);
                r202 = z18;
                if (view.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams) {
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.gravity = 8388691;
                    view.setLayoutParams(layoutParams2);
                    r202 = z18;
                }
            }
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
            long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : -1L;
            java.lang.Object obj2 = f406412z.get(java.lang.Long.valueOf(itemId));
            int i17 = -1;
            java.lang.Object obj3 = obj2;
            if (obj2 == null) {
                obj3 = -1;
            }
            int intValue = ((java.lang.Number) obj3).intValue();
            if (intValue == -1 && hVar2 == null) {
                android.view.View view2 = hVar != null ? hVar.f3143d : null;
                if (view2 == null) {
                    z17 = r202;
                } else {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf((int) r202));
                    java.util.Collections.reverse(arrayList);
                    android.view.View view3 = view2;
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    z17 = r202;
                    view2.setVisibility(((java.lang.Integer) arrayList.get(z17 ? 1 : 0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                if (hVar != null && (wf6Var3 = hVar.f3149m) != null) {
                    i17 = wf6Var3.getInteger(2);
                }
                G(itemId, i17);
            } else {
                z17 = r202;
                if (intValue != -1) {
                    if ((hVar == null || (wf6Var2 = hVar.f3149m) == null || wf6Var2.getInteger(2) != intValue) ? z17 ? 1 : 0 : true) {
                        android.view.View view4 = hVar != null ? hVar.f3143d : null;
                        if (view4 != null) {
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(java.lang.Integer.valueOf(z17 ? 1 : 0));
                            java.util.Collections.reverse(arrayList2);
                            android.view.View view5 = view4;
                            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((java.lang.Integer) arrayList2.get(z17 ? 1 : 0)).intValue());
                            yj0.a.f(view5, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        G(itemId, (hVar == null || (wf6Var = hVar.f3149m) == null) ? -1 : wf6Var.getInteger(2));
                    }
                }
                android.view.View view6 = hVar != null ? hVar.f3143d : null;
                if (view6 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    android.view.View view7 = view6;
                    yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList3.get(z17 ? 1 : 0)).intValue());
                    yj0.a.f(view7, "com/tencent/mm/plugin/finder/feed/component/FeedJumperCombinationLayoutObserver", "onBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            hVar3 = hVar;
        }
        gs2.c.f275072a.e(holder, jumpView, j(finderJumpInfo), z17);
    }

    @Override // ad2.h
    public void v(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        xc2.p0 p0Var;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.v(holder, jumpView, infoEx);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
        long j17 = -1;
        java.lang.Object obj = f406412z.get(java.lang.Long.valueOf(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : -1L));
        if (obj == null) {
            obj = -1;
        }
        ad2.h hVar = (ad2.h) ((java.util.LinkedHashMap) this.f406414x).get(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()));
        ad2.h hVar2 = hVar != null ? hVar.f3153q : null;
        if (hVar != null && (p0Var = hVar.f3147h) != null && (baseFinderFeed = p0Var.f453244f) != null) {
            j17 = baseFinderFeed.getItemId();
        }
        long j18 = j17;
        if (hVar2 != null) {
            r45.wf6 wf6Var = hVar2.f3149m;
            int integer = wf6Var != null ? wf6Var.getInteger(11) : 0;
            com.tencent.mm.sdk.platformtools.n3 n3Var = this.f406415y;
            n3Var.removeCallbacksAndMessages(null);
            n3Var.postDelayed(new sc2.y3(hVar, hVar2, this, j18), integer * 1000);
        }
    }

    @Override // ad2.h
    public void w(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(jumpView, "jumpView");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        super.w(holder, jumpView, infoEx);
        this.f406415y.removeCallbacksAndMessages(null);
    }
}
