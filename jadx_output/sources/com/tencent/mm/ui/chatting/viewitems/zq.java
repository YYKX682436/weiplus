package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class zq implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.es f206173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f206174e;

    public zq(com.tencent.mm.ui.chatting.viewitems.es esVar, yz5.p pVar) {
        this.f206173d = esVar;
        this.f206174e = pVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateUtil", "setClickJumpToPayDetailListener to weapp");
        java.lang.Object tag = view.getTag();
        com.tencent.mm.ui.chatting.viewitems.er erVar = tag instanceof com.tencent.mm.ui.chatting.viewitems.er ? (com.tencent.mm.ui.chatting.viewitems.er) tag : null;
        if ((erVar != null ? erVar.c() : null) != null) {
            com.tencent.mm.ui.chatting.viewitems.es esVar = this.f206173d;
            if ((esVar != null ? esVar.f203936f : null) != null) {
                com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.storage.f9 c17 = erVar.c();
                sb6.append(c17 != null ? java.lang.Long.valueOf(c17.I0()) : null);
                sb6.append(':');
                sb6.append(erVar.f203906b);
                sb6.append(':');
                sb6.append(esVar.f203936f.x());
                sb6.append(':');
                sb6.append(esVar.f203935e);
                appBrandStatObject.f87791g = sb6.toString();
                if (((com.tencent.mm.plugin.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Bi(erVar.f203906b)) {
                    java.lang.String str = esVar.f203935e;
                    appBrandStatObject.f87790f = (str == null || !r26.i0.y(str, "SUBSCRIPTION", false)) ? 1014 : 1107;
                    ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).aj(esVar.f203936f.g(), esVar.f203931a, null, esVar.f203933c, esVar.f203934d, esVar.f203932b, appBrandStatObject);
                } else {
                    appBrandStatObject.f87790f = 1043;
                    this.f206174e.invoke(erVar.f203906b, appBrandStatObject);
                }
                yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DyeingTemplateUtil", "tplPayDetailLayout param has null !");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/DyeingTemplateUtil$payRecepitDetailClickJumpToWeapp$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
