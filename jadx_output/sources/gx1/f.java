package gx1;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.g f277297d;

    public f(gx1.g gVar) {
        this.f277297d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorLocationItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix1.e eVar = (ix1.e) this.f277297d.f277303e;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 2);
        intent.putExtra("kwebmap_slat", eVar.f295331t);
        intent.putExtra("kwebmap_lng", eVar.f295332u);
        intent.putExtra("kPoiName", eVar.f295330s);
        intent.putExtra("Kwebmap_locaion", eVar.f295334w);
        double d17 = eVar.f295333v;
        if (d17 >= 0.0d) {
            intent.putExtra("kwebmap_scale", d17);
        }
        intent.putExtra("kisUsername", "");
        intent.putExtra("kwebmap_from_to", true);
        intent.putExtra("KFavLocSigleView", true);
        intent.putExtra("kFavCanDel", false);
        intent.putExtra("kFavCanRemark", false);
        intent.putExtra("kPoiid", eVar.f295335x);
        intent.putExtra("KIsFromPoiList", eVar.f295336y);
        intent.putExtra("KPoiCategoryTips", eVar.f295337z);
        intent.putExtra("kPoiBusinessHour", eVar.A);
        intent.putExtra("KPoiPhone", eVar.B);
        intent.putExtra("KPoiPriceTips", eVar.C);
        intent.putExtra("kBuildingID", eVar.D);
        intent.putExtra("kFloorName", eVar.E);
        j45.l.j(com.tencent.mm.sdk.platformtools.x2.f193071a, ya.b.LOCATION, ".ui.RedirectUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorLocationItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
