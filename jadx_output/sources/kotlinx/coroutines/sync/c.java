package kotlinx.coroutines.sync;

/* loaded from: classes12.dex */
public abstract class c {
    public static /* synthetic */ java.lang.Object a(kotlinx.coroutines.sync.d dVar, java.lang.Object obj, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }
        if ((i17 & 1) != 0) {
            obj = null;
        }
        return ((kotlinx.coroutines.sync.k) dVar).b(obj, continuation);
    }

    public static /* synthetic */ boolean b(kotlinx.coroutines.sync.d dVar, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }
        if ((i17 & 1) != 0) {
            obj = null;
        }
        return ((kotlinx.coroutines.sync.k) dVar).c(obj);
    }

    public static /* synthetic */ void c(kotlinx.coroutines.sync.d dVar, java.lang.Object obj, int i17, java.lang.Object obj2) {
        if (obj2 != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
        if ((i17 & 1) != 0) {
            obj = null;
        }
        ((kotlinx.coroutines.sync.k) dVar).d(obj);
    }
}
