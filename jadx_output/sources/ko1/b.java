package ko1;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lko1/b;", "Lcom/tencent/mm/ipcinvoker/k0;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class b implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        android.os.Bundle data = (android.os.Bundle) obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String string = data.getString("query", "");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        jo1.b.f300877a = string;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", "wxalitee65dc317cc6dc1cf679d2f77cd6030be");
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, data.getString("pagePath", "pages/roam-main"));
        bundle.putString("query", jo1.b.f300877a);
        com.tencent.mars.xlog.Log.i("MicroMsg.RoamBackupLiteAppManager", "try start LiteApp, page:" + bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "") + ", query:" + jo1.b.f300877a);
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, bundle, true, true, new jo1.a());
        return new com.tencent.mm.ipcinvoker.type.IPCVoid();
    }
}
