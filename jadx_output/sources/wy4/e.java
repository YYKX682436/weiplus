package wy4;

/* loaded from: classes.dex */
public class e implements uy4.w {
    @Override // uy4.w
    public void Wc(android.app.Activity activity, java.lang.String str) {
        if (!com.tencent.mm.plugin.websearch.l2.h(0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FTS.SearchOneSearchOpener", "fts h5 template not avail");
            return;
        }
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsbizscene", 20);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map b17 = su4.r2.b(20, true, 0);
        a17.putExtra("ftsneedkeyboard", true);
        a17.putExtra("rawUrl", su4.r2.e(b17, 0));
        j45.l.j(activity, "webview", ".ui.tools.fts.FTSSearchOneSearchWebViewUI", a17, null);
    }

    @Override // uy4.w
    public java.lang.String ra(java.lang.String str) {
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        java.lang.String optString = su4.o2.d("discoverSearchEntry").optString("wording");
        return com.tencent.mm.sdk.platformtools.t8.K0(optString) ? com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.cfz) : optString;
    }

    @Override // uy4.w
    public java.lang.String xe(java.lang.String str) {
        ((sg0.e2) ((tg0.p1) i95.n0.c(tg0.p1.class))).getClass();
        return su4.o2.d("discoverSearchEntry").optString("labIcon");
    }
}
