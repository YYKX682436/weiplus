package hr3;

/* loaded from: classes10.dex */
public final class ed implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI f283522d;

    public ed(com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI, int i17) {
        this.f283522d = recommendDeleteContactUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.profile.ui.RecommendDeleteContactUI recommendDeleteContactUI = this.f283522d;
        java.util.List list = recommendDeleteContactUI.f153799s.f453011d;
        int i17 = 0;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((xb5.a) it.next()).f453008f && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RecommendDeleteContactUI", "showDeleteTipsBottomSheet: count:%s", java.lang.Integer.valueOf(i17));
        g4Var.d(1, recommendDeleteContactUI.getContext().getResources().getColor(com.tencent.mm.R.color.f479483a32), recommendDeleteContactUI.getContext().getString(com.tencent.mm.R.string.mf9, java.lang.String.valueOf(i17)));
    }
}
