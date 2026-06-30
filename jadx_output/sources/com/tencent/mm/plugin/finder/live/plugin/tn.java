package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tn {
    public final android.animation.ObjectAnimator A;
    public volatile boolean B;
    public volatile boolean C;
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap D;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f114434a;

    /* renamed from: b, reason: collision with root package name */
    public final int f114435b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f114436c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f114437d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f114438e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f114439f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f114440g;

    /* renamed from: h, reason: collision with root package name */
    public volatile java.lang.String f114441h;

    /* renamed from: i, reason: collision with root package name */
    public volatile int f114442i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f114443j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f114444k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f114445l;

    /* renamed from: m, reason: collision with root package name */
    public volatile int f114446m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.un f114447n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.wn f114448o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f114449p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f114450q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f114451r;

    /* renamed from: s, reason: collision with root package name */
    public volatile java.lang.String f114452s;

    /* renamed from: t, reason: collision with root package name */
    public r45.ch1 f114453t;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.String f114454u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f114455v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f114456w;

    /* renamed from: x, reason: collision with root package name */
    public final android.animation.AnimatorSet f114457x;

    /* renamed from: y, reason: collision with root package name */
    public final android.animation.ObjectAnimator f114458y;

    /* renamed from: z, reason: collision with root package name */
    public final android.animation.ObjectAnimator f114459z;

    public tn(com.tencent.mm.plugin.finder.live.plugin.ap apVar, android.view.ViewGroup container, int i17, boolean z17, boolean z18, boolean z19, boolean z27, int i18, int i19, kotlin.jvm.internal.i iVar) {
        boolean z28 = (i19 & 8) != 0 ? false : z18;
        boolean z29 = (i19 & 16) != 0 ? false : z19;
        boolean z37 = (i19 & 32) != 0 ? false : z27;
        int i27 = (i19 & 64) != 0 ? 0 : i18;
        kotlin.jvm.internal.o.g(container, "container");
        this.D = apVar;
        this.f114434a = container;
        this.f114435b = i17;
        this.f114436c = z29;
        this.f114437d = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f114439f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f114441h = "";
        this.f114445l = new java.util.concurrent.ConcurrentLinkedDeque();
        com.tencent.mm.plugin.finder.live.plugin.un unVar = new com.tencent.mm.plugin.finder.live.plugin.un(container, z17, z29, z37, i27);
        this.f114447n = unVar;
        this.f114448o = new com.tencent.mm.plugin.finder.live.plugin.wn(container);
        this.f114449p = z28;
        this.f114452s = "";
        this.f114454u = ((mm2.c1) apVar.P0(mm2.c1.class)).f328852o;
        this.f114455v = new java.util.concurrent.atomic.AtomicBoolean(true);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.f114457x = animatorSet;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(unVar.f114597g, "scaleX", 0.0f, 1.1f).setDuration(63L);
        kotlin.jvm.internal.o.f(duration, "setDuration(...)");
        this.f114458y = duration;
        android.animation.ObjectAnimator duration2 = android.animation.ObjectAnimator.ofFloat(unVar.f114597g, "scaleY", 0.0f, 1.1f).setDuration(63L);
        kotlin.jvm.internal.o.f(duration2, "setDuration(...)");
        this.f114459z = duration2;
        android.animation.ObjectAnimator duration3 = android.animation.ObjectAnimator.ofFloat(unVar.f114597g, "alpha", 0.0f, 1.0f).setDuration(104L);
        kotlin.jvm.internal.o.f(duration3, "setDuration(...)");
        this.A = duration3;
        android.animation.ObjectAnimator duration4 = android.animation.ObjectAnimator.ofFloat(unVar.f114597g, "scaleX", 1.1f, 1.0f).setDuration(42L);
        kotlin.jvm.internal.o.f(duration4, "setDuration(...)");
        duration4.setStartDelay(63L);
        android.animation.ObjectAnimator duration5 = android.animation.ObjectAnimator.ofFloat(unVar.f114597g, "scaleY", 1.1f, 1.0f).setDuration(42L);
        kotlin.jvm.internal.o.f(duration5, "setDuration(...)");
        duration5.setStartDelay(63L);
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = unVar.f114597g;
        if (finderLiveGiftTextView != null) {
            finderLiveGiftTextView.setPivotX(0.0f);
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView2 = unVar.f114597g;
        if (finderLiveGiftTextView2 != null) {
            finderLiveGiftTextView2.setPivotY(finderLiveGiftTextView2.getMeasuredHeight());
        }
        animatorSet.playTogether(duration, duration2, duration4, duration5, duration3);
    }

    public final void a() {
        java.util.Map map = this.D.D;
        java.lang.String str = this.f114441h;
        com.tencent.mm.plugin.finder.live.plugin.vn vnVar = new com.tencent.mm.plugin.finder.live.plugin.vn();
        vnVar.f114800a.getAndSet(this.f114439f.get());
        vnVar.f114801b = this.f114442i;
        vnVar.f114802c = c01.id.c();
        kotlin.jvm.internal.o.g(this.f114452s, "<set-?>");
        map.put(str, vnVar);
        pm0.v.O("giftQueueMapClear", new com.tencent.mm.plugin.finder.live.plugin.on(this.D, this));
        java.lang.Integer num = (java.lang.Integer) this.f114445l.peekLast();
        if (num != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.pn(this, num));
        }
        this.f114437d.getAndSet(false);
        this.f114438e = false;
        this.f114439f.getAndSet(false);
        this.f114440g = false;
        this.f114441h = "";
        this.f114442i = 0;
        this.f114446m = 0;
        this.f114445l.clear();
        this.f114450q = 0L;
        this.f114451r = 0L;
        this.f114452s = "";
        this.f114453t = null;
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.qn(this));
        f(false);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.rn(this));
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = this.f114447n.f114597g;
        if (finderLiveGiftTextView == null) {
            return;
        }
        finderLiveGiftTextView.setTag(null);
    }

    public final void b() {
        com.tencent.mm.plugin.finder.live.plugin.un unVar = this.f114447n;
        android.view.ViewGroup viewGroup = unVar.f114600j;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.view.View view = unVar.f114599i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = unVar.f114602l;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = unVar.f114602l;
        if (view3 != null) {
            view3.setOnClickListener(null);
        }
        com.tencent.mm.plugin.finder.live.plugin.wn wnVar = this.f114448o;
        android.view.View view4 = wnVar.f114969a;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = wnVar.f114972d;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2GiftBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = wnVar.f114969a;
        if (view6 != null) {
            view6.setOnClickListener(null);
        }
    }

    public final void c() {
        com.tencent.mm.plugin.finder.live.plugin.un unVar = this.f114447n;
        android.view.ViewGroup viewGroup = unVar.f114600j;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        android.view.View view = unVar.f114599i;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = unVar.f114602l;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = unVar.f114602l;
        if (view3 != null) {
            view3.setOnClickListener(null);
        }
        com.tencent.mm.plugin.finder.live.plugin.wn wnVar = this.f114448o;
        android.view.View view4 = wnVar.f114969a;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view5 = wnVar.f114972d;
        if (view5 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo", "reset2NotifyBullet", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view6 = wnVar.f114969a;
        if (view6 != null) {
            view6.setOnClickListener(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.C
            if (r3 == r0) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "bulletFlying origin value:"
            r0.<init>(r1)
            boolean r1 = r2.C
            r0.append(r1)
            java.lang.String r1 = ",value:"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.FinderLiveGiftQueuePlugin"
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r3 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            r2.C = r3
            if (r0 == 0) goto L2f
            java.lang.String r3 = "bulletFlying Stop"
            r2.g(r3)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.tn.d(boolean):void");
    }

    public final void e(int i17, boolean z17, com.tencent.mm.plugin.finder.live.util.l1 giftShowInfo) {
        kotlin.jvm.internal.o.g(giftShowInfo, "giftShowInfo");
        boolean z18 = false;
        if (giftShowInfo.f115602t) {
            com.tencent.mm.plugin.finder.live.plugin.un unVar = this.f114447n;
            int i18 = this.f114442i;
            unVar.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "showBatchCntText: " + i18);
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = unVar.f114597g;
            if (finderLiveGiftTextView != null) {
                finderLiveGiftTextView.setVisibility(8);
            }
            com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView = unVar.f114598h;
            if (finderRandomAnimTextView != null) {
                finderRandomAnimTextView.setVisibility(0);
            }
            if (finderRandomAnimTextView != null) {
                finderRandomAnimTextView.h1(i18);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.plugin.un unVar2 = this.f114447n;
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView2 = unVar2.f114597g;
        if (finderLiveGiftTextView2 != null) {
            finderLiveGiftTextView2.setVisibility(0);
        }
        com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView2 = unVar2.f114598h;
        if (finderRandomAnimTextView2 != null) {
            finderRandomAnimTextView2.setVisibility(8);
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView3 = this.f114447n.f114597g;
        java.lang.Object tag = finderLiveGiftTextView3 != null ? finderLiveGiftTextView3.getTag() : null;
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : this.f114446m;
        if (intValue < 1) {
            intValue = 1;
            z18 = true;
        }
        this.f114445l.clear();
        if (i17 <= intValue) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "setCntQueue: destinationCnt:" + i17 + " <= startCnt:" + intValue);
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView4 = this.f114447n.f114597g;
            if (finderLiveGiftTextView4 != null) {
                finderLiveGiftTextView4.setText("x" + i17);
            }
            com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView5 = this.f114447n.f114597g;
            if (finderLiveGiftTextView5 != null) {
                finderLiveGiftTextView5.setTag(java.lang.Integer.valueOf(i17));
            }
            if (this.f114444k) {
                pm0.v.V(500L, new com.tencent.mm.plugin.finder.live.plugin.sn(this, this.D));
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("localSend:" + z17 + ",startCnt:" + intValue + ",lastCountOnBackToLive:" + this.f114446m + ",firstGift:" + z18 + ';');
        if (!z17) {
            int ceil = (int) java.lang.Math.ceil((i17 - intValue) / 5);
            int i19 = 1 < ceil ? ceil : 1;
            if (!z18) {
                intValue += i19;
            }
            while (intValue < i17) {
                this.f114445l.offer(java.lang.Integer.valueOf(intValue));
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(intValue);
                sb7.append(',');
                sb6.append(sb7.toString());
                intValue += i19;
            }
        }
        this.f114445l.offer(java.lang.Integer.valueOf(i17));
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "setCntQueue " + ((java.lang.Object) sb6));
        g("setCntQueue");
    }

    public final void f(boolean z17) {
        if (z17 != this.B) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "cntTransferAniming origin value:" + this.B + ",value:" + z17);
        }
        this.B = z17;
        if (this.B) {
            return;
        }
        g("cntTransferAnim end");
    }

    public final void g(java.lang.String prefix) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        df2.zo zoVar;
        androidx.lifecycle.j0 j0Var;
        java.lang.Object obj;
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(prefix, "prefix");
        boolean isEmpty = this.f114445l.isEmpty();
        if (isEmpty || this.B || this.C) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "startTransferCnt(" + prefix + ") cntQueueEmpty:" + isEmpty + ",cntTransferAniming:" + this.B + ",bulletFlying:" + this.C);
            return;
        }
        java.lang.Integer num = (java.lang.Integer) this.f114445l.pollFirst();
        int intValue = num == null ? this.f114442i : num.intValue();
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView = this.f114447n.f114597g;
        boolean b17 = kotlin.jvm.internal.o.b(finderLiveGiftTextView != null ? finderLiveGiftTextView.getF130846i() : null, "x" + intValue);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "startTransferCnt(" + prefix + ") number:" + intValue + ", sameValue:" + b17 + ", cntQueueEmpty:" + isEmpty + ",cntTransferAniming:" + this.B + ",bulletFlying:" + this.C);
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView2 = this.f114447n.f114597g;
        if (finderLiveGiftTextView2 != null) {
            finderLiveGiftTextView2.setText("x" + intValue);
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView3 = this.f114447n.f114597g;
        if (finderLiveGiftTextView3 != null) {
            finderLiveGiftTextView3.setTag(java.lang.Integer.valueOf(intValue));
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView4 = this.f114447n.f114597g;
        if (finderLiveGiftTextView4 != null) {
            finderLiveGiftTextView4.setPivotX(0.0f);
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView5 = this.f114447n.f114597g;
        if (finderLiveGiftTextView5 != null) {
            finderLiveGiftTextView5.setPivotY(finderLiveGiftTextView5 != null ? finderLiveGiftTextView5.getMeasuredHeight() : 0.0f);
        }
        this.f114457x.start();
        com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.D;
        apVar.getClass();
        if (!b17 && this.f114447n.f114591a) {
            java.util.List list = ((mm2.o4) apVar.P0(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (android.text.TextUtils.equals(((km2.q) obj).f309172c, this.f114454u)) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (!(qVar != null ? kotlin.jvm.internal.o.b(qVar.f309189t, java.lang.Boolean.TRUE) : false)) {
                android.widget.TextView textView2 = this.f114447n.f114595e;
                java.lang.CharSequence text = textView2 != null ? textView2.getText() : null;
                boolean z17 = true;
                if (!(text == null || text.length() == 0)) {
                    com.tencent.mm.plugin.finder.live.plugin.un unVar = this.f114447n;
                    if (unVar.f114595e != null) {
                        android.widget.TextView textView3 = unVar.f114594d;
                        int measuredWidth = textView3 != null ? textView3.getMeasuredWidth() : 0;
                        com.tencent.mm.plugin.finder.live.view.FinderLiveGiftTextView finderLiveGiftTextView6 = this.f114447n.f114597g;
                        int measuredWidth2 = finderLiveGiftTextView6 != null ? finderLiveGiftTextView6.getMeasuredWidth() : 0;
                        float f17 = measuredWidth + com.tencent.mm.plugin.finder.live.plugin.ap.R;
                        float f18 = com.tencent.mm.plugin.finder.live.plugin.ap.P;
                        int i17 = (int) (f17 + f18 + measuredWidth2 + f18);
                        zl2.r4.f473950a.M2("Finder.FinderLiveGiftQueuePlugin", "enoughSpaceForRelaunch comboSumCount:" + this.f114442i + ",fromUserNameWidth:" + measuredWidth + ", countWidth:" + measuredWidth2 + ",takePlaceWidth:" + i17 + ",outSpaceWidth:" + this.f114447n.f114593c);
                        com.tencent.mm.plugin.finder.live.plugin.un unVar2 = this.f114447n;
                        int i18 = unVar2.f114593c;
                        android.widget.TextView textView4 = unVar2.f114595e;
                        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.dha, "");
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        int paddingLeft = ((i18 - i17) - textView4.getPaddingLeft()) - textView4.getPaddingRight();
                        android.view.ViewParent parent = textView4.getParent();
                        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
                        int paddingLeft2 = paddingLeft - (viewGroup != null ? viewGroup.getPaddingLeft() : 0);
                        android.view.ViewParent parent2 = textView4.getParent();
                        android.view.ViewGroup viewGroup2 = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
                        int paddingRight = (paddingLeft2 - (viewGroup2 != null ? viewGroup2.getPaddingRight() : 0)) - 6;
                        z17 = (paddingRight > 0 ? new android.text.StaticLayout(string, textView4.getPaint(), paddingRight, android.text.Layout.Alignment.ALIGN_NORMAL, 1.0f, 1.0f, true).getLineCount() : Integer.MAX_VALUE) <= 1;
                    }
                }
                if (!z17 && (textView = this.f114447n.f114595e) != null) {
                    textView.setText("");
                }
            }
        }
        if (!this.f114444k || (mMPAGView = this.f114447n.f114596f) == null || (zoVar = (df2.zo) this.D.U0(df2.zo.class)) == null || (j0Var = zoVar.f231980n) == null) {
            return;
        }
        j0Var.postValue(new jz5.l(this.f114452s, pm0.v.t(mMPAGView)));
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("index = " + this.f114435b);
        sb6.append(", ");
        sb6.append("giftId = " + this.f114452s);
        sb6.append(", ");
        sb6.append("isShowing = " + this.f114437d);
        sb6.append(", ");
        sb6.append("isPreciousGift = " + this.f114439f);
        sb6.append(", ");
        sb6.append("isAnimationEnd = " + this.f114438e);
        sb6.append(", ");
        sb6.append("comboId = " + this.f114441h);
        sb6.append(", ");
        sb6.append("comboSumCount = " + this.f114442i);
        sb6.append(", ");
        sb6.append("lastCountOnBackToLive = " + this.f114446m);
        sb6.append(", ");
        sb6.append("totalShowingTime = " + this.f114450q);
        sb6.append(", ");
        sb6.append("cntTransferAniming = " + this.B);
        sb6.append(", ");
        sb6.append("bulletFlying = " + this.C);
        sb6.append(", ");
        sb6.append("targetUserName = " + this.f114454u);
        sb6.append(", ");
        sb6.append("enabled = " + this.f114455v);
        sb6.append("isFromBatchSend = " + this.f114443j);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
