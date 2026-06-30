package sg0;

/* loaded from: classes.dex */
public class s3 implements com.tencent.mm.modelbase.e3 {
    public s3(sg0.u3 u3Var) {
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            return 0;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(457L, 1L, 1L, false);
        return 0;
    }
}
