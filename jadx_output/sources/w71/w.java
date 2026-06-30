package w71;

/* loaded from: classes11.dex */
public final class w implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w71.x f443459d;

    public w(w71.x xVar) {
        this.f443459d = xVar;
    }

    @Override // com.tencent.mm.network.l0
    public final void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        w71.x xVar = this.f443459d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(xVar.hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(xVar.getType());
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSPlatformWebView", "scene doScene finish:%d, func:%d, netId:%d, time:%d", valueOf, valueOf2, valueOf3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - xVar.f443462f));
        if (str == null) {
            str = "";
        }
        w71.s sVar = xVar.f443460d;
        com.tencent.mm.modelbase.o oVar = xVar.f443463g;
        sVar.a(i18, i19, str, oVar != null ? oVar.f70711b.f70700a : null);
        com.tencent.mm.modelbase.u0 u0Var = xVar.f443461e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, xVar);
        }
    }
}
