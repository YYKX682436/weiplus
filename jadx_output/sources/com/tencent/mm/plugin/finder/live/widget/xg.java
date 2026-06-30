package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class xg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f120323d;

    public xg(com.tencent.mm.plugin.finder.live.widget.bh bhVar, int i17, int i18) {
        this.f120323d = bhVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f120323d;
        int i18 = bhVar.L;
        int itemId = menuItem.getItemId();
        android.widget.TextView textView = bhVar.H;
        if (itemId == 0) {
            bhVar.L = 1;
            textView.setText(bhVar.getContext().getString(com.tencent.mm.R.string.f491523lu2));
        } else if (itemId == 1) {
            bhVar.L = 2;
            textView.setText(bhVar.getContext().getString(com.tencent.mm.R.string.luo));
        }
        if (i18 != bhVar.L) {
            bhVar.j();
        }
    }
}
