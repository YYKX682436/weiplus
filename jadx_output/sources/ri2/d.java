package ri2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f396045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ri2.j jVar, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396045d = jVar;
        this.f396046e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ri2.d(this.f396045d, this.f396046e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ri2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ri2.j jVar = this.f396045d;
        com.tencent.mm.view.MMPAGView mMPAGView = jVar.f396073p;
        if (mMPAGView != null) {
            mMPAGView.d();
        }
        ym5.l2 l2Var = ym5.l2.f463424a;
        com.tencent.mm.view.MMPAGView mMPAGView2 = jVar.f396073p;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        com.tencent.mm.view.MMPAGView mMPAGView3 = jVar.f396073p;
        if (mMPAGView3 != null) {
            mMPAGView3.o(ae2.in.f3688a.a(ym5.f6.N));
        }
        com.tencent.mm.view.MMPAGView mMPAGView4 = jVar.f396073p;
        if (mMPAGView4 != null) {
            android.content.res.AssetManager assets = this.f396046e.getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView4.k(assets, jVar.f396061d);
        }
        com.tencent.mm.view.MMPAGView mMPAGView5 = jVar.f396073p;
        if (mMPAGView5 == null) {
            return null;
        }
        mMPAGView5.setRepeatCount(0);
        return jz5.f0.f302826a;
    }
}
