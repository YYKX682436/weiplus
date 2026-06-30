package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class p3 implements com.tencent.mm.sdk.platformtools.s3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.t3 f192914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f192915b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f192916c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.u3 f192917d;

    public p3(com.tencent.mm.sdk.platformtools.u3 u3Var, com.tencent.mm.sdk.platformtools.t3 t3Var, java.lang.String str, java.lang.Object obj) {
        this.f192917d = u3Var;
        this.f192914a = t3Var;
        this.f192915b = str;
        this.f192916c = obj;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset doInBackground tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        com.tencent.mm.sdk.platformtools.t3 t3Var = this.f192914a;
        if (t3Var != null) {
            gm0.m1 m1Var = (gm0.m1) t3Var;
            m1Var.getClass();
            ku5.u.a(com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.booter.p3());
            gm0.m mVar = m1Var.f273259a.f273212e;
            if (mVar != null) {
                synchronized (mVar.f273240c) {
                    mVar.y();
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset doInBackground callback done tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        this.f192917d.f193015a.quit();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset init start old tid[%d]", java.lang.Long.valueOf(this.f192917d.f193015a.getId()));
        com.tencent.mm.sdk.platformtools.u3 u3Var = this.f192917d;
        java.lang.String str = this.f192915b;
        u3Var.f193016b = null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = "MMHandlerThread";
        }
        u3Var.f193017c = str;
        u3Var.f193015a = s75.a.a(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset init done new tid[%d]", java.lang.Long.valueOf(this.f192917d.f193015a.getId()));
        synchronized (this.f192916c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset notify tid[%d]", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            this.f192916c.notifyAll();
        }
        return true;
    }

    @Override // com.tencent.mm.sdk.platformtools.s3
    public boolean b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMHandlerThread", "syncReset onPostExecute");
        return true;
    }
}
