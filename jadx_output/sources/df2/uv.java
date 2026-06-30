package df2;

/* loaded from: classes.dex */
public final class uv extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f231559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv(android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231559e = view;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.uv(this.f231559e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.uv) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f231558d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f231558d = 1;
            if (kotlinx.coroutines.k1.b(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.view.View view = this.f231559e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController$onLiveStart$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveVipTagController$onLiveStart$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}
