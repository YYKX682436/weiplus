package e95;

/* loaded from: classes11.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public e95.h f250438a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f250439b;

    public o(e95.h hVar, int i17, boolean z17) {
        this.f250438a = hVar;
        this.f250439b = z17;
        hVar.u(true);
        this.f250438a.Y(new e95.n(this));
        if (i17 != 0) {
            this.f250438a.u1(i17);
        }
        if (z17) {
            return;
        }
        a();
    }

    public int a() {
        return this.f250438a.getCount();
    }
}
