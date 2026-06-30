package df;

/* loaded from: classes7.dex */
public class d1 implements com.tencent.skyline.jni.SkylineReporterInterface {
    @Override // com.tencent.skyline.jni.SkylineReporterInterface
    public void idKeyReport(int i17, int i18, int i19) {
        jx3.f.INSTANCE.w(i17, i18, i19);
    }

    @Override // com.tencent.skyline.jni.SkylineReporterInterface
    public void kvReport(int i17, java.lang.String str) {
        jx3.f.INSTANCE.kvStat(i17, str);
    }
}
