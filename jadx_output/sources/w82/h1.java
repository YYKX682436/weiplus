package w82;

/* loaded from: classes12.dex */
public class h1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavVideoView f443884d;

    public h1(com.tencent.mm.plugin.fav.ui.widget.FavVideoView favVideoView) {
        this.f443884d = favVideoView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavVideoView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        w82.p1 p1Var = this.f443884d.E;
        if (p1Var != null) {
            p1Var.finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavVideoView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
