package d52;

/* loaded from: classes13.dex */
public final class l implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d52.n f226543d;

    public l(d52.n nVar) {
        this.f226543d = nVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        if (it.what == 0) {
            try {
                java.lang.Object obj = it.obj;
                d52.b bVar = obj instanceof d52.b ? (d52.b) obj : null;
                if (bVar != null) {
                }
            } catch (java.lang.Exception unused) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(932L, 114L, 1L, false);
            }
        }
        return true;
    }
}
