package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ic implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210498e;

    public ic(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, java.util.ArrayList arrayList) {
        this.f210498e = showVideoUI;
        this.f210497d = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210498e;
        if (!showVideoUI.f210229q) {
            if (com.tencent.mm.vfs.w6.j(showVideoUI.f210220e)) {
                g4Var.add(0, 1, 0, showVideoUI.getString(com.tencent.mm.R.string.ccw));
            }
            if (showVideoUI.f210230r) {
                g4Var.add(0, 3, 0, showVideoUI.getString(com.tencent.mm.R.string.mfz));
            }
            g4Var.add(0, 2, 0, showVideoUI.getString(com.tencent.mm.R.string.i8d));
            return;
        }
        boolean j17 = com.tencent.mm.vfs.w6.j(showVideoUI.f210220e);
        java.util.ArrayList arrayList = this.f210497d;
        if (j17) {
            g4Var.h(1, showVideoUI.getString(com.tencent.mm.R.string.i29), com.tencent.mm.R.raw.icons_filled_share, showVideoUI.getResources().getColor(com.tencent.mm.R.color.f478502m));
            arrayList.add(1);
        }
        if (showVideoUI.f210230r) {
            g4Var.h(3, showVideoUI.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
            arrayList.add(2);
        }
    }
}
