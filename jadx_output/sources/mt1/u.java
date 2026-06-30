package mt1;

/* loaded from: classes12.dex */
public final class u implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m3.d f331265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f331266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f331267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f331268g;

    public u(m3.d dVar, kotlin.jvm.internal.f0 f0Var, kotlin.jvm.internal.f0 f0Var2, kotlin.jvm.internal.f0 f0Var3) {
        this.f331265d = dVar;
        this.f331266e = f0Var;
        this.f331267f = f0Var2;
        this.f331268g = f0Var3;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        java.lang.String str;
        m3.d dVar = this.f331265d;
        com.tencent.mm.vfs.x1 m17 = com.tencent.mm.vfs.w6.m(ot1.h.u0((java.lang.String) dVar.f323093b));
        if (m17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CalcWxNewService", "File not exists when refreshing link: " + ((java.lang.String) dVar.f323093b));
            kotlin.jvm.internal.f0 f0Var = this.f331266e;
            f0Var.f310116d = f0Var.f310116d + 1;
        }
        ot1.h hVar = new ot1.h();
        java.lang.Object first = dVar.f323092a;
        kotlin.jvm.internal.o.f(first, "first");
        hVar.systemRowid = ((java.lang.Number) first).longValue();
        hVar.field_diskSpace = m17 != null ? m17.f213234d : 0L;
        if (m17 instanceof com.tencent.mm.vfs.k5) {
            this.f331267f.f310116d++;
            str = ((com.tencent.mm.vfs.k5) m17).f213029h;
        } else {
            if (m17 != null) {
                this.f331268g.f310116d++;
            }
            str = null;
        }
        hVar.y0(str);
        return hVar;
    }
}
