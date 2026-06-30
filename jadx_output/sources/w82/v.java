package w82;

/* loaded from: classes10.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel f443936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel) {
        super(1);
        this.f443936d = favFilterPanel;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l lVar;
        w82.l option = (w82.l) obj;
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel = this.f443936d;
        android.widget.TextView textView = favFilterPanel.f101532h;
        if (textView != null) {
            textView.setText(option.f443907a);
        }
        favFilterPanel.e(favFilterPanel.f101534m, true);
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel.b(favFilterPanel, false, null, 3, null);
        w82.n nVar = option instanceof w82.n ? (w82.n) option : null;
        if (nVar != null && (lVar = favFilterPanel.f101545x) != null) {
            lVar.invoke(java.lang.Integer.valueOf(nVar.f443914c));
        }
        favFilterPanel.setSelectedSortIndex(kz5.n0.c0(favFilterPanel.f101547z, option));
        return jz5.f0.f302826a;
    }
}
