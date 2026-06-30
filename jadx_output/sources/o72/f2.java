package o72;

/* loaded from: classes12.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o72.i2 f343333d;

    public f2(o72.i2 i2Var) {
        this.f343333d = i2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        o72.i2 i2Var;
        ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().di();
        this.f343333d.f343356d = java.lang.System.currentTimeMillis();
        o72.i2 i2Var2 = this.f343333d;
        long j17 = i2Var2.f343356d;
        long j18 = i2Var2.f343355c;
        o72.i2 i2Var3 = this.f343333d;
        i2Var3.f343356d = -1L;
        i2Var3.f343355c = -1L;
        synchronized (i2Var3.f343357e) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERFINO_FAV_HAS_DB_DATATOTALLENGTH_BOOLEAN, java.lang.Boolean.TRUE);
            i2Var = this.f343333d;
            i2Var.f343353a = false;
        }
        i2Var.f343359g.sendEmptyMessage(0);
    }
}
