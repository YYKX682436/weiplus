package d7;

/* loaded from: classes13.dex */
public class q extends d7.v {
    @Override // d7.v
    public d7.u a(int i17, int i18, int i19, int i27) {
        return b(i17, i18, i19, i27) == 1.0f ? d7.u.QUALITY : d7.v.f226838a.a(i17, i18, i19, i27);
    }

    @Override // d7.v
    public float b(int i17, int i18, int i19, int i27) {
        return java.lang.Math.min(1.0f, d7.v.f226838a.b(i17, i18, i19, i27));
    }
}
