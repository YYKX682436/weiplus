package h53;

/* loaded from: classes8.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final sd.g f279064a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f279065b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f279066c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f279067d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f279068e = new java.util.LinkedList();

    public q(sd.g gVar) {
        this.f279064a = gVar;
    }

    public void a(sd.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "dispatchEvent, hasDestroyed = %b, hasReady = %b", java.lang.Boolean.valueOf(this.f279066c), java.lang.Boolean.valueOf(this.f279065b));
        if (this.f279066c) {
            return;
        }
        if (this.f279065b) {
            this.f279064a.c(eVar);
        } else {
            this.f279067d.add(eVar);
        }
    }
}
