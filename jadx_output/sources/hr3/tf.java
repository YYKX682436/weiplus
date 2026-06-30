package hr3;

/* loaded from: classes.dex */
public final class tf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f284029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f284031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(yz5.p pVar, java.lang.String str, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f284029d = pVar;
        this.f284030e = str;
        this.f284031f = bitmap;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.tf(this.f284029d, this.f284030e, this.f284031f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.tf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        yz5.p pVar = this.f284029d;
        if (pVar == null) {
            return null;
        }
        pVar.invoke(this.f284030e, this.f284031f);
        return jz5.f0.f302826a;
    }
}
