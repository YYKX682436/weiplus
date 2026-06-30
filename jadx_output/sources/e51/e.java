package e51;

/* loaded from: classes10.dex */
public final class e extends android.os.Handler implements e51.b {

    /* renamed from: d, reason: collision with root package name */
    public final e51.m f249575d;

    /* renamed from: e, reason: collision with root package name */
    public final e51.d f249576e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f249577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.os.Looper looper, e51.m confettiView) {
        super(looper);
        kotlin.jvm.internal.o.g(looper, "looper");
        kotlin.jvm.internal.o.g(confettiView, "confettiView");
        this.f249575d = confettiView;
        this.f249576e = new e51.d(new java.lang.ref.WeakReference(this));
        this.f249577f = new java.util.LinkedList();
    }

    public final void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        synchronized (this.f249577f) {
            java.util.Iterator it = this.f249577f.iterator();
            while (it.hasNext()) {
                ((e51.j) ((e51.l) it.next())).f249584e.draw(canvas);
            }
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        boolean z17;
        kotlin.jvm.internal.o.g(msg, "msg");
        int i17 = msg.what;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    return;
                }
                synchronized (this.f249577f) {
                    this.f249577f.clear();
                }
                e51.d dVar = this.f249576e;
                dVar.f249574d = false;
                dVar.f249572b.removeFrameCallback(dVar.f249573c);
                return;
            }
            java.lang.Object obj = msg.obj;
            e51.l lVar = obj instanceof e51.l ? (e51.l) obj : null;
            if (lVar == null) {
                return;
            }
            ((e51.j) lVar).G = android.os.SystemClock.uptimeMillis();
            synchronized (this.f249577f) {
                this.f249577f.add(lVar);
            }
            e51.d dVar2 = this.f249576e;
            if (dVar2.f249574d) {
                return;
            }
            dVar2.f249574d = true;
            dVar2.f249572b.removeFrameCallback(dVar2.f249573c);
            dVar2.f249572b.postFrameCallback(dVar2.f249573c);
            return;
        }
        java.lang.Object obj2 = msg.obj;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((java.lang.Long) obj2).longValue();
        synchronized (this.f249577f) {
            java.util.Iterator it = this.f249577f.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                kotlin.jvm.internal.o.f(next, "next(...)");
                e51.j jVar = (e51.j) ((e51.l) next);
                long j17 = longValue - jVar.G;
                jVar.i(j17);
                if (((java.util.ArrayList) jVar.f249586g).size() != 0 || j17 < jVar.f249590k) {
                    z17 = true;
                } else {
                    jVar.h();
                    z17 = false;
                }
                if (!z17) {
                    it.remove();
                }
            }
        }
        if (this.f249577f.isEmpty()) {
            e51.d dVar3 = this.f249576e;
            dVar3.f249574d = false;
            dVar3.f249572b.removeFrameCallback(dVar3.f249573c);
        }
        this.f249575d.a();
    }
}
