package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class ek implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.fk f123678a;

    public ek(com.tencent.mm.plugin.finder.profile.uic.fk fkVar) {
        this.f123678a = fkVar;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("Finder.FinderTingProfileFragmentUIC", "OpenLiteApp fail");
        db5.t7.makeText(this.f123678a.getActivity(), com.tencent.mm.R.string.ggb, 0).show();
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("Finder.FinderTingProfileFragmentUIC", "OpenLiteApp success");
    }
}
