package rw2;

/* loaded from: classes10.dex */
public final /* synthetic */ class e extends kotlin.jvm.internal.m implements yz5.p {
    public e(java.lang.Object obj) {
        super(2, obj, rw2.j.class, "onFrameGenerated", "onFrameGenerated(Landroid/graphics/Bitmap;J)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap p07 = (android.graphics.Bitmap) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        kotlin.jvm.internal.o.g(p07, "p0");
        rw2.j jVar = (rw2.j) this.receiver;
        com.tencent.mars.xlog.Log.i(jVar.f400607c, "onFrameGenerated, " + p07 + ", " + longValue);
        kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
        g0Var.f310121d = -1L;
        synchronized (jVar.f400609e) {
            kz5.h0.B(jVar.f400609e, new rw2.i(longValue, g0Var, p07, jVar));
        }
        com.tencent.mars.xlog.Log.i(jVar.f400607c, "get " + jVar.hashCode() + ": " + g0Var.f310121d + (char) 65292 + longValue);
        jVar.f400610f = false;
        jVar.c();
        if (g0Var.f310121d >= 0) {
            rw2.j.f400604j.put(jVar.f400606b + '-' + g0Var.f310121d, p07);
        }
        return jz5.f0.f302826a;
    }
}
