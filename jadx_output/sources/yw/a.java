package yw;

/* loaded from: classes11.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f466259d;

    public a(int i17) {
        this.f466259d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yw.q0 q0Var = yw.q0.f466429a;
        yw.d0 d0Var = yw.d0.f466292f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("eventType=");
        int i17 = this.f466259d;
        sb6.append(i17);
        q0Var.a(d0Var, sb6.toString());
        if (i17 != 6) {
            if (i17 == 8) {
                new com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent().e();
            }
        } else {
            o25.q qVar = o25.q.f342574a;
            if (qVar.f() && qVar.g()) {
                qVar.h();
            }
        }
    }
}
