package ni2;

/* loaded from: classes3.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f337473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.w f337474e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ni2.w wVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f337474e = wVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ni2.u(this.f337474e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f337473d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.f437823i;
            android.widget.ImageView imageView = this.f337474e.f337492p;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("ivBgPkRanklist");
                throw null;
            }
            this.f337473d = 1;
            if (sVar.c(hVar, imageView, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
