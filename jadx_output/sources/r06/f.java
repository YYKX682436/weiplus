package r06;

/* loaded from: classes16.dex */
public abstract class f extends r06.q {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e26.c0 c0Var, o06.m mVar, p06.k kVar, n16.g gVar, f26.d3 d3Var, boolean z17, int i17, o06.x1 x1Var, o06.c2 c2Var) {
        super(c0Var, mVar, kVar, gVar, d3Var, z17, i17, x1Var, c2Var);
        if (c0Var == null) {
            G(0);
            throw null;
        }
        if (mVar == null) {
            G(1);
            throw null;
        }
        if (kVar == null) {
            G(2);
            throw null;
        }
        if (gVar == null) {
            G(3);
            throw null;
        }
        if (d3Var == null) {
            G(4);
            throw null;
        }
        if (x1Var == null) {
            G(5);
            throw null;
        }
        if (c2Var != null) {
        } else {
            G(6);
            throw null;
        }
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        switch (i17) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = ya.b.SOURCE;
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // r06.v
    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        java.lang.String str = "";
        objArr[0] = this.f368505i ? "reified " : "";
        if (q() != f26.d3.f259143f) {
            str = q() + " ";
        }
        objArr[1] = str;
        objArr[2] = getName();
        return java.lang.String.format("%s%s%s", objArr);
    }
}
