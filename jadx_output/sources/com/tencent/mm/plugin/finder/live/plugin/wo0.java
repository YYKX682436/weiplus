package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class wo0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f114984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ep0 f114985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f114987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f114988h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var, android.view.View view, android.graphics.Rect rect, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114985e = ep0Var;
        this.f114986f = view;
        this.f114987g = rect;
        this.f114988h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.wo0(this.f114985e, this.f114986f, this.f114987g, this.f114988h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.wo0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f114984d;
        android.graphics.Rect rect = this.f114987g;
        android.view.View view = this.f114986f;
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var = this.f114985e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f114984d = 1;
            ep0Var.getClass();
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(0.0f, 0.0f);
            path.cubicTo(0.25f, 0.1f, 0.25f, 0.1f, 1.0f, 1.0f);
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(path);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.hhb);
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.u49);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.3f);
            ofFloat.addUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.qo0(view, rect));
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(findViewById, "alpha", 1.0f, 0.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setInterpolator(pathInterpolator);
            animatorSet.setDuration(333L);
            animatorSet.addListener(new com.tencent.mm.plugin.finder.live.plugin.ro0(nVar));
            animatorSet.start();
            java.lang.Object j17 = rVar.j();
            if (j17 != aVar) {
                j17 = f0Var;
            }
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                this.f114988h.invoke();
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f114984d = 2;
        ep0Var.getClass();
        kotlinx.coroutines.r rVar2 = new kotlinx.coroutines.r(pz5.f.b(this), 1);
        rVar2.k();
        v65.n nVar2 = new v65.n(rVar2);
        android.graphics.Path path2 = new android.graphics.Path();
        path2.moveTo(0.0f, 0.0f);
        path2.cubicTo(0.25f, 0.1f, 0.25f, 0.1f, 1.0f, 1.0f);
        android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(path2);
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.hal);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view.findViewById(com.tencent.mm.R.id.u49), "alpha", 1.0f, 0.0f);
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(0.3f, 0.0f);
        ofFloat4.addUpdateListener(new com.tencent.mm.plugin.finder.live.plugin.so0(view, rect, findViewById3));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setInterpolator(pathInterpolator2);
        animatorSet2.setDuration(666L);
        animatorSet2.addListener(new com.tencent.mm.plugin.finder.live.plugin.to0(nVar2));
        animatorSet2.start();
        java.lang.Object j18 = rVar2.j();
        if (j18 != aVar) {
            j18 = f0Var;
        }
        if (j18 == aVar) {
            return aVar;
        }
        this.f114988h.invoke();
        return f0Var;
    }
}
