package od;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final od.p f344501a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f344502b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public boolean f344503c = false;

    public f(od.p pVar) {
        this.f344501a = pVar;
    }

    public synchronized void a(od.e eVar) {
        if (!this.f344503c && eVar.f344497b.optLong("liteCallbackId", 0L) == 0) {
            this.f344502b.add(eVar);
        }
        b(eVar);
    }

    public final void b(od.e eVar) {
        long optLong = eVar.f344497b.optLong("liteCallbackId", 0L);
        od.p pVar = this.f344501a;
        if (optLong != 0) {
            pVar.evaluateJavascript(eVar.toString(), null);
        } else {
            pVar.evaluateJavascript(java.lang.String.format("if(typeof luggageBridge !== 'undefined') luggageBridge._processMessageFromJava(%s);", eVar.toString()), null);
        }
    }
}
