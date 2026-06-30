package iq0;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f293657a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f293658b;

    /* renamed from: c, reason: collision with root package name */
    public final int f293659c;

    public e(java.lang.String path, java.lang.String query, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        query = (i19 & 2) != 0 ? "" : query;
        i17 = (i19 & 4) != 0 ? 0 : i17;
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(query, "query");
        this.f293657a = path;
        this.f293658b = query;
        this.f293659c = i17;
    }

    public final java.lang.String a() {
        java.lang.String str = this.f293658b;
        boolean z17 = str.length() == 0;
        java.lang.String str2 = this.f293657a;
        if (z17) {
            return str2;
        }
        return str2 + '-' + str;
    }
}
