package tu5;

/* loaded from: classes12.dex */
public class f extends tu5.b {
    public f(long j17, float f17, int i17, int i18) {
        super(i17, i18);
    }

    @Override // uu5.b
    public long d(tu5.h hVar, java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Object obj = hVar.f422172a.get("incrementCount");
        int intValue = obj == null ? 1 : ((java.lang.Integer) obj).intValue();
        long j17 = ((float) 1000) + (intValue * 500.0f);
        hVar.f422172a.put("incrementCount", java.lang.Integer.valueOf(intValue + 1));
        return timeUnit.convert(j17, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
