package lm3;

/* loaded from: classes10.dex */
public final class f extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final in5.s0 f319483d;

    /* renamed from: e, reason: collision with root package name */
    public final lm3.e f319484e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f319485f;

    public f(lm3.b0 b0Var, in5.s0 holder, lm3.e item, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        this.f319485f = b0Var;
        this.f319483d = holder;
        this.f319484e = item;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView a(in5.s0 s0Var, android.view.ViewGroup viewGroup) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(s0Var.f293121e);
        weImageView.setVisibility(4);
        android.content.Context context = s0Var.f293121e;
        int dimension = (int) context.getResources().getDimension(com.tencent.mm.R.dimen.f479725dh);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.gravity = 17;
        weImageView.setLayoutParams(layoutParams);
        weImageView.setImageResource(com.tencent.mm.R.raw.finder_full_like);
        weImageView.setIconColor(context.getResources().getColor(com.tencent.mm.R.color.Red_90));
        viewGroup.addView(weImageView);
        return weImageView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        in5.s0 s0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "onDoubleTap");
        fm3.t tVar = fm3.u.A;
        lm3.e eVar = this.f319484e;
        boolean e18 = tVar.e(eVar.f319482d);
        uw2.h0 h0Var = uw2.h0.f431674a;
        lm3.b0 b0Var = this.f319485f;
        in5.s0 s0Var2 = this.f319483d;
        if (e18) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var2.itemView.findViewById(com.tencent.mm.R.id.ghl);
            kotlin.jvm.internal.o.d(viewGroup);
            s0Var = s0Var2;
            uw2.h0.p(h0Var, a(s0Var2, viewGroup), 1.4f, e17, true, viewGroup.getY(), 0L, 32, null);
            if (!eVar.f319482d.f264134n) {
                lm3.b0.n(b0Var, s0Var, eVar, 2);
                b0Var.s(s0Var, eVar);
            }
        } else {
            s0Var = s0Var2;
        }
        if (b0Var.f319473h) {
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) s0Var.itemView.findViewById(com.tencent.mm.R.id.ghl);
            kotlin.jvm.internal.o.d(viewGroup2);
            uw2.h0.p(h0Var, a(s0Var, viewGroup2), 1.4f, e17, true, viewGroup2.getY(), 0L, 32, null);
            androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
            kotlin.jvm.internal.o.g(activity, "activity");
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
            b0Var.getClass();
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) s0Var.itemView.findViewById(com.tencent.mm.R.id.h6l);
            boolean z17 = !n0Var.D;
            if (z17) {
                n0Var.D = z17;
                com.tencent.mm.plugin.finder.uniComments.h2 h2Var = com.tencent.mm.plugin.finder.uniComments.q3.F;
                if (z17) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
                    weImageView.setIconColor(s0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f478532ac));
                    h2Var.a(n0Var.f151310i, 1L, 1L);
                } else {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
                    weImageView.setIconColor(s0Var.itemView.getResources().getColor(com.tencent.mm.R.color.f478553an));
                    h2Var.a(n0Var.f151310i, 2L, 1L);
                }
                android.widget.TextView textView = (android.widget.TextView) s0Var.itemView.findViewById(com.tencent.mm.R.id.i1i);
                if (z17) {
                    int i17 = n0Var.C + 1;
                    n0Var.C = i17;
                    textView.setText(b0Var.o(i17));
                } else {
                    int i18 = n0Var.C;
                    if (i18 <= 1 || z17) {
                        textView.setText(s0Var.itemView.getResources().getString(com.tencent.mm.R.string.h3y));
                    } else {
                        int i19 = i18 - 1;
                        n0Var.C = i19;
                        textView.setText(b0Var.o(i19));
                    }
                }
                fv2.f fVar = new fv2.f(new iv2.b(n0Var.A, n0Var.B));
                int i27 = z17 ? 1 : 2;
                com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
                r45.a13 a13Var = new r45.a13();
                iv2.b bVar = fVar.f266974m;
                a13Var.f369632f = bVar.f295125a;
                a13Var.f369633g = bVar.f295126b;
                a13Var.f369639p = null;
                a13Var.f369630d = db2.t4.f228171a.a(6989);
                a13Var.f369631e = java.lang.System.currentTimeMillis();
                a13Var.f369636m = i27;
                lVar.f70664a = a13Var;
                lVar.f70665b = new r45.b13();
                lVar.f70666c = "/cgi-bin/micromsg-bin/finderunilike";
                lVar.f70667d = 6989;
                fVar.p(lVar.a());
                fVar.l();
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        super.onLongPress(e17);
        lm3.b0 b0Var = this.f319485f;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.mv.ui.view.e4 e4Var = ((com.tencent.mm.plugin.mv.ui.uic.e1) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.e1.class)).f151109g;
        if (e4Var.isShowing()) {
            e4Var.dismiss();
        }
        lm3.e eVar = this.f319484e;
        fm3.u musicMv = eVar.f319482d;
        kotlin.jvm.internal.o.g(musicMv, "musicMv");
        int i17 = musicMv.f264136p;
        boolean z17 = true;
        if (i17 != 1 && i17 != 4) {
            z17 = false;
        }
        if (z17) {
            in5.s0 s0Var = this.f319483d;
            s0Var.itemView.performHapticFeedback(0, 2);
            androidx.appcompat.app.AppCompatActivity activity2 = b0Var.f319470e;
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.mv.ui.uic.q7) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.q7.class)).O6(s0Var, eVar.f319482d, 3);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        pk4.c cVar;
        kotlin.jvm.internal.o.g(e17, "e");
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "onSingleTapConfirmed");
        lm3.b0 b0Var = this.f319485f;
        androidx.appcompat.app.AppCompatActivity activity = b0Var.f319470e;
        kotlin.jvm.internal.o.g(activity, "activity");
        boolean z17 = ((com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151318t;
        in5.s0 s0Var = this.f319483d;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity2 = b0Var.f319470e;
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((com.tencent.mm.plugin.mv.ui.uic.n0) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.n0.class)).f151318t = false;
            lm3.e eVar = this.f319484e;
            b0Var.r(s0Var, eVar);
            b0Var.p(s0Var, eVar);
        } else {
            androidx.appcompat.app.AppCompatActivity activity3 = b0Var.f319470e;
            kotlin.jvm.internal.o.g(activity3, "activity");
            pf5.z zVar = pf5.z.f353948a;
            androidx.lifecycle.c1 a17 = zVar.a(activity3).a(com.tencent.mm.plugin.mv.ui.uic.n0.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            com.tencent.mm.plugin.mv.ui.uic.n0 n0Var = (com.tencent.mm.plugin.mv.ui.uic.n0) a17;
            androidx.lifecycle.c1 a18 = zVar.a(activity3).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC.class);
            kotlin.jvm.internal.o.f(a18, "get(...)");
            com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC musicMvSongInfoUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvSongInfoUIC) a18;
            boolean i17 = kl3.t.g().a().i();
            fm3.j0 j0Var = fm3.j0.f264078a;
            if (i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "onSingleTap, stop music");
                b21.m.f();
                j0Var.k(activity3, n0Var.f151310i, 2);
                r45.bt4 bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                if (bt4Var != null) {
                    bt4Var.f371046q = android.os.SystemClock.elapsedRealtime();
                }
                r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                java.lang.Integer valueOf = bt4Var2 != null ? java.lang.Integer.valueOf(bt4Var2.f371048s + 1) : null;
                r45.bt4 bt4Var3 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                if (bt4Var3 != null) {
                    bt4Var3.f371048s = valueOf.intValue();
                }
                musicMvSongInfoUIC.T6();
                musicMvSongInfoUIC.U6();
                musicMvSongInfoUIC.P6();
                android.view.KeyEvent.Callback findViewById = s0Var.itemView.findViewById(com.tencent.mm.R.id.k0o);
                cVar = findViewById instanceof pk4.c ? (pk4.c) findViewById : null;
                if (cVar != null) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).a();
                }
            } else {
                if (kl3.t.g().a().g()) {
                    ((com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) zVar.a(activity3).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class)).c7(s0Var.getAdapterPosition());
                    kl3.t.g().a().resume();
                } else {
                    kl3.t.g().d(b21.m.b());
                }
                musicMvSongInfoUIC.Q6();
                musicMvSongInfoUIC.R6();
                musicMvSongInfoUIC.S6();
                android.view.KeyEvent.Callback findViewById2 = s0Var.itemView.findViewById(com.tencent.mm.R.id.k0o);
                cVar = findViewById2 instanceof pk4.c ? (pk4.c) findViewById2 : null;
                if (cVar != null) {
                    ((com.tencent.mm.plugin.thumbplayer.view.MultiMediaEffectVideoLayout) cVar).c();
                }
                j0Var.k(activity3, n0Var.f151310i, 1);
                r45.bt4 bt4Var4 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(activity3, 7, r45.bt4.class);
                if (bt4Var4 != null) {
                    long j17 = bt4Var4.f371046q;
                    if (j17 > 0) {
                        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
                        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MvItemConvert", "accumulate pauseTime:" + elapsedRealtime);
                        bt4Var4.f371045p = bt4Var4.f371045p + elapsedRealtime;
                        bt4Var4.f371046q = -1L;
                    }
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$ItemGestureListener", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return false;
    }
}
