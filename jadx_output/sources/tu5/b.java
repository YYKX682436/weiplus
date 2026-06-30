package tu5;

/* loaded from: classes12.dex */
public abstract class b extends uu5.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f422167b;

    /* renamed from: c, reason: collision with root package name */
    public final int f422168c;

    public b(int i17, int i18) {
        this.f422167b = i17;
        this.f422168c = i18;
    }

    @Override // uu5.b
    public synchronized boolean a(tu5.h hVar) {
        boolean z17;
        int i17 = hVar.f422173b.f422171c.get();
        int i18 = this.f422167b;
        java.lang.Object obj = hVar.f422173b.f422169a.get("LIMIT");
        if (obj != null) {
            i18 = ((java.lang.Integer) obj).intValue();
        }
        z17 = i18 > i17;
        if (!z17 && i18 >= this.f422167b) {
            hVar.f422173b.f422169a.put("LIMIT", java.lang.Integer.valueOf(this.f422168c));
        }
        return z17;
    }

    @Override // uu5.a, uu5.b
    public synchronized void c(tu5.h hVar) {
        super.c(hVar);
        java.lang.Object obj = hVar.f422173b.f422169a.get("LIMIT");
        if ((obj == null ? 0 : ((java.lang.Integer) obj).intValue()) <= this.f422168c) {
            hVar.f422173b.f422169a.put("LIMIT", java.lang.Integer.valueOf(this.f422167b));
        }
    }
}
