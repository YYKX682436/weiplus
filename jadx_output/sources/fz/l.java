package fz;

@j95.b
/* loaded from: classes12.dex */
public final class l extends i95.w implements cp.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f267276d = mm.k.j(mm.k.C1, null, 1, null);

    /* renamed from: e, reason: collision with root package name */
    public boolean f267277e = mm.k.j(mm.k.D1, null, 1, null);

    public void Ai(java.lang.String tag, java.lang.Runnable runnable) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(runnable, "runnable");
        if (wi()) {
            ((ku5.t0) ku5.t0.f312615d).h(runnable, tag);
        } else {
            gm0.j1.e().j(runnable);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new fz.k(this));
    }

    public boolean wi() {
        return com.tencent.mm.sdk.platformtools.x2.n() && (this.f267276d || mm.o.a());
    }
}
