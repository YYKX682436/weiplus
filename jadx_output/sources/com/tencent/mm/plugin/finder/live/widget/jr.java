package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class jr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.mr f118772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(com.tencent.mm.plugin.finder.live.widget.mr mrVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118772e = mrVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.jr(this.f118772e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.jr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object j17;
        java.util.List list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118771d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.widget.mr mrVar = this.f118772e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.widget.TextView textView = mrVar.S;
            if (textView == null) {
                kotlin.jvm.internal.o.o("poiTxt");
                throw null;
            }
            textView.setText("");
            com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout = mrVar.T;
            if (finderLiveLocSingleTagLayout == null) {
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            if (finderLiveLocSingleTagLayout.getTagCount() > 0) {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout2 = mrVar.T;
                if (finderLiveLocSingleTagLayout2 != null) {
                    finderLiveLocSingleTagLayout2.setVisibility(0);
                    return f0Var;
                }
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            zl2.r4 r4Var = zl2.r4.f473950a;
            gk2.e eVar = mrVar.H;
            this.f118771d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            pf5.u uVar = pf5.u.f353936a;
            if (((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).N6()) {
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "#requestLocationLikeByUser begin");
                jz5.l P6 = ((ey2.k0) ((ya2.o1) uVar.e(zy2.b6.class).c(ya2.o1.class))).P6();
                r45.d64 d64Var = new r45.d64();
                d64Var.f372174d = ((java.lang.Number) P6.f302833d).floatValue();
                d64Var.f372175e = ((java.lang.Number) P6.f302834e).floatValue();
                d64Var.f372179i = 0;
                d64Var.f372176f = 1;
                ((dn3.f) ((w25.f) i95.n0.c(w25.f.class))).wi(7, d64Var, false, new zl2.e3(rVar, d64Var));
            } else {
                com.tencent.mars.xlog.Log.i("FinderLiveUtil", "#requestLocationLikeByUser no permission");
                rVar.resumeWith(kotlin.Result.m521constructorimpl(null));
            }
            j17 = rVar.j();
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        jz5.l lVar = (jz5.l) j17;
        if (lVar == null || (list = (java.util.List) lVar.f302834e) == null || !(true ^ list.isEmpty())) {
            list = null;
        }
        r45.ze2 ze2Var = lVar != null ? (r45.ze2) lVar.f302833d : null;
        if (ze2Var == null || list == null) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout3 = mrVar.T;
            if (finderLiveLocSingleTagLayout3 == null) {
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            finderLiveLocSingleTagLayout3.o();
            com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout4 = mrVar.T;
            if (finderLiveLocSingleTagLayout4 == null) {
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(finderLiveLocSingleTagLayout4, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(finderLiveLocSingleTagLayout4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$refreshPoiView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            finderLiveLocSingleTagLayout4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(finderLiveLocSingleTagLayout4, "com/tencent/mm/plugin/finder/live/widget/FinderLivePostStrengthenPanel$refreshPoiView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(finderLiveLocSingleTagLayout4, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout5 = mrVar.T;
            if (finderLiveLocSingleTagLayout5 == null) {
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            finderLiveLocSingleTagLayout5.o();
            int i18 = 0;
            for (java.lang.Object obj2 : kz5.n0.K0(list, 5)) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.c64 c64Var = (r45.c64) obj2;
                com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout6 = mrVar.T;
                if (finderLiveLocSingleTagLayout6 == null) {
                    kotlin.jvm.internal.o.o("poiFlow");
                    throw null;
                }
                java.lang.String Title = c64Var.f371311e;
                kotlin.jvm.internal.o.f(Title, "Title");
                finderLiveLocSingleTagLayout6.d(Title, false);
                i18 = i19;
            }
            com.tencent.mm.plugin.finder.live.widget.FinderLiveLocSingleTagLayout finderLiveLocSingleTagLayout7 = mrVar.T;
            if (finderLiveLocSingleTagLayout7 == null) {
                kotlin.jvm.internal.o.o("poiFlow");
                throw null;
            }
            finderLiveLocSingleTagLayout7.setOnTagClickListener(new com.tencent.mm.plugin.finder.live.widget.ir(mrVar, list, ze2Var));
        }
        return f0Var;
    }
}
