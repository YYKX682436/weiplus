package n40;

/* loaded from: classes2.dex */
public interface o extends i95.m {
    static /* synthetic */ void U8(n40.o oVar, android.content.Context context, java.util.Map map, boolean z17, android.os.Bundle bundle, com.tencent.mm.protocal.protobuf.FinderObject finderObject, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: jumpPlayerDetailUI");
        }
        if ((i17 & 4) != 0) {
            z17 = false;
        }
        ((a03.h0) oVar).ij(context, map, z17, bundle, (i17 & 16) != 0 ? null : finderObject, (i17 & 32) != 0 ? null : str);
    }
}
