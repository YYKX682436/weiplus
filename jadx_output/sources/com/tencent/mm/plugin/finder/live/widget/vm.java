package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class vm implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wm f120075d;

    public vm(com.tencent.mm.plugin.finder.live.widget.wm wmVar) {
        this.f120075d = wmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.widget.wm wmVar = this.f120075d;
        java.lang.String str = wmVar.f120212m;
        java.lang.String str2 = wmVar.f120208f;
        if (str == null) {
            com.tencent.mars.xlog.Log.e(str2, "handleClick - giftId is null");
        } else {
            com.tencent.mars.xlog.Log.i(str2, "handleClick - giftId=".concat(str));
            dk2.u7 u7Var = dk2.u7.f234181a;
            ce2.i e17 = u7Var.e(str);
            if (e17 != null) {
                u7Var.a(e17);
            }
            android.content.Context context = wmVar.f120206d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            if (wmVar.k(context, 1, str)) {
                com.tencent.mm.plugin.finder.live.widget.wm.m(wmVar, null, str, 1, 1, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveKTVSendFlowerEntranceWidget$setupLongClickListener$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
