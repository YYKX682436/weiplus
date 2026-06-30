package fc;

/* loaded from: classes16.dex */
public abstract class o {

    /* renamed from: d, reason: collision with root package name */
    public final fc.b f260920d;

    /* renamed from: e, reason: collision with root package name */
    public int f260921e;

    /* renamed from: f, reason: collision with root package name */
    public int f260922f;

    public o(fc.b bVar) {
        this.f260920d = bVar;
        this.f260921e = bVar.f260900d;
        this.f260922f = bVar.d();
    }

    public boolean hasNext() {
        return nextIndex() >= 0;
    }

    public abstract int nextIndex();

    public void remove() {
        int i17 = this.f260921e;
        fc.b bVar = this.f260920d;
        if (i17 != bVar.f260900d) {
            throw new java.util.ConcurrentModificationException();
        }
        int i18 = bVar.f260902f;
        if (i18 < 0) {
            throw new java.lang.IllegalStateException("Unpaired stop/startCompactingOnRemove");
        }
        bVar.f260902f = i18 - bVar.d();
        try {
            bVar.l(this.f260922f);
            int i19 = bVar.f260902f;
            if (i19 >= 0) {
                throw new java.lang.IllegalStateException("Unpaired stop/startCompactingOnRemove");
            }
            bVar.f260902f = i19 + bVar.d();
            this.f260921e--;
        } catch (java.lang.Throwable th6) {
            int i27 = bVar.f260902f;
            if (i27 >= 0) {
                throw new java.lang.IllegalStateException("Unpaired stop/startCompactingOnRemove");
            }
            bVar.f260902f = i27 + bVar.d();
            throw th6;
        }
    }
}
