package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class wf implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI f129988d;

    public wf(com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI finderSelectDistrictUI) {
        this.f129988d = finderSelectDistrictUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI.f128689m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("complete location ");
        com.tencent.mm.plugin.finder.ui.FinderSelectDistrictUI finderSelectDistrictUI = this.f129988d;
        sb6.append(finderSelectDistrictUI.f128691e);
        sb6.append(' ');
        sb6.append(finderSelectDistrictUI.f128692f);
        sb6.append(' ');
        sb6.append(finderSelectDistrictUI.f128693g);
        com.tencent.mars.xlog.Log.i(finderSelectDistrictUI.f128690d, sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Country", finderSelectDistrictUI.f128691e);
        intent.putExtra("Contact_Province", finderSelectDistrictUI.f128692f);
        intent.putExtra("Contact_City", finderSelectDistrictUI.f128693g);
        finderSelectDistrictUI.setResult(-1, intent);
        finderSelectDistrictUI.finish();
        return true;
    }
}
