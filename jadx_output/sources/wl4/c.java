package wl4;

/* loaded from: classes11.dex */
public final class c implements rl4.c {

    /* renamed from: a, reason: collision with root package name */
    public final bw5.eq0 f447085a;

    public c(bw5.eq0 id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        this.f447085a = id6;
    }

    @Override // rl4.c
    public void a() {
        sl4.a a17 = jm4.t2.a(this.f447085a);
        if (a17 == null || (a17 instanceof wl4.h)) {
            return;
        }
        a17.a();
    }

    @Override // rl4.c
    public bw5.eq0 b() {
        return this.f447085a;
    }

    @Override // rl4.c
    public int c() {
        return 23;
    }

    @Override // rl4.c
    public boolean d() {
        return false;
    }

    @Override // rl4.c
    public java.lang.String e() {
        return "default";
    }

    @Override // rl4.c
    public jm4.q3 f() {
        return jm4.q3.f300408g;
    }

    @Override // rl4.c
    public void g() {
        a();
    }
}
