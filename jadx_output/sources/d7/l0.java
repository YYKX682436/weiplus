package d7;

/* loaded from: classes13.dex */
public class l0 implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final d7.y f226822a;

    /* renamed from: b, reason: collision with root package name */
    public final x6.b f226823b;

    public l0(d7.y yVar, x6.b bVar) {
        this.f226822a = yVar;
        this.f226823b = bVar;
    }

    @Override // t6.n
    public w6.z0 a(java.lang.Object obj, int i17, int i18, t6.l lVar) {
        boolean z17;
        d7.i0 i0Var;
        q7.f fVar;
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        if (inputStream instanceof d7.i0) {
            i0Var = (d7.i0) inputStream;
            z17 = false;
        } else {
            z17 = true;
            i0Var = new d7.i0(inputStream, this.f226823b);
        }
        java.util.Queue queue = q7.f.f360294f;
        synchronized (queue) {
            fVar = (q7.f) ((java.util.ArrayDeque) queue).poll();
        }
        if (fVar == null) {
            fVar = new q7.f();
        }
        fVar.f360295d = i0Var;
        try {
            w6.z0 a17 = this.f226822a.a(new q7.l(fVar), i17, i18, lVar, new d7.k0(i0Var, fVar));
            fVar.f360296e = null;
            fVar.f360295d = null;
            synchronized (queue) {
                ((java.util.ArrayDeque) queue).offer(fVar);
            }
            if (z17) {
                i0Var.release();
            }
            return a17;
        } catch (java.lang.Throwable th6) {
            fVar.f360296e = null;
            fVar.f360295d = null;
            java.util.Queue queue2 = q7.f.f360294f;
            synchronized (queue2) {
                ((java.util.ArrayDeque) queue2).offer(fVar);
                if (z17) {
                    i0Var.release();
                }
                throw th6;
            }
        }
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        this.f226822a.getClass();
        return true;
    }
}
