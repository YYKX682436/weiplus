package cv;

/* loaded from: classes12.dex */
public interface f1 extends i95.m {
    static /* synthetic */ java.lang.Object Qd(cv.f1 f1Var, java.lang.String str, boolean z17, yz5.a aVar, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readTextAndWait");
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            aVar = null;
        }
        return ((pn4.z) f1Var).bj(str, z17, aVar, continuation);
    }
}
