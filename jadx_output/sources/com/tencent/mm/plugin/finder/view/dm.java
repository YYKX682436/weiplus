package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class dm extends com.tencent.mm.plugin.finder.view.w {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.FrameLayout f131904p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f131905q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f131906r;

    /* renamed from: s, reason: collision with root package name */
    public final vo2.d f131907s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.base.MediaPlayBanner f131908t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f131909u;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dm(java.lang.String r3, android.widget.FrameLayout r4, pj4.j0 r5, pj4.t r6, com.tencent.mm.protocal.protobuf.FinderObject r7) {
        /*
            r2 = this;
            java.lang.String r3 = "parent"
            kotlin.jvm.internal.o.g(r4, r3)
            java.lang.String r3 = "jumpInfo"
            kotlin.jvm.internal.o.g(r5, r3)
            java.lang.String r3 = "pullDownParam"
            kotlin.jvm.internal.o.g(r6, r3)
            java.lang.String r3 = "finderObject"
            kotlin.jvm.internal.o.g(r7, r3)
            android.content.Context r3 = r4.getContext()
            java.lang.String r5 = "getContext(...)"
            kotlin.jvm.internal.o.f(r3, r5)
            r2.<init>(r3, r7, r6)
            r2.f131904p = r4
            r2.f131905q = r7
            java.lang.String r3 = "Finder.TextStatusImageView"
            r2.f131906r = r3
            vo2.d r3 = r2.q()
            r2.f131907s = r3
            com.tencent.mm.plugin.finder.view.base.MediaPlayBanner r3 = new com.tencent.mm.plugin.finder.view.base.MediaPlayBanner
            android.content.Context r6 = r4.getContext()
            kotlin.jvm.internal.o.f(r6, r5)
            r3.<init>(r6)
            r2.f131908t = r3
            android.content.Context r5 = r4.getContext()
            android.view.LayoutInflater r5 = com.tencent.mm.ui.id.b(r5)
            r6 = 2131496869(0x7f0c0fa5, float:1.8617315E38)
            r7 = 1
            r5.inflate(r6, r4, r7)
            r5 = 2131301915(0x7f09161b, float:1.8221901E38)
            android.view.View r5 = r4.findViewById(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r0 = -1
            r6.<init>(r0, r0)
            r5.addView(r3, r6)
            android.content.Context r6 = r4.getContext()
            android.view.LayoutInflater r6 = com.tencent.mm.ui.id.b(r6)
            r0 = 2131496868(0x7f0c0fa4, float:1.8617313E38)
            r1 = 0
            android.view.View r6 = r6.inflate(r0, r4, r1)
            r5.addView(r6)
            com.tencent.mm.view.RecyclerHorizontalViewPager r5 = r3.getRecyclerView()
            r5.setHasFixedSize(r1)
            com.tencent.mm.view.RecyclerHorizontalViewPager r5 = r3.getRecyclerView()
            r5.setFrozeTouch(r7)
            com.tencent.mm.plugin.finder.view.bm r5 = new com.tencent.mm.plugin.finder.view.bm
            r5.<init>(r2)
            r3.setAdapter(r5)
            r3.setAutoPlay(r1)
            com.tencent.mm.plugin.finder.view.cm r3 = new com.tencent.mm.plugin.finder.view.cm
            r3.<init>(r2)
            pm0.v.b(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.dm.<init>(java.lang.String, android.widget.FrameLayout, pj4.j0, pj4.t, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    @Override // com.tencent.mm.plugin.finder.view.w, al5.a0
    public void g() {
        super.g();
        vo2.d dVar = this.f131907s;
        if (dVar != null) {
            ((vo2.c) dVar).c();
        }
        this.f131908t.setAutoPlay(false);
        com.tencent.mars.xlog.Log.i(this.f131906r, "[onPostClose]");
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "Finder.TextStatusImageView";
    }

    @Override // al5.a0
    public void h() {
        this.f5862d = true;
        com.tencent.mars.xlog.Log.i(this.f131906r, "[onPostOpen]");
        if (o()) {
            vo2.d dVar = this.f131907s;
            boolean z17 = false;
            if (dVar != null && !((vo2.c) dVar).b()) {
                z17 = true;
            }
            if (z17) {
                ((vo2.c) dVar).d();
            }
        }
        this.f131908t.setAutoPlay(true);
    }

    @Override // al5.a0
    public void i() {
        com.tencent.mars.xlog.Log.i(this.f131906r, "[onPreClose]");
        this.f131909u = false;
        n(o());
    }

    @Override // al5.a0
    public void j() {
        com.tencent.mars.xlog.Log.i(this.f131906r, "[onPreOpen]");
        this.f131909u = true;
        n(o());
        m();
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    @Override // com.tencent.mm.plugin.finder.view.w
    public void n(boolean z17) {
        java.lang.String str = "[checkShowValid] isFeedValid=" + z17 + " isViewOpen=" + this.f131909u;
        java.lang.String str2 = this.f131906r;
        com.tencent.mars.xlog.Log.i(str2, str);
        vo2.d dVar = this.f131907s;
        android.widget.FrameLayout frameLayout = this.f131904p;
        if (z17) {
            android.view.View findViewById = frameLayout.findViewById(com.tencent.mm.R.id.heg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (!this.f131909u || dVar == null) {
                return;
            }
            ((vo2.c) dVar).d();
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) m17;
        if (str3.length() > 0) {
            com.tencent.mars.xlog.Log.i(str2, "[checkShowValidLayout] wording=".concat(str3));
            android.widget.TextView textView = (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.hei);
            if (textView != null) {
                textView.setText(str3);
            }
        }
        android.view.View findViewById2 = frameLayout.findViewById(com.tencent.mm.R.id.heg);
        if (findViewById2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f131909u) {
            android.view.View findViewById3 = frameLayout.findViewById(com.tencent.mm.R.id.heh);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = frameLayout.findViewById(com.tencent.mm.R.id.h0d);
            if (findViewById4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View findViewById5 = frameLayout.findViewById(com.tencent.mm.R.id.h0d);
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById6 = frameLayout.findViewById(com.tencent.mm.R.id.heh);
            if (findViewById6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/view/FinderTextStatusImageView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (dVar != null) {
            ((vo2.c) dVar).c();
        }
    }

    @Override // al5.a0, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("Finder.TextStatusImageView", "onDestroy");
        this.f133275i = false;
        this.f133276m.dead();
        com.tencent.mars.xlog.Log.i(this.f131906r, "[onDestroy]");
        vo2.d dVar = this.f131907s;
        if (dVar != null) {
            ((vo2.c) dVar).e();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.w
    public void p(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        super.p(finderObject);
        this.f131905q = finderObject;
        com.tencent.mars.xlog.Log.w(this.f131906r, "[resetFinderObject] feedId=".concat(pm0.v.u(finderObject.getId())));
        r(finderObject);
        vo2.d dVar = this.f131907s;
        if (dVar != null) {
            ((vo2.c) dVar).e();
        }
        q();
        n(o());
    }

    public final vo2.d q() {
        r45.el2 feedBgmInfo;
        com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f131905q;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = h90Var.a(finderObject, finderObject.getObjectType()).getFeedObject().getObjectDesc();
        r45.zi2 zi2Var = (objectDesc == null || (feedBgmInfo = objectDesc.getFeedBgmInfo()) == null) ? null : (r45.zi2) feedBgmInfo.getCustom(0);
        if (zi2Var == null) {
            return null;
        }
        java.lang.String string = zi2Var.getString(5);
        if (!(!(string == null || string.length() == 0))) {
            zi2Var = null;
        }
        if (zi2Var == null) {
            return null;
        }
        android.content.Context context = this.f131904p.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vo2.c(context, zi2Var);
    }

    public final void r(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        androidx.recyclerview.widget.f2 adapter = this.f131908t.getAdapter();
        eb5.d dVar = adapter instanceof eb5.d ? (eb5.d) adapter : null;
        if (dVar != null) {
            dVar.E(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, finderObject.getObjectType()).getMediaList());
        }
    }
}
