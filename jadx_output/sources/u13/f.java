package u13;

/* loaded from: classes11.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u13.g f423757a;

    public f(u13.g gVar) {
        this.f423757a = gVar;
    }

    public void a(java.lang.String str, p13.y yVar) {
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).xj(str, yVar, 0);
        ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).aj(str, 0L);
        u13.g gVar = this.f423757a;
        if (com.tencent.mm.sdk.platformtools.t8.K0(gVar.f())) {
            return;
        }
        ((s50.k0) ((u50.w) i95.n0.c(u50.w.class))).aj(gVar.f(), 0L);
    }

    public abstract void b(android.content.Context context, u13.e eVar, u13.g gVar, java.lang.Object... objArr);

    public abstract android.view.View c(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view);

    public abstract boolean d(android.content.Context context, android.view.View view, u13.g gVar, java.lang.Object... objArr);
}
