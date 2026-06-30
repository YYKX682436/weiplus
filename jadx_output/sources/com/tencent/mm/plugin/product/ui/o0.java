package com.tencent.mm.plugin.product.ui;

/* loaded from: classes15.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI f153322d;

    public o0(com.tencent.mm.plugin.product.ui.MallProductSelectSkuUI mallProductSelectSkuUI) {
        this.f153322d = mallProductSelectSkuUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.product.ui.w wVar = this.f153322d.f153227s;
        boolean z17 = wVar.f153365e;
        android.app.Activity activity = wVar.f153364d;
        if (z17) {
            db5.t7.makeText(activity, com.tencent.mm.R.string.grp, 1).show();
        } else {
            wq3.j jVar = wVar.f153367g;
            if (!jVar.a()) {
                java.util.Map map = jVar.f448562o;
                if (map != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    int size = hashMap.size();
                    int i17 = jVar.f448560m;
                    if (size < i17 && i17 > 0) {
                        java.util.Iterator it = jVar.f448549b.f448599e.f456072t.iterator();
                        while (it.hasNext()) {
                            xq3.m mVar = (xq3.m) it.next();
                            if (!hashMap.containsKey(mVar.f456102d)) {
                                str = mVar.f456103e;
                                break;
                            }
                        }
                    }
                }
                str = null;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    db5.t7.makeText(activity, activity.getString(com.tencent.mm.R.string.grx, str), 0).show();
                }
            } else if (jVar.f448556i != null) {
                gm0.j1.i();
                gm0.j1.n().f273288b.g(new wq3.q(jVar.i(), com.tencent.mm.plugin.product.ui.w.f153363m));
            } else {
                j45.l.m(activity, "address", ".ui.WalletAddAddressUI", 2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
