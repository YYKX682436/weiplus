package hd2;

/* loaded from: classes2.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f280465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280466e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f280466e = finderProfileCardFragment;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hd2.d0(this.f280466e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hd2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object x17;
        android.content.Context context;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f280465d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            g92.b bVar = g92.b.f269769e;
            this.f280465d = 1;
            x17 = bVar.x1(8, this);
            if (x17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            x17 = ((kotlin.Result) obj).getValue();
        }
        boolean m528isSuccessimpl = kotlin.Result.m528isSuccessimpl(x17);
        com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment = this.f280466e;
        if (m528isSuccessimpl) {
            finderProfileCardFragment.f110052p = (r45.lk2) x17;
            pm0.v.X(new hd2.b0(finderProfileCardFragment));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(x17);
        if (m524exceptionOrNullimpl != null) {
            rm0.j jVar = m524exceptionOrNullimpl instanceof rm0.j ? (rm0.j) m524exceptionOrNullimpl : null;
            if (jVar != null && (context = finderProfileCardFragment.getContext()) != null) {
                pm0.v.X(new hd2.c0(context, jVar));
            }
        }
        return jz5.f0.f302826a;
    }
}
