package xc5;

/* loaded from: classes12.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f453396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xc5.h0 h0Var, mf3.k kVar, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453394d = h0Var;
        this.f453395e = kVar;
        this.f453396f = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.b0(this.f453394d, this.f453395e, this.f453396f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        lg3.a aVar;
        pz5.a aVar2 = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xc5.h0 h0Var = this.f453394d;
        boolean z17 = h0Var.f453467y;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (z17 && (aVar = h0Var.f453465w) != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(this.f453395e, new vf3.f(vf3.e.f436380g, null, 0, this.f453396f, 6, null));
        }
        return f0Var;
    }
}
