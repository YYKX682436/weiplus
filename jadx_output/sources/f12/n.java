package f12;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258646d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f21.d0 f258647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, f21.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f258646d = str;
        this.f258647e = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f12.n(this.f258646d, this.f258647e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f12.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f258646d;
        sb6.append(str);
        sb6.append('/');
        f21.d0 d0Var = this.f258647e;
        sb6.append(d0Var.f258860o);
        if (!com.tencent.mm.vfs.w6.j(sb6.toString())) {
            return null;
        }
        return com.tencent.mm.sdk.platformtools.x.J(str + '/' + d0Var.f258860o, null);
    }
}
