package z;

/* loaded from: classes14.dex */
public abstract class s {
    public static z.r a(float f17, float f18, long j17, long j18, boolean z17, int i17, java.lang.Object obj) {
        return new z.r(z.q3.f468801a, java.lang.Float.valueOf(f17), new z.t((i17 & 2) != 0 ? 0.0f : f18), (i17 & 4) != 0 ? Long.MIN_VALUE : j17, (i17 & 8) == 0 ? j18 : Long.MIN_VALUE, (i17 & 16) != 0 ? false : z17);
    }

    public static z.r b(z.r rVar, float f17, float f18, long j17, long j18, boolean z17, int i17, java.lang.Object obj) {
        float floatValue = (i17 & 1) != 0 ? ((java.lang.Number) rVar.getValue()).floatValue() : f17;
        float f19 = (i17 & 2) != 0 ? ((z.t) rVar.f468812f).f468831a : f18;
        long j19 = (i17 & 4) != 0 ? rVar.f468813g : j17;
        long j27 = (i17 & 8) != 0 ? rVar.f468814h : j18;
        boolean z18 = (i17 & 16) != 0 ? rVar.f468815i : z17;
        kotlin.jvm.internal.o.g(rVar, "<this>");
        return new z.r(rVar.f468810d, java.lang.Float.valueOf(floatValue), new z.t(f19), j19, j27, z18);
    }

    public static final z.w c(z.w2 w2Var, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(w2Var, "<this>");
        z.w wVar = (z.w) ((z.x2) w2Var).f468873a.invoke(obj);
        kotlin.jvm.internal.o.g(wVar, "<this>");
        return wVar.c();
    }
}
