package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes3.dex */
public final class j8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f204235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f204236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f204237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f204238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f204239h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(android.widget.LinearLayout linearLayout, android.content.Context context, float f17, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f204236e = linearLayout;
        this.f204237f = context;
        this.f204238g = f17;
        this.f204239h = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.viewitems.j8(this.f204236e, this.f204237f, this.f204238g, this.f204239h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.viewitems.j8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f204235d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.widget.LinearLayout linearLayout = this.f204236e;
            linearLayout.setVisibility(0);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            float f17 = com.tencent.mm.ui.chatting.viewitems.l8.f204404a;
            float f18 = this.f204238g;
            os5.u uVar = new os5.u((int) (f17 * f18), (int) (com.tencent.mm.ui.chatting.viewitems.l8.f204405b * f18), com.tencent.mm.ui.chatting.viewitems.l8.f204406c);
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            android.content.Context context = this.f204237f;
            kotlin.jvm.internal.o.g(context, "context");
            xt2.k1 k1Var = new xt2.k1(context, uVar);
            k1Var.b("MicroMsg.ChattingItemAppMsgFinderProduct", linearLayout);
            int a17 = i65.a.a(context, 175.0f);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFinderProduct", "parse showbox " + this.f204239h + " with space " + a17);
            java.util.List list = this.f204239h;
            android.widget.LinearLayout linearLayout2 = this.f204236e;
            this.f204235d = 1;
            if (os5.v.a(k1Var, "MicroMsg.ChattingItemAppMsgFinderProduct", list, false, linearLayout2, a17, null, this, 32, null) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
