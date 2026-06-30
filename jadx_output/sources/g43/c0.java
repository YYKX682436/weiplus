package g43;

/* loaded from: classes5.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268746d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268747e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.j0 f268748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str, java.lang.String str2, androidx.lifecycle.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268746d = str;
        this.f268747e = str2;
        this.f268748f = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.c0(this.f268746d, this.f268747e, this.f268748f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g43.c0 c0Var = (g43.c0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        c0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        a43.k kVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        synchronized (a43.k.class) {
            if (a43.k.f1222c == null) {
                a43.k.f1222c = new a43.k();
            }
            kVar = a43.k.f1222c;
        }
        kVar.a(this.f268746d, this.f268747e, 0, new g43.b0(this.f268748f));
        return jz5.f0.f302826a;
    }
}
