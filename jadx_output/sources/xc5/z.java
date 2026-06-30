package xc5;

/* loaded from: classes12.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453602e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(xc5.h0 h0Var, mf3.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453601d = h0Var;
        this.f453602e = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.z(this.f453601d, this.f453602e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        xc5.z zVar = (xc5.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        zVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xc5.h0 h0Var = this.f453601d;
        h0Var.f453467y = false;
        lg3.a aVar2 = h0Var.f453465w;
        if (aVar2 != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(this.f453602e, new vf3.f(vf3.e.f436382i, null, 0, 0.0f, 14, null));
        }
        h0Var.a0();
        return jz5.f0.f302826a;
    }
}
