package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class hd implements com.tencent.mm.plugin.finder.view.nd {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.kd f132233a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.id f132234b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.dd f132235c;

    public hd(com.tencent.mm.plugin.finder.view.kd kdVar, com.tencent.mm.plugin.finder.view.id idVar, com.tencent.mm.plugin.finder.view.dd ddVar) {
        this.f132233a = kdVar;
        this.f132234b = idVar;
        this.f132235c = ddVar;
    }

    @Override // com.tencent.mm.plugin.finder.view.nd
    public void a(cm2.k0 item, com.tencent.mm.plugin.finder.view.FinderLiveShoppingCouponView view) {
        kotlin.jvm.internal.o.g(item, "item");
        kotlin.jvm.internal.o.g(view, "view");
        if (item.f43360v.getInteger(21) != 2) {
            com.tencent.mars.xlog.Log.e("FinderLiveNoticeSuccessView", "#refreshView ops, click_button_action=" + item.f43360v.getInteger(21) + ". can not do anything.");
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        com.tencent.mm.plugin.finder.view.kd kdVar = this.f132233a;
        java.lang.String str = kdVar.f132495q;
        com.tencent.mm.plugin.finder.view.id idVar = this.f132234b;
        java.lang.String e17 = xy2.c.e(idVar.f132300d);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str2 = item.f43362x;
        if (str2 == null) {
            str2 = "";
        }
        linkedList.add(str2);
        com.tencent.mm.plugin.finder.view.dd ddVar = this.f132235c;
        s40.w0.Fa(w0Var, 0L, 0L, str, e17, null, linkedList, ddVar.f131890b, idVar.f132300d, false, new com.tencent.mm.plugin.finder.view.gd(item, view, kdVar, ddVar), 256, null);
    }
}
