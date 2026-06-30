package gf2;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271259d;

    /* renamed from: e, reason: collision with root package name */
    public int f271260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c02 f271261f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271262g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f271263h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f271264i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r45.c02 c02Var, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f271261f = c02Var;
        this.f271262g = anchorMilestoneShareView;
        this.f271263h = mMPAGView;
        this.f271264i = view;
    }

    public static final void a(com.tencent.mm.rfx.RfxPagComposition rfxPagComposition, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.rfx.RfxPagLayer[] layersByName;
        if (!(str2 != null) || (layersByName = rfxPagComposition.getLayersByName(str)) == null) {
            return;
        }
        for (com.tencent.mm.rfx.RfxPagLayer rfxPagLayer : layersByName) {
            if (rfxPagLayer.layerType() == 3 && (rfxPagLayer instanceof com.tencent.mm.rfx.RfxPagTextLayer)) {
                ((com.tencent.mm.rfx.RfxPagTextLayer) rfxPagLayer).setText(str2);
            }
        }
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gf2.b(this.f271261f, this.f271262g, this.f271263h, this.f271264i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gf2.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f271260e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.c02 c02Var = this.f271261f;
            java.lang.String string2 = c02Var.getString(6);
            if (string2 == null || (string = c02Var.getString(7)) == null) {
                return f0Var;
            }
            this.f271259d = string2;
            this.f271260e = 1;
            java.lang.Object b17 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.b(this.f271262g, string2, string, this);
            if (b17 == aVar) {
                return aVar;
            }
            str = string2;
            obj = b17;
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) this.f271259d;
            kotlin.ResultKt.throwOnFailure(obj);
            str = str2;
        }
        java.lang.String str3 = (java.lang.String) obj;
        if (str3 == null) {
            return f0Var;
        }
        com.tencent.mm.rfx.RfxPagFile Load = com.tencent.mm.rfx.RfxPagFile.Load(str3);
        com.tencent.mm.rfx.RfxPagFile Load2 = com.tencent.mm.rfx.RfxPagFile.Load(str3);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        gf2.a aVar2 = new gf2.a(this.f271261f, Load, this.f271263h, Load2, str, this.f271262g, this.f271264i, null);
        this.f271259d = null;
        this.f271260e = 2;
        return kotlinx.coroutines.l.g(g3Var, aVar2, this) == aVar ? aVar : f0Var;
    }
}
