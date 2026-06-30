package il;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: d, reason: collision with root package name */
    public static il.j f292002d;

    /* renamed from: a, reason: collision with root package name */
    public volatile java.util.LinkedList f292003a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public volatile java.util.HashMap f292004b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public volatile java.lang.Object f292005c = new java.lang.Object();

    public static il.j a() {
        if (f292002d == null) {
            synchronized (il.j.class) {
                if (f292002d == null) {
                    f292002d = new il.j();
                }
            }
        }
        return f292002d;
    }

    public hl.d b(java.lang.String str) {
        hl.d dVar;
        synchronized (this.f292005c) {
            if (!this.f292003a.contains(str)) {
                this.f292003a.add(str);
            }
            dVar = (hl.d) this.f292004b.get(str);
            if (dVar == null) {
                dVar = new hl.d(str);
                this.f292004b.put(str, dVar);
            }
        }
        return dVar;
    }

    public int c(java.lang.String str) {
        synchronized (this.f292005c) {
            if (!this.f292003a.contains(str)) {
                return 0;
            }
            hl.d dVar = (hl.d) this.f292004b.get(str);
            if (dVar == null) {
                return 0;
            }
            return dVar.k();
        }
    }

    public boolean d(java.lang.String str) {
        synchronized (this.f292005c) {
            if (!this.f292003a.contains(str)) {
                return false;
            }
            hl.d dVar = (hl.d) this.f292004b.get(str);
            return dVar != null && dVar.k() > 0 && dVar.f282019b;
        }
    }
}
