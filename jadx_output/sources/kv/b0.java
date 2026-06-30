package kv;

/* loaded from: classes11.dex */
public interface b0 extends i95.m {
    static /* synthetic */ android.graphics.Bitmap Mg(kv.b0 b0Var, float f17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDefaultAvatarBitmap");
        }
        if ((i17 & 1) != 0) {
            f17 = 0.1f;
        }
        return ((hn1.s) b0Var).Ri(f17);
    }

    static /* synthetic */ java.lang.Object n4(kv.b0 b0Var, java.lang.String str, java.lang.String str2, float f17, java.util.Map map, kotlin.coroutines.Continuation continuation, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateHeadBitmap");
        }
        if ((i17 & 4) != 0) {
            f17 = 0.1f;
        }
        float f18 = f17;
        if ((i17 & 8) != 0) {
            map = null;
        }
        return ((hn1.s) b0Var).qj(str, str2, f18, map, continuation);
    }
}
