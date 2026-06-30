package fp;

/* loaded from: classes12.dex */
public abstract class k0 {
    public static java.lang.String a(java.lang.String str) {
        wo.o oVar;
        int i17;
        return (str == null || (i17 = (oVar = wo.v1.f447833m).f447752j) == 2 || oVar.f447758p == 1 || i17 != 1 || !str.contains("\n")) ? str : str.replace("\n", " ");
    }
}
