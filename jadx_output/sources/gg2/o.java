package gg2;

/* loaded from: classes2.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.q f271704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.wk5 f271705e;

    public o(gg2.q qVar, r45.wk5 wk5Var) {
        this.f271704d = qVar;
        this.f271705e = wk5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        java.lang.String l17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderCoupon$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 18);
        gg2.q qVar = this.f271704d;
        tc2.g gVar = qVar.f271664a;
        in5.s0 s0Var = gVar.f417149i;
        if (s0Var == null || (view2 = s0Var.itemView) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderCoupon$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) gVar.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        java.lang.String string = this.f271705e.getString(0);
        java.lang.String str = "";
        if (string == null) {
            string = "";
        }
        qVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = qVar.f271664a.f417148h;
        if (baseFinderFeed != null && (feedObject = baseFinderFeed.getFeedObject()) != null && (liveInfo = feedObject.getLiveInfo()) != null && (l17 = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) != null) {
            str = l17;
        }
        hashMap.put("liveid", str);
        hashMap.put("guide_bar_txt", string);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.T2, hashMap, null, null, null, null, false, 124, null);
        qVar.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderCoupon$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
