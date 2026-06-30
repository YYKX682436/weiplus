package re2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f394461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f394462e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ re2.w f394463f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f394464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f394465h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, re2.w wVar, yz5.l lVar, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f394462e = str;
        this.f394463f = wVar;
        this.f394464g = lVar;
        this.f394465h = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new re2.p(this.f394462e, this.f394463f, this.f394464g, this.f394465h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((re2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f394461d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                zl2.r4 r4Var = zl2.r4.f473950a;
                java.lang.String str2 = this.f394462e;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                this.f394461d = 1;
                obj = r4Var.p3(str2, context, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            str = (java.lang.String) obj;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("Finder.CoLiveAvatarMerger", "doUpload: upLoadImg threw: " + th6.getMessage());
            str = null;
        }
        this.f394463f.f394498d.post(new re2.o(str, this.f394464g, this.f394465h));
        return jz5.f0.f302826a;
    }
}
