package x06;

/* loaded from: classes16.dex */
public final /* synthetic */ class j0 extends kotlin.jvm.internal.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.j0 f451265d = new x06.j0();

    public j0() {
        super(1);
    }

    @Override // kotlin.jvm.internal.e, f06.c
    public final java.lang.String getName() {
        return "getDefaultReportLevelForAnnotation";
    }

    @Override // kotlin.jvm.internal.e
    public final f06.f getOwner() {
        return kotlin.jvm.internal.i0.b(x06.h0.class, "compiler.common.jvm");
    }

    @Override // kotlin.jvm.internal.e
    public final java.lang.String getSignature() {
        return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n16.c p07 = (n16.c) obj;
        kotlin.jvm.internal.o.g(p07, "p0");
        n16.c cVar = x06.h0.f451255a;
        x06.s0.f451321a.getClass();
        x06.s0 configuredReportLevels = x06.r0.f451320b;
        jz5.f fVar = new jz5.f(1, 7, 20);
        kotlin.jvm.internal.o.g(configuredReportLevels, "configuredReportLevels");
        x06.w0 w0Var = (x06.w0) ((e26.q) ((x06.u0) configuredReportLevels).f451326c).invoke(p07);
        if (w0Var != null) {
            return w0Var;
        }
        x06.u0 u0Var = (x06.u0) x06.h0.f451257c;
        u0Var.getClass();
        x06.i0 i0Var = (x06.i0) ((e26.q) u0Var.f451326c).invoke(p07);
        if (i0Var == null) {
            return x06.w0.f451330e;
        }
        jz5.f fVar2 = i0Var.f451262b;
        return (fVar2 == null || fVar2.f302825g - fVar.f302825g > 0) ? i0Var.f451261a : i0Var.f451263c;
    }
}
