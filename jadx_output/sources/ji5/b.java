package ji5;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final ji5.b f299961a = new ji5.b();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, com.tencent.mm.storage.f9 f9Var, l15.c liteAppMsg) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liteAppMsg, "liteAppMsg");
        z05.d p17 = liteAppMsg.p();
        z05.b o17 = liteAppMsg.o();
        java.lang.String j17 = o17 != null ? o17.j() : null;
        if ((j17 == null || j17.length() == 0) != true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ForwardChattingItemClickHelper", "app is from jsapi sendGameShareCard, not allow to click");
            return;
        }
        if (p17 == null || (str = p17.getString(p17.f368365d + 0)) == null) {
            str = "";
        }
        q80.d0 d0Var = new q80.d0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ot0.q v17 = ot0.q.v(f9Var != null ? f9Var.j() : null);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to open, appMsg appId is null");
                return;
            }
            com.tencent.mm.pluginsdk.ui.tools.h0 h0Var = (com.tencent.mm.pluginsdk.ui.tools.h0) v17.y(com.tencent.mm.pluginsdk.ui.tools.h0.class);
            if (h0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to open, content.piece is null");
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(h0Var.f191665b)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ForwardChattingItemClickHelper", "unable to open, msg appId is null");
                return;
            }
            d0Var.f360649a = h0Var.f191665b;
            d0Var.f360650b = h0Var.f191666c;
            d0Var.f360651c = h0Var.f191667d;
            d0Var.f360654f = h0Var.f191669f;
            d0Var.f360652d = java.lang.Boolean.valueOf(h0Var.f191670g);
            boolean z17 = h0Var.f191674k;
            com.tencent.liteapp.storage.LiteAppReferrerInfo liteAppReferrerInfo = new com.tencent.liteapp.storage.LiteAppReferrerInfo();
            if (z17) {
                cl0.g gVar = new cl0.g();
                gVar.o("shareImageCardFlag", 1);
                liteAppReferrerInfo.extraData = gVar;
                d0Var.f360674z = liteAppReferrerInfo;
            }
        } else {
            d0Var.f360649a = str;
            d0Var.f360650b = p17 != null ? p17.n() : null;
            d0Var.f360651c = p17 != null ? p17.o() : null;
            d0Var.f360654f = p17 != null ? p17.l() : null;
            d0Var.f360652d = p17 != null ? java.lang.Boolean.valueOf(p17.r()) : null;
        }
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new ji5.a());
    }
}
