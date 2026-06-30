package vx1;

@j95.b(dependencies = {com.tencent.mm.plugin.zero.m1.class, c42.i.class})
/* loaded from: classes7.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f441229d;

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        android.os.Handler handler = new android.os.Handler(android.os.Looper.myLooper());
        if (!com.tencent.mm.sdk.platformtools.x2.j()) {
            wi(handler);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new vx1.g(this, handler));
    }

    public final void wi(android.os.Handler handler) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SystemCrashFixPatch", "api level :" + android.os.Build.VERSION.SDK_INT);
        if (this.f441229d == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.f441229d = arrayList;
            arrayList.add(new yx1.f());
            ((java.util.ArrayList) this.f441229d).add(new zx1.a());
            ((java.util.ArrayList) this.f441229d).add(new com.tencent.mm.plugin.crashfix.patch.killself.b());
            ((java.util.ArrayList) this.f441229d).add(new com.tencent.mm.plugin.crashfix.patch.phonestateoverflow.e());
            ((java.util.ArrayList) this.f441229d).add(new xx1.c());
            ((java.util.ArrayList) this.f441229d).add(new wx1.b());
        }
        java.util.Iterator it = ((java.util.ArrayList) this.f441229d).iterator();
        while (it.hasNext()) {
            vx1.f fVar = (vx1.f) it.next();
            if (fVar.a(android.os.Build.VERSION.SDK_INT)) {
                if (fVar instanceof vx1.e) {
                    handler.postDelayed(new vx1.h(this, (vx1.e) fVar, fVar), 0L);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SystemCrashFixPatch", fVar.getClass().getCanonicalName() + " : " + fVar.b());
                }
            }
        }
    }
}
