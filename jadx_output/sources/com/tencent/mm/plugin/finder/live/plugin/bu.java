package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f112072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f112073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f112073e = ivVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.bu(this.f112073e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.bu) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f112072d;
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f112073e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f112072d = 1;
            obj = com.tencent.mm.plugin.finder.live.plugin.iv.u1(ivVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.List singerList = (java.util.List) obj;
        if (!(singerList == null || singerList.isEmpty())) {
            com.tencent.mm.plugin.finder.live.widget.wv wvVar = (com.tencent.mm.plugin.finder.live.widget.wv) ((jz5.n) ivVar.X).getValue();
            wvVar.getClass();
            kotlin.jvm.internal.o.g(singerList, "singerList");
            if (!singerList.isEmpty()) {
                android.view.View view = wvVar.f120241f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveSingerListWidget", "updateSingerList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveSingerListWidget", "updateSingerList", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                wvVar.f120239d.setVisibility(0);
                com.tencent.mm.plugin.finder.live.widget.k80 k80Var = wvVar.f120237b;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) k80Var.f118823e;
                arrayList2.clear();
                if (!singerList.isEmpty()) {
                    arrayList2.add(new com.tencent.mm.plugin.finder.live.widget.f80(0, null));
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(singerList, 10));
                    java.util.Iterator it = singerList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new com.tencent.mm.plugin.finder.live.widget.f80(k80Var.f118824f, (r45.px1) it.next()));
                    }
                    arrayList2.addAll(arrayList3);
                    k80Var.notifyDataSetChanged();
                }
            }
            oa.i k17 = ivVar.F.k(1);
            if (k17 != null) {
                k17.b();
            }
            ivVar.f113027y1 = singerList.size();
            ivVar.E1();
        }
        return jz5.f0.f302826a;
    }
}
