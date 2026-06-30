package vg2;

/* loaded from: classes3.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView f436550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436550e = finderRandomAnimTextView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vg2.p(this.f436550e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vg2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f436549d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f436549d = 1;
            if (kotlinx.coroutines.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.gift.widget.FinderRandomAnimTextView finderRandomAnimTextView = this.f436550e;
        kotlinx.coroutines.r2 r2Var = finderRandomAnimTextView.f111656e2;
        boolean z17 = false;
        if (r2Var != null && ((kotlinx.coroutines.a) r2Var).a()) {
            z17 = true;
        }
        if (z17) {
            vg2.q qVar = new vg2.q(finderRandomAnimTextView.getContext());
            java.util.LinkedList linkedList = finderRandomAnimTextView.f111653b2;
            if (linkedList.size() > 1) {
                qVar.f12049a = linkedList.size() - 1;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = finderRandomAnimTextView.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll(qVar);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
