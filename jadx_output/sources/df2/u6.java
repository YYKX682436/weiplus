package df2;

/* loaded from: classes3.dex */
public final class u6 extends dk2.cb {
    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.yc2 result = (r45.yc2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        if ((result.getInteger(0) & 1) == 1) {
            com.tencent.mars.xlog.Log.i("FinderGestureEffectVisitorDataController", "#polling success MMFinderLiveesourceLoadFlag_Gesture");
            sg2.a0.f407882a.b(result.getList(1), false);
        }
    }
}
