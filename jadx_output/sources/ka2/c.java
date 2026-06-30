package ka2;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public r45.dd1 f306014a;

    /* renamed from: b, reason: collision with root package name */
    public r45.dd1 f306015b;

    public final boolean a(ka2.f streamType) {
        kotlin.jvm.internal.o.g(streamType, "streamType");
        int ordinal = streamType.ordinal();
        if (ordinal == 0) {
            r45.dd1 dd1Var = this.f306014a;
            if (dd1Var == null || dd1Var.getInteger(2) != 1) {
                return false;
            }
        } else if (ordinal != 1) {
            r45.dd1 dd1Var2 = this.f306014a;
            if (!(dd1Var2 != null && dd1Var2.getInteger(2) == 1)) {
                r45.dd1 dd1Var3 = this.f306015b;
                if (!(dd1Var3 != null && dd1Var3.getInteger(2) == 1)) {
                    return false;
                }
            }
        } else {
            r45.dd1 dd1Var4 = this.f306015b;
            if (dd1Var4 == null || dd1Var4.getInteger(2) != 1) {
                return false;
            }
        }
        return true;
    }
}
