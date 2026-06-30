package vz4;

/* loaded from: classes8.dex */
public final class z implements com.tencent.mm.plugin.wepkg.event.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f441778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f441779c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vz4.j f441780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f441781e;

    public z(java.lang.String str, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var, vz4.j jVar, java.lang.String str2) {
        this.f441777a = str;
        this.f441778b = h0Var;
        this.f441779c = c0Var;
        this.f441780d = jVar;
        this.f441781e = str2;
    }

    @Override // com.tencent.mm.plugin.wepkg.event.c
    public final void a(java.lang.Object obj) {
        if ((obj instanceof com.tencent.mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify) && kotlin.jvm.internal.o.b(this.f441777a, ((com.tencent.mm.plugin.wepkg.event.LiteInfoUpdateCompleteNotify) obj).f188330d)) {
            com.tencent.mm.plugin.wepkg.event.h.b((com.tencent.mm.plugin.wepkg.event.c) this.f441778b.f310123d);
            vz4.d0 d0Var = vz4.d0.f441729a;
            java.lang.Object obj2 = vz4.d0.f441730b;
            kotlin.jvm.internal.c0 c0Var = this.f441779c;
            vz4.j jVar = this.f441780d;
            java.lang.String str = this.f441781e;
            synchronized (obj2) {
                if (!c0Var.f310112d) {
                    c0Var.f310112d = true;
                    jVar.onSuccess(str);
                }
            }
            ((ku5.t0) ku5.t0.f312615d).A("MicroMsg.WePkgUpdateManager");
        }
    }
}
