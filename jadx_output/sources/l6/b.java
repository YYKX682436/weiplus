package l6;

/* loaded from: classes16.dex */
public class b extends java.lang.Thread {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f316710f;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f316708d = new java.lang.Object();

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Object f316709e = new java.lang.Object();

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f316711g = false;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f316712h = new java.util.ArrayList();

    public b(android.content.Context context) {
        this.f316710f = context;
    }

    public void a(l6.a aVar) {
        synchronized (this.f316708d) {
            aVar.f316706h = aVar.f316701c + l6.c.c(this.f316710f).d(aVar.f316699a);
            aVar.f316704f = 0L;
            synchronized (this.f316709e) {
                if (((java.util.ArrayList) this.f316712h).size() > 0) {
                    ((l6.a) ((java.util.ArrayList) this.f316712h).get(0)).f316705g = false;
                }
                ((java.util.ArrayList) this.f316712h).add(0, aVar);
            }
            try {
                this.f316708d.notify();
            } catch (java.lang.Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01e6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1 A[SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b.run():void");
    }
}
