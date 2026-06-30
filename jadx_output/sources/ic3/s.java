package ic3;

/* loaded from: classes12.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity f290419d;

    public s(com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity) {
        this.f290419d = magicAdServiceDemoActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity magicAdServiceDemoActivity = this.f290419d;
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.U6(magicAdServiceDemoActivity, "force clean ads");
        ((wj.j0) ((xj.i) i95.n0.c(xj.i.class))).Ni();
        ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).getClass();
        com.tencent.mm.sdk.platformtools.o4 N = com.tencent.mm.sdk.platformtools.o4.N("recent_use_app_mmkv", 2, null);
        if (N != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "removeExposedRecord: ".concat(""));
            N.remove("");
            int i17 = com.tencent.mm.sdk.platformtools.z.f193112h;
            if ((i17 == 788529167 || i17 == 788529166) || z65.c.a()) {
                N.d();
                com.tencent.mars.xlog.Log.i("MicroMsg.OpenByOtherMMKV", "removeExposedRecord: , clearAll");
            }
        }
        com.tencent.mm.plugin.magicbrush.ad.MagicAdServiceDemoActivity.T6(magicAdServiceDemoActivity);
        yj0.a.h(this, "com/tencent/mm/plugin/magicbrush/ad/MagicAdServiceDemoActivity$buttonDataList$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
