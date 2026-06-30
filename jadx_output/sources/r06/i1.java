package r06;

/* loaded from: classes16.dex */
public class i1 extends r06.g {

    /* renamed from: f, reason: collision with root package name */
    public final o06.m f368454f;

    /* renamed from: g, reason: collision with root package name */
    public final z16.g f368455g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i1(o06.m mVar, z16.g gVar, p06.k kVar) {
        this(mVar, gVar, kVar, n16.i.f334176d);
        if (mVar == null) {
            G(0);
            throw null;
        }
        if (gVar == null) {
            G(1);
            throw null;
        }
        if (kVar != null) {
        } else {
            G(2);
            throw null;
        }
    }

    public static /* synthetic */ void G(int i17) {
        java.lang.String str = (i17 == 7 || i17 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 7 || i17 == 8) ? 2 : 3];
        switch (i17) {
            case 1:
            case 4:
                objArr[0] = "value";
                break;
            case 2:
            case 5:
                objArr[0] = "annotations";
                break;
            case 3:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 6:
                objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
                break;
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
                break;
            case 9:
                objArr[0] = "newOwner";
                break;
            case 10:
                objArr[0] = "outType";
                break;
        }
        if (i17 == 7) {
            objArr[1] = "getValue";
        } else if (i17 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        switch (i17) {
            case 7:
            case 8:
                break;
            case 9:
                objArr[2] = "copy";
                break;
            case 10:
                objArr[2] = "setOutType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 7 && i17 != 8) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // o06.m
    public o06.m e() {
        o06.m mVar = this.f368454f;
        if (mVar != null) {
            return mVar;
        }
        G(8);
        throw null;
    }

    @Override // o06.r1
    public z16.g getValue() {
        z16.g gVar = this.f368455g;
        if (gVar != null) {
            return gVar;
        }
        G(7);
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(o06.m mVar, z16.g gVar, p06.k kVar, n16.g gVar2) {
        super(kVar, gVar2);
        if (mVar == null) {
            G(3);
            throw null;
        }
        if (gVar == null) {
            G(4);
            throw null;
        }
        if (kVar == null) {
            G(5);
            throw null;
        }
        if (gVar2 != null) {
            this.f368454f = mVar;
            this.f368455g = gVar;
            return;
        }
        G(6);
        throw null;
    }
}
