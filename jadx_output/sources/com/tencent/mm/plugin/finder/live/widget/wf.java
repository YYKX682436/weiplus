package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.gg f120180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f120181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f120182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.g f120183h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120184i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f120185m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f120186n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wf(com.tencent.mm.plugin.finder.live.widget.gg ggVar, long j17, long j18, dk2.g gVar, java.lang.String str, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120180e = ggVar;
        this.f120181f = j17;
        this.f120182g = j18;
        this.f120183h = gVar;
        this.f120184i = str;
        this.f120185m = i17;
        this.f120186n = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.wf(this.f120180e, this.f120181f, this.f120182g, this.f120183h, this.f120184i, this.f120185m, this.f120186n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.wf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        oz5.n nVar;
        dk2.xf W0;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120179d;
        if (i17 != 0) {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            return obj;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.widget.gg ggVar = this.f120180e;
        long j17 = this.f120181f;
        long j18 = this.f120182g;
        dk2.g gVar = this.f120183h;
        java.lang.String str = this.f120184i;
        int i18 = this.f120185m;
        int i19 = this.f120186n;
        this.f120179d = 1;
        int i27 = com.tencent.mm.plugin.finder.live.widget.gg.f118429z;
        ggVar.getClass();
        oz5.n nVar2 = new oz5.n(pz5.f.b(this));
        com.tencent.mars.xlog.Log.i("FinderLiveFansJoinWidget", "pay, giftId:" + str + " price:" + i18 + ",comboId:" + gVar.f233467b + ",liveId:" + j17 + ",objectId:" + j18 + ", fromScene:" + ggVar.f118443x);
        boolean z17 = ggVar.f118443x == com.tencent.mm.plugin.finder.live.plugin.eh0.f112420m;
        com.tencent.mm.plugin.finder.live.plugin.l basePlugin = ggVar.getBasePlugin();
        if (basePlugin == null || (W0 = basePlugin.W0()) == null) {
            nVar = nVar2;
        } else {
            android.content.Context context = ggVar.f118433n.getContext();
            com.tencent.mm.plugin.finder.live.plugin.l basePlugin2 = ggVar.getBasePlugin();
            com.tencent.mm.protobuf.g gVar2 = null;
            java.lang.String str2 = basePlugin2 != null ? ((mm2.e1) basePlugin2.P0(mm2.e1.class)).f328993w : null;
            com.tencent.mm.plugin.finder.live.plugin.l basePlugin3 = ggVar.getBasePlugin();
            byte[] bArr = basePlugin3 != null ? ((mm2.e1) basePlugin3.P0(mm2.e1.class)).f328985o : null;
            kz5.p0 p0Var = kz5.p0.f313996d;
            if (z17) {
                r45.b82 b82Var = new r45.b82();
                b82Var.set(0, 10);
                gVar2 = com.tencent.mm.protobuf.g.b(b82Var.toByteArray());
            }
            com.tencent.mm.plugin.finder.live.widget.yf yfVar = new com.tencent.mm.plugin.finder.live.widget.yf(ggVar, i18, nVar2);
            kotlin.jvm.internal.o.d(context);
            nVar = nVar2;
            dk2.xf.d(W0, context, j17, j18, str, i19, i18, gVar, "", 4, gVar2, p0Var, null, null, str2, bArr, yfVar, 6144, null);
        }
        java.lang.Object a17 = nVar.a();
        return a17 == aVar ? aVar : a17;
    }
}
