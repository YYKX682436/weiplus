package vr1;

/* loaded from: classes3.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f439557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI f439558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ip3 f439559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f439560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f439561h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI, r45.ip3 ip3Var, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439558e = bizPCRecentReadUI;
        this.f439559f = ip3Var;
        this.f439560g = z17;
        this.f439561h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vr1.e0(this.f439558e, this.f439559f, this.f439560g, this.f439561h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr1.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f439557d;
        boolean z17 = this.f439560g;
        com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI bizPCRecentReadUI = this.f439558e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            xr1.m mVar = bizPCRecentReadUI.f94066g;
            this.f439557d = 1;
            mVar.getClass();
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            new xr1.j(this.f439559f, z17).l().K(new xr1.l(mVar, nVar));
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (((r45.y26) obj) == null) {
            com.tencent.mars.xlog.Log.i(bizPCRecentReadUI.f94063d, "resp == null");
            db5.t7.g(bizPCRecentReadUI.getContext(), bizPCRecentReadUI.getString(com.tencent.mm.R.string.f490748am4));
        } else {
            java.lang.String string = z17 ? bizPCRecentReadUI.getString(com.tencent.mm.R.string.f490747am3) : bizPCRecentReadUI.getString(com.tencent.mm.R.string.f490749am5);
            kotlin.jvm.internal.o.d(string);
            db5.t7.i(bizPCRecentReadUI.getContext(), string, com.tencent.mm.R.raw.icons_filled_done);
            yz5.a aVar2 = this.f439561h;
            if (aVar2 != null) {
                aVar2.invoke();
            }
        }
        return jz5.f0.f302826a;
    }
}
