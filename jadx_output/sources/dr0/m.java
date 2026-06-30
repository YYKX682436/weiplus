package dr0;

@j95.b
/* loaded from: classes12.dex */
public final class m extends i95.w implements lh.k {

    /* renamed from: f, reason: collision with root package name */
    public static final int f242465f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f242466d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f242467e = jz5.h.a(jz5.i.f302829d, dr0.l.f242457d);

    static {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        f242465f = z65.c.a() || com.tencent.mm.sdk.platformtools.s9.f192975c ? 1 : 24;
    }

    public void Ai() {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).e();
            }
        }
    }

    public void Bi(boolean z17) {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).b(z17);
            }
        }
    }

    public void Di(long j17) {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).c(j17);
            }
        }
        synchronized (Ui()) {
            java.util.Iterator it6 = Ui().iterator();
            while (it6.hasNext()) {
                ((lh.j) it6.next()).a();
            }
        }
    }

    public final void Ni(m3.a aVar) {
        dr0.p1 a17 = dr0.p1.f242489d.a();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        a17.getClass();
        java.util.List n17 = sh.c.n(context);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(n17, 10));
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((m3.d) it.next()).f323093b);
        }
        java.util.List S0 = kz5.n0.S0(arrayList);
        for (java.lang.String str : Vi()) {
            if (S0.contains(str)) {
                aVar.accept(str);
            }
        }
    }

    public long Ri() {
        return com.tencent.mm.sdk.platformtools.o4.L().getLong("batt_last_charged_r2", 0L);
    }

    public final java.util.LinkedList Ui() {
        return (java.util.LinkedList) this.f242467e.getValue();
    }

    public java.util.List Vi() {
        return kz5.c0.i(com.tencent.mm.sdk.platformtools.w9.f193053a, com.tencent.mm.sdk.platformtools.w9.f193054b, com.tencent.mm.sdk.platformtools.w9.f193055c, com.tencent.mm.sdk.platformtools.w9.f193058f, com.tencent.mm.sdk.platformtools.w9.f193059g, com.tencent.mm.sdk.platformtools.w9.f193060h, com.tencent.mm.sdk.platformtools.w9.f193061i, com.tencent.mm.sdk.platformtools.w9.f193062j);
    }

    public void Zi(lh.j stats) {
        kotlin.jvm.internal.o.g(stats, "stats");
        if (this.f242466d) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            stats.f(context);
        }
        synchronized (Ui()) {
            Ui().add(stats);
        }
    }

    public void wi() {
        synchronized (Ui()) {
            java.util.Iterator it = Ui().iterator();
            while (it.hasNext()) {
                ((lh.j) it.next()).d();
            }
        }
    }
}
