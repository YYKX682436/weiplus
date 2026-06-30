package l36;

/* loaded from: classes16.dex */
public final class f implements n36.c {

    /* renamed from: a, reason: collision with root package name */
    public final n36.h f315487a;

    /* renamed from: b, reason: collision with root package name */
    public final x36.f0 f315488b;

    /* renamed from: c, reason: collision with root package name */
    public final x36.f0 f315489c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f315490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l36.j f315491e;

    public f(l36.j jVar, n36.h hVar) {
        this.f315491e = jVar;
        this.f315487a = hVar;
        x36.f0 d17 = hVar.d(1);
        this.f315488b = d17;
        this.f315489c = new l36.e(this, d17, jVar, hVar);
    }

    public void a() {
        synchronized (this.f315491e) {
            if (this.f315490d) {
                return;
            }
            this.f315490d = true;
            this.f315491e.getClass();
            m36.e.c(this.f315488b);
            try {
                this.f315487a.a();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
