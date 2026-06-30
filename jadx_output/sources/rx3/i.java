package rx3;

/* loaded from: classes2.dex */
public interface i {
    static /* synthetic */ java.lang.Object b(rx3.i iVar, int i17, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
        if ((i18 & 2) != 0) {
            z17 = false;
        }
        if ((i18 & 4) != 0) {
            z18 = false;
        }
        return iVar.a(i17, z17, z18, continuation);
    }

    java.lang.Object a(int i17, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation);
}
