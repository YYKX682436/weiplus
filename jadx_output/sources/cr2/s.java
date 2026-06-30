package cr2;

/* loaded from: classes2.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f221888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cr2.x f221889e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(cr2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221889e = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cr2.s(this.f221889e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cr2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f221888d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f221888d = 1;
            if (kotlinx.coroutines.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        cr2.x xVar = this.f221889e;
        up2.m mVar = xVar.f221918x;
        if (mVar != null) {
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = xVar.f221907m;
            if (wxRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            mVar.a(wxRecyclerView);
        }
        return jz5.f0.f302826a;
    }
}
