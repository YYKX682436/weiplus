package pb4;

/* loaded from: classes4.dex */
public final class f extends jm0.k {
    @Override // n75.a
    public java.util.Set N6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAutoDBItemSet", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachDB");
        java.util.Set c17 = kz5.o1.c(new dm.ia());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAutoDBItemSet", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachDB");
        return c17;
    }

    @Override // jm0.k
    public boolean Q6() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEncrypt", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachDB");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEncrypt", "com.tencent.mm.plugin.sns.storage.star.SnsStarTeachDB");
        return false;
    }
}
