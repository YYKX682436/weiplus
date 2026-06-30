package zv;

/* loaded from: classes11.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final zv.z f476143d = new zv.z();

    @Override // java.lang.Runnable
    public final void run() {
        dw.f fVar = dw.f.f244070a;
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        com.tencent.mm.storage.l4 p17 = Di.p("service_officialaccounts");
        if (p17 != null) {
            p17.Y1(0);
            Di.Y(p17, p17.h1(), true, true);
        }
    }
}
