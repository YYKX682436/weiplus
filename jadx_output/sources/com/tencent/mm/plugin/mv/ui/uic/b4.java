package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f151049d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f151050e;

    /* renamed from: f, reason: collision with root package name */
    public long f151051f;

    /* renamed from: g, reason: collision with root package name */
    public int f151052g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f151053h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151054i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(int i17, com.tencent.mm.plugin.mv.ui.uic.h4 h4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151053h = i17;
        this.f151054i = h4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.b4(this.f151053h, this.f151054i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        fm3.q qVar;
        java.lang.Object g17;
        androidx.recyclerview.widget.k3 k3Var;
        long j17;
        gk4.b effector;
        kk4.b player;
        kk4.b player2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f151052g;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151054i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("refreshVideo: ");
            int i18 = this.f151053h;
            sb6.append(i18);
            sb6.append(' ');
            sb6.append(h4Var.f151169p);
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Mv.MusicMvMakerFixEditUIC", sb6.toString(), new java.lang.Object[0]);
            if (h4Var.f151169p >= 0) {
                kk4.d dVar = h4Var.f151176w;
                if ((dVar == null || (player2 = dVar.getPlayer()) == null || !((kk4.v) player2).s()) ? false : true) {
                    java.lang.Object obj2 = h4Var.f151161e.get(h4Var.f151169p);
                    kotlin.jvm.internal.o.f(obj2, "get(...)");
                    fm3.q qVar2 = (fm3.q) obj2;
                    kk4.d dVar2 = h4Var.f151176w;
                    jk4.a aVar2 = (dVar2 == null || (player = dVar2.getPlayer()) == null) ? null : ((kk4.v) player).L;
                    kk4.d dVar3 = h4Var.f151176w;
                    fm3.j0.f264078a.j(h4Var.getActivity(), h4Var.f151172s, h4Var.f151169p, qVar2, aVar2, (dVar3 == null || (effector = dVar3.getEffector()) == null) ? null : ((gk4.h0) effector).f272558c);
                }
            }
            androidx.recyclerview.widget.k3 p07 = h4Var.S6().p0(i18);
            if (p07 == null) {
                return f0Var;
            }
            java.lang.Object obj3 = h4Var.f151161e.get(i18);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            qVar = (fm3.q) obj3;
            h4Var.f151169p = i18;
            if (qVar.f264111i) {
                kl3.t.g().a().c(qVar.f264107e);
            }
            fm3.o oVar = qVar.f264113n;
            long d17 = oVar != null ? oVar.d() : 0L;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            com.tencent.mm.plugin.mv.ui.uic.a4 a4Var = new com.tencent.mm.plugin.mv.ui.uic.a4(qVar, null);
            this.f151049d = p07;
            this.f151050e = qVar;
            this.f151051f = d17;
            this.f151052g = 1;
            g17 = kotlinx.coroutines.l.g(p0Var, a4Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            long j18 = d17;
            k3Var = p07;
            j17 = j18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f151051f;
            fm3.q qVar3 = (fm3.q) this.f151050e;
            androidx.recyclerview.widget.k3 k3Var2 = (androidx.recyclerview.widget.k3) this.f151049d;
            kotlin.ResultKt.throwOnFailure(obj);
            k3Var = k3Var2;
            qVar = qVar3;
            g17 = obj;
        }
        dk4.a aVar3 = (dk4.a) g17;
        if (aVar3 == null) {
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvMakerFixEditUIC", "refreshVideo mediaInfo:" + aVar3);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) k3Var.itemView.findViewById(com.tencent.mm.R.id.oy7);
        java.lang.Object obj4 = h4Var.f151176w;
        android.view.View view = obj4 instanceof android.view.View ? (android.view.View) obj4 : null;
        if ((view != null ? view.getParent() : null) != null) {
            java.lang.Object obj5 = h4Var.f151176w;
            android.view.View view2 = obj5 instanceof android.view.View ? (android.view.View) obj5 : null;
            android.view.ViewParent parent = view2 != null ? view2.getParent() : null;
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                java.lang.Object obj6 = h4Var.f151176w;
                kotlin.jvm.internal.o.e(obj6, "null cannot be cast to non-null type android.view.View");
                viewGroup.removeView((android.view.View) obj6);
            }
        }
        frameLayout.removeAllViews();
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        java.lang.Object obj7 = h4Var.f151176w;
        android.view.View view3 = obj7 instanceof android.view.View ? (android.view.View) obj7 : null;
        if (view3 != null) {
            frameLayout.addView(view3, layoutParams);
        }
        ((android.widget.ProgressBar) k3Var.itemView.findViewById(com.tencent.mm.R.id.kp6)).setProgress(0);
        kk4.d dVar4 = h4Var.f151176w;
        if (dVar4 != 0) {
            ((com.tencent.mm.plugin.thumbplayer.view.MMTPVideoLayout) dVar4).d();
            android.view.View view4 = dVar4 instanceof android.view.View ? (android.view.View) dVar4 : null;
            if (view4 != null) {
                view4.setKeepScreenOn(true);
            }
            kk4.b player3 = dVar4.getPlayer();
            if (player3 != null) {
                ((kk4.v) player3).R();
            }
            dVar4.setMediaInfo(aVar3);
            kk4.b player4 = dVar4.getPlayer();
            if (player4 != null) {
                ((kk4.v) player4).f308585j = true;
            }
            kk4.b player5 = dVar4.getPlayer();
            if (player5 != null) {
                ((kk4.v) player5).C(true);
            }
            kk4.b player6 = dVar4.getPlayer();
            if (player6 != null) {
                ((kk4.v) player6).A(true);
            }
            gk4.b.a(dVar4.getEffector(), 0.0f, 1, null);
            kk4.b player7 = dVar4.getPlayer();
            if (player7 != null) {
                ((kk4.v) player7).H(j17, (qVar.f264108f - qVar.f264107e) + j17);
            }
            kk4.b player8 = dVar4.getPlayer();
            if (player8 != null) {
                ((kk4.v) player8).O();
            }
            kk4.b player9 = dVar4.getPlayer();
            if (player9 != null) {
                ((kk4.v) player9).I(new com.tencent.mm.plugin.mv.ui.uic.z3(qVar, j17, k3Var), 30L);
            }
        }
        return f0Var;
    }
}
