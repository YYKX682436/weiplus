package q83;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f360748a = false;

    public abstract void a();

    public final void b() {
        if (this.f360748a) {
            a();
            this.f360748a = false;
        }
    }

    public void c() {
    }

    public void d() {
        c();
        this.f360748a = true;
    }
}
