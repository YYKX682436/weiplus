package gg2;

/* loaded from: classes2.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg2.q f271706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.px3 f271707e;

    public p(gg2.q qVar, r45.px3 px3Var) {
        this.f271706d = qVar;
        this.f271707e = px3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.view.View view2;
        java.lang.String str;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.nw1 liveInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_DO_ACTION", 17);
        gg2.q qVar = this.f271706d;
        tc2.g gVar = qVar.f271664a;
        in5.s0 s0Var = gVar.f417149i;
        if (s0Var == null || (view2 = s0Var.itemView) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        uc2.i iVar = (uc2.i) gVar.b(uc2.i.class);
        if (iVar != null) {
            ((sb2.o) iVar).Y6(view2, intent);
        }
        qVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = qVar.f271664a.f417148h;
        if (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null || (str = java.lang.Long.valueOf(liveInfo.getLong(0)).toString()) == null) {
            str = "";
        }
        hashMap.put("liveid", str);
        r45.px3 px3Var = this.f271707e;
        hashMap.put("guide_bar_type", java.lang.String.valueOf(px3Var.getInteger(3)));
        java.lang.String string = px3Var.getString(1);
        hashMap.put("guide_bar_txt", string != null ? string : "");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.S2, hashMap, null, null, null, null, false, 124, null);
        qVar.k();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/exp/LiveExpTwelveItem$renderProducts$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
