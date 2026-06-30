package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class MusicMvSongInfoUIC extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public r45.hf2 f150999d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.view.i f151000e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f151001f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f151002g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f151003h;

    /* renamed from: i, reason: collision with root package name */
    public long f151004i;

    /* renamed from: m, reason: collision with root package name */
    public long f151005m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f151006n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.k f151007o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f151008p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.HashMap f151009q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.HashMap f151010r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.HashMap f151011s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f151012t;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f151013u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MusicMvSongInfoUIC(final androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        new java.util.HashMap();
        this.f151007o = new com.tencent.mm.plugin.mv.ui.uic.t7(this, activity);
        this.f151008p = new java.util.HashMap();
        this.f151009q = new java.util.HashMap();
        this.f151010r = new java.util.HashMap();
        this.f151011s = new java.util.HashMap();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f151012t = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicCheckErrorEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$musicCheckErrorListener$1
            {
                this.__eventId = -1443570203;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicCheckErrorEvent musicCheckErrorEvent) {
                com.tencent.mm.autogen.events.MusicCheckErrorEvent event = musicCheckErrorEvent;
                kotlin.jvm.internal.o.g(event, "event");
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", "musicCheckErrorListener check error");
                am.ik ikVar = event.f54511g;
                if (ikVar.f6956a == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mv.MusicMvSongInfoUIC", "musicCheckErrorListener, must has error.");
                    return false;
                }
                java.lang.String string = !com.tencent.mm.sdk.platformtools.t8.K0(ikVar.f6957b) ? ikVar.f6957b : androidx.appcompat.app.AppCompatActivity.this.getString(com.tencent.mm.R.string.h4e);
                kotlin.jvm.internal.o.d(string);
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC = this;
                musicMvSongInfoUIC.f151001f = db5.e1.y(musicMvSongInfoUIC.getContext(), string, "", musicMvSongInfoUIC.getContext().getString(com.tencent.mm.R.string.f490454vi), new com.tencent.mm.plugin.mv.ui.uic.u7(musicMvSongInfoUIC));
                return true;
            }
        };
        this.f151013u = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC$musicPlayerListener$1
            {
                this.__eventId = -1155728636;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
                fm3.u uVar;
                com.tencent.mm.autogen.events.MusicPlayerEvent event = musicPlayerEvent;
                kotlin.jvm.internal.o.g(event, "event");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("MusicPlayerEvent, action:");
                am.jk jkVar = event.f54512g;
                sb6.append(jkVar.f7036b);
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", sb6.toString());
                androidx.appcompat.app.AppCompatActivity activity2 = androidx.appcompat.app.AppCompatActivity.this;
                kotlin.jvm.internal.o.g(activity2, "activity");
                pf5.z zVar = pf5.z.f353948a;
                if (!((com.tencent.mm.plugin.mv.ui.uic.n0) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).R6(jkVar.f7037c)) {
                    return false;
                }
                int i17 = jkVar.f7036b;
                if (i17 == 0) {
                    pk4.c cVar = ((com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class)).f150983p;
                    if (cVar == null) {
                        return false;
                    }
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).f();
                    return false;
                }
                com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC = this;
                if (i17 == 1) {
                    pk4.c cVar2 = ((com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class)).f150983p;
                    if (cVar2 != null) {
                        ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar2).c();
                    }
                    musicMvSongInfoUIC.Q6();
                    musicMvSongInfoUIC.R6();
                    musicMvSongInfoUIC.S6();
                    return false;
                }
                if (i17 != 2 && i17 != 3 && i17 != 4) {
                    if (i17 != 7) {
                        return false;
                    }
                    com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.O6(musicMvSongInfoUIC, musicMvSongInfoUIC.f151003h);
                    return false;
                }
                pk4.c cVar3 = ((com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class)).f150983p;
                if (cVar3 != null) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar3).a();
                }
                com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
                lm3.e eVar = (lm3.e) kz5.n0.a0(musicMvMainUIC.f150977g, musicMvMainUIC.f150982o);
                if (eVar != null && (uVar = eVar.f319482d) != null) {
                    uVar.f264144x++;
                }
                musicMvSongInfoUIC.T6();
                musicMvSongInfoUIC.U6();
                musicMvSongInfoUIC.P6();
                return false;
            }
        };
    }

    public static final void O6(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC, android.view.View view) {
        android.view.View findViewById;
        android.view.View findViewById2;
        musicMvSongInfoUIC.getClass();
        ka0.o0 o0Var = (ka0.o0) i95.n0.c(ka0.o0.class);
        b21.r b17 = b21.m.b();
        java.lang.String str = b17 != null ? b17.P : null;
        ((ja0.i0) o0Var).getClass();
        java.lang.Integer num = (java.lang.Integer) ml3.c.f328402d.get(str);
        if (num != null && num.intValue() == 2) {
            ka0.o0 o0Var2 = (ka0.o0) i95.n0.c(ka0.o0.class);
            b21.r b18 = b21.m.b();
            java.lang.String str2 = b18 != null ? b18.P : null;
            ((ja0.i0) o0Var2).getClass();
            if (kotlin.jvm.internal.o.b((java.lang.Boolean) ml3.c.f328403e.get(str2), java.lang.Boolean.TRUE)) {
                ((ja0.c0) ((ka0.h0) i95.n0.c(ka0.h0.class))).getClass();
                ll3.b1 b1Var = ll3.b1.f319140a;
                ll3.b1.f319141b.f319157u = true;
                if ((view != null ? view.findViewById(com.tencent.mm.R.id.ojy) : null) == null) {
                    return;
                }
                int i17 = 0;
                if (!musicMvSongInfoUIC.f151006n) {
                    android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.setDuration(150L);
                    int width = (view == null || (findViewById2 = view.findViewById(com.tencent.mm.R.id.ojy)) == null) ? 0 : findViewById2.getWidth();
                    if (view != null && (findViewById = view.findViewById(com.tencent.mm.R.id.ojz)) != null) {
                        i17 = findViewById.getWidth();
                    }
                    ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
                    ofFloat.addUpdateListener(new com.tencent.mm.plugin.mv.ui.uic.v7(width, i17, view));
                    ofFloat.addListener(new com.tencent.mm.plugin.mv.ui.uic.w7(view, musicMvSongInfoUIC));
                    ofFloat.start();
                    return;
                }
                android.view.View findViewById3 = view != null ? view.findViewById(com.tencent.mm.R.id.gsl) : null;
                if (findViewById3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    android.view.View view2 = findViewById3;
                    yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View findViewById4 = view != null ? view.findViewById(com.tencent.mm.R.id.gsl) : null;
                if (findViewById4 == null) {
                    return;
                }
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                android.view.View view3 = findViewById4;
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                findViewById4.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showLongTryListen", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void P6() {
        java.util.Collection values = this.f151009q.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((java.lang.ref.WeakReference) it.next()).get();
            if (recyclerView != null) {
                recyclerView.setVisibility(8);
            }
        }
        java.util.Collection<java.lang.ref.WeakReference> values2 = this.f151010r.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        for (java.lang.ref.WeakReference weakReference : values2) {
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = (com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView) weakReference.get();
            if (musicMvLyricPreludeView != null) {
                musicMvLyricPreludeView.setVisibility(4);
            }
            com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView2 = (com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView) weakReference.get();
            if (musicMvLyricPreludeView2 != null) {
                musicMvLyricPreludeView2.c();
            }
        }
    }

    public final void Q6() {
        java.util.Collection values = this.f151011s.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((java.lang.ref.WeakReference) it.next()).get();
            if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        }
    }

    public final void R6() {
        java.util.Collection values = this.f151008p.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = (com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar) ((java.lang.ref.WeakReference) it.next()).get();
            if (musicMainSeekBar != null) {
                musicMainSeekBar.setVisibility(8);
            }
        }
    }

    public final void S6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        if (!((com.tencent.mm.plugin.mv.ui.uic.s1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).f151424r) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            if (!((com.tencent.mm.plugin.mv.ui.uic.s1) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).f151431y) {
                java.util.Collection values = this.f151009q.values();
                kotlin.jvm.internal.o.f(values, "<get-values>(...)");
                java.util.Iterator it = values.iterator();
                while (it.hasNext()) {
                    androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((java.lang.ref.WeakReference) it.next()).get();
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                    }
                }
            }
        }
        androidx.appcompat.app.AppCompatActivity activity3 = getActivity();
        kotlin.jvm.internal.o.g(activity3, "activity");
        if (((com.tencent.mm.plugin.mv.ui.uic.s1) pf5.z.f353948a.a(activity3).a(com.tencent.mm.plugin.mv.ui.uic.s1.class)).f151431y) {
            java.util.Collection<java.lang.ref.WeakReference> values2 = this.f151010r.values();
            kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
            for (java.lang.ref.WeakReference weakReference : values2) {
                com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView = (com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView) weakReference.get();
                if (musicMvLyricPreludeView != null) {
                    musicMvLyricPreludeView.setVisibility(0);
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView musicMvLyricPreludeView2 = (com.tencent.mm.plugin.mv.ui.view.MusicMvLyricPreludeView) weakReference.get();
                if (musicMvLyricPreludeView2 != null) {
                    musicMvLyricPreludeView2.d();
                }
            }
        }
    }

    public final void T6() {
        java.util.Collection values = this.f151011s.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((java.lang.ref.WeakReference) it.next()).get();
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
        }
    }

    public final void U6() {
        java.util.Collection values = this.f151008p.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar musicMainSeekBar = (com.tencent.mm.plugin.music.ui.view.MusicMainSeekBar) ((java.lang.ref.WeakReference) it.next()).get();
            if (musicMainSeekBar != null) {
                musicMainSeekBar.setVisibility(0);
            }
        }
    }

    public final void V6(android.view.View view) {
        ka0.o0 o0Var = (ka0.o0) i95.n0.c(ka0.o0.class);
        b21.r b17 = b21.m.b();
        java.lang.String str = b17 != null ? b17.P : null;
        ((ja0.i0) o0Var).getClass();
        java.lang.Integer num = (java.lang.Integer) ml3.c.f328402d.get(str);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
        if ((num != null && num.intValue() == 2) || n0Var.f151324z == 2) {
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ojy);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showTryListenIcon", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvSongInfoUIC", "showTryListenIcon", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f151002g = true;
            if (j65.c.f(i65.a.n(getContext())) >= 6) {
                android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.gsl);
                android.widget.TextView textView = findViewById2 instanceof android.widget.TextView ? (android.widget.TextView) findViewById2 : null;
                if (textView != null) {
                    textView.setText(getActivity().getString(com.tencent.mm.R.string.h5l));
                }
                android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.gsm);
                android.widget.TextView textView2 = findViewById3 instanceof android.widget.TextView ? (android.widget.TextView) findViewById3 : null;
                if (textView2 != null) {
                    textView2.setText(getActivity().getString(com.tencent.mm.R.string.h5l));
                }
            }
            ka0.o0 o0Var2 = (ka0.o0) i95.n0.c(ka0.o0.class);
            b21.r b18 = b21.m.b();
            java.lang.String str2 = b18 != null ? b18.P : null;
            ((ja0.i0) o0Var2).getClass();
            kotlin.jvm.internal.o.b((java.lang.Boolean) ml3.c.f328403e.get(str2), java.lang.Boolean.TRUE);
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            if (((com.tencent.mm.plugin.mv.ui.uic.n0) zVar.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151321w) {
                view.post(new com.tencent.mm.plugin.mv.ui.uic.x7(this, view));
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1 && i18 == -1) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            android.view.View contentView = ((com.tencent.mm.plugin.mv.ui.uic.e1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151109g.getContentView();
            if (contentView == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/mv/ui/view/MusicMvTipsPopupWindow", "setVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvSongInfoUIC", "onCreate");
        this.f151012t.alive();
        this.f151013u.alive();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f151001f;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f151012t.dead();
        this.f151013u.dead();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.mv.ui.uic.e1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151109g.a();
        kl3.t.g().f(this.f151007o);
        ((ja0.i0) ((ka0.o0) i95.n0.c(ka0.o0.class))).getClass();
        ml3.c.f328404f = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        kl3.t.g().f(this.f151007o);
        super.onPause();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        kl3.t g17 = kl3.t.g();
        com.tencent.mm.plugin.music.player.base.k kVar = this.f151007o;
        rl3.b bVar = (rl3.b) g17.a();
        if (kVar == null) {
            bVar.getClass();
            return;
        }
        java.util.LinkedList linkedList = bVar.f397235j;
        if (linkedList.contains(kVar)) {
            return;
        }
        linkedList.add(kVar);
    }
}
