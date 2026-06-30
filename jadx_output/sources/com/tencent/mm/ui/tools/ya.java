package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ya implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f210929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210930e;

    public ya(com.tencent.mm.ui.tools.ShowImageUI showImageUI, java.util.ArrayList arrayList) {
        this.f210930e = showImageUI;
        this.f210929d = arrayList;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210930e;
        g4Var.h(1, showImageUI.getString(com.tencent.mm.R.string.i29), com.tencent.mm.R.raw.icons_filled_share, showImageUI.getResources().getColor(com.tencent.mm.R.color.f478502m));
        java.util.ArrayList arrayList = this.f210929d;
        arrayList.add(1);
        if (showImageUI.f210191d) {
            j45.l.g("favorite");
            g4Var.h(3, showImageUI.getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.bottomsheet_icon_fav, 0);
            arrayList.add(2);
        }
    }
}
