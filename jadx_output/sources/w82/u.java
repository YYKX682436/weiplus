package w82;

/* loaded from: classes10.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel f443933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel) {
        super(1);
        this.f443933d = favFilterPanel;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.l lVar;
        w82.l option = (w82.l) obj;
        kotlin.jvm.internal.o.g(option, "option");
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel favFilterPanel = this.f443933d;
        android.widget.TextView textView = favFilterPanel.f101531g;
        if (textView != null) {
            textView.setText(option.f443907a);
        }
        favFilterPanel.e(favFilterPanel.f101533i, true);
        com.tencent.mm.plugin.fav.ui.widget.FavFilterPanel.b(favFilterPanel, false, null, 3, null);
        w82.m mVar = option instanceof w82.m ? (w82.m) option : null;
        if (mVar != null && (lVar = favFilterPanel.f101544w) != null) {
            lVar.invoke(mVar.f443912c);
        }
        favFilterPanel.setSelectedTypeIndex(kz5.n0.c0(favFilterPanel.f101546y, option));
        return jz5.f0.f302826a;
    }
}
