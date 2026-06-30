package w82;

/* loaded from: classes12.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w82.b0 f443948d;

    public z(w82.b0 b0Var) {
        this.f443948d = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w82.b0 b0Var = this.f443948d;
        int i17 = b0Var.f443823n;
        if (i17 == 1 || i17 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavHeaderView", "click clear fav item");
            if (b0Var.f443818f != null) {
                int i18 = b0Var.f443823n;
                if (i18 == 1) {
                    str = b0Var.getContext().getString(com.tencent.mm.R.string.ntz, o72.x1.O((float) (b0Var.f443822m.longValue() - o72.x1.K())));
                } else if (i18 == 3) {
                    str = b0Var.getContext().getString(com.tencent.mm.R.string.f491741nu0, o72.x1.O((float) o72.x1.K()));
                } else {
                    str = "";
                }
                ((com.tencent.mm.plugin.fav.ui.FavoriteIndexUI) b0Var.f443818f).s7(str);
            }
        }
        b0Var.c("view_clk");
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavHeaderView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
