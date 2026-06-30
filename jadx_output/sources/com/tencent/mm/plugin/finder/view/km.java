package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class km extends com.tencent.mm.plugin.finder.view.w {

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.FrameLayout f132508p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f132509q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FeedData f132510r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.ImageView f132511s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout f132512t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f132513u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f132514v;

    /* renamed from: w, reason: collision with root package name */
    public f25.m0 f132515w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f132516x;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public km(java.lang.String r1, android.widget.FrameLayout r2, pj4.j0 r3, pj4.t r4, com.tencent.mm.protocal.protobuf.FinderObject r5) {
        /*
            r0 = this;
            java.lang.String r1 = "parent"
            kotlin.jvm.internal.o.g(r2, r1)
            java.lang.String r1 = "jumpInfo"
            kotlin.jvm.internal.o.g(r3, r1)
            java.lang.String r1 = "pullDownParam"
            kotlin.jvm.internal.o.g(r4, r1)
            java.lang.String r1 = "finderObject"
            kotlin.jvm.internal.o.g(r5, r1)
            android.content.Context r1 = r2.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            r0.<init>(r1, r5, r4)
            r0.f132508p = r2
            java.lang.String r1 = r0.getTag()
            r0.f132509q = r1
            com.tencent.mm.plugin.finder.storage.j r1 = com.tencent.mm.plugin.finder.storage.FeedData.Companion
            com.tencent.mm.plugin.finder.storage.h90 r3 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion
            int r4 = r5.getObjectType()
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.a(r5, r4)
            com.tencent.mm.plugin.finder.storage.FeedData r1 = r1.b(r3)
            r0.f132510r = r1
            android.widget.ImageView r1 = new android.widget.ImageView
            android.content.Context r3 = r2.getContext()
            r1.<init>(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r1.setLayoutParams(r3)
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1.setScaleType(r3)
            r0.f132511s = r1
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r3 = r0.q()
            r0.f132512t = r3
            android.content.Context r3 = r2.getContext()
            android.view.LayoutInflater r3 = com.tencent.mm.ui.id.b(r3)
            r4 = 2131496869(0x7f0c0fa5, float:1.8617315E38)
            r5 = 1
            r3.inflate(r4, r2, r5)
            r3 = 2131301915(0x7f09161b, float:1.8221901E38)
            android.view.View r3 = r2.findViewById(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r4 = r0.f132512t
            r3.addView(r4)
            r3.addView(r1)
            android.content.Context r1 = r2.getContext()
            android.view.LayoutInflater r1 = com.tencent.mm.ui.id.b(r1)
            r4 = 2131496868(0x7f0c0fa4, float:1.8617313E38)
            r5 = 0
            android.view.View r1 = r1.inflate(r4, r2, r5)
            r3.addView(r1)
            boolean r1 = r0.o()
            r0.n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.km.<init>(java.lang.String, android.widget.FrameLayout, pj4.j0, pj4.t, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    @Override // al5.a0
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f132509q, "applyMute: " + z17);
        this.f132516x = z17;
        v(z17);
    }

    @Override // al5.a0
    public long d() {
        if (this.f133277n != null) {
            return r0.f133083b;
        }
        return 1L;
    }

    @Override // al5.a0
    public boolean f() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.w, al5.a0
    public void g() {
        super.g();
        n(o());
        kk4.b player = this.f132512t.getPlayer();
        if (player != null) {
            ((kk4.v) player).f308585j = false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPostClose] player[");
        kk4.b player2 = this.f132512t.getPlayer();
        sb6.append(player2 != null ? java.lang.Integer.valueOf(player2.hashCode()) : null);
        sb6.append("] isPlaying=");
        kk4.b player3 = this.f132512t.getPlayer();
        sb6.append(player3 != null ? java.lang.Boolean.valueOf(((kk4.v) player3).s()) : null);
        sb6.append(" isPreviewVideo:");
        pj4.t tVar = this.f133273g;
        sb6.append(tVar.f355290f);
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        if (tVar.f355290f) {
            v(true);
        } else {
            r();
        }
    }

    @Override // bm5.s0
    public java.lang.String getTag() {
        return "Finder.TextStatusVideoView@" + hashCode();
    }

    @Override // al5.a0
    public void h() {
        this.f5862d = true;
        com.tencent.mars.xlog.Log.i(this.f132509q, "[onPostOpen] isFeedValid=" + o());
        n(o());
        m();
        s();
    }

    @Override // al5.a0
    public void i() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreClose] player[");
        kk4.b player = this.f132512t.getPlayer();
        sb6.append(player != null ? java.lang.Integer.valueOf(player.hashCode()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        this.f132514v = false;
    }

    @Override // al5.a0
    public void j() {
        com.tencent.mars.xlog.Log.i(this.f132509q, "[onPreOpen]");
        this.f133277n = new com.tencent.mm.plugin.finder.view.t(0);
        this.f132514v = true;
    }

    @Override // al5.a0
    public void k(float f17) {
    }

    @Override // com.tencent.mm.plugin.finder.view.w
    public void n(boolean z17) {
        java.lang.String str = "[checkShowValidLayout] isFeedValid=" + z17 + " isViewOpen=" + this.f132514v;
        java.lang.String str2 = this.f132509q;
        com.tencent.mars.xlog.Log.i(str2, str);
        android.widget.FrameLayout frameLayout = this.f132508p;
        if (z17) {
            android.view.View findViewById = frameLayout.findViewById(com.tencent.mm.R.id.heg);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            u(this.f132512t);
            return;
        }
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TEXT_STATUS_FEED_INVALID_WORDING_STRING, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str3 = (java.lang.String) m17;
        if (!(str3.length() == 0)) {
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
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.f132514v) {
            android.view.View findViewById3 = frameLayout.findViewById(com.tencent.mm.R.id.heh);
            if (findViewById3 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById4 = frameLayout.findViewById(com.tencent.mm.R.id.h0d);
            if (findViewById4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View findViewById5 = frameLayout.findViewById(com.tencent.mm.R.id.h0d);
            if (findViewById5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById6 = frameLayout.findViewById(com.tencent.mm.R.id.heh);
            if (findViewById6 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/view/FinderTextStatusVideoView", "checkShowValidLayout", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        r();
    }

    @Override // al5.a0, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(getTag(), "onDestroy");
        this.f133275i = false;
        this.f133276m.dead();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDestroy] player:");
        kk4.b player = this.f132512t.getPlayer();
        sb6.append(player != null ? java.lang.Integer.valueOf(player.hashCode()) : null);
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        t();
        kk4.b player2 = this.f132512t.getPlayer();
        if (player2 != null) {
            player2.stop();
        }
        kk4.b player3 = this.f132512t.getPlayer();
        if (player3 != null) {
            player3.recycle();
        }
        this.f132512t.g();
    }

    @Override // al5.a0, pf5.g
    public void onPause() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPause] player[");
        kk4.b player = this.f132512t.getPlayer();
        sb6.append(player != null ? java.lang.Integer.valueOf(player.hashCode()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        kk4.b player2 = this.f132512t.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).f308585j = false;
        }
        if (this.f133273g.f355290f) {
            r();
        }
    }

    @Override // al5.a0, pf5.g
    public void onResume() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onResume] player[");
        kk4.b player = this.f132512t.getPlayer();
        sb6.append(player != null ? java.lang.Integer.valueOf(player.hashCode()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        kk4.b player2 = this.f132512t.getPlayer();
        if (player2 != null) {
            ((kk4.v) player2).f308585j = true;
        }
        if (this.f133273g.f355290f) {
            s();
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.w
    public void p(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        super.p(finderObject);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[resetFinderObject] feedId=");
        sb6.append(pm0.v.u(finderObject.getId()));
        sb6.append(" player");
        kk4.b player = this.f132512t.getPlayer();
        sb6.append(player != null ? java.lang.Integer.valueOf(player.hashCode()) : null);
        com.tencent.mars.xlog.Log.w(this.f132509q, sb6.toString());
        this.f132510r = com.tencent.mm.plugin.finder.storage.FeedData.Companion.b(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, finderObject.getObjectType()));
        kk4.b player2 = this.f132512t.getPlayer();
        if (player2 != null) {
            player2.stop();
        }
        kk4.b player3 = this.f132512t.getPlayer();
        if (player3 != null) {
            player3.recycle();
        }
        this.f132512t.g();
        android.widget.FrameLayout frameLayout = this.f132508p;
        ((android.view.ViewGroup) frameLayout.findViewById(com.tencent.mm.R.id.ci6)).removeView(this.f132512t);
        this.f132512t = q();
        w();
        ((android.view.ViewGroup) frameLayout.findViewById(com.tencent.mm.R.id.ci6)).addView(this.f132512t, 0);
    }

    public final com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout q() {
        java.lang.String str;
        dk4.a aVar;
        boolean z17;
        boolean isForeground = com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground();
        boolean z18 = this.f133273g.f355294m;
        boolean z19 = isForeground && z18;
        java.lang.String str2 = "createVideoLayout: start, isAppUIForeground=" + isForeground + ", contextResumeCalled=" + z18;
        java.lang.String str3 = this.f132509q;
        com.tencent.mars.xlog.Log.i(str3, str2);
        android.content.Context context = this.f132508p.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout = new com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout(context, false);
        mMTPEffectVideoLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        mMTPEffectVideoLayout.f();
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f132510r.getMediaList());
        if (mb4Var != null) {
            mn2.g4 c17 = ds2.h.f242866a.c(this.f132510r.getId(), mb4Var, false);
            java.lang.String str4 = c17.n() + "_textStatus";
            java.lang.String str5 = c17.getPath() + "_textStatus";
            java.lang.String url = c17.getUrl();
            java.lang.String i17 = c17.i();
            java.lang.String h17 = c17.h();
            long integer = mb4Var.getInteger(3);
            java.lang.String g17 = c17.g();
            str = str3;
            mn2.c1 c1Var = new mn2.c1(mb4Var, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null);
            java.lang.String path = c1Var.getPath();
            java.lang.String l17 = c1Var.l();
            java.lang.String m17 = c1Var.m();
            aVar = r12;
            dk4.a aVar2 = new dk4.a(str4, str5, url, (int) mb4Var.getFloat(4), (int) mb4Var.getFloat(5));
            aVar.f234467d = h17;
            aVar.f234466c = i17;
            aVar.f234470g = integer;
            aVar.f234465b = g17;
            aVar.f234473j = path;
            aVar.f234471h = l17;
            aVar.f234472i = m17;
        } else {
            str = str3;
            aVar = new dk4.a("", "", "", 0, 0);
        }
        mMTPEffectVideoLayout.setMediaInfo(aVar);
        mMTPEffectVideoLayout.getEffectManager().d();
        mMTPEffectVideoLayout.setKeepScreenOn(true);
        kk4.b player = mMTPEffectVideoLayout.getPlayer();
        if (player != null) {
            ((kk4.v) player).f308585j = z19;
        }
        kk4.b player2 = mMTPEffectVideoLayout.getPlayer();
        if (player2 != null) {
            z17 = true;
            ((kk4.v) player2).A(true);
        } else {
            z17 = true;
        }
        this.f132512t = mMTPEffectVideoLayout;
        v(z17);
        r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(this.f132510r.getMediaList());
        mn2.u0 u0Var = mb4Var2 != null ? new mn2.u0(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, 4, null) : null;
        if (u0Var != null) {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.e().b(u0Var, g1Var.h(mn2.f1.f329953d));
            com.tencent.mm.plugin.finder.view.gm gmVar = new com.tencent.mm.plugin.finder.view.gm(this);
            b17.getClass();
            b17.f447873d = gmVar;
            b17.a();
        }
        this.f132511s.setVisibility(0);
        mMTPEffectVideoLayout.setOnFirstFrameAvailable(new com.tencent.mm.plugin.finder.view.hm(this, mMTPEffectVideoLayout));
        kk4.b player3 = mMTPEffectVideoLayout.getPlayer();
        if (player3 != null) {
            kk4.b.g(player3, new com.tencent.mm.plugin.finder.view.im(this), 0L, 2, null);
        }
        this.f132513u = false;
        u(mMTPEffectVideoLayout);
        m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createVideoLayout: videoLayout[");
        sb6.append(this.f132512t.hashCode());
        sb6.append("], player[");
        kk4.b player4 = this.f132512t.getPlayer();
        sb6.append(player4 != null ? java.lang.Integer.valueOf(player4.hashCode()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        return mMTPEffectVideoLayout;
    }

    public final void r() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pauseVideo: player[");
        kk4.b player = this.f132512t.getPlayer();
        sb6.append(player != null ? java.lang.Integer.valueOf(player.hashCode()) : null);
        sb6.append(']');
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        kk4.b player2 = this.f132512t.getPlayer();
        if (player2 != null) {
            kk4.b.i(player2, false, false, 3, null);
        }
        t();
    }

    public final void s() {
        if (o()) {
            w();
            kk4.b player = this.f132512t.getPlayer();
            if (player != null) {
                ((kk4.v) player).f308585j = true;
            }
            kk4.b player2 = this.f132512t.getPlayer();
            if (player2 != null) {
                ((kk4.v) player2).O();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playVideo startToPlay player[");
            kk4.b player3 = this.f132512t.getPlayer();
            sb6.append(player3 != null ? java.lang.Integer.valueOf(player3.hashCode()) : null);
            sb6.append(']');
            com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
        }
    }

    public final void t() {
        com.tencent.mars.xlog.Log.i(this.f132509q, "releaseAudioSession: ");
        f25.m0 m0Var = this.f132515w;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
        this.f132515w = null;
    }

    public final void u(com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout mMTPEffectVideoLayout) {
        kk4.b player;
        kotlin.jvm.internal.o.g(mMTPEffectVideoLayout, "<this>");
        pj4.t tVar = this.f133273g;
        int i17 = tVar.f355289e;
        boolean z17 = ((i17 != 1 && i17 != 2) || tVar.f355290f || this.f132514v) ? false : true;
        if (z17) {
            if (!this.f132513u && (player = mMTPEffectVideoLayout.getPlayer()) != null) {
                kk4.b.a(player, null, 1, null);
            }
            this.f132513u = true;
        } else {
            kk4.b player2 = mMTPEffectVideoLayout.getPlayer();
            if (player2 != null) {
                ((kk4.v) player2).O();
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("tryInitVideo ");
        kk4.b player3 = mMTPEffectVideoLayout.getPlayer();
        sb6.append(player3 != null ? java.lang.Integer.valueOf(player3.hashCode()) : null);
        sb6.append(' ');
        sb6.append(z17);
        sb6.append(' ');
        sb6.append(this.f132513u);
        com.tencent.mars.xlog.Log.i(this.f132509q, sb6.toString());
    }

    public final void v(boolean z17) {
        boolean z18 = false;
        if (z17) {
            t();
        } else {
            f25.m0 m96 = ((f25.n0) i95.n0.c(f25.n0.class)).m9(f25.y.f259117c, new com.tencent.mm.plugin.finder.view.jm(this));
            this.f132515w = m96;
            if (m96 != null && ((g25.e) m96).f267980c) {
                z18 = true;
            }
        }
        kk4.b player = this.f132512t.getPlayer();
        if (player != null) {
            ((kk4.v) player).C(true ^ z18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (iq.b.F(r2.f132512t.getContext(), false) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            r2 = this;
            boolean r0 = r2.f132516x
            if (r0 != 0) goto L1b
            boolean r0 = r2.f132514v
            if (r0 == 0) goto L1b
            boolean r0 = iq.b.y()
            if (r0 != 0) goto L1b
            com.tencent.mm.plugin.thumbplayer.view.MMTPEffectVideoLayout r0 = r2.f132512t
            android.content.Context r0 = r0.getContext()
            r1 = 0
            boolean r0 = iq.b.F(r0, r1)
            if (r0 == 0) goto L1c
        L1b:
            r1 = 1
        L1c:
            r2.v(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.km.w():void");
    }
}
