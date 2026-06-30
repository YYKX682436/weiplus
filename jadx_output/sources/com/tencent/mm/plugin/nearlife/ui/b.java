package com.tencent.mm.plugin.nearlife.ui;

/* loaded from: classes15.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearlife.ui.BaseLifeUI f152314d;

    public b(com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI) {
        this.f152314d = baseLifeUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.nearlife.ui.BaseLifeUI baseLifeUI = this.f152314d;
        if (baseLifeUI.f152244t == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BaseLifeUI", "Location is null");
            yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11138, "1", java.lang.Integer.valueOf(baseLifeUI.f152235h.getCount() + 1), baseLifeUI.F);
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(baseLifeUI, com.tencent.mm.plugin.nearlife.ui.NearLifeCreatePoiUI.class);
        intent.putExtra("get_lat", baseLifeUI.f152244t.f372175e);
        intent.putExtra("get_lng", baseLifeUI.f152244t.f372174d);
        intent.putExtra("get_preci", baseLifeUI.f152244t.f372176f);
        intent.putExtra("get_poi_name", baseLifeUI.f152235h.f152310r);
        intent.putExtra("get_cur_lat", baseLifeUI.f152245u);
        intent.putExtra("get_cur_lng", baseLifeUI.f152246v);
        intent.putExtra("get_accuracy", baseLifeUI.f152248x);
        intent.putExtra("get_loctype", baseLifeUI.f152247w);
        intent.putExtra("search_id", baseLifeUI.F);
        intent.putExtra("get_is_mars", baseLifeUI.f152249y);
        baseLifeUI.startActivityForResult(intent, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/nearlife/ui/BaseLifeUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
