package w82;

/* loaded from: classes11.dex */
public class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTagPanel f443904d;

    public k0(com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel) {
        this.f443904d = favTagPanel;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagPanel", "fav tag panel, on click call");
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        com.tencent.mm.plugin.fav.ui.widget.FavTagPanel favTagPanel = this.f443904d;
        if (intValue == 0) {
            int i17 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
            favTagPanel.u((android.widget.TextView) view, true, false);
            if (favTagPanel.N != null) {
                view.post(new w82.i0(this, view));
            }
        } else {
            int i18 = com.tencent.mm.plugin.fav.ui.widget.FavTagPanel.Q;
            favTagPanel.u((android.widget.TextView) view, false, false);
            if (favTagPanel.N != null) {
                view.post(new w82.j0(this, view));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTagPanel$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
