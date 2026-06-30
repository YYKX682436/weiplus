package j36;

/* loaded from: classes13.dex */
public class p extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297542f = 0;

    public p() {
        this.f297540e = 282;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        int i17 = this.f297538c;
        if (i17 < 5) {
            return java.lang.Boolean.FALSE;
        }
        int i18 = this.f297539d[8] & 255;
        if (i17 < i18 + 5) {
            return java.lang.Boolean.FALSE;
        }
        this.f297542f = i18;
        return java.lang.Boolean.TRUE;
    }
}
