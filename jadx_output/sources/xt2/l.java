package xt2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f456853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f456854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.m f456855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f456856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f456857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f456858i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f456859m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f456860n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f456861o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.Object obj, xt2.m mVar, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, android.widget.ImageView imageView, kotlin.jvm.internal.h0 h0Var3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456854e = obj;
        this.f456855f = mVar;
        this.f456856g = mMPAGView;
        this.f456857h = c0Var;
        this.f456858i = h0Var;
        this.f456859m = h0Var2;
        this.f456860n = imageView;
        this.f456861o = h0Var3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.l(this.f456854e, this.f456855f, this.f456856g, this.f456857h, this.f456858i, this.f456859m, this.f456860n, this.f456861o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f456853d;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f456856g;
        xt2.m mVar = this.f456855f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            xt2.h hVar = new xt2.h(mVar, mMPAGView, null);
            this.f456853d = 1;
            if (kotlinx.coroutines.l.g(g3Var, hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.Object obj2 = this.f456854e;
        kotlin.jvm.internal.c0 c0Var = this.f456857h;
        if (obj2 == null) {
            java.lang.String str = mVar.f456878g;
            if (str == null || str.length() == 0) {
                java.lang.String k17 = mVar.k();
                if (k17.length() == 0) {
                    java.lang.String str2 = mVar.f456882n;
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i(str2, "play animate with pag name: pagName.isEmpty() = True", null);
                    return null;
                }
                ym5.l2 l2Var = ym5.l2.f463424a;
                ym5.j2[] j2VarArr = ym5.j2.f463392d;
                c0Var.f310112d = ae2.in.f3688a.a(ym5.f6.f463305e);
                mMPAGView.o(c0Var.f310112d);
                mVar.getClass();
                vl2.h hVar2 = kotlin.jvm.internal.o.b(k17, "finder_live_shopping_entrance_fire") ? vl2.h.Z : vl2.h.f437819e;
                if (hVar2 == vl2.h.f437819e) {
                    java.lang.String str3 = mVar.f456882n;
                    java.lang.String str4 = "play animate with pag name: " + k17 + " not in UDR, load from assets, useRfx = " + c0Var.f310112d;
                    int i19 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i(str3, str4, null);
                    android.content.res.AssetManager assets = mVar.f456875d.getContext().getAssets();
                    kotlin.jvm.internal.o.f(assets, "getAssets(...)");
                    mMPAGView.k(assets, k17);
                } else {
                    java.lang.String str5 = mVar.f456882n;
                    java.lang.String str6 = "play animate with pag name: useRfx = " + c0Var.f310112d;
                    int i27 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i(str5, str6, null);
                    kotlinx.coroutines.r2 r2Var = mVar.f456881m;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    mVar.f456881m = com.tencent.mm.plugin.finder.live.util.y.m(mVar.f456877f, null, null, new xt2.i(hVar2, mMPAGView, null), 3, null);
                }
            } else {
                c0Var.f310112d = ae2.in.f3688a.a(ym5.f6.f463305e);
                java.lang.String str7 = mVar.f456882n;
                java.lang.String str8 = "play animate with new default: useRfx = " + c0Var.f310112d;
                int i28 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i(str7, str8, null);
                ym5.l2 l2Var2 = ym5.l2.f463424a;
                ym5.j2[] j2VarArr2 = ym5.j2.f463392d;
                mMPAGView.o(c0Var.f310112d);
                mMPAGView.setComposition(mVar.f456878g);
            }
        } else {
            java.lang.String str9 = mVar.f456882n;
            java.lang.String str10 = "play animate with fenwei " + c0Var.f310112d;
            int i29 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i(str9, str10, null);
            if (c0Var.f310112d) {
                mMPAGView.setComposition((com.tencent.mm.rfx.RfxPagFile) this.f456858i.f310123d);
            } else {
                mMPAGView.setComposition((org.libpag.PAGFile) this.f456859m.f310123d);
            }
        }
        mMPAGView.d();
        mMPAGView.setRepeatCount(1);
        mMPAGView.setProgress(0.0d);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        xt2.k kVar = new xt2.k(this.f456856g, this.f456860n, this.f456855f, this.f456861o, null);
        this.f456853d = 2;
        obj = kotlinx.coroutines.l.g(g3Var2, kVar, this);
        return obj == aVar ? aVar : obj;
    }
}
