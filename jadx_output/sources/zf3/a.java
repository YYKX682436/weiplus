package zf3;

/* loaded from: classes3.dex */
public interface a extends pf5.c {
    static /* synthetic */ void Y5(zf3.a aVar, mf3.k kVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forwardToFriends");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        aVar.z4(kVar, str);
    }

    void I(mf3.k kVar);

    void z4(mf3.k kVar, java.lang.String str);
}
