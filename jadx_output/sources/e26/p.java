package e26;

/* loaded from: classes16.dex */
public abstract class p extends e26.n implements e26.x {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(e26.u uVar, yz5.a aVar) {
        super(uVar, aVar);
        if (uVar == null) {
            a(0);
            throw null;
        }
        if (aVar != null) {
        } else {
            a(1);
            throw null;
        }
    }

    public static /* synthetic */ void a(int i17) {
        java.lang.String str = i17 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        java.lang.Object[] objArr = new java.lang.Object[i17 != 2 ? 3 : 2];
        if (i17 == 1) {
            objArr[0] = "computable";
        } else if (i17 != 2) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        }
        if (i17 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
        } else {
            objArr[1] = "invoke";
        }
        if (i17 != 2) {
            objArr[2] = "<init>";
        }
        java.lang.String format = java.lang.String.format(str, objArr);
        if (i17 == 2) {
            throw new java.lang.IllegalStateException(format);
        }
    }

    @Override // e26.n, e26.m, yz5.a
    public java.lang.Object invoke() {
        java.lang.Object invoke = super.invoke();
        if (invoke != null) {
            return invoke;
        }
        a(2);
        throw null;
    }
}
