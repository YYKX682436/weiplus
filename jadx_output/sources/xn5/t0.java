package xn5;

@j95.b
/* loaded from: classes13.dex */
public final class t0 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f455722d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.app.s2 f455723e = new xn5.r0(this);

    public static final void wi(xn5.t0 t0Var) {
        t0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.X2C.X2CFeatureService", "submitPreloadData");
        java.util.HashMap hashMap = xn5.q0.f455711j;
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r45.hg7 hg7Var = new r45.hg7();
            hg7Var.f376140d = ((xn5.h0) entry.getValue()).f455677a.f376140d;
            hg7Var.f376141e.addAll(((xn5.h0) entry.getValue()).f455677a.f376141e);
            arrayList.add(hg7Var);
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r45.hg7 hg7Var2 = (r45.hg7) it.next();
            xn5.z b17 = xn5.q0.f455702a.b().b();
            if (b17 != null) {
                b17.b(hg7Var2);
            }
        }
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f455722d = ((ku5.t0) ku5.t0.f312615d).d(new xn5.s0(this), 300000L, 600000L);
        this.f455723e.alive();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        wu5.c cVar = this.f455722d;
        if (cVar != null) {
            cVar.cancel(true);
        }
        this.f455723e.dead();
    }
}
