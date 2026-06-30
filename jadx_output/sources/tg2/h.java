package tg2;

/* loaded from: classes3.dex */
public interface h {
    static /* synthetic */ void d(tg2.h hVar, java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onBatchGiftSend");
        }
        if ((i18 & 4) != 0) {
            str2 = null;
        }
        hVar.a(str, i17, str2);
    }

    void a(java.lang.String str, int i17, java.lang.String str2);

    void b(android.view.ViewGroup viewGroup, java.lang.String str, boolean z17, ce2.i iVar, boolean z18);

    void c(android.view.ViewGroup viewGroup, java.lang.String str);

    void e(android.view.ViewGroup viewGroup, java.lang.String str);

    void f(android.view.ViewGroup viewGroup, ce2.i iVar);
}
