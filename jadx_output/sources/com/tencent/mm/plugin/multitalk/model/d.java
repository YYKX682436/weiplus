package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.j f149904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.multitalk.model.j jVar) {
        super(1);
        this.f149904d = jVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView;
        sj3.b5 elementPrev;
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView2;
        java.lang.String wxUserName = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(wxUserName, "wxUserName");
        com.tencent.mm.plugin.multitalk.model.j jVar = this.f149904d;
        java.lang.Integer num = (java.lang.Integer) jVar.f150010m.get(wxUserName);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 3) {
                sj3.j g17 = jVar.g(wxUserName);
                if (g17 != null && (multitalkFrameView2 = g17.f408577d) != null) {
                    multitalkFrameView2.c();
                }
                jVar.f150010m.put(wxUserName, 4);
                jVar.h().g(2, wxUserName);
                com.tencent.mm.plugin.multitalk.model.a2 n17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                if (n17 != null) {
                    com.tencent.mm.plugin.multitalk.model.c cVar = new com.tencent.mm.plugin.multitalk.model.c(jVar);
                    jj3.j jVar2 = n17.e().f272397i;
                    jVar2.getClass();
                    jVar2.f300021f.put(wxUserName, cVar);
                }
                zj3.g.f473302a.b(4, 2);
                zj3.g.f473322u.b();
                com.tencent.mm.plugin.multitalk.model.k kVar = jVar.f150007g;
                if (kVar != null) {
                    sj3.a5 a5Var = (sj3.a5) kVar;
                    java.lang.Boolean bool = java.lang.Boolean.TRUE;
                    a5Var.w(bool);
                    a5Var.o();
                    com.tencent.mm.plugin.multitalk.ui.widget.CollapseView collapseView = a5Var.H;
                    if (collapseView != null && a5Var.L) {
                        collapseView.f150310f.setTag(bool);
                        collapseView.a(collapseView.f150313i);
                        android.view.ViewPropertyAnimator animate = collapseView.f150310f.animate();
                        long j17 = collapseView.f150309e;
                        animate.setDuration(j17).rotation(270);
                        collapseView.f150320s.setTag(bool);
                        android.widget.ImageButton imageButton = collapseView.f150320s;
                        sj3.p pVar = new sj3.p(collapseView, imageButton, sj3.i1.f408570o - sj3.i1.f408566k);
                        pVar.setDuration(j17);
                        imageButton.startAnimation(pVar);
                    }
                }
                sj3.j g18 = jVar.g(wxUserName);
                if (g18 != null) {
                    g18.B = true;
                    uj3.g gVar = g18.f408596z;
                    if (gVar != null) {
                        gVar.b();
                    }
                }
                android.widget.FrameLayout frameLayout = jVar.f150005e;
                r3 = frameLayout != null ? frameLayout.getLayoutParams() : null;
                kotlin.jvm.internal.o.e(r3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) r3;
                com.tencent.mm.plugin.multitalk.model.k kVar2 = jVar.f150007g;
                layoutParams.topMargin = kVar2 != null ? com.tencent.mm.ui.bk.p(((sj3.a5) kVar2).f408417d) : 0;
                android.widget.FrameLayout frameLayout2 = jVar.f150005e;
                if (frameLayout2 != null) {
                    frameLayout2.setLayoutParams(layoutParams);
                }
                android.widget.FrameLayout frameLayout3 = jVar.f150005e;
                if (frameLayout3 != null) {
                    frameLayout3.setVisibility(0);
                }
                androidx.recyclerview.widget.RecyclerView recyclerView = jVar.f150004d;
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                }
                sj3.j jVar3 = jVar.f150008h;
                if (jVar3 != null) {
                    jVar3.i();
                    jVar.f150013p = true;
                    com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView3 = jVar3.f408577d;
                    if (multitalkFrameView3 != null) {
                        multitalkFrameView3.g(wxUserName, zj3.j.c(wxUserName));
                        multitalkFrameView3.e();
                        sj3.j g19 = jVar.g(wxUserName);
                        if (g19 != null) {
                            com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView4 = g19.f408577d;
                            if (multitalkFrameView4 != null && (elementPrev = multitalkFrameView4.getElementPrev()) != null) {
                                multitalkFrameView3.h(elementPrev);
                            }
                            if (g19.f408595y == 2) {
                                sj3.j jVar4 = jVar.f150008h;
                                if (jVar4 != null) {
                                    jVar4.j(true);
                                }
                                sj3.j jVar5 = jVar.f150008h;
                                if (jVar5 != null) {
                                    jVar5.n(true, true);
                                }
                            }
                        }
                    }
                    jVar3.n(false, true);
                }
                android.widget.RelativeLayout relativeLayout = jVar.f150006f;
                if (relativeLayout != null) {
                    android.view.ViewGroup.LayoutParams layoutParams2 = relativeLayout.getLayoutParams();
                    kotlin.jvm.internal.o.e(layoutParams2, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    android.widget.FrameLayout.LayoutParams layoutParams3 = (android.widget.FrameLayout.LayoutParams) layoutParams2;
                    layoutParams3.width = -1;
                    layoutParams3.height = -1;
                    layoutParams3.leftMargin = 0;
                    layoutParams3.rightMargin = 0;
                    relativeLayout.setLayoutParams(layoutParams3);
                    relativeLayout.setVisibility(0);
                    com.tencent.mm.plugin.multitalk.model.k kVar3 = jVar.f150007g;
                    if (kVar3 != null) {
                        zj3.j jVar6 = zj3.j.f473337a;
                        android.content.Context context = relativeLayout.getContext();
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        sj3.j jVar7 = jVar.f150008h;
                        if (jVar7 == null || (multitalkFrameView = jVar7.f408577d) == null || (str = multitalkFrameView.getF150345n()) == null) {
                            str = "";
                        }
                        ((sj3.a5) kVar3).r(jVar6.f(context, str), false);
                    }
                }
                if (!kotlin.jvm.internal.o.b(wxUserName, c01.z1.b())) {
                    com.tencent.mm.plugin.multitalk.model.e3.Ri().getClass();
                }
                com.tencent.mm.plugin.multitalk.model.a2 n18 = com.tencent.mm.plugin.multitalk.model.e3.Ri().n();
                if (n18 != null) {
                    n18.h(wxUserName);
                }
                java.lang.String str2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
            } else if (intValue != 4) {
                com.tencent.mars.xlog.Log.e("AvatarViewManager", "unable to trans from " + num.intValue() + " to ScreenCastBig");
            } else {
                com.tencent.mars.xlog.Log.i("AvatarViewManager", "trans state from screen cast big to screen cast big");
            }
            r3 = f0Var;
        }
        if (r3 == null) {
            com.tencent.mars.xlog.Log.e("AvatarViewManager", "unable trans state to screen cast big");
        }
        return f0Var;
    }
}
