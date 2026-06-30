package y06;

/* loaded from: classes15.dex */
public abstract class t {
    public static /* synthetic */ void a(int i17) {
        java.lang.String str = (i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 4 || i17 == 5 || i17 == 6 || i17 == 7) ? 2 : 3];
        switch (i17) {
            case 1:
                objArr[0] = "valueParameters";
                break;
            case 2:
                objArr[0] = "typeParameters";
                break;
            case 3:
                objArr[0] = "signatureErrors";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            default:
                objArr[0] = "returnType";
                break;
        }
        if (i17 == 4) {
            objArr[1] = "getReturnType";
        } else if (i17 == 5) {
            objArr[1] = "getValueParameters";
        } else if (i17 == 6) {
            objArr[1] = "getTypeParameters";
        } else if (i17 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
        } else {
            objArr[1] = "getErrors";
        }
        if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 4 && i17 != 5 && i17 != 6 && i17 != 7) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }
}
