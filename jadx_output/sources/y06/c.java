package y06;

/* loaded from: classes16.dex */
public abstract class c {
    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 18 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 18 ? 3 : 2];
        switch (i17) {
            case 1:
            case 7:
            case 13:
                objArr[0] = "membersFromSupertypes";
                break;
            case 2:
            case 8:
            case 14:
                objArr[0] = "membersFromCurrent";
                break;
            case 3:
            case 9:
            case 15:
                objArr[0] = "classDescriptor";
                break;
            case 4:
            case 10:
            case 16:
                objArr[0] = "errorReporter";
                break;
            case 5:
            case 11:
            case 17:
                objArr[0] = "overridingUtil";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
                break;
            case 20:
                objArr[0] = "annotationClass";
                break;
        }
        if (i17 != 18) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils";
        } else {
            objArr[1] = "resolveOverrides";
        }
        switch (i17) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "resolveOverridesForStaticMembers";
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "resolveOverrides";
                break;
            case 18:
                break;
            case 19:
            case 20:
                objArr[2] = "getAnnotationParameterByName";
                break;
            default:
                objArr[2] = "resolveOverridesForNonStaticMembers";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 18) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static o06.l2 b(n16.g gVar, o06.g gVar2) {
        if (gVar == null) {
            a(19);
            throw null;
        }
        if (gVar2 == null) {
            a(20);
            throw null;
        }
        java.util.Collection S = gVar2.S();
        if (S.size() != 1) {
            return null;
        }
        for (o06.l2 l2Var : ((r06.j0) ((o06.f) S.iterator().next())).W()) {
            if (((r06.v) l2Var).getName().equals(gVar)) {
                return l2Var;
            }
        }
        return null;
    }

    public static java.util.Collection c(n16.g gVar, java.util.Collection collection, java.util.Collection collection2, o06.g gVar2, b26.c0 c0Var, r16.x xVar, boolean z17) {
        if (gVar == null) {
            a(12);
            throw null;
        }
        if (collection == null) {
            a(13);
            throw null;
        }
        if (collection2 == null) {
            a(14);
            throw null;
        }
        if (gVar2 == null) {
            a(15);
            throw null;
        }
        if (c0Var == null) {
            a(16);
            throw null;
        }
        if (xVar == null) {
            a(17);
            throw null;
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        xVar.h(gVar, collection, collection2, gVar2, new y06.b(c0Var, linkedHashSet, z17));
        return linkedHashSet;
    }

    public static java.util.Collection d(n16.g gVar, java.util.Collection collection, java.util.Collection collection2, o06.g gVar2, b26.c0 c0Var, r16.x xVar) {
        if (gVar == null) {
            a(0);
            throw null;
        }
        if (collection == null) {
            a(1);
            throw null;
        }
        if (collection2 == null) {
            a(2);
            throw null;
        }
        if (gVar2 == null) {
            a(3);
            throw null;
        }
        if (c0Var == null) {
            a(4);
            throw null;
        }
        if (xVar != null) {
            return c(gVar, collection, collection2, gVar2, c0Var, xVar, false);
        }
        a(5);
        throw null;
    }

    public static java.util.Collection e(n16.g gVar, java.util.Collection collection, java.util.Collection collection2, o06.g gVar2, b26.c0 c0Var, r16.x xVar) {
        if (gVar == null) {
            a(6);
            throw null;
        }
        if (collection == null) {
            a(7);
            throw null;
        }
        if (collection2 == null) {
            a(8);
            throw null;
        }
        if (gVar2 == null) {
            a(9);
            throw null;
        }
        if (c0Var == null) {
            a(10);
            throw null;
        }
        if (xVar != null) {
            return c(gVar, collection, collection2, gVar2, c0Var, xVar, true);
        }
        a(11);
        throw null;
    }
}
