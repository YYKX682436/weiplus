package ot0;

/* loaded from: classes5.dex */
public abstract class l3 {
    public static final boolean a() {
        int i17;
        try {
            i17 = j62.e.g().c(new com.tencent.mm.repairer.config.msgrefactor.RepairerConfigNewDBCheckCorrectness());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OrmCorrectnessTestConfig", "Failed to get expt value: " + e17.getMessage());
            i17 = 0;
        }
        return i17 == 1;
    }
}
