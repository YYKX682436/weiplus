package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class k4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f118806e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l71 f118807f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.q4 f118808g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(com.tencent.mm.protocal.protobuf.FinderObject finderObject, r45.l71 l71Var, com.tencent.mm.plugin.finder.live.widget.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118806e = finderObject;
        this.f118807f = l71Var;
        this.f118808g = q4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.k4(this.f118806e, this.f118807f, this.f118808g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.k4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.l71 l71Var;
        boolean z17;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        com.tencent.mm.protocal.protobuf.FinderMedia first;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118805d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f118806e;
            com.tencent.mm.plugin.finder.live.widget.q4 q4Var = this.f118808g;
            if (finderObject == null || (l71Var = this.f118807f) == null) {
                android.view.View view = q4Var.f119484a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = q4Var.f119484a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget$refreshFeed$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                if (pm0.v.z((int) l71Var.getLong(33), 2)) {
                    ae2.in inVar = ae2.in.f3688a;
                    z17 = true;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3776i7).getValue()).r()).intValue() == 1) {
                        this.f118805d = 1;
                        if (com.tencent.mm.plugin.finder.live.widget.q4.b(q4Var, finderObject, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    z17 = true;
                }
                android.view.View view3 = q4Var.f119490g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = q4Var.f119491h;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAfterReplayWidget", "showUIV1", "(Lcom/tencent/mm/protocal/protobuf/FinderObject;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
                r45.mb4 mb4Var = null;
                java.lang.String description = objectDesc != null ? objectDesc.getDescription() : null;
                if (description != null && description.length() != 0) {
                    z17 = false;
                }
                android.widget.TextView textView = q4Var.f119488e;
                if (z17) {
                    textView.setVisibility(8);
                } else {
                    textView.setVisibility(0);
                    textView.setText(description);
                }
                com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = finderObject.getObjectDesc();
                if (objectDesc2 != null && (media = objectDesc2.getMedia()) != null && (first = media.getFirst()) != null) {
                    mb4Var = bu2.z.i(first);
                }
                r45.mb4 mb4Var2 = mb4Var;
                if (mb4Var2 != null) {
                    boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mb4Var2.getString(16));
                    mn2.g1 g1Var = mn2.g1.f329975a;
                    android.widget.ImageView imageView = q4Var.f119487d;
                    if (K0) {
                        g1Var.e().c(new mn2.c1(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128356f, null, null, 12, null), imageView, g1Var.h(mn2.f1.B));
                    } else {
                        g1Var.e().c(new mn2.r3(mb4Var2, com.tencent.mm.plugin.finder.storage.y90.f128355e, null, 4, null), imageView, g1Var.h(mn2.f1.B));
                    }
                }
                com.tencent.mm.plugin.finder.live.widget.n4 n4Var = new com.tencent.mm.plugin.finder.live.widget.n4(q4Var, finderObject);
                android.widget.TextView textView2 = q4Var.f119489f;
                textView2.setOnClickListener(n4Var);
                com.tencent.mm.ui.fk.a(textView2);
                java.util.HashMap hashMap = new java.util.HashMap();
                com.tencent.mm.plugin.finder.live.plugin.oo0 oo0Var = q4Var.f119485b;
                hashMap.put("finder_username", oo0Var.Y().f410646a);
                hashMap.put("liveid", java.lang.String.valueOf(oo0Var.Y().f410659n.getLong(0)));
                hashMap.put("ref_objectid", java.lang.String.valueOf(finderObject.getId()));
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.u1 u1Var = ml2.u1.f328080r2;
                ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
                java.lang.String b17 = b52.b.b();
                if (b17 == null) {
                    b17 = "";
                }
                zy2.zb.I8(zbVar, u1Var, hashMap, b17, "1002", null, null, false, 112, null);
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
