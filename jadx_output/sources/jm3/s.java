package jm3;

/* loaded from: classes10.dex */
public final class s implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvMakerUI f300350d;

    public s(com.tencent.mm.plugin.mv.ui.MusicMvMakerUI musicMvMakerUI) {
        this.f300350d = musicMvMakerUI;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        com.tencent.mm.plugin.mv.ui.MusicMvMakerUI activity = this.f300350d;
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        androidx.lifecycle.c1 a17 = zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.v4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        androidx.lifecycle.c1 a18 = zVar.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h4.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = (com.tencent.mm.plugin.mv.ui.uic.h4) a18;
        jz5.g gVar = ((com.tencent.mm.plugin.mv.ui.uic.v4) a17).f151493m;
        if (num != null && num.intValue() == 1) {
            ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setVisibility(0);
            h4Var.S6().setVisibility(8);
            int i17 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z6 = activity.Z6();
            if (Z6 != null) {
                if (!Z6.D) {
                    com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.r(Z6, Z6.f151625l1, Z6.f151641x1, false, null, null, 28, null);
                }
                Z6.W = 3;
                Z6.l();
                Z6.p(true, 2000);
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment = Z6.f151638w;
                if (musicMvTabMachineFragment != null) {
                    musicMvTabMachineFragment.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment = Z6.f151639x;
                if (musicMvTabMyPostFragment != null) {
                    musicMvTabMyPostFragment.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment = Z6.f151642y;
                if (musicMvTabMyFavFragment != null) {
                    musicMvTabMyFavFragment.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment = Z6.f151645z;
                if (musicMvTabMyLikeFragment != null) {
                    musicMvTabMyLikeFragment.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment = Z6.f151629p;
                if (musicMvTabSearchFragment != null) {
                    musicMvTabSearchFragment.getAdapter().notifyDataSetChanged();
                    return;
                }
                return;
            }
            return;
        }
        if (num != null && num.intValue() == 0) {
            ((com.tencent.mm.view.recyclerview.WxRecyclerView) ((jz5.n) gVar).getValue()).setVisibility(8);
            h4Var.S6().setVisibility(0);
            if (h4Var.f151167n.f151864m == -1) {
                h4Var.S6().post(new com.tencent.mm.plugin.mv.ui.uic.x3(h4Var));
            }
            int i18 = com.tencent.mm.plugin.mv.ui.MusicMvMakerUI.f150868u;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView Z62 = activity.Z6();
            if (Z62 != null) {
                if (!Z62.D) {
                    com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.r(Z62, Z62.f151641x1, Z62.f151625l1, false, null, null, 28, null);
                }
                Z62.W = 2;
                Z62.l();
                Z62.p(false, com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.B1);
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMachineFragment musicMvTabMachineFragment2 = Z62.f151638w;
                if (musicMvTabMachineFragment2 != null) {
                    musicMvTabMachineFragment2.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyPostFragment musicMvTabMyPostFragment2 = Z62.f151639x;
                if (musicMvTabMyPostFragment2 != null) {
                    musicMvTabMyPostFragment2.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyFavFragment musicMvTabMyFavFragment2 = Z62.f151642y;
                if (musicMvTabMyFavFragment2 != null) {
                    musicMvTabMyFavFragment2.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabMyLikeFragment musicMvTabMyLikeFragment2 = Z62.f151645z;
                if (musicMvTabMyLikeFragment2 != null) {
                    musicMvTabMyLikeFragment2.getAdapter().notifyDataSetChanged();
                }
                com.tencent.mm.plugin.mv.ui.view.MusicMvTabSearchFragment musicMvTabSearchFragment2 = Z62.f151629p;
                if (musicMvTabSearchFragment2 != null) {
                    musicMvTabSearchFragment2.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
