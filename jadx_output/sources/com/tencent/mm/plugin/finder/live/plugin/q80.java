package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q80 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x80 f113972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q80(com.tencent.mm.plugin.finder.live.plugin.x80 x80Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113972e = x80Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.q80(this.f113972e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.q80) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f113971d;
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = this.f113972e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.view.View view = x80Var.f115056w;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$checkFrameScaleTipsShow$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveScreenClearPlugin$checkFrameScaleTipsShow$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            x80Var.y1(1);
            this.f113971d = 1;
            if (kotlinx.coroutines.k1.b(5000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        x80Var.v1();
        return jz5.f0.f302826a;
    }
}
