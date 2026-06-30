package w82;

/* loaded from: classes11.dex */
public class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView f443836d;

    public d0(com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView) {
        this.f443836d = favSearchActionView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = this.f443836d;
        if (favSearchActionView.f101554i == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        favSearchActionView.f101550e.o();
        favSearchActionView.f101550e.g();
        ((java.util.LinkedList) favSearchActionView.f101553h).clear();
        ((java.util.LinkedList) favSearchActionView.f101552g).clear();
        ((com.tencent.mm.plugin.fav.ui.j5) favSearchActionView.f101554i).a(favSearchActionView.f101551f, favSearchActionView.f101553h, favSearchActionView.f101552g, true);
        favSearchActionView.b();
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavSearchActionView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
