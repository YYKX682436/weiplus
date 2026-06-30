package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class x0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI f152225d;

    public x0(com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI) {
        this.f152225d = nearbySayHiListUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        gm0.j1.b().c();
        xg3.c0 Zi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Zi();
        com.tencent.mm.plugin.nearby.ui.NearbySayHiListUI nearbySayHiListUI = this.f152225d;
        ((com.tencent.mm.storage.u8) Zi).y0(java.lang.String.valueOf(nearbySayHiListUI.f152121r));
        nearbySayHiListUI.f152111e.f();
        int i18 = nearbySayHiListUI.f152114h;
        if (i18 > 0) {
            nearbySayHiListUI.f152114h = i18 - 1;
        }
        if (nearbySayHiListUI.f152114h == 0) {
            android.widget.TextView textView = (android.widget.TextView) nearbySayHiListUI.findViewById(com.tencent.mm.R.id.dfo);
            textView.setText(com.tencent.mm.R.string.i8k);
            textView.setVisibility(0);
            nearbySayHiListUI.enableOptionMenu(false);
        }
    }
}
