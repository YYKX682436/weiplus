package h53;

/* loaded from: classes8.dex */
public class j extends sd.m0 {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.LinkedList f279055m = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final h53.q f279056f;

    /* renamed from: g, reason: collision with root package name */
    public final sd.g f279057g;

    /* renamed from: h, reason: collision with root package name */
    public h53.i f279058h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f279059i;

    public j() {
        super(com.tencent.mm.sdk.platformtools.x2.f193071a, h53.p.class);
        java.util.LinkedList linkedList;
        this.f279058h = h53.i.none;
        sd.g gVar = (sd.g) this.f406625e;
        this.f279057g = gVar;
        this.f279056f = new h53.q(gVar);
        synchronized (h53.k.class) {
            h53.k.f279060a = new java.util.LinkedList();
            h53.k.b();
            linkedList = h53.k.f279060a;
        }
        gVar.g(linkedList, this);
        jh0.t tVar = (jh0.t) i95.n0.c(jh0.t.class);
        h53.b bVar = new h53.b(this);
        ((jh0.q) tVar).getClass();
        java.lang.String str = vz4.h.f441734a;
        if (com.tencent.mm.ipcinvoker.d0.g(com.tencent.mm.sdk.platformtools.x2.f193072b)) {
            vz4.h.a(bVar);
        } else {
            com.tencent.mm.plugin.wepkg.utils.n.a("", new vz4.g(bVar));
        }
        b("initing");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameJsCore", "JS CORE CREATE");
    }

    public static h53.j d() {
        return (h53.j) f279055m.peek();
    }

    public synchronized void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameJsCore", "destroyDirectly");
        if (this.f279058h != h53.i.destroyed) {
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f279059i;
        if (b4Var != null && !b4Var.e()) {
            this.f279059i.d();
        }
        h53.q qVar = this.f279056f;
        qVar.f279066c = true;
        qVar.f279067d.clear();
        qVar.f279068e.clear();
        this.f279057g.a();
        f279055m.remove(this);
    }

    public final void b(java.lang.String str) {
        java.util.Iterator it = com.tencent.mm.plugin.webview.luggage.u1.b().iterator();
        while (it.hasNext()) {
            sd.u0 u0Var = (sd.u0) it.next();
            u0Var.f406655i.c(new h53.c(this));
            u0Var.f406655i.f406633i.evaluateJavascript(java.lang.String.format("window.__jscore_state__='%s';", str), null);
        }
    }

    public void c(h53.r rVar) {
        h53.q qVar = this.f279056f;
        com.tencent.mars.xlog.Log.i("MicroMsg.Page2JsCoreMsgDispatch", "evaluateMessage, hasDestroyed = %b, hasReady = %b", java.lang.Boolean.valueOf(qVar.f279066c), java.lang.Boolean.valueOf(qVar.f279065b));
        if (qVar.f279066c) {
            return;
        }
        if (!qVar.f279065b) {
            qVar.f279068e.add(rVar);
        } else {
            qVar.f279064a.h(java.lang.String.format("WxGameJsCoreBridge.invokeEvent(%s,\"%s\")", rVar.f279070b.toString(), rVar.f279069a), null);
        }
    }
}
