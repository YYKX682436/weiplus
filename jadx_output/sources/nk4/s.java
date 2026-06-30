package nk4;

/* loaded from: classes15.dex */
public interface s {
    static /* synthetic */ void c(nk4.s sVar, nk4.i iVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDownloadStop");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        sVar.b(iVar, str);
    }

    static /* synthetic */ void d(nk4.s sVar, nk4.b bVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onDownloadStart");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        sVar.a(bVar, str);
    }

    void a(nk4.b bVar, java.lang.String str);

    void b(nk4.i iVar, java.lang.String str);
}
