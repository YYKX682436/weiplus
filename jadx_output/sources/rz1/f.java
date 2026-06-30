package rz1;

/* loaded from: classes.dex */
public class f implements gy1.b {
    public f(com.tencent.mm.plugin.datareport.sample.SampleUI sampleUI) {
    }

    @Override // gy1.b
    public void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mars.xlog.Log.e("Amoeba.SampleUI", "[onEventOccur] eventId : " + str + ", params : " + map);
    }
}
