package wh5;

/* loaded from: classes9.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wh5.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446107d = g0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wh5.x(this.f446107d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wh5.x xVar = (wh5.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashSet e76 = this.f446107d.e7();
        wh5.g0 g0Var = this.f446107d;
        synchronized (e76) {
            for (java.lang.String str : g0Var.e7()) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
                com.tencent.mars.xlog.Log.i("MediaGallery.ChatLiveStateManager", "cancel all download task, id: " + str);
            }
        }
        return jz5.f0.f302826a;
    }
}
