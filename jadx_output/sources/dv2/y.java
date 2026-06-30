package dv2;

/* loaded from: classes2.dex */
public final class y extends zx2.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dv2.b0 f243973b;

    public y(dv2.b0 b0Var) {
        this.f243973b = b0Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List fragments() {
        return kz5.c0.d(new com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment(0, true, 1 == true ? 1 : 0, null), new com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment(102, true), new com.tencent.mm.plugin.finder.ui.fragment.FinderAllFeedGridFragment(100, true), new com.tencent.mm.plugin.finder.ui.fav.FinderGlobalMixFavFragment());
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public boolean isDynamic() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public zx2.a0 tabContainer() {
        return new dv2.a0(this.f243973b);
    }

    @Override // com.tencent.mm.plugin.finder.view.tabcomp.FinderTabProvider, com.tencent.mm.plugin.finder.view.tabcomp.IFinderTabProvider
    public java.util.List tabs() {
        dv2.b0 b0Var = this.f243973b;
        dv2.z zVar = new dv2.z(b0Var, b0Var.getString(com.tencent.mm.R.string.f491930lw0), 0, 0, 7, this.f243973b.getString(com.tencent.mm.R.string.f491930lw0));
        dv2.b0 b0Var2 = this.f243973b;
        dv2.z zVar2 = new dv2.z(b0Var2, "", com.tencent.mm.R.raw.icons_filled_channels_like_thick, com.tencent.mm.R.raw.icons_filled_channels_like_bold, 1, b0Var2.getString(com.tencent.mm.R.string.mhu));
        dv2.b0 b0Var3 = this.f243973b;
        dv2.z zVar3 = new dv2.z(b0Var3, "", com.tencent.mm.R.raw.icons_outlined_star_new, com.tencent.mm.R.raw.icons_outlined_star_new_bold, 2, b0Var3.getString(com.tencent.mm.R.string.f492090ms5));
        dv2.b0 b0Var4 = this.f243973b;
        return kz5.c0.d(zVar, zVar2, zVar3, new dv2.z(b0Var4, "", com.tencent.mm.R.raw.icons_filled_channels_fav_thick, com.tencent.mm.R.raw.icons_filled_channels_fav_bold, 4, b0Var4.getString(com.tencent.mm.R.string.c__)));
    }
}
