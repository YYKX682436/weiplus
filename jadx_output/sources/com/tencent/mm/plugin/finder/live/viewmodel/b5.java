package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f116926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f116927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.d5 f116928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.c6 f116930h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var, com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var, android.view.View view, com.tencent.mm.plugin.finder.live.viewmodel.c6 c6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116927e = r5Var;
        this.f116928f = d5Var;
        this.f116929g = view;
        this.f116930h = c6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.viewmodel.b5 b5Var = new com.tencent.mm.plugin.finder.live.viewmodel.b5(this.f116927e, this.f116928f, this.f116929g, this.f116930h, continuation);
        b5Var.f116926d = obj;
        return b5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.viewmodel.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f116926d;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_COUNT_INT_SYNC, 0);
        boolean booleanValue = ((java.lang.Boolean) ae2.in.f3775i6.r()).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            int r18 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_TEST_LIVE_GUIDE_LIMIT_INT_SYNC, 0);
            if (r18 <= 0 || r17 >= r18) {
                return f0Var;
            }
            long t17 = gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_TIMESTAMP_LONG_SYNC, 0L);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (t17 > 0 && currentTimeMillis - t17 < 86400000) {
                return f0Var;
            }
        }
        com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var = this.f116927e;
        com.tencent.mm.plugin.finder.live.widget.sl slVar = new com.tencent.mm.plugin.finder.live.widget.sl(r5Var.O6());
        com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var = this.f116928f;
        java.lang.String string = d5Var.itemView.getContext().getString(com.tencent.mm.R.string.oup);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        slVar.c(string);
        android.view.View view = this.f116929g;
        kotlin.jvm.internal.o.g(view, "view");
        slVar.f119800d = view;
        slVar.f119799c = com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT;
        int S = pm0.v.S(224);
        android.widget.TextView textView = slVar.f119798b;
        textView.setMaxWidth(S);
        slVar.f119808l = com.tencent.mm.plugin.finder.live.widget.kl.f118844d;
        slVar.f119809m = 130;
        slVar.f119810n = 16;
        slVar.f119807k = -855638017;
        slVar.f119806j = -12566464;
        textView.setGravity(8388627);
        slVar.f119802f = new com.tencent.mm.plugin.finder.live.viewmodel.y4(d5Var, r17);
        slVar.setOnDismissListener(new com.tencent.mm.plugin.finder.live.viewmodel.z4(d5Var, r5Var));
        slVar.f119804h = new com.tencent.mm.plugin.finder.live.viewmodel.a5(r5Var, this.f116930h);
        slVar.b();
        slVar.d(y0Var);
        r5Var.f117363r = slVar;
        com.tencent.mars.xlog.Log.i(r5Var.f117358m, "show test live guide");
        return f0Var;
    }
}
