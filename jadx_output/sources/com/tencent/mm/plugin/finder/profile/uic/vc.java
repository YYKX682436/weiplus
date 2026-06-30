package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class vc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f124296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.xc f124297e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(android.view.View view, com.tencent.mm.plugin.finder.profile.uic.xc xcVar) {
        super(1);
        this.f124296d = view;
        this.f124297e = xcVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.extension.reddot.a it = (com.tencent.mm.plugin.finder.extension.reddot.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        boolean z17 = it.f105327a;
        android.view.View view = this.f124296d;
        if (z17) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("FinderProfilePostUIC", "createLiveReddot Finder_PersonalCenter_StartLive expose, time:" + c01.id.c());
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = it.f105329c;
            if (jbVar != null) {
                zy2.fa.K0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), jbVar, "finder.personalcenter.startlive", c01.id.c(), false, 8, null);
            }
            com.tencent.mm.plugin.finder.profile.uic.xc xcVar = this.f124297e;
            if (!xcVar.f124359n) {
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                ll2.e.f319133a.j("finder.personalcenter.startlive", true);
                xcVar.f124359n = true;
                c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                ml2.c1 c1Var = ml2.c1.f327325e;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", 1);
                jSONObject.put(ya.b.SOURCE, 2);
                ((b92.g1) acVar).Ai("finder.personalcenter.startlive", 60L, jSONObject);
            }
        } else if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/uic/FinderProfilePostUIC$showPostBtn$5", "invoke", "(Lcom/tencent/mm/plugin/finder/extension/reddot/BaseRedDotResult;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}
