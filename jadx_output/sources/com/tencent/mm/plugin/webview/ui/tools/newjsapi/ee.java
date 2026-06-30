package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

/* loaded from: classes.dex */
public final class ee extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f186070d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186071e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f186072f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186073g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f186074h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ee(nw4.k kVar, kotlin.jvm.internal.h0 h0Var, java.lang.String str, nw4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f186071e = kVar;
        this.f186072f = h0Var;
        this.f186073g = str;
        this.f186074h = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.webview.ui.tools.newjsapi.ee(this.f186071e, this.f186072f, this.f186073g, this.f186074h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.webview.ui.tools.newjsapi.ee) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f186070d;
        nw4.k kVar = this.f186071e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            js.e1 e1Var = (js.e1) i95.n0.c(js.e1.class);
            android.content.Context context = kVar.f340860a;
            js.d1 d1Var = (js.d1) this.f186072f.f310123d;
            this.f186070d = 1;
            obj = ((u61.u) e1Var).wi(context, d1Var, this.f186073g, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.Map map = (java.util.Map) obj;
        java.util.Objects.toString(map);
        java.lang.Object obj2 = map.get("mobile");
        java.lang.String str = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
        java.lang.Object obj3 = map.get("msgId");
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        java.lang.Object obj4 = map.get("carrierType");
        java.lang.Integer num = obj4 instanceof java.lang.Integer ? (java.lang.Integer) obj4 : null;
        boolean z17 = str == null || str.length() == 0;
        jz5.f0 f0Var = jz5.f0.f302826a;
        nw4.y2 y2Var = this.f186074h;
        if (!z17) {
            if (!(str2 == null || str2.length() == 0)) {
                if (!(map.get("tokens") == null) && num != null && num.intValue() != 0) {
                    kVar.f340863d.e(y2Var.f341013c, "SimAuth:ok", map);
                    return f0Var;
                }
            }
        }
        kVar.f340863d.e(y2Var.f341013c, "SimAuth:fail get number fail " + map.get("sim_auth_err"), null);
        return f0Var;
    }
}
