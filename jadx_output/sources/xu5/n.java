package xu5;

/* loaded from: classes12.dex */
public class n implements wu5.j, wu5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.util.concurrent.Future f457322d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Message f457323e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f457324f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Object f457325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xu5.o f457326h;

    public n(xu5.o oVar, android.os.Message message) {
        this.f457326h = oVar;
        if (message == null) {
            throw new java.lang.NullPointerException("msg is null");
        }
        this.f457323e = message;
        this.f457324f = oVar.f457330d + "#" + oVar.getMessageName(message);
        this.f457325g = oVar;
    }

    @Override // wu5.f
    public boolean a() {
        return this.f457326h.f457328b;
    }

    public boolean b() {
        xu5.o oVar = this.f457326h;
        android.os.Message message = this.f457323e;
        oVar.getClass();
        if (message != null) {
            try {
                zu5.b bVar = oVar.f457333g;
                java.lang.Object[] objArr = new java.lang.Object[0];
                synchronized (bVar) {
                    bVar.a(message, false, objArr);
                }
            } catch (java.lang.Exception e17) {
                throw new java.lang.RuntimeException(e17);
            }
        }
        return this.f457322d.cancel(false);
    }

    @Override // wu5.d
    public void f(java.util.concurrent.Future future) {
        this.f457322d = future;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return this.f457324f;
    }

    @Override // java.lang.Runnable
    public void run() {
        xu5.o oVar = this.f457326h;
        boolean z17 = oVar.f457329c.get();
        java.lang.String str = this.f457324f;
        if (z17) {
            this.f457322d.cancel(false);
            ku5.o.f312599c.w("SerialHandler", java.lang.String.format("this handler has quit! %s", str), new java.lang.Object[0]);
            return;
        }
        android.os.Message message = this.f457323e;
        if (message.getTarget() == null && message.obj == null && message.what == 0) {
            this.f457322d.cancel(false);
            ku5.o.f312599c.w("SerialHandler", java.lang.String.format("maybe it's removed before! %s", str), new java.lang.Object[0]);
            return;
        }
        android.os.Handler target = message.getTarget();
        java.util.Objects.requireNonNull(target, "target is null!");
        target.dispatchMessage(message);
        try {
            zu5.b bVar = oVar.f457333g;
            java.lang.Object[] objArr = new java.lang.Object[0];
            synchronized (bVar) {
                bVar.a(message, false, objArr);
            }
        } catch (java.lang.Exception e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }
}
