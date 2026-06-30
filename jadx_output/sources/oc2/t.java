package oc2;

/* loaded from: classes8.dex */
public final class t implements ep0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f344249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f344250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f344251c;

    public t(kotlin.jvm.internal.g0 g0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.g0 g0Var2) {
        this.f344249a = g0Var;
        this.f344250b = h0Var;
        this.f344251c = g0Var2;
    }

    @Override // ep0.c
    public void a(ip0.a aVar, cp0.n nVar, hp0.e eVar) {
        this.f344251c.f310121d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // ep0.c
    public void b(ip0.a aVar, cp0.n nVar) {
        this.f344249a.f310121d = android.os.SystemClock.elapsedRealtime();
        java.lang.String obj = aVar != null ? aVar.f293573a.toString() : null;
        if (obj == null) {
            obj = "";
        }
        this.f344250b.f310123d = obj;
    }
}
