package sg2;

/* loaded from: classes3.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407923d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407923d = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sg2.o(this.f407923d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f407923d;
        if (str == null || str.length() == 0) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sg2.x xVar = sg2.x.f407955a;
        sb6.append((java.lang.String) ((jz5.n) sg2.x.f407957c).getValue());
        sb6.append(com.tencent.mm.sdk.platformtools.w2.a(str));
        sb6.append(".zip");
        return sb6.toString();
    }
}
