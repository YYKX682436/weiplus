package ri2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396047d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396048e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396049f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ri2.j jVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396048e = jVar;
        this.f396049f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ri2.e(this.f396048e, this.f396049f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ri2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396047d;
        ri2.j jVar = this.f396048e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.view.MMPAGView mMPAGView = jVar.f396073p;
            if (mMPAGView != null) {
                mMPAGView.setVisibility(8);
            }
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            ri2.d dVar = new ri2.d(jVar, this.f396049f, null);
            this.f396047d = 1;
            if (kotlinx.coroutines.l.g(p0Var, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = jVar.f396073p;
        if (mMPAGView2 != null) {
            mMPAGView2.setVisibility(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView3 = jVar.f396073p;
        if (mMPAGView3 != null) {
            mMPAGView3.g();
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = jVar.f396073p;
        if (mMPAGView4 != null) {
            mMPAGView4.setScaleY(1.5f);
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = jVar.f396073p;
        if (mMPAGView5 != null) {
            mMPAGView5.setScaleX(1.5f);
        }
        return jz5.f0.f302826a;
    }
}
