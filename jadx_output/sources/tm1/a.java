package tm1;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm1.b f420463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.pq0 f420464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.lq0 f420465f;

    public a(tm1.b bVar, bw5.kq0 kq0Var, bw5.pq0 pq0Var, bw5.lq0 lq0Var, bw5.mq0 mq0Var) {
        this.f420463d = bVar;
        this.f420464e = pq0Var;
        this.f420465f = lq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f420464e.f31808d;
        int i18 = this.f420465f.f29930d;
        this.f420463d.getClass();
        if (tm1.h.f420470a.b() == null) {
            return;
        }
        if (i17 != tm1.h.f420475f) {
            qk.ha haVar = qk.ia.f364169e;
            if (i17 != 2) {
                tm1.h hVar = tm1.h.f420470a;
            }
            tm1.h.f420475f = i17;
        }
        if (i18 != tm1.h.f420476g) {
            tm1.h.f420476g = i18;
        }
    }
}
