package cr0;

/* loaded from: classes12.dex */
public final class u3 extends com.tencent.matrix.lifecycle.g {

    /* renamed from: b, reason: collision with root package name */
    public cr0.n3 f221770b;

    @Override // com.tencent.matrix.lifecycle.g
    public void a() {
        cr0.n3 n3Var = new cr0.n3();
        cr0.w3 w3Var = cr0.w3.f221800a;
        if (w3Var.b()) {
            w3Var.a().lock(new cr0.l3(n3Var));
        }
        this.f221770b = n3Var;
    }

    @Override // com.tencent.matrix.lifecycle.g
    public void b() {
        cr0.n3 n3Var = this.f221770b;
        if (n3Var != null) {
            cr0.n3 n3Var2 = new cr0.n3();
            cr0.w3 w3Var = cr0.w3.f221800a;
            if (w3Var.b()) {
                w3Var.a().lock(new cr0.l3(n3Var2));
            }
            cr0.m3 m3Var = new cr0.m3(n3Var, n3Var2);
            long j17 = m3Var.f395487d;
            if (j17 > 600000) {
                cr0.n3 n3Var3 = (cr0.n3) m3Var.f395486c;
                if (!n3Var3.f221639i.isEmpty()) {
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    java.lang.Long l17 = (java.lang.Long) n3Var3.f221634d.f395552a;
                    ob0.r2 r2Var = (ob0.r2) i95.n0.c(ob0.r2.class);
                    kotlin.jvm.internal.o.d(l17);
                    ((com.tencent.mm.feature.performance.q) r2Var).Ri(l17.longValue(), m3Var, linkedHashMap, new cr0.t3(linkedHashMap, l17, j17));
                    java.lang.String[] strArr = new java.lang.String[4];
                    strArr[0] = java.lang.String.valueOf(j17 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL);
                    strArr[1] = ((cr0.d0) n3Var3.f221639i.get(0)).f221604d;
                    strArr[2] = n3Var3.f221639i.size() > 1 ? ((cr0.d0) n3Var3.f221639i.get(1)).f221604d : "";
                    strArr[3] = n3Var3.f221639i.size() > 2 ? ((cr0.d0) n3Var3.f221639i.get(2)).f221604d : "";
                    ap.a.a(1, "statsNetwork", null, linkedHashMap, strArr);
                }
            }
        }
        this.f221770b = null;
    }
}
