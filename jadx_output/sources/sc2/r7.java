package sc2;

/* loaded from: classes2.dex */
public abstract class r7 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: t */
    public static final sc2.p6 f406203t = new sc2.p6(null);

    /* renamed from: u */
    public static final float f406204u = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479738dv);

    /* renamed from: v */
    public static final float f406205v = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);

    /* renamed from: w */
    public static final java.util.HashMap f406206w = new java.util.HashMap();

    /* renamed from: x */
    public static final java.lang.String f406207x = "priority_group";

    /* renamed from: d */
    public final jz5.g f406208d;

    /* renamed from: e */
    public final com.tencent.mm.sdk.platformtools.n3 f406209e;

    /* renamed from: f */
    public final java.util.HashMap f406210f;

    /* renamed from: g */
    public final jz5.g f406211g;

    /* renamed from: h */
    public final int f406212h;

    /* renamed from: i */
    public final int f406213i;

    /* renamed from: m */
    public final int f406214m;

    /* renamed from: n */
    public yz5.l f406215n;

    /* renamed from: o */
    public final android.util.SparseIntArray f406216o;

    /* renamed from: p */
    public final java.util.concurrent.ConcurrentHashMap f406217p;

    /* renamed from: q */
    public final java.util.concurrent.ConcurrentHashMap f406218q;

    /* renamed from: r */
    public final java.util.HashMap f406219r;

    /* renamed from: s */
    public final com.tencent.mm.sdk.platformtools.c0 f406220s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f406208d = jz5.h.b(sc2.a7.f405764d);
        this.f406209e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f406210f = new java.util.HashMap();
        this.f406211g = jz5.h.b(new sc2.o7(this));
        this.f406212h = com.tencent.mm.R.id.eeo;
        this.f406213i = com.tencent.mm.R.id.eel;
        this.f406214m = com.tencent.mm.R.id.eek;
        this.f406216o = new android.util.SparseIntArray();
        this.f406217p = new java.util.concurrent.ConcurrentHashMap();
        this.f406218q = new java.util.concurrent.ConcurrentHashMap();
        this.f406219r = new java.util.HashMap();
        this.f406220s = new com.tencent.mm.sdk.platformtools.c0(5);
    }

    public static final xc2.p0 O6(sc2.r7 r7Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str, xc2.t tVar, int i17, long j17, xc2.c1 c1Var) {
        java.lang.Object obj;
        r7Var.getClass();
        xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
        p0Var.f453244f = baseFinderFeed;
        p0Var.f453247i = str;
        p0Var.f453256r = tVar.f453301c;
        p0Var.f453257s = i17;
        p0Var.f453245g = j17;
        java.lang.String str2 = tVar.f453304f;
        kotlin.jvm.internal.o.g(str2, "<set-?>");
        p0Var.f453254p = str2;
        p0Var.T = c1Var;
        java.util.LinkedList<r45.wf6> style = p0Var.f453234a.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var.getInteger(2) == i17 && wf6Var.getInteger(1) == tVar.f453301c) {
                break;
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj;
        int integer = wf6Var2 != null ? wf6Var2.getInteger(11) : 0;
        p0Var.f453259u = integer;
        p0Var.f453258t = integer * 1000;
        p0Var.f453264z = wf6Var2 != null && wf6Var2.getInteger(12) == 1;
        p0Var.B = wf6Var2 != null ? wf6Var2.getInteger(20) : 0;
        p0Var.E = (wf6Var2 != null ? wf6Var2.getInteger(14) : 0) / 1000;
        p0Var.F = (wf6Var2 != null ? wf6Var2.getInteger(15) : 0) / 1000;
        if (wf6Var2 != null) {
        }
        java.util.HashMap hashMap = f406206w;
        androidx.appcompat.app.AppCompatActivity activity = r7Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        int i18 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = p0Var.f453244f;
        sc2.w6 w6Var = new sc2.w6(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0L, i18, p0Var.f453256r, p0Var.f453257s);
        java.lang.Object obj2 = hashMap.get(w6Var);
        if (obj2 == null) {
            obj2 = new sc2.q8();
            hashMap.put(w6Var, obj2);
        }
        p0Var.f453233J = (sc2.q8) obj2;
        return p0Var;
    }

    public static final xc2.k0 P6(sc2.r7 r7Var) {
        return (xc2.k0) ((jz5.n) r7Var.f406208d).getValue();
    }

    public static final android.view.View Q6(sc2.r7 r7Var, ad2.j jVar, android.view.ViewGroup viewGroup, int i17, boolean z17, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i18, int i19) {
        android.view.View view;
        xc2.p0 p0Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2;
        r7Var.getClass();
        sc2.u7 u7Var = (sc2.u7) jVar;
        u7Var.getClass();
        int b17 = sc2.a8.G.b(i17, u7Var.f406289a);
        if (b17 > 0) {
            if (z17) {
                java.lang.String jump_id = finderJumpInfo.getJump_id();
                if (jump_id == null) {
                    jump_id = "";
                }
                int childCount = viewGroup.getChildCount();
                int i27 = 0;
                while (true) {
                    if (i27 >= childCount) {
                        view = null;
                        break;
                    }
                    view = viewGroup.getChildAt(i27);
                    java.lang.Object tag = view.getTag(r7Var.f406212h);
                    ad2.h hVar = tag instanceof ad2.h ? (ad2.h) tag : null;
                    java.lang.String jump_id2 = (hVar == null || (p0Var = hVar.f3147h) == null || (finderJumpInfo2 = p0Var.f453234a) == null) ? null : finderJumpInfo2.getJump_id();
                    java.lang.Object tag2 = view.getTag(r7Var.f406213i);
                    java.lang.Integer num = tag2 instanceof java.lang.Integer ? (java.lang.Integer) tag2 : null;
                    if (i17 == (num != null ? num.intValue() : -1) && kotlin.jvm.internal.o.b(jump_id2, jump_id)) {
                        break;
                    }
                    i27++;
                }
                if (view == null) {
                    com.tencent.mars.xlog.Log.e("Finder.BaseAdFeedJumperUIC", "[getJumperView] containLayout:" + viewGroup.hashCode() + " layoutChild is null}");
                }
            } else {
                view = null;
            }
            if (view == null) {
                java.util.LinkedList linkedList = (java.util.LinkedList) r7Var.f406210f.get(java.lang.Integer.valueOf(i17));
                r0 = linkedList != null ? (android.view.View) linkedList.poll() : null;
                if (r0 == null) {
                    r0 = com.tencent.mm.ui.id.b(r7Var.getContext()).inflate(b17, viewGroup, false);
                }
            } else {
                r0 = view;
            }
            if (i18 == 5) {
                if (i19 == 0) {
                    android.view.ViewGroup.LayoutParams layoutParams = r0.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((android.widget.LinearLayout.LayoutParams) layoutParams).topMargin = (int) f406205v;
                } else {
                    android.view.ViewGroup.LayoutParams layoutParams2 = r0.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).topMargin = (int) f406204u;
                }
            }
            if (!z17) {
                viewGroup.addView(r0);
            }
        }
        return r0;
    }

    public static final ad2.h R6(sc2.r7 r7Var, android.view.View view, int i17, ad2.j jVar) {
        int i18 = r7Var.f406212h;
        java.lang.Object tag = view.getTag(i18);
        ad2.h hVar = tag instanceof ad2.h ? (ad2.h) tag : null;
        if (hVar != null) {
            return hVar;
        }
        sc2.u7 u7Var = (sc2.u7) jVar;
        u7Var.getClass();
        ad2.h a17 = sc2.a8.G.a(i17, u7Var.f406289a);
        if (a17 == null) {
            return null;
        }
        view.setTag(i18, a17);
        return a17;
    }

    public static /* synthetic */ int d7(sc2.r7 r7Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var, java.lang.String str, boolean z17, xc2.c1 c1Var, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBindView");
        }
        if ((i17 & 4) != 0) {
            str = "timeline";
        }
        java.lang.String str2 = str;
        if ((i17 & 8) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 16) != 0) {
            c1Var = null;
        }
        return r7Var.b7(baseFinderFeed, s0Var, str2, z18, c1Var);
    }

    public boolean S6() {
        return true;
    }

    public final void T6(in5.s0 holder, yz5.l callback) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ka).getValue()).r()).booleanValue()) {
            ad2.h hVar = (ad2.h) this.f406217p.get(java.lang.Integer.valueOf(holder.hashCode()));
            if (hVar != null) {
                callback.invoke(hVar);
                return;
            }
            return;
        }
        ad2.i iVar = (ad2.i) this.f406218q.get(java.lang.Integer.valueOf(holder.hashCode()));
        if (iVar != null) {
            java.util.Iterator it = iVar.f3159d.entrySet().iterator();
            while (it.hasNext()) {
                callback.invoke((ad2.h) ((java.util.Map.Entry) it.next()).getValue());
            }
        }
    }

    public final void U6(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Ka).getValue()).r()).booleanValue()) {
            java.util.Iterator it = new java.util.HashMap(this.f406217p).entrySet().iterator();
            while (it.hasNext()) {
                ad2.h hVar = (ad2.h) ((java.util.Map.Entry) it.next()).getValue();
                kotlin.jvm.internal.o.d(hVar);
                callback.invoke(hVar);
            }
            return;
        }
        java.util.Iterator it6 = new java.util.HashMap(this.f406218q).entrySet().iterator();
        while (it6.hasNext()) {
            java.util.Iterator it7 = new java.util.HashMap(((ad2.i) ((java.util.Map.Entry) it6.next()).getValue()).f3159d).entrySet().iterator();
            while (it7.hasNext()) {
                ad2.h hVar2 = (ad2.h) ((java.util.Map.Entry) it7.next()).getValue();
                kotlin.jvm.internal.o.d(hVar2);
                callback.invoke(hVar2);
            }
        }
    }

    public final r45.i16 V6(long j17) {
        sc2.x6 x6Var = (sc2.x6) this.f406220s.b(java.lang.Long.valueOf(j17));
        if (x6Var != null) {
            return x6Var.f406368b;
        }
        return null;
    }

    public abstract xc2.d1 W6(xc2.p0 p0Var);

    public abstract java.util.Map X6();

    public abstract xc2.z2 Y6(xc2.p0 p0Var, int i17);

    public final void Z6(ad2.h observer, in5.s0 holder, android.view.View view, xc2.p0 infoEx, r45.wf6 wf6Var) {
        kotlin.jvm.internal.o.g(observer, "observer");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = infoEx.f453244f;
        long itemId = baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[initObserver] cur:[");
        sb6.append(infoEx.f453247i);
        sb6.append(':');
        sb6.append(pm0.v.u(itemId));
        sb6.append(':');
        sb6.append(holder.hashCode());
        sb6.append(':');
        sb6.append(view.hashCode());
        sb6.append(':');
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = infoEx.f453234a;
        sb6.append(finderJumpInfo.hashCode());
        sb6.append("] last:[");
        sb6.append(observer.f3144e);
        sb6.append(':');
        sb6.append(pm0.v.u(observer.f3145f));
        sb6.append(':');
        in5.s0 s0Var = observer.f3148i;
        sb6.append(s0Var != null ? s0Var.hashCode() : 0);
        sb6.append(':');
        android.view.View view2 = observer.f3143d;
        sb6.append(view2 != null ? view2.hashCode() : 0);
        sb6.append(':');
        xc2.p0 p0Var = observer.f3147h;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo2 = p0Var != null ? p0Var.f453234a : null;
        sb6.append(finderJumpInfo2 != null ? finderJumpInfo2.hashCode() : 0);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
        observer.f3148i = holder;
        observer.f3143d = view;
        observer.f3149m = wf6Var;
        xc2.p0 p0Var2 = observer.f3147h;
        boolean b17 = kotlin.jvm.internal.o.b(p0Var2 != null ? p0Var2.f453234a : null, finderJumpInfo);
        boolean z17 = observer.f3151o == null;
        boolean z18 = observer.f3152p == null;
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[setHandlers] isSameJumpInfo:" + b17 + " eventHandlerIsNull:" + z17 + " cacheHandlerIsNull:" + z18);
        if (!b17 || z17) {
            r45.wf6 wf6Var2 = observer.f3149m;
            observer.f3151o = Y6(infoEx, wf6Var2 != null ? wf6Var2.getInteger(2) : -1);
        }
        if (!b17 || z18) {
            observer.f3152p = W6(infoEx);
        }
        java.lang.String str = infoEx.f453247i;
        if (str == null) {
            str = "";
        }
        observer.f3144e = str;
        observer.f3145f = itemId;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = infoEx.f453244f;
        observer.f3146g = baseFinderFeed2 != null ? baseFinderFeed2.w() : null;
        observer.f3147h = infoEx;
        observer.f3150n = finderJumpInfo.getBusiness_type();
        finderJumpInfo.getJumpinfo_type();
    }

    public void a7(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, android.view.View view, xc2.p0 infoEx, java.lang.String source, ad2.h observer) {
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        java.lang.Object obj;
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout;
        r45.bo5 bo5Var;
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(infoEx, "infoEx");
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(observer, "observer");
        if (view == null) {
            return;
        }
        sc2.q8 q8Var = infoEx.f453233J;
        if (!(q8Var != null && q8Var.f406177a) && infoEx.f453258t > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC", "onAfterBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/component/FinderFeedJumperBaseUIC", "onAfterBindView", "(Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Landroid/view/View;Lcom/tencent/mm/plugin/finder/feed/jumper/FinderJumpInfoEx;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/feed/jumper/observer/FeedJumperObserver;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        if (infoEx.f453256r == 10) {
            int t17 = hc2.f1.t(view);
            java.util.LinkedList<r45.wf6> style = infoEx.f453234a.getStyle();
            kotlin.jvm.internal.o.f(style, "getStyle(...)");
            java.util.Iterator<T> it = style.iterator();
            while (true) {
                marginLayoutParams = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).getInteger(2) == infoEx.f453257s) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var == null || (finderVideoLayout = (com.tencent.mm.plugin.finder.video.FinderVideoLayout) holder.p(com.tencent.mm.R.id.e_k)) == null || (bo5Var = (r45.bo5) wf6Var.getCustom(19)) == null) {
                return;
            }
            android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int i17 = b17.x;
            int i18 = b17.y;
            java.lang.System.nanoTime();
            boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (!z17) {
                if (i18 >= i17) {
                    i17 = i18;
                }
                i18 = i17;
            }
            float integer = i18 * (bo5Var.getInteger(1) / 100.0f);
            float measuredWidth = (finderVideoLayout.getMeasuredWidth() * (bo5Var.getInteger(0) / 100.0f)) - (t17 / 2);
            com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "onAfterBindView viewWidth=" + t17 + " videoWidth=" + finderVideoLayout.getMeasuredWidth() + " marginTop=" + integer + " marginLeft=" + measuredWidth);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams2 != null) {
                marginLayoutParams2.topMargin = (int) integer;
                marginLayoutParams2.leftMargin = (int) measuredWidth;
                marginLayoutParams = marginLayoutParams2;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public final int b7(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, in5.s0 holder, java.lang.String source, boolean z17, xc2.c1 c1Var) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(source, "source");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        long itemId = feed.getItemId();
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        if (!S6()) {
            f7(holder);
            h7(holder);
            return 0;
        }
        xc2.k0 k0Var = (xc2.k0) ((jz5.n) this.f406208d).getValue();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.j0 W6 = k0Var.W6(itemId, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, feed.w());
        int hashCode = holder.hashCode();
        int hashCode2 = W6.hashCode();
        android.util.SparseIntArray sparseIntArray = this.f406216o;
        if (!z17 && sparseIntArray.get(hashCode) == hashCode2) {
            return 2;
        }
        f7(holder);
        h7(holder);
        sc2.v6 v6Var = new sc2.v6(this, holder, feed, source, 0L, c1Var, 8, null);
        this.f406219r.put(java.lang.Integer.valueOf(hashCode), v6Var);
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            pm0.v.y(W6, mMActivity, v6Var);
        } else {
            itemView.post(new sc2.d7(W6, mMActivity, v6Var));
        }
        sparseIntArray.put(hashCode, hashCode2);
        return 1;
    }

    public final void c7(com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, long j17, in5.s0 holder, java.lang.String source, int i17) {
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(source, "source");
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        feed.getItemId();
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[onBindView] holder:" + holder.hashCode() + ", position:" + i17 + " itemView:" + itemView.hashCode() + ", commentID:" + j17 + ", feedID:" + feed.getFeedObject().getId());
        if (!S6()) {
            f7(holder);
            h7(holder);
            return;
        }
        xc2.k0 k0Var = (xc2.k0) ((jz5.n) this.f406208d).getValue();
        long itemId = feed.getItemId();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.j0 S6 = k0Var.S6(itemId, j17, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n, feed.w());
        int hashCode = holder.hashCode();
        int hashCode2 = S6.hashCode();
        android.util.SparseIntArray sparseIntArray = this.f406216o;
        if (sparseIntArray.get(hashCode) == hashCode2) {
            com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[onBindView] same data hash, skip on bind");
            return;
        }
        f7(holder);
        h7(holder);
        sc2.v6 v6Var = new sc2.v6(this, holder, feed, source, j17, null, 16, null);
        this.f406219r.put(java.lang.Integer.valueOf(hashCode), v6Var);
        if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            pm0.v.y(S6, mMActivity, v6Var);
        } else {
            itemView.post(new sc2.c7(S6, mMActivity, v6Var));
        }
        sparseIntArray.put(hashCode, hashCode2);
    }

    public final void e7(in5.s0 holder, java.lang.String source) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(source, "source");
        T6(holder, new sc2.g7(holder, source, this));
    }

    public final void f7(in5.s0 holder) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed;
        android.view.View view;
        kotlin.jvm.internal.o.g(holder, "holder");
        int hashCode = holder.hashCode();
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[recycleCacheForViewHolder] holder:" + hashCode);
        this.f406216o.delete(hashCode);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f406217p;
        ad2.h hVar = (ad2.h) concurrentHashMap.get(java.lang.Integer.valueOf(hashCode));
        if (hVar != null) {
            hVar.C(holder);
        }
        if (hVar != null && (view = hVar.f3143d) != null) {
            view.setTag(this.f406214m, "");
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(hashCode));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f406218q;
        ad2.i iVar = (ad2.i) concurrentHashMap2.get(java.lang.Integer.valueOf(hashCode));
        concurrentHashMap2.remove(java.lang.Integer.valueOf(hashCode));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[recycleCacheForViewHolder] holder:");
        sb6.append(holder.hashCode());
        sb6.append(" observerWrapper:");
        sb6.append(iVar != null ? java.lang.Integer.valueOf(iVar.hashCode()) : null);
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb6.toString());
        if (hVar != null) {
            long j17 = hVar.f3145f;
            xc2.p0 p0Var = hVar.f3147h;
            if (p0Var == null || (baseFinderFeed = p0Var.f453244f) == null) {
                return;
            }
            long j18 = p0Var.f453245g;
            baseFinderFeed.getFeedObject().getFeedObject().getAdFlag();
            android.app.Activity context = getContext();
            if ((context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null) == null) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            int i17 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n;
            jz5.g gVar = this.f406208d;
            androidx.lifecycle.j0 W6 = j18 == 0 ? ((xc2.k0) ((jz5.n) gVar).getValue()).W6(j17, i17, hVar.f3146g) : ((xc2.k0) ((jz5.n) gVar).getValue()).S6(j17, j18, i17, hVar.f3146g);
            sc2.v6 v6Var = (sc2.v6) this.f406219r.remove(java.lang.Integer.valueOf(hashCode));
            if (v6Var != null) {
                v6Var.f406313h = null;
                if (kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
                    W6.removeObserver(v6Var);
                } else {
                    new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new sc2.n7(W6, v6Var));
                }
            }
        }
    }

    public abstract java.util.Map g7();

    public final void h7(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.util.Iterator it = X6().entrySet().iterator();
        while (it.hasNext()) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.itemView.findViewById(((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue());
            if (viewGroup != null) {
                i7(holder, viewGroup, false);
                viewGroup.setVisibility(0);
            }
        }
    }

    public final void i7(in5.s0 s0Var, android.view.ViewGroup viewGroup, boolean z17) {
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            java.lang.Integer num = null;
            if (!z17) {
                java.lang.Object tag = childAt.getTag(this.f406213i);
                java.lang.Integer num2 = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
                int intValue = num2 != null ? num2.intValue() : -1;
                if (intValue >= 0) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
                    java.util.HashMap hashMap = this.f406210f;
                    java.lang.Object obj = hashMap.get(valueOf);
                    if (obj == null) {
                        obj = new java.util.LinkedList();
                        hashMap.put(valueOf, obj);
                    }
                    ((java.util.LinkedList) obj).add(childAt);
                }
            }
            ad2.i iVar = (ad2.i) this.f406218q.get(java.lang.Integer.valueOf(s0Var.hashCode()));
            if (iVar != null) {
                int hashCode = childAt.hashCode();
                ad2.h hVar = (ad2.h) iVar.f3159d.remove(java.lang.Integer.valueOf(hashCode));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[removeObserver] key:");
                sb6.append(hashCode);
                sb6.append(" observer:");
                sb6.append(hVar != null ? hVar.hashCode() : 0);
                sb6.append(" observerWrapper:");
                sb6.append(iVar.hashCode());
                com.tencent.mars.xlog.Log.i("FeedJumperObserverWrapper", sb6.toString());
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[removeAndRecycleView] holder:");
            sb7.append(s0Var.hashCode());
            sb7.append(" view:");
            sb7.append(childAt.hashCode());
            sb7.append(" observerWrapper:");
            if (iVar != null) {
                num = java.lang.Integer.valueOf(iVar.hashCode());
            }
            sb7.append(num);
            com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", sb7.toString());
        }
        if (z17) {
            return;
        }
        viewGroup.setTag(this.f406214m, "");
        viewGroup.removeAllViews();
    }

    public final void k7(in5.s0 holder) {
        boolean z17;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        r45.cl2 cl2Var3;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null || !hc2.o0.D(baseFinderFeed.getFeedObject().getFeedObject(), false)) {
            return;
        }
        long itemId = baseFinderFeed.getItemId();
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var = (com.tencent.mm.plugin.finder.viewmodel.component.p1) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
        if (p1Var != null) {
            p1Var.P6(itemId);
        }
        android.app.Activity context2 = getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        int integer = nyVar != null ? nyVar.V6().getInteger(5) : 0;
        qc2.b bVar = qc2.b.f361509a;
        r45.dm2 object_extend = baseFinderFeed.getFeedObject().getFeedObject().getObject_extend();
        qc2.b.a(bVar, 3, itemId, integer, (object_extend == null || (cl2Var3 = (r45.cl2) object_extend.getCustom(4)) == null) ? 0L : cl2Var3.getLong(1), false, "", 0, 0, false, null, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, null);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.viewmodel.component.p1 p1Var2 = (com.tencent.mm.plugin.finder.viewmodel.component.p1) pf5.z.f353948a.a(activity).e(com.tencent.mm.plugin.finder.viewmodel.component.p1.class);
        if (p1Var2 != null) {
            com.tencent.mm.protocal.protobuf.FinderObject feed = baseFinderFeed.getFeedObject().getFeedObject();
            kotlin.jvm.internal.o.g(feed, "feed");
            r45.dm2 object_extend2 = feed.getObject_extend();
            long j17 = (object_extend2 == null || (cl2Var2 = (r45.cl2) object_extend2.getCustom(4)) == null) ? 0L : cl2Var2.getLong(1);
            r45.dm2 object_extend3 = feed.getObject_extend();
            if (object_extend3 == null || (cl2Var = (r45.cl2) object_extend3.getCustom(4)) == null) {
                z17 = false;
                finderJumpInfo = null;
            } else {
                z17 = false;
                finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) cl2Var.getCustom(0);
            }
            boolean z18 = finderJumpInfo != null ? true : z17;
            if (hc2.o0.D(feed, z17) && j17 != 0) {
                java.lang.Boolean bool = (java.lang.Boolean) ((java.util.LinkedHashMap) p1Var2.f135499e).get(java.lang.Long.valueOf(feed.getId()));
                boolean booleanValue = bool != null ? bool.booleanValue() : z17;
                com.tencent.mars.xlog.Log.i("Finder.AdTraceUIC", "checkHasReport feedId=" + pm0.v.u(feed.getId()) + " hasReport=" + booleanValue + " hasComponent=" + z18);
                pm0.z.b(xy2.b.f458155b, "finderAdExposureReport", booleanValue, null, null, false, false, new com.tencent.mm.plugin.finder.viewmodel.component.o1(feed, j17, z18), 60, null);
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.m1 a17 = com.tencent.mm.plugin.finder.viewmodel.component.m1.f135109d.a();
        com.tencent.mm.protocal.protobuf.FinderObject feed2 = baseFinderFeed.getFeedObject().getFeedObject();
        a17.getClass();
        kotlin.jvm.internal.o.g(feed2, "feed");
        if (com.tencent.mm.plugin.finder.viewmodel.component.m1.f135110e.contains(java.lang.Integer.valueOf(integer))) {
            com.tencent.mm.plugin.finder.viewmodel.component.j1 j1Var = (com.tencent.mm.plugin.finder.viewmodel.component.j1) a17.f135112a.get(new com.tencent.mm.plugin.finder.viewmodel.component.k1(feed2.getId(), integer));
            if (j1Var == null || j1Var.f134794f < 3) {
                com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onFeedUnFocused return! unfocus without consume, dispatch and focus, commentScene=" + integer + " feedId=" + pm0.v.u(feed2.getId()));
                return;
            }
            j1Var.f134794f = 4;
            j1Var.f134798j = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("Finder.AdTraceMgr", "onFeedUnFocused dispatchFeed=" + j1Var + " [unFocus-focus]=" + (j1Var.f134798j - j1Var.f134797i) + "ms");
        }
    }

    public final void l7(long j17, long j18) {
        sc2.x6 x6Var = (sc2.x6) this.f406220s.c(java.lang.Long.valueOf(j17), sc2.q7.f406176d);
        if (x6Var == null) {
            return;
        }
        x6Var.f406367a = j18;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onConfigurationChanged(android.content.res.Configuration newConfig) {
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        U6(new sc2.e7(newConfig));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f406209e.removeCallbacksAndMessages(null);
        U6(sc2.i7.f405975d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f406208d = jz5.h.b(sc2.a7.f405764d);
        this.f406209e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f406210f = new java.util.HashMap();
        this.f406211g = jz5.h.b(new sc2.o7(this));
        this.f406212h = com.tencent.mm.R.id.eeo;
        this.f406213i = com.tencent.mm.R.id.eel;
        this.f406214m = com.tencent.mm.R.id.eek;
        this.f406216o = new android.util.SparseIntArray();
        this.f406217p = new java.util.concurrent.ConcurrentHashMap();
        this.f406218q = new java.util.concurrent.ConcurrentHashMap();
        this.f406219r = new java.util.HashMap();
        this.f406220s = new com.tencent.mm.sdk.platformtools.c0(5);
    }
}
