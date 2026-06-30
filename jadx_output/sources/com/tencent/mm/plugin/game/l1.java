package com.tencent.mm.plugin.game;

@j95.b
/* loaded from: classes8.dex */
public final class l1 extends i95.w implements m33.q1 {

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f139470f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f139471g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f139468d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f139469e = "";

    /* renamed from: h, reason: collision with root package name */
    public boolean f139472h = true;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.app.t2 f139473i = new com.tencent.mm.plugin.game.h1(this);

    public static final void Ai(com.tencent.mm.plugin.game.l1 l1Var) {
        java.lang.String str = l1Var.f139468d;
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "releaseStore, AppId: " + l1Var.f139468d);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Zj(l1Var.f139468d);
        l1Var.f139468d = "";
        l1Var.f139469e = "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk(r13.f139468d) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean wi(com.tencent.mm.plugin.game.l1 r13) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.l1.wi(com.tencent.mm.plugin.game.l1):boolean");
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "onAccountInitialized");
        super.onAccountInitialized(context);
        com.tencent.mm.app.w.INSTANCE.a(this.f139473i);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "onAccountReleased");
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.game.j1(this), "GameLiteAppStoreService.SerialQueue");
        com.tencent.mm.app.w.INSTANCE.p(this.f139473i);
        super.onAccountReleased(context);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.opensdk.utils.Log.i("MicroMsg.GameLiteAppStoreService", "onCreate");
        super.onCreate(context);
    }
}
