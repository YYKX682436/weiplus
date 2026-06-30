package hr3;

/* loaded from: classes.dex */
public final class df extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283491e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df(java.lang.String str, hr3.pf pfVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283490d = str;
        this.f283491e = pfVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.df(this.f283490d, this.f283491e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        hr3.df dfVar = (hr3.df) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dfVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f283490d);
        hr3.pf pfVar = this.f283491e;
        if (K0) {
            db5.t7.h(pfVar.getActivity(), pfVar.getActivity().getString(com.tencent.mm.R.string.f490556yf));
        } else {
            db5.t7.m(pfVar.getActivity(), pfVar.getActivity().getString(com.tencent.mm.R.string.f492735ho1));
        }
        return jz5.f0.f302826a;
    }
}
