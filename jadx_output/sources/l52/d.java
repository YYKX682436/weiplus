package l52;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l52.f f316578d;

    public d(l52.f fVar) {
        this.f316578d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = e62.q.a().f249810h;
        l52.f fVar = this.f316578d;
        fVar.getClass();
        if (str == null || str.isEmpty()) {
            return;
        }
        com.tencent.mm.autogen.events.SnsSessionChangeEvent snsSessionChangeEvent = new com.tencent.mm.autogen.events.SnsSessionChangeEvent();
        am.vw vwVar = snsSessionChangeEvent.f54839g;
        vwVar.f8225b = str;
        vwVar.f8224a = fVar.f316597q;
        snsSessionChangeEvent.e();
    }
}
