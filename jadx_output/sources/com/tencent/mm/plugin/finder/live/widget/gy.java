package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes12.dex */
public final class gy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f118480d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget f118481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f118482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gy(xg2.h hVar, kotlin.coroutines.Continuation continuation, com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget, r45.xn1 xn1Var) {
        super(2, continuation);
        this.f118480d = hVar;
        this.f118481e = finderLiveVisitorActiveDetailWidget;
        this.f118482f = xn1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.gy(this.f118480d, continuation, this.f118481e, this.f118482f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.gy gyVar = (com.tencent.mm.plugin.finder.live.widget.gy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gyVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.t41 t41Var = (r45.t41) ((xg2.i) this.f118480d).f454393b;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget finderLiveVisitorActiveDetailWidget = this.f118481e;
        java.lang.String str = finderLiveVisitorActiveDetailWidget.f117693d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showDetailWidget success nick: ");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) this.f118482f.getCustom(0);
        sb6.append(finderContact != null ? finderContact.getNickname() : null);
        sb6.append(" audience_live_info: ");
        r45.mu0 mu0Var = (r45.mu0) t41Var.getCustom(1);
        sb6.append(mu0Var != null ? mu0Var.toJSON() : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.mu0 mu0Var2 = (r45.mu0) t41Var.getCustom(1);
        if (mu0Var2 != null && (list = mu0Var2.getList(0)) != null) {
            if (list.size() > 0) {
                finderLiveVisitorActiveDetailWidget.getClass();
                if (list.size() > 0) {
                    android.view.View view = finderLiveVisitorActiveDetailWidget.f117695f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorActiveDetailWidget", "showItemWidget", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveVisitorActiveDetailWidget", "showItemWidget", "(Ljava/util/LinkedList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    finderLiveVisitorActiveDetailWidget.f117696g.setVisibility(0);
                    androidx.recyclerview.widget.k kVar = finderLiveVisitorActiveDetailWidget.f117697h.f12200d;
                    int i17 = kVar.f12106f + 1;
                    kVar.f12106f = i17;
                    java.util.List list2 = kVar.f12104d;
                    if (list != list2) {
                        if (list2 == null) {
                            kVar.f12104d = list;
                            kVar.f12105e = java.util.Collections.unmodifiableList(list);
                            kVar.f12101a.b(0, list.size());
                        } else {
                            kVar.f12102b.f12017a.execute(new androidx.recyclerview.widget.i(kVar, list2, list, i17));
                        }
                    }
                } else {
                    finderLiveVisitorActiveDetailWidget.setVisibility(8);
                }
            } else {
                finderLiveVisitorActiveDetailWidget.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
