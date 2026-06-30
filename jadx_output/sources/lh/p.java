package lh;

/* loaded from: classes12.dex */
public final class p implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gi.w0 f318622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lh.q f318623b;

    public p(gi.w0 w0Var, lh.q qVar) {
        this.f318622a = w0Var;
        this.f318623b = qVar;
    }

    @Override // wh.t0
    public void accept(java.lang.Object obj) {
        qh.b bVar;
        if (((qh.b) obj).f363321n >= 300000) {
            gi.w0 w0Var = this.f318622a;
            float s17 = w0Var.s();
            lh.q qVar = this.f318623b;
            if (s17 >= qVar.f318626f) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#alert ");
                lh.t tVar = qVar.f318624d;
                sb6.append(tVar.f318634a);
                sb6.append(": loop=");
                sb6.append(tVar.f318637d);
                sb6.append(", minute=");
                int i17 = qVar.f318625e;
                sb6.append(i17);
                sb6.append(", cpuLoad=");
                sb6.append(w0Var.s());
                sb6.append(", threshold=");
                float f17 = qVar.f318626f;
                sb6.append(f17);
                com.tencent.mars.xlog.Log.i("MicroMsg.battery.CpuAlertInspector", sb6.toString());
                int i18 = tVar.f318637d;
                android.os.Bundle bundle = w0Var.f395327i;
                bundle.putInt("cpu-alert-loop", i18);
                bundle.putInt("cpu-alert-postMin", i17);
                bundle.putFloat("cpu-alert-threshold", f17);
                bundle.putInt("cpu-alert-everFg", lh.t.f318630e ? 1 : 0);
                java.util.List list = ri.p.f395959a;
                java.lang.String str = w0Var.f395337s;
                if ((str.equals("canary") || str.equals("biz")) && (bVar = w0Var.f395330l) != null) {
                    w0Var.p(new ri.p$$k(w0Var, bVar, str));
                }
                int i19 = tVar.f318637d + 1;
                tVar.a();
                tVar.c(i19);
            }
        }
    }
}
