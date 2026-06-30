package of1;

/* loaded from: classes7.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f344928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344929e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344930f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344931g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f344929e = str;
        this.f344930f = str2;
        this.f344931g = str3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new of1.h0(this.f344929e, this.f344930f, this.f344931g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((of1.h0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f344928d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(ft.j4.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String str = this.f344929e;
            java.lang.String str2 = this.f344930f;
            java.lang.String str3 = this.f344931g;
            this.f344928d = 1;
            obj = com.tencent.mm.plugin.appbrand.jsapi.webview.i.f83891a.a(str, str2, str3, null, null, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
