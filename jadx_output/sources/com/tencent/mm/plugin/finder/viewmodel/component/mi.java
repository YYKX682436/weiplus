package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class mi implements zx2.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.bl f135174a;

    public mi(com.tencent.mm.plugin.finder.viewmodel.component.bl blVar) {
        this.f135174a = blVar;
    }

    @Override // zx2.o
    public void a(zx2.u t17) {
        android.widget.ImageView imageView;
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f477081a;
        if (obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.gi) {
            com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = (com.tencent.mm.plugin.finder.viewmodel.component.gi) obj;
            com.tencent.mm.plugin.finder.viewmodel.component.bl blVar = this.f135174a;
            boolean z17 = false;
            giVar.b(blVar.f133903s, false);
            giVar.a(true);
            r45.nx2 nx2Var = blVar.f7().f257506i;
            nx2Var.set(5, 0);
            nx2Var.set(4, java.lang.Integer.valueOf(blVar.f7().f257508n));
            nx2Var.set(3, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLRecommendTab") != null));
            nx2Var.set(2, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("TLFollow") != null));
            nx2Var.set(1, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("finder_tl_hot_tab") != null));
            nx2Var.set(0, java.lang.Boolean.valueOf(((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderEntrance") != null));
            androidx.appcompat.app.AppCompatActivity activity = blVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f353948a;
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC finderHomeUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class);
            int i17 = giVar.f134525b;
            finderHomeUIC.f7(i17, null);
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = giVar.f134529f;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 35 && (imageView = giVar.f134530g) != null) {
                        imageView.setVisibility(8);
                    }
                } else if (weImageView != null) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_location);
                }
            } else if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_little_like);
            }
            androidx.appcompat.app.AppCompatActivity activity2 = blVar.getActivity();
            if (activity2 != null && ((com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) && com.tencent.mm.ui.bk.v0() && (com.tencent.mm.ui.bk.P(activity2) || com.tencent.mm.ui.bk.N(activity2.getTaskId()) || (com.tencent.mm.ui.bk.O(activity2.getContentResolver()) && !activity2.isInMultiWindowMode())))) {
                z17 = true;
            }
            if (z17 || blVar.g7()) {
                return;
            }
            androidx.appcompat.app.AppCompatActivity activity3 = blVar.getActivity();
            kotlin.jvm.internal.o.g(activity3, "activity");
            ((com.tencent.mm.plugin.finder.viewmodel.component.gg) zVar.a(activity3).a(com.tencent.mm.plugin.finder.viewmodel.component.gg.class)).W6(!blVar.h7(i17), true);
        }
    }

    @Override // zx2.o
    public void b(zx2.u t17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView;
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f477081a;
        if (obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.gi) {
            com.tencent.mm.plugin.finder.viewmodel.component.gi giVar = (com.tencent.mm.plugin.finder.viewmodel.component.gi) obj;
            giVar.b(this.f135174a.f133904t, true);
            giVar.a(false);
            int i17 = giVar.f134525b;
            if (i17 != 1) {
                if (i17 == 2 && (weImageView = giVar.f134529f) != null) {
                    weImageView.setImageResource(com.tencent.mm.R.raw.icons_outlined_location);
                    return;
                }
                return;
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = giVar.f134529f;
            if (weImageView2 != null) {
                weImageView2.setImageResource(com.tencent.mm.R.raw.icons_outlined_little_like);
            }
        }
    }

    @Override // zx2.o
    public void c(zx2.u t17) {
        kotlin.jvm.internal.o.g(t17, "t");
    }
}
