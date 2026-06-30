package x06;

/* loaded from: classes16.dex */
public final class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.k0 f451270d;

    /* renamed from: a, reason: collision with root package name */
    public final x06.n0 f451271a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f451272b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f451273c;

    static {
        n16.c cVar = x06.h0.f451255a;
        jz5.f configuredKotlinVersion = jz5.f.f302821h;
        kotlin.jvm.internal.o.g(configuredKotlinVersion, "configuredKotlinVersion");
        x06.i0 i0Var = x06.h0.f451258d;
        jz5.f fVar = i0Var.f451262b;
        x06.w0 globalReportLevel = (fVar == null || fVar.f302825g - configuredKotlinVersion.f302825g > 0) ? i0Var.f451261a : i0Var.f451263c;
        kotlin.jvm.internal.o.g(globalReportLevel, "globalReportLevel");
        f451270d = new x06.k0(new x06.n0(globalReportLevel, globalReportLevel == x06.w0.f451331f ? null : globalReportLevel, null, 4, null), x06.j0.f451265d);
    }

    public k0(x06.n0 jsr305, yz5.l getReportLevelForAnnotation) {
        kotlin.jvm.internal.o.g(jsr305, "jsr305");
        kotlin.jvm.internal.o.g(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f451271a = jsr305;
        this.f451272b = getReportLevelForAnnotation;
        this.f451273c = jsr305.f451281d || getReportLevelForAnnotation.invoke(x06.h0.f451255a) == x06.w0.f451330e;
    }

    public java.lang.String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f451271a + ", getReportLevelForAnnotation=" + this.f451272b + ')';
    }
}
