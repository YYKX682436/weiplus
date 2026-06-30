package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class wk extends ym5.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderSnsHeaderView f133298d;

    public wk(com.tencent.mm.plugin.finder.view.FinderSnsHeaderView finderSnsHeaderView) {
        this.f133298d = finderSnsHeaderView;
    }

    @Override // ym5.w, ym5.m1
    public void onChanged() {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.rk(this.f133298d));
    }

    @Override // ym5.w, ym5.m1
    public void onItemRangeChanged(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.sk(this.f133298d, i17, i18));
    }

    @Override // ym5.w, ym5.m1
    public void onItemRangeInserted(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.uk(this.f133298d, i17, i18));
    }

    @Override // ym5.w, ym5.m1
    public void onItemRangeRemoved(int i17, int i18) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.vk(this.f133298d, i17, i18));
    }

    @Override // ym5.w, ym5.m1
    public void onItemRangeChanged(int i17, int i18, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.tk(this.f133298d, i17, i18, obj));
    }
}
