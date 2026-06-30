package zv2;

/* loaded from: classes10.dex */
public interface r0 {
    static /* synthetic */ void b(zv2.r0 r0Var, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onSelectItem");
        }
        if ((i17 & 1) != 0) {
            finderJumpInfo = null;
        }
        ((zv2.b) r0Var).i(finderJumpInfo);
    }

    void a();
}
