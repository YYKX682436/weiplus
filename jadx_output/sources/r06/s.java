package r06;

/* loaded from: classes16.dex */
public abstract class s extends r06.e {

    /* renamed from: h, reason: collision with root package name */
    public final o06.m f368519h;

    /* renamed from: i, reason: collision with root package name */
    public final o06.x1 f368520i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f368521m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(e26.c0 c0Var, o06.m mVar, n16.g gVar, o06.x1 x1Var, boolean z17) {
        super(c0Var, gVar);
        if (c0Var == null) {
            j0(0);
            throw null;
        }
        if (mVar == null) {
            j0(1);
            throw null;
        }
        if (gVar == null) {
            j0(2);
            throw null;
        }
        if (x1Var == null) {
            j0(3);
            throw null;
        }
        this.f368519h = mVar;
        this.f368520i = x1Var;
        this.f368521m = z17;
    }

    public static /* synthetic */ void j0(int i17) {
        java.lang.String str = (i17 == 4 || i17 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        java.lang.Object[] objArr = new java.lang.Object[(i17 == 4 || i17 == 5) ? 2 : 3];
        if (i17 == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i17 == 2) {
            objArr[0] = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME;
        } else if (i17 == 3) {
            objArr[0] = ya.b.SOURCE;
        } else if (i17 == 4 || i17 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[0] = "storageManager";
        }
        if (i17 == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i17 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        } else {
            objArr[1] = "getSource";
        }
        if (i17 != 4 && i17 != 5) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 != 4 && i17 != 5) {
            throw new java.lang.IllegalArgumentException(format);
        }
        throw new java.lang.IllegalStateException(format);
    }

    @Override // o06.m
    public o06.m e() {
        o06.m mVar = this.f368519h;
        if (mVar != null) {
            return mVar;
        }
        j0(4);
        throw null;
    }

    @Override // o06.p
    public o06.x1 getSource() {
        o06.x1 x1Var = this.f368520i;
        if (x1Var != null) {
            return x1Var;
        }
        j0(5);
        throw null;
    }

    public boolean isExternal() {
        return this.f368521m;
    }
}
