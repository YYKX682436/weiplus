package l81;

/* loaded from: classes7.dex */
public interface v0 {
    static /* synthetic */ void b(l81.v0 v0Var, int i17, java.lang.String str, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onError");
        }
        if ((i18 & 2) != 0) {
            str = null;
        }
        v0Var.a(i17, str);
    }

    void a(int i17, java.lang.String str);

    void onSuccess();
}
