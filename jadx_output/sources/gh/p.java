package gh;

/* loaded from: classes7.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final gh.r a(android.content.Context context, gh.y yVar) {
        int ordinal = yVar.ordinal();
        if (ordinal == 0) {
            return new gh.j(context);
        }
        if (ordinal == 1) {
            return new gh.k(context);
        }
        throw new java.lang.Exception("invalid viewType");
    }
}
