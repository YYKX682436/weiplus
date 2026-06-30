package e14;

/* loaded from: classes12.dex */
public abstract class m {
    public static /* synthetic */ void a(e14.n nVar, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromXml");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        if ((i17 & 8) != 0) {
            z18 = false;
        }
        nVar.fromXml(str, str2, z17, z18);
    }
}
