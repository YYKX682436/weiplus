package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f120067d;

    public vg(com.tencent.mm.plugin.finder.live.widget.bh bhVar, int i17, int i18) {
        this.f120067d = bhVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String superFansCntDesc;
        java.lang.String allFansCntDesc;
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f120067d;
        int i18 = bhVar.K;
        int itemId = menuItem.getItemId();
        android.widget.TextView textView = bhVar.G;
        if (itemId == 0) {
            bhVar.K = 1;
            allFansCntDesc = bhVar.getAllFansCntDesc();
            textView.setText(allFansCntDesc);
        } else if (itemId == 1) {
            bhVar.K = 2;
            superFansCntDesc = bhVar.getSuperFansCntDesc();
            textView.setText(superFansCntDesc);
        }
        if (i18 != bhVar.K) {
            bhVar.j();
        }
    }
}
