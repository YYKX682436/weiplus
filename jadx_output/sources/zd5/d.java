package zd5;

/* loaded from: classes9.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ae5.j f471671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f471672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f471673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ae5.j jVar, kotlin.jvm.internal.h0 h0Var, androidx.recyclerview.widget.k3 k3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471671d = jVar;
        this.f471672e = h0Var;
        this.f471673f = k3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd5.d(this.f471671d, this.f471672e, this.f471673f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zd5.d dVar = (zd5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ae5.j jVar = this.f471671d;
        java.lang.String str2 = jVar.f4417g;
        if (str2 != null) {
            if (r26.i0.o(str2, "hd", false, 2, null)) {
                str = jVar.f4417g;
            } else {
                str = jVar.f4417g + "hd";
            }
            str2 = str;
            if (com.tencent.mm.vfs.w6.k(str2) == 0) {
                str2 = str2.substring(0, str2.length() - 2);
                kotlin.jvm.internal.o.f(str2, "substring(...)");
            }
        }
        androidx.recyclerview.widget.k3 k3Var = this.f471673f;
        this.f471672e.f310123d = com.tencent.mm.sdk.platformtools.x.L(str2, ((zd5.r) k3Var).f471709i.getWidth(), ((zd5.r) k3Var).f471709i.getHeight());
        return jz5.f0.f302826a;
    }
}
