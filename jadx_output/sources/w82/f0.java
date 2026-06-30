package w82;

/* loaded from: classes8.dex */
public class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance f443840d;

    public f0(com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance favTagEntrance) {
        this.f443840d = favTagEntrance;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_fav_scene", 1);
        com.tencent.mm.plugin.fav.ui.widget.FavTagEntrance favTagEntrance = this.f443840d;
        intent.putExtra("key_fav_item_id", favTagEntrance.f101557e);
        o72.x1.L0(favTagEntrance.getContext(), ".ui.FavTagEditUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTagEntrance$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
