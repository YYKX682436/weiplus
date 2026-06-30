package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class q6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f151386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.t6 f151387e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(com.tencent.mm.plugin.mv.ui.uic.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f151387e = t6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.mv.ui.uic.q6(this.f151387e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.mv.ui.uic.q6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f151386d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.mv.ui.uic.t6 t6Var = this.f151387e;
            androidx.appcompat.app.AppCompatActivity activity = t6Var.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            java.util.LinkedList P6 = ((com.tencent.mm.plugin.mv.ui.uic.h6) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.h6.class)).P6();
            t6Var.getClass();
            kotlin.jvm.internal.o.g(P6, "<set-?>");
            t6Var.f151462g = P6;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initBgTrackView size:");
            sb6.append(t6Var.f151460e.size());
            sb6.append(", mediaInfoList.size:");
            sb6.append(t6Var.f151462g.size());
            sb6.append(", trackData?.refObjectList.size:");
            r45.ss4 ss4Var = t6Var.f151459d;
            sb6.append((ss4Var == null || (list = ss4Var.getList(1)) == null) ? null : new java.lang.Integer(list.size()));
            com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvPreviewTrackUIC", sb6.toString());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.mv.ui.uic.p6 p6Var = new com.tencent.mm.plugin.mv.ui.uic.p6(t6Var, null);
            this.f151386d = 1;
            if (kotlinx.coroutines.l.g(g3Var, p6Var, this) == aVar) {
                return aVar;
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
