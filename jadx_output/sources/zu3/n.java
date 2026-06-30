package zu3;

/* loaded from: classes10.dex */
public interface n {
    static /* synthetic */ av3.a e(zu3.n nVar, android.graphics.Matrix matrix, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createEditorItem");
        }
        if ((i17 & 1) != 0) {
            matrix = null;
        }
        return nVar.p(matrix);
    }

    zu3.a g();

    av3.a p(android.graphics.Matrix matrix);
}
