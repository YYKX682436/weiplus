package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class wc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.yc f120170e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f120171f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(com.tencent.mm.plugin.finder.live.widget.yc ycVar, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120170e = ycVar;
        this.f120171f = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.wc(this.f120170e, this.f120171f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.wc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120169d;
        com.tencent.mm.plugin.finder.live.widget.yc ycVar = this.f120170e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.widget.sc scVar = ycVar.f120432a.f119628j;
            com.tencent.mm.plugin.finder.live.widget.sc scVar2 = com.tencent.mm.plugin.finder.live.widget.sc.f119749d;
            android.widget.ImageView imageView = ycVar.f120436e;
            android.widget.ImageView imageView2 = ycVar.f120435d;
            if (scVar == scVar2) {
                imageView2.setVisibility(0);
                imageView.setVisibility(8);
            } else {
                imageView2.setVisibility(8);
                imageView.setVisibility(0);
            }
            android.view.View view = ycVar.f120433b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$showWidget$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveCommonGuideWidget$showWidget$2$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.widget.PopupWindow popupWindow = ycVar.f120434c;
            android.view.View view2 = this.f120171f;
            popupWindow.showAtLocation(view2, 51, 0, 0);
            popupWindow.setOnDismissListener(null);
            ycVar.f120433b.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.finder.live.widget.vc(ycVar, view2));
            long j17 = ycVar.f120432a.f119629k;
            this.f120169d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ycVar.f120432a.f119620b.invoke();
        ycVar.f120434c.dismiss();
        kotlinx.coroutines.r2 r2Var = ycVar.f120438g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
