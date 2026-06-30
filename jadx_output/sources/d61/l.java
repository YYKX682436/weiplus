package d61;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final d61.l f226751a = new d61.l();

    public final void a(boolean z17, long j17, int i17) {
        jz5.o oVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mp4ParserStat", "markParseCost, useLazy:" + z17 + ", cost:" + j17 + ", timetTableLength:" + i17);
        if (j17 < 0 || i17 < 0) {
            return;
        }
        if (z17) {
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.w(1290L, 8L, j17);
            fVar.w(1290L, 9L, 1L);
        } else {
            jx3.f fVar2 = jx3.f.INSTANCE;
            fVar2.w(1290L, 3L, j17);
            fVar2.w(1290L, 4L, 1L);
        }
        if (i17 >= 0 && i17 < 31) {
            oVar = z17 ? new jz5.o(13, 22, 23) : new jz5.o(13, 47, 48);
        } else {
            if (31 <= i17 && i17 < 61) {
                oVar = z17 ? new jz5.o(14, 26, 27) : new jz5.o(14, 51, 52);
            } else {
                if (61 <= i17 && i17 < 121) {
                    oVar = z17 ? new jz5.o(15, 30, 31) : new jz5.o(15, 55, 56);
                } else {
                    if (121 <= i17 && i17 < 181) {
                        oVar = z17 ? new jz5.o(16, 34, 35) : new jz5.o(16, 59, 60);
                    } else {
                        oVar = 181 <= i17 && i17 < 241 ? z17 ? new jz5.o(17, 38, 39) : new jz5.o(17, 63, 64) : z17 ? new jz5.o(18, 43, 44) : new jz5.o(18, 67, 68);
                    }
                }
            }
        }
        int intValue = ((java.lang.Number) oVar.f302841d).intValue();
        int intValue2 = ((java.lang.Number) oVar.f302842e).intValue();
        int intValue3 = ((java.lang.Number) oVar.f302843f).intValue();
        jx3.f fVar3 = jx3.f.INSTANCE;
        fVar3.w(1290L, intValue, 1L);
        fVar3.w(1290L, intValue2, j17);
        fVar3.w(1290L, intValue3, 1L);
    }
}
