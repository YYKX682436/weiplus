package e55;

@j95.b
/* loaded from: classes8.dex */
public final class f extends i95.w implements f55.g {
    public void Ai(f55.e pageIndex, java.lang.String entryKey) {
        kotlin.jvm.internal.o.g(pageIndex, "pageIndex");
        kotlin.jvm.internal.o.g(entryKey, "entryKey");
        if (e55.e.f249667a.n()) {
            e55.m mVar = e55.m.f249681a;
            com.tencent.mm.sdk.platformtools.n3 g17 = mVar.g();
            android.os.Message obtainMessage = mVar.g().obtainMessage();
            obtainMessage.what = 1006;
            obtainMessage.obj = nm5.j.c(java.lang.Integer.valueOf(pageIndex.f259774d), entryKey);
            g17.sendMessage(obtainMessage);
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.RedDotReportService", "onAccountInitialized cur process " + bm5.f1.a());
        if (e55.e.f249667a.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotReportService", "start monitor");
        }
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (e55.e.f249667a.n()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RedDotReportService", "stop monitor");
            e55.m.f249681a.n();
        }
    }

    public android.widget.AbsListView.OnScrollListener wi() {
        if (!e55.e.f249667a.n()) {
            return null;
        }
        e55.m mVar = e55.m.f249681a;
        f55.e eVar = f55.e.f259771e;
        java.lang.Object obj = i55.u.f288889a.b().get(2);
        i55.h hVar = obj instanceof i55.h ? (i55.h) obj : null;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }
}
