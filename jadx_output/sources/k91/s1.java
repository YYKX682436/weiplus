package k91;

/* loaded from: classes5.dex */
public abstract class s1 {
    public static void a(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(str + "_entryPagePath");
        if (M == null) {
            return;
        }
        M.remove("keyEntryPagePath");
    }
}
