package hu3;

/* loaded from: classes5.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285125d = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.g(this.f285125d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hu3.g gVar = (hu3.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeImageReader:");
        hu3.n0 n0Var = this.f285125d;
        sb6.append(n0Var.f285169p);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfessionalTemplateCorePlugin", sb6.toString());
        android.media.ImageReader imageReader = n0Var.f285169p;
        if (imageReader != null) {
            imageReader.close();
        }
        n0Var.f285169p = null;
        return jz5.f0.f302826a;
    }
}
