package kotlinx.coroutines.flow;

/* loaded from: classes11.dex */
public abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.internal.l0 f310389a = new kotlinx.coroutines.internal.l0("NO_VALUE");

    public static final kotlinx.coroutines.flow.i2 a(int i17, int i18, u26.u uVar) {
        boolean z17 = true;
        if (!(i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("replay cannot be negative, but was " + i17).toString());
        }
        if (!(i18 >= 0)) {
            throw new java.lang.IllegalArgumentException(("extraBufferCapacity cannot be negative, but was " + i18).toString());
        }
        if (i17 <= 0 && i18 <= 0 && uVar != u26.u.SUSPEND) {
            z17 = false;
        }
        if (!z17) {
            throw new java.lang.IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + uVar).toString());
        }
        int i19 = i18 + i17;
        if (i19 < 0) {
            i19 = Integer.MAX_VALUE;
        }
        return new kotlinx.coroutines.flow.q2(i17, i19, uVar);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i2 b(int i17, int i18, u26.u uVar, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = 0;
        }
        if ((i19 & 2) != 0) {
            i18 = 0;
        }
        if ((i19 & 4) != 0) {
            uVar = u26.u.SUSPEND;
        }
        return a(i17, i18, uVar);
    }
}
