package te2;

/* loaded from: classes2.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a0 f418518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f418519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418520g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(te2.a0 a0Var, android.widget.FrameLayout frameLayout, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418518e = a0Var;
        this.f418519f = frameLayout;
        this.f418520g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te2.x(this.f418518e, this.f418519f, this.f418520g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418517d;
        te2.a0 a0Var = this.f418518e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onPagAnimationStart scope launch");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f418519f, "translationX", (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x / 2) - ym5.x.a(a0Var.f417844d.getContext(), 36.0f), 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.start();
            android.view.View view = a0Var.f417844d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f418517d = 1;
            if (kotlinx.coroutines.k1.b(1250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f418517d = 2;
        if (te2.a0.a(this.f418520g, a0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
