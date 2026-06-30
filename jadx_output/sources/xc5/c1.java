package xc5;

/* loaded from: classes9.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(xc5.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453405d = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.c1(this.f453405d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.c1 c1Var = (xc5.c1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.HashSet h76 = this.f453405d.h7();
        xc5.k1 k1Var = this.f453405d;
        synchronized (h76) {
            for (java.lang.String str : k1Var.h7()) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
                com.tencent.mars.xlog.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "cancel all download task, id=" + str);
            }
        }
        return jz5.f0.f302826a;
    }
}
