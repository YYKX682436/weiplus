package df2;

/* loaded from: classes2.dex */
public final class cm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f229890d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cm(com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229890d = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.cm(this.f229890d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.cm cmVar = (df2.cm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cmVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.view.MMPAGView mMPAGView = this.f229890d;
        if (mMPAGView.getVisibility() == 0) {
            mMPAGView.g();
        }
        return jz5.f0.f302826a;
    }
}
