package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class h4 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f151160d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f151161e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f151162f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f151163g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f151164h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f151165i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f151166m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.view.i f151167n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.h3 f151168o;

    /* renamed from: p, reason: collision with root package name */
    public int f151169p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.music.player.base.k f151170q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.mv.ui.uic.g3 f151171r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ss4 f151172s;

    /* renamed from: t, reason: collision with root package name */
    public dm.i8 f151173t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f151174u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f151175v;

    /* renamed from: w, reason: collision with root package name */
    public kk4.d f151176w;

    /* renamed from: x, reason: collision with root package name */
    public int f151177x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f151160d = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.j3(this));
        this.f151161e = new java.util.ArrayList();
        this.f151162f = new java.util.ArrayList();
        this.f151163g = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.i3(this));
        this.f151164h = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.q3(activity));
        this.f151165i = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.d4(this));
        this.f151166m = jz5.h.b(new com.tencent.mm.plugin.mv.ui.uic.p3(activity));
        this.f151167n = new com.tencent.mm.plugin.mv.ui.view.i();
        this.f151168o = new com.tencent.mm.plugin.mv.ui.uic.h3(this);
        this.f151169p = -1;
        this.f151170q = new com.tencent.mm.plugin.mv.ui.uic.v3(this);
    }

    public static final void O6(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var, int i17) {
        androidx.appcompat.app.AppCompatActivity activity = h4Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.sdk.coroutines.LifecycleScope O6 = ((um3.b) a17).O6();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(O6, kotlinx.coroutines.internal.b0.f310484a, null, new com.tencent.mm.plugin.mv.ui.uic.b4(i17, h4Var, null), 2, null);
    }

    public final boolean P6() {
        java.util.ArrayList arrayList = this.f151161e;
        if ((arrayList instanceof java.util.Collection) && arrayList.isEmpty()) {
            return false;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((fm3.q) it.next()).f264114o != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:201:0x03ac, code lost:
    
        if (((r2 == null || r2.length() == 0) ? r13 : false) != false) goto L199;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0372 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x039b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.ss4 Q6(r45.ss4 r25) {
        /*
            Method dump skipped, instructions count: 1173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.mv.ui.uic.h4.Q6(r45.ss4):r45.ss4");
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter R6() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerAdapter) ((jz5.n) this.f151163g).getValue();
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView S6() {
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) this.f151160d).getValue();
    }

    public final void T6(int i17, fm3.q qVar, yz5.l lVar) {
        android.widget.ImageView imageView;
        android.view.View findViewByPosition = ((androidx.recyclerview.widget.LinearLayoutManager) ((jz5.n) this.f151164h).getValue()).findViewByPosition(i17);
        if (findViewByPosition == null || (imageView = (android.widget.ImageView) findViewByPosition.findViewById(com.tencent.mm.R.id.k1j)) == null) {
            return;
        }
        imageView.setVisibility(0);
        imageView.setAlpha(0.0f);
        fm3.n nVar = qVar.f264112m;
        if (nVar != null) {
            nVar.a(imageView, new com.tencent.mm.plugin.mv.ui.uic.t3(imageView, lVar));
        }
    }

    public final void U6() {
        gk4.b effector;
        kk4.b player;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "pauseVideo");
        androidx.recyclerview.widget.k3 p07 = S6().p0(this.f151169p);
        if (p07 == null) {
            return;
        }
        android.view.KeyEvent.Callback findViewById = p07.itemView.findViewById(com.tencent.mm.R.id.k0o);
        jk4.b bVar = null;
        kk4.d dVar = findViewById instanceof kk4.d ? (kk4.d) findViewById : null;
        if (dVar != null) {
            kk4.b player2 = dVar.getPlayer();
            if (player2 != null) {
                kk4.b.e(player2, null, 1, null);
            }
            kk4.b player3 = dVar.getPlayer();
            if (player3 != null) {
                player3.stop();
            }
        }
        int i17 = this.f151169p;
        if (i17 >= 0) {
            java.lang.Object obj = this.f151161e.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            fm3.q qVar = (fm3.q) obj;
            kk4.d dVar2 = this.f151176w;
            jk4.a aVar = (dVar2 == null || (player = dVar2.getPlayer()) == null) ? null : ((kk4.v) player).L;
            kk4.d dVar3 = this.f151176w;
            if (dVar3 != null && (effector = dVar3.getEffector()) != null) {
                bVar = ((gk4.h0) effector).f272558c;
            }
            fm3.j0.f264078a.j(getActivity(), this.f151172s, this.f151169p, qVar, aVar, bVar);
        }
    }

    public final void V6(int i17) {
        int i18 = this.f151169p;
        if (i17 != i18) {
            java.util.ArrayList arrayList = this.f151161e;
            fm3.q qVar = (fm3.q) kz5.n0.a0(arrayList, i18);
            lm3.a aVar = lm3.d.f319478h;
            if (qVar != null && qVar.f264110h) {
                qVar.f264110h = false;
                qVar.f264111i = false;
                androidx.recyclerview.widget.k3 p07 = S6().p0(this.f151169p);
                if (p07 instanceof in5.s0) {
                    aVar.a((in5.s0) p07, qVar);
                }
            }
            fm3.q qVar2 = (fm3.q) kz5.n0.a0(arrayList, i17);
            if (qVar2 == null || qVar2.f264110h) {
                return;
            }
            qVar2.f264110h = true;
            qVar2.f264111i = true;
            androidx.recyclerview.widget.k3 p08 = S6().p0(i17);
            if (p08 instanceof in5.s0) {
                aVar.a((in5.s0) p08, qVar2);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "onActivityResult, requestCodec:" + i17 + ", resultCodec:" + i18);
        if (i17 == 1024) {
            kl3.t.g().a().resume();
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new com.tencent.mm.plugin.mv.ui.uic.w3(this, intent, i18, null), 2, null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.c3.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        java.lang.Integer num = (java.lang.Integer) ((com.tencent.mm.plugin.mv.ui.uic.c3) a17).O6().getValue();
        if (num == null || num.intValue() != 0) {
            return false;
        }
        androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
        kotlin.jvm.internal.o.g(activity2, "activity");
        ((com.tencent.mm.plugin.mv.ui.uic.x6) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.mv.ui.uic.x6.class)).O6(Q6(this.f151172s), this.f151174u, 2);
        return true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        gk4.b effector;
        kk4.b player;
        kk4.d dVar = this.f151176w;
        if (dVar != null && (player = dVar.getPlayer()) != null) {
            player.recycle();
        }
        kk4.d dVar2 = this.f151176w;
        if (dVar2 == null || (effector = dVar2.getEffector()) == null) {
            return;
        }
        gk4.h0 h0Var = (gk4.h0) effector;
        com.tencent.mm.sdk.platformtools.n3 n3Var = h0Var.f272560e;
        if (n3Var != null) {
            n3Var.removeCallbacksAndMessages(null);
        }
        h0Var.e(new gk4.f0(h0Var));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        U6();
        kl3.t.g().f(this.f151170q);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "resumeVideo");
        R6().notifyItemChanged(this.f151167n.f151864m);
        kl3.t g17 = kl3.t.g();
        com.tencent.mm.plugin.music.player.base.k kVar = this.f151170q;
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
