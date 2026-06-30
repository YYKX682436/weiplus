package rk2;

/* loaded from: classes3.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396486d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView f396487e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.plugin.finder.live.multistream.MultiStreamRecyclerView multiStreamRecyclerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396487e = multiStreamRecyclerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk2.s(this.f396487e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk2.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396486d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout();
            this.f396486d = 1;
            if (kotlinx.coroutines.k1.b(doubleTapTimeout, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        yz5.a aVar2 = this.f396487e.f111753y2;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}
