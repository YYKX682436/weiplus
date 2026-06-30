package com.tencent.mm.plugin.game.luggage.jsevent;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/game/luggage/jsevent/m;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "luggage-game_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class m implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle != null ? bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME) : null;
        java.lang.String string2 = bundle != null ? bundle.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppIpcEventDispatch", "invoke, " + string);
        if (string != null && ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).Ij()) {
            try {
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.initLib();
                cl0.g gVar = new cl0.g(string2);
                ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).getClass();
                com.tencent.mm.plugin.lite.w.l(string, gVar);
            } catch (java.lang.Exception e17) {
                cl0.g gVar2 = new cl0.g();
                try {
                    gVar2.h("error", e17.toString());
                    java.lang.String gVar3 = gVar2.toString();
                    kotlin.jvm.internal.o.f(gVar3, "toString(...)");
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile(",");
                    kotlin.jvm.internal.o.f(compile, "compile(...)");
                    java.lang.String replaceAll = compile.matcher(gVar3).replaceAll(";");
                    kotlin.jvm.internal.o.f(replaceAll, "replaceAll(...)");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(23449, "LiteAppIpcEventDispatch,".concat(replaceAll));
                } catch (cl0.f e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LiteAppIpcEventDispatch", e18, "", new java.lang.Object[0]);
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppIpcEventDispatch", e17.toString());
            }
        }
    }
}
