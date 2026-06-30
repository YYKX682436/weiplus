package j36;

/* loaded from: classes13.dex */
public class e extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f297529f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f297530g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f297531h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f297532i = 0;

    public e() {
        this.f297540e = 261;
    }

    @Override // j36.m0
    public java.lang.Boolean h() {
        if (this.f297538c < 2) {
            return java.lang.Boolean.FALSE;
        }
        int f17 = oicq.wlogin_sdk.tools.util.f(this.f297539d, 4);
        this.f297530g = f17;
        if (this.f297538c < f17 + 2 + 2) {
            return java.lang.Boolean.FALSE;
        }
        int f18 = oicq.wlogin_sdk.tools.util.f(this.f297539d, f17 + 6);
        this.f297529f = f18;
        int i17 = this.f297538c;
        int i18 = this.f297530g + 2 + 2;
        if (i17 < f18 + i18) {
            return java.lang.Boolean.FALSE;
        }
        this.f297532i = 6;
        this.f297531h = i18 + 4;
        return java.lang.Boolean.TRUE;
    }
}
